package a.a.n;

import a.h.k.h;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.o;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater */
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f51e;

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f52f;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f53a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f54b;

    /* renamed from: c  reason: collision with root package name */
    Context f55c;

    /* renamed from: d  reason: collision with root package name */
    private Object f56d;

    /* compiled from: SupportMenuInflater */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?>[] f57c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        private Object f58a;

        /* renamed from: b  reason: collision with root package name */
        private Method f59b;

        public a(Object obj, String str) {
            this.f58a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f59b = cls.getMethod(str, f57c);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f59b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f59b.invoke(this.f58a, new Object[]{menuItem})).booleanValue();
                }
                this.f59b.invoke(this.f58a, new Object[]{menuItem});
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* compiled from: SupportMenuInflater */
    private class b {
        a.h.k.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f60a;

        /* renamed from: b  reason: collision with root package name */
        private int f61b;

        /* renamed from: c  reason: collision with root package name */
        private int f62c;

        /* renamed from: d  reason: collision with root package name */
        private int f63d;

        /* renamed from: e  reason: collision with root package name */
        private int f64e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f65f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.f60a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = g.this.f55c.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!g.this.f55c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z3 = menuItem instanceof j;
            if (z3) {
                j jVar = (j) menuItem;
            }
            if (this.r >= 2) {
                if (z3) {
                    ((j) menuItem).t(true);
                } else if (menuItem instanceof k) {
                    ((k) menuItem).i(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f51e, g.this.f53a));
                z2 = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!z2) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            a.h.k.b bVar = this.A;
            if (bVar != null) {
                h.a(menuItem, bVar);
            }
            h.c(menuItem, this.B);
            h.g(menuItem, this.C);
            h.b(menuItem, this.n, this.o);
            h.f(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                h.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                h.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.h = true;
            i(this.f60a.add(this.f61b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu addSubMenu = this.f60a.addSubMenu(this.f61b, this.i, this.j, this.k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f55c.obtainStyledAttributes(attributeSet, a.a.j.MenuGroup);
            this.f61b = obtainStyledAttributes.getResourceId(a.a.j.MenuGroup_android_id, 0);
            this.f62c = obtainStyledAttributes.getInt(a.a.j.MenuGroup_android_menuCategory, 0);
            this.f63d = obtainStyledAttributes.getInt(a.a.j.MenuGroup_android_orderInCategory, 0);
            this.f64e = obtainStyledAttributes.getInt(a.a.j.MenuGroup_android_checkableBehavior, 0);
            this.f65f = obtainStyledAttributes.getBoolean(a.a.j.MenuGroup_android_visible, true);
            this.g = obtainStyledAttributes.getBoolean(a.a.j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f55c.obtainStyledAttributes(attributeSet, a.a.j.MenuItem);
            this.i = obtainStyledAttributes.getResourceId(a.a.j.MenuItem_android_id, 0);
            this.j = (obtainStyledAttributes.getInt(a.a.j.MenuItem_android_menuCategory, this.f62c) & -65536) | (obtainStyledAttributes.getInt(a.a.j.MenuItem_android_orderInCategory, this.f63d) & 65535);
            this.k = obtainStyledAttributes.getText(a.a.j.MenuItem_android_title);
            this.l = obtainStyledAttributes.getText(a.a.j.MenuItem_android_titleCondensed);
            this.m = obtainStyledAttributes.getResourceId(a.a.j.MenuItem_android_icon, 0);
            this.n = c(obtainStyledAttributes.getString(a.a.j.MenuItem_android_alphabeticShortcut));
            this.o = obtainStyledAttributes.getInt(a.a.j.MenuItem_alphabeticModifiers, CodedOutputStream.DEFAULT_BUFFER_SIZE);
            this.p = c(obtainStyledAttributes.getString(a.a.j.MenuItem_android_numericShortcut));
            this.q = obtainStyledAttributes.getInt(a.a.j.MenuItem_numericModifiers, CodedOutputStream.DEFAULT_BUFFER_SIZE);
            if (obtainStyledAttributes.hasValue(a.a.j.MenuItem_android_checkable)) {
                this.r = obtainStyledAttributes.getBoolean(a.a.j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.r = this.f64e;
            }
            this.s = obtainStyledAttributes.getBoolean(a.a.j.MenuItem_android_checked, false);
            this.t = obtainStyledAttributes.getBoolean(a.a.j.MenuItem_android_visible, this.f65f);
            this.u = obtainStyledAttributes.getBoolean(a.a.j.MenuItem_android_enabled, this.g);
            this.v = obtainStyledAttributes.getInt(a.a.j.MenuItem_showAsAction, -1);
            this.z = obtainStyledAttributes.getString(a.a.j.MenuItem_android_onClick);
            this.w = obtainStyledAttributes.getResourceId(a.a.j.MenuItem_actionLayout, 0);
            this.x = obtainStyledAttributes.getString(a.a.j.MenuItem_actionViewClass);
            String string = obtainStyledAttributes.getString(a.a.j.MenuItem_actionProviderClass);
            this.y = string;
            boolean z2 = string != null;
            if (z2 && this.w == 0 && this.x == null) {
                this.A = (a.h.k.b) e(this.y, g.f52f, g.this.f54b);
            } else {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = obtainStyledAttributes.getText(a.a.j.MenuItem_contentDescription);
            this.C = obtainStyledAttributes.getText(a.a.j.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(a.a.j.MenuItem_iconTintMode)) {
                this.E = o.e(obtainStyledAttributes.getInt(a.a.j.MenuItem_iconTintMode, -1), this.E);
            } else {
                this.E = null;
            }
            if (obtainStyledAttributes.hasValue(a.a.j.MenuItem_iconTint)) {
                this.D = obtainStyledAttributes.getColorStateList(a.a.j.MenuItem_iconTint);
            } else {
                this.D = null;
            }
            obtainStyledAttributes.recycle();
            this.h = false;
        }

        public void h() {
            this.f61b = 0;
            this.f62c = 0;
            this.f63d = 0;
            this.f64e = 0;
            this.f65f = true;
            this.g = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f51e = r0
            f52f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.n.g.<clinit>():void");
    }

    public g(Context context) {
        super(context);
        this.f55c = context;
        Object[] objArr = {context};
        this.f53a = objArr;
        this.f54b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.h();
                        } else if (name2.equals("item")) {
                            if (!bVar.d()) {
                                a.h.k.b bVar2 = bVar.A;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.g(attributeSet);
                    } else if (name3.equals("menu")) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object b() {
        if (this.f56d == null) {
            this.f56d = a(this.f55c);
        }
        return this.f56d;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof a.h.f.a.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f55c.getResources().getLayout(i);
            c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
