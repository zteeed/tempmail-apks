package androidx.appcompat.app;

import a.a.n.b;
import a.a.n.f;
import a.h.k.b0;
import a.h.k.e;
import a.h.k.q;
import a.h.k.t;
import a.h.k.x;
import a.h.k.y;
import a.h.k.z;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.q;
import com.google.android.gms.ads.AdRequest;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AppCompatDelegateImpl */
class h extends g implements h.a, LayoutInflater.Factory2 {
    private static final boolean T;
    private static final int[] U = {16842836};
    private static boolean V = true;
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    private boolean E;
    private n[] F;
    private n G;
    private boolean H;
    boolean I;
    private int J = -100;
    private boolean K;
    private l L;
    boolean M;
    int N;
    private final Runnable O = new b();
    private boolean P;
    private Rect Q;
    private Rect R;
    private AppCompatViewInflater S;

    /* renamed from: c  reason: collision with root package name */
    final Context f720c;

    /* renamed from: d  reason: collision with root package name */
    final Window f721d;

    /* renamed from: e  reason: collision with root package name */
    final Window.Callback f722e;

    /* renamed from: f  reason: collision with root package name */
    final Window.Callback f723f;
    final f g;
    a h;
    MenuInflater i;
    private CharSequence j;
    private androidx.appcompat.widget.m k;
    private i l;
    private o m;
    a.a.n.b n;
    ActionBarContextView o;
    PopupWindow p;
    Runnable q;
    x r = null;
    private boolean s = true;
    private boolean t;
    private ViewGroup u;
    private TextView v;
    private View w;
    private boolean x;
    private boolean y;
    boolean z;

    /* compiled from: AppCompatDelegateImpl */
    static class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f724a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f724a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f724a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f724a.uncaughtException(thread, th);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class b implements Runnable {
        b() {
        }

