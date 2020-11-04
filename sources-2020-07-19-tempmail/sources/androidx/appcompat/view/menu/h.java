package androidx.appcompat.view.menu;

import a.h.k.u;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuBuilder */
public class h implements a.h.f.a.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    private final Context f849a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f850b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f851c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f852d;

    /* renamed from: e  reason: collision with root package name */
    private a f853e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<j> f854f;
    private ArrayList<j> g;
    private boolean h;
    private ArrayList<j> i;
    private ArrayList<j> j;
    private boolean k;
    private int l = 0;
    private ContextMenu.ContextMenuInfo m;
    CharSequence n;
    Drawable o;
    View p;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private ArrayList<j> v = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<o>> w = new CopyOnWriteArrayList<>();
    private j x;
    private boolean y = false;
    private boolean z;

    /* compiled from: MenuBuilder */
    public interface a {
        boolean a(h hVar, MenuItem menuItem);

        void b(h hVar);
    }

    /* compiled from: MenuBuilder */
    public interface b {
        boolean a(j jVar);
    }

    public h(Context context) {
        this.f849a = context;
        this.f850b = context.getResources();
        this.f854f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.h = true;
        this.i = new ArrayList<>();
        this.j = new ArrayList<>();
        this.k = true;
        f0(true);
    }

    private static int D(int i2) {
        int i3 = (-65536 & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = A;
            if (i3 < iArr.length) {
                return (i2 & 65535) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void P(int i2, boolean z2) {
        if (i2 >= 0 && i2 < this.f854f.size()) {
            this.f854f.remove(i2);
            if (z2) {
                M(true);
            }
        }
    }

    private void a0(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources E = E();
        if (view != null) {
            this.p = view;
            this.n = null;
            this.o = null;
        } else {
            if (i2 > 0) {
                this.n = E.getText(i2);
            } else if (charSequence != null) {
                this.n = charSequence;
            }
            if (i3 > 0) {
                this.o = androidx.core.content.a.f(w(), i3);
            } else if (drawable != null) {
                this.o = drawable;
            }
            this.p = null;
        }
        M(false);
    }

    private void f0(boolean z2) {
        boolean z3 = true;
        if (!z2 || this.f850b.getConfiguration().keyboard == 1 || !u.e(ViewConfiguration.get(this.f849a), this.f849a)) {
            z3 = false;
        }
        this.f852d = z3;
    }

    private j g(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new j(this, i2, i3, i4, i5, charSequence, i6);
    }

    private void i(boolean z2) {
        if (!this.w.isEmpty()) {
            h0();
            Iterator<WeakReference<o>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                o oVar = (o) next.get();
                if (oVar == null) {
                    this.w.remove(next);
                } else {
                    oVar.h(z2);
                }
            }
            g0();
        }
    }

    private void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.w.isEmpty()) {
            Iterator<WeakReference<o>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                o oVar = (o) next.get();
                if (oVar == null) {
                    this.w.remove(next);
                } else {
                    int g2 = oVar.g();
                    if (g2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(g2)) != null) {
                        oVar.n(parcelable);
                    }
                }
            }
        }
    }

    private void k(Bundle bundle) {
        Parcelable p2;
        if (!this.w.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<o>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                o oVar = (o) next.get();
                if (oVar == null) {
                    this.w.remove(next);
                } else {
                    int g2 = oVar.g();
                    if (g2 > 0 && (p2 = oVar.p()) != null) {
                        sparseArray.put(g2, p2);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    private boolean l(u uVar, o oVar) {
        boolean z2 = false;
        if (this.w.isEmpty()) {
            return false;
        }
        if (oVar != null) {
            z2 = oVar.o(uVar);
        }
        Iterator<WeakReference<o>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            o oVar2 = (o) next.get();
            if (oVar2 == null) {
                this.w.remove(next);
            } else if (!z2) {
                z2 = oVar2.o(uVar);
            }
        }
        return z2;
    }

    private static int p(ArrayList<j> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    public View A() {
        return this.p;
    }

    public ArrayList<j> B() {
        t();
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public boolean C() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public Resources E() {
        return this.f850b;
    }

    public h F() {
        return this;
    }

    public ArrayList<j> G() {
        if (!this.h) {
            return this.g;
        }
        this.g.clear();
        int size = this.f854f.size();
        for (int i2 = 0; i2 < size; i2++) {
            j jVar = this.f854f.get(i2);
            if (jVar.isVisible()) {
                this.g.add(jVar);
            }
        }
        this.h = false;
        this.k = true;
        return this.g;
    }

    public boolean H() {
        return this.y;
    }

    /* access modifiers changed from: package-private */
    public boolean I() {
        return this.f851c;
    }

    public boolean J() {
        return this.f852d;
    }

    /* access modifiers changed from: package-private */
    public void K(j jVar) {
        this.k = true;
        M(true);
    }

    /* access modifiers changed from: package-private */
    public void L(j jVar) {
        this.h = true;
        M(true);
    }

    public void M(boolean z2) {
        if (!this.q) {
            if (z2) {
                this.h = true;
                this.k = true;
            }
            i(z2);
            return;
        }
        this.r = true;
        if (z2) {
            this.s = true;
        }
    }

    public boolean N(MenuItem menuItem, int i2) {
        return O(menuItem, (o) null, i2);
    }

    public boolean O(MenuItem menuItem, o oVar, int i2) {
        j jVar = (j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        boolean k2 = jVar.k();
        a.h.k.b b2 = jVar.b();
        boolean z2 = b2 != null && b2.a();
        if (jVar.j()) {
            k2 |= jVar.expandActionView();
            if (k2) {
                e(true);
            }
        } else if (jVar.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                e(false);
            }
            if (!jVar.hasSubMenu()) {
                jVar.x(new u(w(), this, jVar));
            }
            u uVar = (u) jVar.getSubMenu();
            if (z2) {
                b2.f(uVar);
            }
            k2 |= l(uVar, oVar);
            if (!k2) {
                e(true);
            }
        } else if ((i2 & 1) == 0) {
            e(true);
        }
        return k2;
    }

    public void Q(o oVar) {
        Iterator<WeakReference<o>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            o oVar2 = (o) next.get();
            if (oVar2 == null || oVar2 == oVar) {
                this.w.remove(next);
            }
        }
    }

    public void R(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(v());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((u) item.getSubMenu()).R(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void S(Bundle bundle) {
        j(bundle);
    }

    public void T(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((u) item.getSubMenu()).T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(v(), sparseArray);
        }
    }

    public void U(Bundle bundle) {
        k(bundle);
    }

    public void V(a aVar) {
        this.f853e = aVar;
    }

    public h W(int i2) {
        this.l = i2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void X(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f854f.size();
        h0();
        for (int i2 = 0; i2 < size; i2++) {
            j jVar = this.f854f.get(i2);
            if (jVar.getGroupId() == groupId && jVar.m() && jVar.isCheckable()) {
                jVar.s(jVar == menuItem);
            }
        }
        g0();
    }

    /* access modifiers changed from: protected */
    public h Y(int i2) {
        a0(0, (CharSequence) null, i2, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public h Z(Drawable drawable) {
        a0(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int D = D(i4);
        j g2 = g(i2, i3, i4, D, charSequence, this.l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.m;
        if (contextMenuInfo != null) {
            g2.v(contextMenuInfo);
        }
        ArrayList<j> arrayList = this.f854f;
        arrayList.add(p(arrayList, D), g2);
        M(true);
        return g2;
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f849a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(o oVar) {
        c(oVar, this.f849a);
    }

    /* access modifiers changed from: protected */
    public h b0(int i2) {
        a0(i2, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public void c(o oVar, Context context) {
        this.w.add(new WeakReference(oVar));
        oVar.m(context, this);
        this.k = true;
    }

    /* access modifiers changed from: protected */
    public h c0(CharSequence charSequence) {
        a0(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public void clear() {
        j jVar = this.x;
        if (jVar != null) {
            f(jVar);
        }
        this.f854f.clear();
        M(true);
    }

    public void clearHeader() {
        this.o = null;
        this.n = null;
        this.p = null;
        M(false);
    }

    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f853e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    /* access modifiers changed from: protected */
    public h d0(View view) {
        a0(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final void e(boolean z2) {
        if (!this.u) {
            this.u = true;
            Iterator<WeakReference<o>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                o oVar = (o) next.get();
                if (oVar == null) {
                    this.w.remove(next);
                } else {
                    oVar.a(this, z2);
                }
            }
            this.u = false;
        }
    }

    public void e0(boolean z2) {
        this.z = z2;
    }

    public boolean f(j jVar) {
        boolean z2 = false;
        if (!this.w.isEmpty() && this.x == jVar) {
            h0();
            Iterator<WeakReference<o>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                o oVar = (o) next.get();
                if (oVar == null) {
                    this.w.remove(next);
                } else {
                    z2 = oVar.j(this, jVar);
                    if (z2) {
                        break;
                    }
                }
            }
            g0();
            if (z2) {
                this.x = null;
            }
        }
        return z2;
    }

    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = this.f854f.get(i3);
            if (jVar.getItemId() == i2) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.getSubMenu().findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public void g0() {
        this.q = false;
        if (this.r) {
            this.r = false;
            M(this.s);
        }
    }

    public MenuItem getItem(int i2) {
        return this.f854f.get(i2);
    }

    /* access modifiers changed from: package-private */
    public boolean h(h hVar, MenuItem menuItem) {
        a aVar = this.f853e;
        return aVar != null && aVar.a(hVar, menuItem);
    }

    public void h0() {
        if (!this.q) {
            this.q = true;
            this.r = false;
            this.s = false;
        }
    }

    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f854f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return r(i2, keyEvent) != null;
    }

    public boolean m(j jVar) {
        boolean z2 = false;
        if (this.w.isEmpty()) {
            return false;
        }
        h0();
        Iterator<WeakReference<o>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            o oVar = (o) next.get();
            if (oVar == null) {
                this.w.remove(next);
            } else {
                z2 = oVar.k(this, jVar);
                if (z2) {
                    break;
                }
            }
        }
        g0();
        if (z2) {
            this.x = jVar;
        }
        return z2;
    }

    public int n(int i2) {
        return o(i2, 0);
    }

    public int o(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f854f.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return N(findItem(i2), i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        j r2 = r(i2, keyEvent);
        boolean N = r2 != null ? N(r2, i3) : false;
        if ((i3 & 2) != 0) {
            e(true);
        }
        return N;
    }

    public int q(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f854f.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public j r(int i2, KeyEvent keyEvent) {
        char c2;
        ArrayList<j> arrayList = this.v;
        arrayList.clear();
        s(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean I = I();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = arrayList.get(i3);
            if (I) {
                c2 = jVar.getAlphabeticShortcut();
            } else {
                c2 = jVar.getNumericShortcut();
            }
            if ((c2 == keyData.meta[0] && (metaState & 2) == 0) || ((c2 == keyData.meta[2] && (metaState & 2) != 0) || (I && c2 == 8 && i2 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    public void removeGroup(int i2) {
        int n2 = n(i2);
        if (n2 >= 0) {
            int size = this.f854f.size() - n2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || this.f854f.get(n2).getGroupId() != i2) {
                    M(true);
                } else {
                    P(n2, false);
                    i3 = i4;
                }
            }
            M(true);
        }
    }

    public void removeItem(int i2) {
        P(q(i2), true);
    }

    /* access modifiers changed from: package-private */
    public void s(List<j> list, int i2, KeyEvent keyEvent) {
        boolean I = I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f854f.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar = this.f854f.get(i3);
                if (jVar.hasSubMenu()) {
                    ((h) jVar.getSubMenu()).s(list, i2, keyEvent);
                }
                char alphabeticShortcut = I ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if (((modifiers & 69647) == ((I ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (I && alphabeticShortcut == 8 && i2 == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.f854f.size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = this.f854f.get(i3);
            if (jVar.getGroupId() == i2) {
                jVar.t(z3);
                jVar.setCheckable(z2);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.y = z2;
    }

    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.f854f.size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = this.f854f.get(i3);
            if (jVar.getGroupId() == i2) {
                jVar.setEnabled(z2);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z2) {
        int size = this.f854f.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = this.f854f.get(i3);
            if (jVar.getGroupId() == i2 && jVar.y(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            M(true);
        }
    }

    public void setQwertyMode(boolean z2) {
        this.f851c = z2;
        M(false);
    }

    public int size() {
        return this.f854f.size();
    }

    public void t() {
        ArrayList<j> G = G();
        if (this.k) {
            Iterator<WeakReference<o>> it = this.w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                o oVar = (o) next.get();
                if (oVar == null) {
                    this.w.remove(next);
                } else {
                    z2 |= oVar.i();
                }
            }
            if (z2) {
                this.i.clear();
                this.j.clear();
                int size = G.size();
                for (int i2 = 0; i2 < size; i2++) {
                    j jVar = G.get(i2);
                    if (jVar.l()) {
                        this.i.add(jVar);
                    } else {
                        this.j.add(jVar);
                    }
                }
            } else {
                this.i.clear();
                this.j.clear();
                this.j.addAll(G());
            }
            this.k = false;
        }
    }

    public ArrayList<j> u() {
        t();
        return this.i;
    }

    /* access modifiers changed from: protected */
    public String v() {
        return "android:menu:actionviewstates";
    }

    public Context w() {
        return this.f849a;
    }

    public j x() {
        return this.x;
    }

    public Drawable y() {
        return this.o;
    }

    public CharSequence z() {
        return this.n;
    }

    public MenuItem add(int i2) {
        return a(0, 0, 0, this.f850b.getString(i2));
    }

    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f850b.getString(i2));
    }

    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        j jVar = (j) a(i2, i3, i4, charSequence);
        u uVar = new u(this.f849a, this, jVar);
        jVar.x(uVar);
        return uVar;
    }

    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f850b.getString(i5));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, (CharSequence) this.f850b.getString(i5));
    }
}