        public void run() {
            h hVar = h.this;
            if ((hVar.N & 1) != 0) {
                hVar.L(0);
            }
            h hVar2 = h.this;
            if ((hVar2.N & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
                hVar2.L(108);
            }
            h hVar3 = h.this;
            hVar3.M = false;
            hVar3.N = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class c implements q {
        c() {
        }

        public b0 a(View view, b0 b0Var) {
            int e2 = b0Var.e();
            int y0 = h.this.y0(e2);
            if (e2 != y0) {
                b0Var = b0Var.h(b0Var.c(), y0, b0Var.d(), b0Var.b());
            }
            return t.P(view, b0Var);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class d implements q.a {
        d() {
        }

        public void a(Rect rect) {
            rect.top = h.this.y0(rect.top);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class e implements ContentFrameLayout.a {
        e() {
        }

        public void a() {
        }

        public void onDetachedFromWindow() {
            h.this.J();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class f implements Runnable {

        /* compiled from: AppCompatDelegateImpl */
        class a extends z {
            a() {
            }

            public void b(View view) {
                h.this.o.setAlpha(1.0f);
                h.this.r.f((y) null);
                h.this.r = null;
            }

            public void c(View view) {
                h.this.o.setVisibility(0);
            }
        }

        f() {
        }

        public void run() {
            h hVar = h.this;
            hVar.p.showAtLocation(hVar.o, 55, 0, 0);
            h.this.M();
            if (h.this.r0()) {
                h.this.o.setAlpha(0.0f);
                h hVar2 = h.this;
                x b2 = t.b(hVar2.o);
                b2.a(1.0f);
                hVar2.r = b2;
                h.this.r.f(new a());
                return;
            }
            h.this.o.setAlpha(1.0f);
            h.this.o.setVisibility(0);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class g extends z {
        g() {
        }

        public void b(View view) {
            h.this.o.setAlpha(1.0f);
            h.this.r.f((y) null);
            h.this.r = null;
        }

        public void c(View view) {
            h.this.o.setVisibility(0);
            h.this.o.sendAccessibilityEvent(32);
            if (h.this.o.getParent() instanceof View) {
                t.X((View) h.this.o.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$h  reason: collision with other inner class name */
    /* compiled from: AppCompatDelegateImpl */
    private class C0033h implements b.C0032b {
        C0033h() {
        }

        public boolean a() {
            a k = h.this.k();
            return (k == null || (k.i() & 4) == 0) ? false : true;
        }

        public Context b() {
            return h.this.Q();
        }

        public void c(Drawable drawable, int i) {
            a k = h.this.k();
            if (k != null) {
                k.u(drawable);
                k.t(i);
            }
        }

        public Drawable d() {
            androidx.appcompat.widget.b0 t = androidx.appcompat.widget.b0.t(b(), (AttributeSet) null, new int[]{a.a.a.homeAsUpIndicator});
            Drawable g = t.g(0);
            t.v();
            return g;
        }

        public void e(int i) {
            a k = h.this.k();
            if (k != null) {
                k.t(i);
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private final class i implements o.a {
        i() {
        }

        public void a(androidx.appcompat.view.menu.h hVar, boolean z) {
            h.this.E(hVar);
        }

        public boolean b(androidx.appcompat.view.menu.h hVar) {
            Window.Callback U = h.this.U();
            if (U == null) {
                return true;
            }
            U.onMenuOpened(108, hVar);
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    class j implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f734a;

        /* compiled from: AppCompatDelegateImpl */
        class a extends z {
            a() {
            }

            public void b(View view) {
                h.this.o.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.p;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.o.getParent() instanceof View) {
                    t.X((View) h.this.o.getParent());
                }
                h.this.o.removeAllViews();
                h.this.r.f((y) null);
                h.this.r = null;
            }
        }

        public j(b.a aVar) {
            this.f734a = aVar;
        }

        public void a(a.a.n.b bVar) {
            this.f734a.a(bVar);
            h hVar = h.this;
            if (hVar.p != null) {
                hVar.f721d.getDecorView().removeCallbacks(h.this.q);
            }
            h hVar2 = h.this;
            if (hVar2.o != null) {
                hVar2.M();
                h hVar3 = h.this;
                x b2 = t.b(hVar3.o);
                b2.a(0.0f);
                hVar3.r = b2;
                h.this.r.f(new a());
            }
            h hVar4 = h.this;
            f fVar = hVar4.g;
            if (fVar != null) {
                fVar.s(hVar4.n);
            }
            h.this.n = null;
        }

        public boolean b(a.a.n.b bVar, Menu menu) {
            return this.f734a.b(bVar, menu);
        }

        public boolean c(a.a.n.b bVar, Menu menu) {
            return this.f734a.c(bVar, menu);
        }

        public boolean d(a.a.n.b bVar, MenuItem menuItem) {
            return this.f734a.d(bVar, menuItem);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    final class l {

        /* renamed from: a  reason: collision with root package name */
        private m f738a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f739b;

        /* renamed from: c  reason: collision with root package name */
        private BroadcastReceiver f740c;

        /* renamed from: d  reason: collision with root package name */
        private IntentFilter f741d;

        /* compiled from: AppCompatDelegateImpl */
        class a extends BroadcastReceiver {
            a() {
            }

            public void onReceive(Context context, Intent intent) {
                l.this.b();
            }
        }

        l(m mVar) {
            this.f738a = mVar;
            this.f739b = mVar.d();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.f740c;
            if (broadcastReceiver != null) {
                h.this.f720c.unregisterReceiver(broadcastReceiver);
                this.f740c = null;
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            boolean d2 = this.f738a.d();
            if (d2 != this.f739b) {
                this.f739b = d2;
                h.this.d();
            }
        }

        /* access modifiers changed from: package-private */
        public int c() {
            boolean d2 = this.f738a.d();
            this.f739b = d2;
            return d2 ? 2 : 1;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            a();
            if (this.f740c == null) {
                this.f740c = new a();
            }
            if (this.f741d == null) {
                IntentFilter intentFilter = new IntentFilter();
                this.f741d = intentFilter;
                intentFilter.addAction("android.intent.action.TIME_SET");
                this.f741d.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f741d.addAction("android.intent.action.TIME_TICK");
            }
            h.this.f720c.registerReceiver(this.f740c, this.f741d);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private class m extends ContentFrameLayout {
        public m(Context context) {
            super(context);
        }

        private boolean b(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.K(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            h.this.F(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(a.a.k.a.a.d(getContext(), i));
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    protected static final class n {

        /* renamed from: a  reason: collision with root package name */
        int f744a;

        /* renamed from: b  reason: collision with root package name */
        int f745b;

        /* renamed from: c  reason: collision with root package name */
        int f746c;

        /* renamed from: d  reason: collision with root package name */
        int f747d;

        /* renamed from: e  reason: collision with root package name */
        int f748e;

        /* renamed from: f  reason: collision with root package name */
        int f749f;
        ViewGroup g;
        View h;
        View i;
        androidx.appcompat.view.menu.h j;
        androidx.appcompat.view.menu.f k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        n(int i2) {
            this.f744a = i2;
        }

        /* access modifiers changed from: package-private */
        public p a(o.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(this.l, a.a.g.abc_list_menu_item_layout);
                this.k = fVar;
                fVar.l(aVar);
                this.j.b(this.k);
            }
            return this.k.c(this.g);
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            if (this.i == null && this.k.b().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.appcompat.view.menu.h hVar) {
            androidx.appcompat.view.menu.f fVar;
            androidx.appcompat.view.menu.h hVar2 = this.j;
            if (hVar != hVar2) {
                if (hVar2 != null) {
                    hVar2.Q(this.k);
                }
                this.j = hVar;
                if (hVar != null && (fVar = this.k) != null) {
                    hVar.b(fVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(a.a.a.actionBarPopupTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            }
            newTheme.resolveAttribute(a.a.a.panelMenuListTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                newTheme.applyStyle(i3, true);
            } else {
                newTheme.applyStyle(a.a.i.Theme_AppCompat_CompactMenu, true);
            }
            a.a.n.d dVar = new a.a.n.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(a.a.j.AppCompatTheme);
            this.f745b = obtainStyledAttributes.getResourceId(a.a.j.AppCompatTheme_panelBackground, 0);
            this.f749f = obtainStyledAttributes.getResourceId(a.a.j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    private final class o implements o.a {
        o() {
        }

        public void a(androidx.appcompat.view.menu.h hVar, boolean z) {
            androidx.appcompat.view.menu.h F = hVar.F();
            boolean z2 = F != hVar;
            h hVar2 = h.this;
            if (z2) {
                hVar = F;
            }
            n P = hVar2.P(hVar);
            if (P == null) {
                return;
            }
            if (z2) {
                h.this.D(P.f744a, P, F);
                h.this.G(P, true);
                return;
            }
            h.this.G(P, z);
        }

        public boolean b(androidx.appcompat.view.menu.h hVar) {
            Window.Callback U;
            if (hVar != null) {
                return true;
            }
            h hVar2 = h.this;
            if (!hVar2.z || (U = hVar2.U()) == null || h.this.I) {
                return true;
            }
            U.onMenuOpened(108, hVar);
            return true;
        }
    }

    static {
        boolean z2 = Build.VERSION.SDK_INT < 21;
        T = z2;
        if (z2 && !V) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    h(Context context, Window window, f fVar) {
        this.f720c = context;
        this.f721d = window;
        this.g = fVar;
        Window.Callback callback = window.getCallback();
        this.f722e = callback;
        if (!(callback instanceof k)) {
            k kVar = new k(callback);
            this.f723f = kVar;
            this.f721d.setCallback(kVar);
            androidx.appcompat.widget.b0 t2 = androidx.appcompat.widget.b0.t(context, (AttributeSet) null, U);
            Drawable h2 = t2.h(0);
            if (h2 != null) {
                this.f721d.setBackgroundDrawable(h2);
            }
            t2.v();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private void C() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.u.findViewById(16908290);
        View decorView = this.f721d.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f720c.obtainStyledAttributes(a.a.j.AppCompatTheme);
        obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(a.a.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private ViewGroup H() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f720c.obtainStyledAttributes(a.a.j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(a.a.j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_windowNoTitle, false)) {
                v(1);
            } else if (obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_windowActionBar, false)) {
                v(108);
            }
            if (obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_windowActionBarOverlay, false)) {
                v(109);
            }
            if (obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_windowActionModeOverlay, false)) {
                v(10);
            }
            this.C = obtainStyledAttributes.getBoolean(a.a.j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            this.f721d.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f720c);
            if (this.D) {
                if (this.B) {
                    viewGroup = (ViewGroup) from.inflate(a.a.g.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
                } else {
                    viewGroup = (ViewGroup) from.inflate(a.a.g.abc_screen_simple, (ViewGroup) null);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    t.l0(viewGroup, new c());
                } else {
                    ((androidx.appcompat.widget.q) viewGroup).setOnFitSystemWindowsListener(new d());
                }
            } else if (this.C) {
                viewGroup = (ViewGroup) from.inflate(a.a.g.abc_dialog_title_material, (ViewGroup) null);
                this.A = false;
                this.z = false;
            } else if (this.z) {
                TypedValue typedValue = new TypedValue();
                this.f720c.getTheme().resolveAttribute(a.a.a.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new a.a.n.d(this.f720c, typedValue.resourceId);
                } else {
                    context = this.f720c;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(a.a.g.abc_screen_toolbar, (ViewGroup) null);
                androidx.appcompat.widget.m mVar = (androidx.appcompat.widget.m) viewGroup.findViewById(a.a.f.decor_content_parent);
                this.k = mVar;
                mVar.setWindowCallback(U());
                if (this.A) {
                    this.k.f(109);
                }
                if (this.x) {
                    this.k.f(2);
                }
                if (this.y) {
                    this.k.f(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.k == null) {
                    this.v = (TextView) viewGroup.findViewById(a.a.f.title);
                }
                h0.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(a.a.f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f721d.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f721d.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.z + ", windowActionBarOverlay: " + this.A + ", android:windowIsFloating: " + this.C + ", windowActionModeOverlay: " + this.B + ", windowNoTitle: " + this.D + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void N() {
        if (this.L == null) {
            this.L = new l(m.a(this.f720c));
        }
    }

    private void O() {
        if (!this.t) {
            this.u = H();
            CharSequence T2 = T();
            if (!TextUtils.isEmpty(T2)) {
                androidx.appcompat.widget.m mVar = this.k;
                if (mVar != null) {
                    mVar.setWindowTitle(T2);
                } else if (m0() != null) {
                    m0().x(T2);
                } else {
                    TextView textView = this.v;
                    if (textView != null) {
                        textView.setText(T2);
                    }
                }
            }
            C();
            k0(this.u);
            this.t = true;
            n S2 = S(0, false);
            if (this.I) {
                return;
            }
            if (S2 == null || S2.j == null) {
                Z(108);
            }
        }
    }

    private int R() {
        int i2 = this.J;
        return i2 != -100 ? i2 : g.h();
    }

    private void V() {
        O();
        if (this.z && this.h == null) {
            Window.Callback callback = this.f722e;
            if (callback instanceof Activity) {
                this.h = new n((Activity) this.f722e, this.A);
            } else if (callback instanceof Dialog) {
                this.h = new n((Dialog) this.f722e);
            }
            a aVar = this.h;
            if (aVar != null) {
                aVar.s(this.P);
            }
        }
    }

    private boolean W(n nVar) {
        View view = nVar.i;
        if (view != null) {
            nVar.h = view;
            return true;
        } else if (nVar.j == null) {
            return false;
        } else {
            if (this.m == null) {
                this.m = new o();
            }
            View view2 = (View) nVar.a(this.m);
            nVar.h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    private boolean X(n nVar) {
        nVar.d(Q());
        nVar.g = new m(nVar.l);
        nVar.f746c = 81;
        return true;
    }

    private boolean Y(n nVar) {
        Context context = this.f720c;
        int i2 = nVar.f744a;
        if ((i2 == 0 || i2 == 108) && this.k != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(a.a.a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(a.a.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(a.a.a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                a.a.n.d dVar = new a.a.n.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context);
        hVar.V(this);
        nVar.c(hVar);
        return true;
    }

    private void Z(int i2) {
        this.N = (1 << i2) | this.N;
        if (!this.M) {
            t.V(this.f721d.getDecorView(), this.O);
            this.M = true;
        }
    }

    private boolean e0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        n S2 = S(i2, true);
        if (!S2.o) {
            return o0(S2, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean h0(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            a.a.n.b r0 = r3.n
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.h$n r2 = r3.S(r4, r0)
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.m r4 = r3.k
            if (r4 == 0) goto L_0x0043
            boolean r4 = r4.b()
            if (r4 == 0) goto L_0x0043
            android.content.Context r4 = r3.f720c
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.m r4 = r3.k
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.I
            if (r4 != 0) goto L_0x0062
            boolean r4 = r3.o0(r2, r5)
            if (r4 == 0) goto L_0x0062
            androidx.appcompat.widget.m r4 = r3.k
            boolean r0 = r4.e()
            goto L_0x006a
        L_0x003c:
            androidx.appcompat.widget.m r4 = r3.k
            boolean r0 = r4.d()
            goto L_0x006a
        L_0x0043:
            boolean r4 = r2.o
            if (r4 != 0) goto L_0x0064
            boolean r4 = r2.n
            if (r4 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r4 = r2.m
            if (r4 == 0) goto L_0x0062
            boolean r4 = r2.r
            if (r4 == 0) goto L_0x005b
            r2.m = r1
            boolean r4 = r3.o0(r2, r5)
            goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            if (r4 == 0) goto L_0x0062
            r3.l0(r2, r5)
            goto L_0x006a
        L_0x0062:
            r0 = 0
            goto L_0x006a
        L_0x0064:
            boolean r4 = r2.o
            r3.G(r2, r0)
            r0 = r4
        L_0x006a:
            if (r0 == 0) goto L_0x0083
            android.content.Context r4 = r3.f720c
            java.lang.String r5 = "audio"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            if (r4 == 0) goto L_0x007c
            r4.playSoundEffect(r1)
            goto L_0x0083
        L_0x007c:
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r5 = "Couldn't get audio manager"
            android.util.Log.w(r4, r5)
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.h0(int, android.view.KeyEvent):boolean");
    }

    private void l0(n nVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (!nVar.o && !this.I) {
            if (nVar.f744a == 0) {
                if ((this.f720c.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback U2 = U();
            if (U2 == null || U2.onMenuOpened(nVar.f744a, nVar.j)) {
                WindowManager windowManager = (WindowManager) this.f720c.getSystemService("window");
                if (windowManager != null && o0(nVar, keyEvent)) {
                    if (nVar.g == null || nVar.q) {
                        ViewGroup viewGroup = nVar.g;
                        if (viewGroup == null) {
                            if (!X(nVar) || nVar.g == null) {
                                return;
                            }
                        } else if (nVar.q && viewGroup.getChildCount() > 0) {
                            nVar.g.removeAllViews();
                        }
                        if (W(nVar) && nVar.b()) {
                            ViewGroup.LayoutParams layoutParams2 = nVar.h.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            nVar.g.setBackgroundResource(nVar.f745b);
                            ViewParent parent = nVar.h.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(nVar.h);
                            }
                            nVar.g.addView(nVar.h, layoutParams2);
                            if (!nVar.h.hasFocus()) {
                                nVar.h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = nVar.i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i2 = -1;
                            nVar.n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, nVar.f747d, nVar.f748e, 1002, 8519680, -3);
                            layoutParams3.gravity = nVar.f746c;
                            layoutParams3.windowAnimations = nVar.f749f;
                            windowManager.addView(nVar.g, layoutParams3);
                            nVar.o = true;
                            return;
                        }
                    }
                    i2 = -2;
                    nVar.n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, nVar.f747d, nVar.f748e, 1002, 8519680, -3);
                    layoutParams32.gravity = nVar.f746c;
                    layoutParams32.windowAnimations = nVar.f749f;
                    windowManager.addView(nVar.g, layoutParams32);
                    nVar.o = true;
                    return;
                }
                return;
            }
            G(nVar, true);
        }
    }

    private boolean n0(n nVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.h hVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((nVar.m || o0(nVar, keyEvent)) && (hVar = nVar.j) != null) {
            z2 = hVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.k == null) {
            G(nVar, true);
        }
        return z2;
    }

    private boolean o0(n nVar, KeyEvent keyEvent) {
        androidx.appcompat.widget.m mVar;
        androidx.appcompat.widget.m mVar2;
        androidx.appcompat.widget.m mVar3;
        if (this.I) {
            return false;
        }
        if (nVar.m) {
            return true;
        }
        n nVar2 = this.G;
        if (!(nVar2 == null || nVar2 == nVar)) {
            G(nVar2, false);
        }
        Window.Callback U2 = U();
        if (U2 != null) {
            nVar.i = U2.onCreatePanelView(nVar.f744a);
        }
        int i2 = nVar.f744a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (mVar3 = this.k) != null) {
            mVar3.setMenuPrepared();
        }
        if (nVar.i == null && (!z2 || !(m0() instanceof k))) {
            if (nVar.j == null || nVar.r) {
                if (nVar.j == null && (!Y(nVar) || nVar.j == null)) {
                    return false;
                }
                if (z2 && this.k != null) {
                    if (this.l == null) {
                        this.l = new i();
                    }
                    this.k.setMenu(nVar.j, this.l);
                }
                nVar.j.h0();
                if (!U2.onCreatePanelMenu(nVar.f744a, nVar.j)) {
                    nVar.c((androidx.appcompat.view.menu.h) null);
                    if (z2 && (mVar2 = this.k) != null) {
                        mVar2.setMenu((Menu) null, this.l);
                    }
                    return false;
                }
                nVar.r = false;
            }
            nVar.j.h0();
            Bundle bundle = nVar.s;
            if (bundle != null) {
                nVar.j.R(bundle);
                nVar.s = null;
            }
            if (!U2.onPreparePanel(0, nVar.i, nVar.j)) {
                if (z2 && (mVar = this.k) != null) {
                    mVar.setMenu((Menu) null, this.l);
                }
                nVar.j.g0();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            nVar.p = z3;
            nVar.j.setQwertyMode(z3);
            nVar.j.g0();
        }
        nVar.m = true;
        nVar.n = false;
        this.G = nVar;
        return true;
    }

    private void p0(androidx.appcompat.view.menu.h hVar, boolean z2) {
        androidx.appcompat.widget.m mVar = this.k;
        if (mVar == null || !mVar.b() || (ViewConfiguration.get(this.f720c).hasPermanentMenuKey() && !this.k.c())) {
            n S2 = S(0, true);
            S2.q = true;
            G(S2, false);
            l0(S2, (KeyEvent) null);
            return;
        }
        Window.Callback U2 = U();
        if (this.k.a() && z2) {
            this.k.d();
            if (!this.I) {
                U2.onPanelClosed(108, S(0, true).j);
            }
        } else if (U2 != null && !this.I) {
            if (this.M && (this.N & 1) != 0) {
                this.f721d.getDecorView().removeCallbacks(this.O);
                this.O.run();
            }
            n S3 = S(0, true);
            androidx.appcompat.view.menu.h hVar2 = S3.j;
            if (hVar2 != null && !S3.r && U2.onPreparePanel(0, S3.i, hVar2)) {
                U2.onMenuOpened(108, S3.j);
                this.k.e();
            }
        }
    }

    private int q0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i2 != 9) {
            return i2;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    private boolean s0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f721d.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || t.H((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean t0() {
        if (this.K) {
            Context context = this.f720c;
            if (context instanceof Activity) {
                try {
                    if ((context.getPackageManager().getActivityInfo(new ComponentName(this.f720c, this.f720c.getClass()), 0).configChanges & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
                        return true;
                    }
                    return false;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                    return true;
                }
            }
        }
        return false;
    }

    private void w0() {
        if (this.t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private boolean x0(int i2) {
        Resources resources = this.f720c.getResources();
        Configuration configuration = resources.getConfiguration();
        int i3 = configuration.uiMode & 48;
        int i4 = i2 == 2 ? 32 : 16;
        if (i3 == i4) {
            return false;
        }
        if (t0()) {
            ((Activity) this.f720c).recreate();
            return true;
        }
        Configuration configuration2 = new Configuration(configuration);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration2.uiMode = i4 | (configuration2.uiMode & -49);
        resources.updateConfiguration(configuration2, displayMetrics);
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        j.a(resources);
        return true;
    }

    public void A(Toolbar toolbar) {
        if (this.f722e instanceof Activity) {
            a k2 = k();
            if (!(k2 instanceof n)) {
                this.i = null;
                if (k2 != null) {
                    k2.o();
                }
                if (toolbar != null) {
                    k kVar = new k(toolbar, ((Activity) this.f722e).getTitle(), this.f723f);
                    this.h = kVar;
                    this.f721d.setCallback(kVar.B());
                } else {
                    this.h = null;
                    this.f721d.setCallback(this.f723f);
                }
                m();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public final void B(CharSequence charSequence) {
        this.j = charSequence;
        androidx.appcompat.widget.m mVar = this.k;
        if (mVar != null) {
            mVar.setWindowTitle(charSequence);
        } else if (m0() != null) {
            m0().x(charSequence);
        } else {
            TextView textView = this.v;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void D(int i2, n nVar, Menu menu) {
        if (menu == null) {
            if (nVar == null && i2 >= 0) {
                n[] nVarArr = this.F;
                if (i2 < nVarArr.length) {
                    nVar = nVarArr[i2];
                }
            }
            if (nVar != null) {
                menu = nVar.j;
            }
        }
        if ((nVar == null || nVar.o) && !this.I) {
            this.f722e.onPanelClosed(i2, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void E(androidx.appcompat.view.menu.h hVar) {
        if (!this.E) {
            this.E = true;
            this.k.g();
            Window.Callback U2 = U();
            if (U2 != null && !this.I) {
                U2.onPanelClosed(108, hVar);
            }
            this.E = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void F(int i2) {
        G(S(i2, true), true);
    }

    /* access modifiers changed from: package-private */
    public void G(n nVar, boolean z2) {
        ViewGroup viewGroup;
        androidx.appcompat.widget.m mVar;
        if (!z2 || nVar.f744a != 0 || (mVar = this.k) == null || !mVar.a()) {
            WindowManager windowManager = (WindowManager) this.f720c.getSystemService("window");
            if (!(windowManager == null || !nVar.o || (viewGroup = nVar.g) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    D(nVar.f744a, nVar, (Menu) null);
                }
            }
            nVar.m = false;
            nVar.n = false;
            nVar.o = false;
            nVar.h = null;
            nVar.q = true;
            if (this.G == nVar) {
                this.G = null;
                return;
            }
            return;
        }
        E(nVar.j);
    }

    public View I(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        boolean z3 = false;
        if (this.S == null) {
            String string = this.f720c.obtainStyledAttributes(a.a.j.AppCompatTheme).getString(a.a.j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.S = new AppCompatViewInflater();
            } else {
                try {
                    this.S = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.S = new AppCompatViewInflater();
                }
            }
        }
        if (T) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z3 = s0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z3 = true;
            }
            z2 = z3;
        } else {
            z2 = false;
        }
        return this.S.createView(view, str, context, attributeSet, z2, T, true, g0.b());
    }

    /* access modifiers changed from: package-private */
    public void J() {
        androidx.appcompat.view.menu.h hVar;
        androidx.appcompat.widget.m mVar = this.k;
        if (mVar != null) {
            mVar.g();
        }
        if (this.p != null) {
            this.f721d.getDecorView().removeCallbacks(this.q);
            if (this.p.isShowing()) {
                try {
                    this.p.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.p = null;
        }
        M();
        n S2 = S(0, false);
        if (S2 != null && (hVar = S2.j) != null) {
            hVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean K(KeyEvent keyEvent) {
        View decorView;
        Window.Callback callback = this.f722e;
        boolean z2 = true;
        if (((callback instanceof e.a) || (callback instanceof i)) && (decorView = this.f721d.getDecorView()) != null && a.h.k.e.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f722e.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z2 = false;
        }
        return z2 ? d0(keyCode, keyEvent) : g0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public void L(int i2) {
        n S2;
        n S3 = S(i2, true);
        if (S3.j != null) {
            Bundle bundle = new Bundle();
            S3.j.T(bundle);
            if (bundle.size() > 0) {
                S3.s = bundle;
            }
            S3.j.h0();
            S3.j.clear();
        }
        S3.r = true;
        S3.q = true;
        if ((i2 == 108 || i2 == 0) && this.k != null && (S2 = S(0, false)) != null) {
            S2.m = false;
            o0(S2, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void M() {
        x xVar = this.r;
        if (xVar != null) {
            xVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public n P(Menu menu) {
        n[] nVarArr = this.F;
        int length = nVarArr != null ? nVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            n nVar = nVarArr[i2];
            if (nVar != null && nVar.j == menu) {
                return nVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Context Q() {
        a k2 = k();
        Context j2 = k2 != null ? k2.j() : null;
        return j2 == null ? this.f720c : j2;
    }

    /* access modifiers changed from: protected */
    public n S(int i2, boolean z2) {
        n[] nVarArr = this.F;
        if (nVarArr == null || nVarArr.length <= i2) {
            n[] nVarArr2 = new n[(i2 + 1)];
            if (nVarArr != null) {
                System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
            }
            this.F = nVarArr2;
            nVarArr = nVarArr2;
        }
        n nVar = nVarArr[i2];
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(i2);
        nVarArr[i2] = nVar2;
        return nVar2;
    }

    /* access modifiers changed from: package-private */
    public final CharSequence T() {
        Window.Callback callback = this.f722e;
        if (callback instanceof Activity) {
            return ((Activity) callback).getTitle();
        }
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback U() {
        return this.f721d.getCallback();
    }

    public boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
        n P2;
        Window.Callback U2 = U();
        if (U2 == null || this.I || (P2 = P(hVar.F())) == null) {
            return false;
        }
        return U2.onMenuItemSelected(P2.f744a, menuItem);
    }

    public boolean a0() {
        return this.s;
    }

    public void b(androidx.appcompat.view.menu.h hVar) {
        p0(hVar, true);
    }

    /* access modifiers changed from: package-private */
    public int b0(int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f720c.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        N();
        return this.L.c();
    }

    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        O();
        ((ViewGroup) this.u.findViewById(16908290)).addView(view, layoutParams);
        this.f722e.onContentChanged();
    }

    /* access modifiers changed from: package-private */
    public boolean c0() {
        a.a.n.b bVar = this.n;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        a k2 = k();
        if (k2 == null || !k2.g()) {
            return false;
        }
        return true;
    }

    public boolean d() {
        int R2 = R();
        int b0 = b0(R2);
        boolean x0 = b0 != -1 ? x0(b0) : false;
        if (R2 == 0) {
            N();
            this.L.d();
        }
        this.K = true;
        return x0;
    }

    /* access modifiers changed from: package-private */
    public boolean d0(int i2, KeyEvent keyEvent) {
        boolean z2 = true;
        if (i2 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z2 = false;
            }
            this.H = z2;
        } else if (i2 == 82) {
            e0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean f0(int i2, KeyEvent keyEvent) {
        a k2 = k();
        if (k2 != null && k2.p(i2, keyEvent)) {
            return true;
        }
        n nVar = this.G;
        if (nVar == null || !n0(nVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.G == null) {
                n S2 = S(0, true);
                o0(S2, keyEvent);
                boolean n0 = n0(S2, keyEvent.getKeyCode(), keyEvent, 1);
                S2.m = false;
                if (n0) {
                    return true;
                }
            }
            return false;
        }
        n nVar2 = this.G;
        if (nVar2 != null) {
            nVar2.n = true;
        }
        return true;
    }

    public <T extends View> T g(int i2) {
        O();
        return this.f721d.findViewById(i2);
    }

    /* access modifiers changed from: package-private */
    public boolean g0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z2 = this.H;
            this.H = false;
            n S2 = S(0, false);
            if (S2 != null && S2.o) {
                if (!z2) {
                    G(S2, true);
                }
                return true;
            } else if (c0()) {
                return true;
            }
        } else if (i2 == 82) {
            h0(0, keyEvent);
            return true;
        }
        return false;
    }

    public final b.C0032b i() {
        return new C0033h();
    }

    /* access modifiers changed from: package-private */
    public void i0(int i2) {
        a k2;
        if (i2 == 108 && (k2 = k()) != null) {
            k2.h(true);
        }
    }

    public MenuInflater j() {
        if (this.i == null) {
            V();
            a aVar = this.h;
            this.i = new a.a.n.g(aVar != null ? aVar.j() : this.f720c);
        }
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public void j0(int i2) {
        if (i2 == 108) {
            a k2 = k();
            if (k2 != null) {
                k2.h(false);
            }
        } else if (i2 == 0) {
            n S2 = S(i2, true);
            if (S2.o) {
                G(S2, false);
            }
        }
    }

    public a k() {
        V();
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public void k0(ViewGroup viewGroup) {
    }

    public void l() {
        LayoutInflater from = LayoutInflater.from(this.f720c);
        if (from.getFactory() == null) {
            a.h.k.f.b(from, this);
        } else if (!(from.getFactory2() instanceof h)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void m() {
        a k2 = k();
        if (k2 == null || !k2.m()) {
            Z(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final a m0() {
        return this.h;
    }

    public void n(Configuration configuration) {
        a k2;
        if (this.z && this.t && (k2 = k()) != null) {
            k2.n(configuration);
        }
        androidx.appcompat.widget.f.n().y(this.f720c);
        d();
    }

    public void o(Bundle bundle) {
        Window.Callback callback = this.f722e;
        if (callback instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.e.c((Activity) callback);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a m0 = m0();
                if (m0 == null) {
                    this.P = true;
                } else {
                    m0.s(true);
                }
            }
        }
        if (bundle != null && this.J == -100) {
            this.J = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return I(view, str, context, attributeSet);
    }

    public void p() {
        if (this.M) {
            this.f721d.getDecorView().removeCallbacks(this.O);
        }
        this.I = true;
        a aVar = this.h;
        if (aVar != null) {
            aVar.o();
        }
        l lVar = this.L;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void q(Bundle bundle) {
        O();
    }

    public void r() {
        a k2 = k();
        if (k2 != null) {
            k2.v(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.u;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r0() {
        /*
            r1 = this;
            boolean r0 = r1.t
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.u
            if (r0 == 0) goto L_0x0010
            boolean r0 = a.h.k.t.I(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.r0():boolean");
    }

    public void s(Bundle bundle) {
        int i2 = this.J;
        if (i2 != -100) {
            bundle.putInt("appcompat:local_night_mode", i2);
        }
    }

    public void t() {
        d();
    }

    public void u() {
        a k2 = k();
        if (k2 != null) {
            k2.v(false);
        }
        l lVar = this.L;
        if (lVar != null) {
            lVar.a();
        }
    }

    public a.a.n.b u0(b.a aVar) {
        f fVar;
        if (aVar != null) {
            a.a.n.b bVar = this.n;
            if (bVar != null) {
                bVar.c();
            }
            j jVar = new j(aVar);
            a k2 = k();
            if (k2 != null) {
                a.a.n.b z2 = k2.z(jVar);
                this.n = z2;
                if (!(z2 == null || (fVar = this.g) == null)) {
                    fVar.n(z2);
                }
            }
            if (this.n == null) {
                this.n = v0(jVar);
            }
            return this.n;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public boolean v(int i2) {
        int q0 = q0(i2);
        if (this.D && q0 == 108) {
            return false;
        }
        if (this.z && q0 == 1) {
            this.z = false;
        }
        if (q0 == 1) {
            w0();
            this.D = true;
            return true;
        } else if (q0 == 2) {
            w0();
            this.x = true;
            return true;
        } else if (q0 == 5) {
            w0();
            this.y = true;
            return true;
        } else if (q0 == 10) {
            w0();
            this.B = true;
            return true;
        } else if (q0 == 108) {
            w0();
            this.z = true;
            return true;
        } else if (q0 != 109) {
            return this.f721d.requestFeature(q0);
        } else {
            w0();
            this.A = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a.a.n.b v0(a.a.n.b.a r8) {
        /*
            r7 = this;
            r7.M()
            a.a.n.b r0 = r7.n
            if (r0 == 0) goto L_0x000a
            r0.c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.h.j
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.h$j r0 = new androidx.appcompat.app.h$j
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.f r0 = r7.g
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.I
            if (r2 != 0) goto L_0x0022
            a.a.n.b r0 = r0.I(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.n = r0
            goto L_0x0161
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.o
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.C
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f720c
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = a.a.a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f720c
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            a.a.n.d r4 = new a.a.n.d
            android.content.Context r6 = r7.f720c
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f720c
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.o = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = a.a.a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.p = r5
            r6 = 2
            androidx.core.widget.h.b(r5, r6)
            android.widget.PopupWindow r5 = r7.p
            androidx.appcompat.widget.ActionBarContextView r6 = r7.o
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.p
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = a.a.a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.o
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.p
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.h$f r0 = new androidx.appcompat.app.h$f
            r0.<init>()
            r7.q = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.u
            int r4 = a.a.f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.Q()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.o = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.o
            if (r0 == 0) goto L_0x0161
            r7.M()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.o
            r0.k()
            a.a.n.e r0 = new a.a.n.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.o
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.o
            android.widget.PopupWindow r6 = r7.p
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.e()
            boolean r8 = r8.b(r0, r3)
            if (r8 == 0) goto L_0x015f
            r0.k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.o
            r8.h(r0)
            r7.n = r0
            boolean r8 = r7.r0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0129
            androidx.appcompat.widget.ActionBarContextView r8 = r7.o
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.o
            a.h.k.x r8 = a.h.k.t.b(r8)
            r8.a(r0)
            r7.r = r8
            androidx.appcompat.app.h$g r0 = new androidx.appcompat.app.h$g
            r0.<init>()
            r8.f(r0)
            goto L_0x014f
        L_0x0129:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.o
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.o
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.o
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.o
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x014f
            androidx.appcompat.widget.ActionBarContextView r8 = r7.o
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            a.h.k.t.X(r8)
        L_0x014f:
            android.widget.PopupWindow r8 = r7.p
            if (r8 == 0) goto L_0x0161
            android.view.Window r8 = r7.f721d
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.q
            r8.post(r0)
            goto L_0x0161
        L_0x015f:
            r7.n = r1
        L_0x0161:
            a.a.n.b r8 = r7.n
            if (r8 == 0) goto L_0x016c
            androidx.appcompat.app.f r0 = r7.g
            if (r0 == 0) goto L_0x016c
            r0.n(r8)
        L_0x016c:
            a.a.n.b r8 = r7.n
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.v0(a.a.n.b$a):a.a.n.b");
    }

    public void w(int i2) {
        O();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f720c).inflate(i2, viewGroup);
        this.f722e.onContentChanged();
    }

    public void x(View view) {
        O();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f722e.onContentChanged();
    }

    public void y(View view, ViewGroup.LayoutParams layoutParams) {
        O();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f722e.onContentChanged();
    }

    /* access modifiers changed from: package-private */
    public int y0(int i2) {
        boolean z2;
        boolean z3;
        ActionBarContextView actionBarContextView = this.o;
        int i3 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            boolean z4 = true;
            if (this.o.isShown()) {
                if (this.Q == null) {
                    this.Q = new Rect();
                    this.R = new Rect();
                }
                Rect rect = this.Q;
                Rect rect2 = this.R;
                rect.set(0, i2, 0, 0);
                h0.a(this.u, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.w;
                    if (view == null) {
                        View view2 = new View(this.f720c);
                        this.w = view2;
                        view2.setBackgroundColor(this.f720c.getResources().getColor(a.a.c.abc_input_method_navigation_guard));
                        this.u.addView(this.w, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.w.setLayoutParams(layoutParams);
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.w == null) {
                    z4 = false;
                }
                if (!this.B && z4) {
                    i2 = 0;
                }
                boolean z5 = z4;
                z4 = z3;
                z2 = z5;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z4 = false;
            }
            if (z4) {
                this.o.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.w;
        if (view3 != null) {
            if (!z2) {
                i3 = 8;
            }
            view3.setVisibility(i3);
        }
        return i2;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* compiled from: AppCompatDelegateImpl */
    class k extends a.a.n.i {
        k(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        public final ActionMode a(ActionMode.Callback callback) {
            f.a aVar = new f.a(h.this.f720c, callback);
            a.a.n.b u0 = h.this.u0(aVar);
            if (u0 != null) {
                return aVar.e(u0);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.K(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.f0(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.h)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            h.this.i0(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            h.this.j0(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.h hVar = menu instanceof androidx.appcompat.view.menu.h ? (androidx.appcompat.view.menu.h) menu : null;
            if (i == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.e0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (hVar != null) {
                hVar.e0(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.h hVar;
            n S = h.this.S(0, true);
            if (S == null || (hVar = S.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, hVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (h.this.a0()) {
                return a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!h.this.a0() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return a(callback);
        }
    }
}
