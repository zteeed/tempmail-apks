package com.google.android.material.snackbar;

import a.h.k.c0;
import a.h.k.d0.c;
import a.h.k.q;
import a.h.k.u;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.b;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    static final Handler j = new Handler(Looper.getMainLooper(), new c());
    /* access modifiers changed from: private */
    public static final boolean k;
    private static final int[] l = {b.c.a.d.b.snackbarStyle};

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f11057a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11058b;

    /* renamed from: c  reason: collision with root package name */
    protected final SnackbarBaseLayout f11059c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final a f11060d;

    /* renamed from: e  reason: collision with root package name */
    private int f11061e;

    /* renamed from: f  reason: collision with root package name */
    private List<l<B>> f11062f;
    private Behavior g;
    private final AccessibilityManager h;
    final b.C0099b i = new f();

    public static class Behavior extends SwipeDismissBehavior<View> {
        private final m k = new m(this);

        /* access modifiers changed from: private */
        public void N(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.k.c(baseTransientBottomBar);
        }

        public boolean D(View view) {
            return this.k.a(view);
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    protected static class SnackbarBaseLayout extends FrameLayout {

        /* renamed from: b  reason: collision with root package name */
        private final AccessibilityManager f11063b;

        /* renamed from: c  reason: collision with root package name */
        private final c.a f11064c;

        /* renamed from: d  reason: collision with root package name */
        private o f11065d;

        /* renamed from: e  reason: collision with root package name */
        private n f11066e;

        class a implements c.a {
            a() {
            }

            public void onTouchExplorationStateChanged(boolean z) {
                SnackbarBaseLayout.this.setClickableOrFocusableBasedOnAccessibility(z);
            }
        }

        protected SnackbarBaseLayout(Context context) {
            this(context, (AttributeSet) null);
        }

        /* access modifiers changed from: private */
        public void setClickableOrFocusableBasedOnAccessibility(boolean z) {
            setClickable(!z);
            setFocusable(z);
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            n nVar = this.f11066e;
            if (nVar != null) {
                nVar.onViewAttachedToWindow(this);
            }
            u.X(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            n nVar = this.f11066e;
            if (nVar != null) {
                nVar.onViewDetachedFromWindow(this);
            }
            a.h.k.d0.c.b(this.f11063b, this.f11064c);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            o oVar = this.f11065d;
            if (oVar != null) {
                oVar.a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(n nVar) {
            this.f11066e = nVar;
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(o oVar) {
            this.f11065d = oVar;
        }

        protected SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.c.a.d.k.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(b.c.a.d.k.SnackbarLayout_elevation)) {
                u.f0(this, (float) obtainStyledAttributes.getDimensionPixelSize(b.c.a.d.k.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            this.f11063b = (AccessibilityManager) context.getSystemService("accessibility");
            a aVar = new a();
            this.f11064c = aVar;
            a.h.k.d0.c.a(this.f11063b, aVar);
            setClickableOrFocusableBasedOnAccessibility(this.f11063b.isTouchExplorationEnabled());
        }
    }

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11068a;

        a(int i) {
            this.f11068a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.o(this.f11068a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f11060d.b(0, 180);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private int f11070a = 0;

        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.k) {
                u.O(BaseTransientBottomBar.this.f11059c, intValue - this.f11070a);
            } else {
                BaseTransientBottomBar.this.f11059c.setTranslationY((float) intValue);
            }
            this.f11070a = intValue;
        }
    }

    static class c implements Handler.Callback {
        c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).t();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).m(message.arg1);
                return true;
            }
        }
    }

    class d implements q {
        d(BaseTransientBottomBar baseTransientBottomBar) {
        }

        public c0 a(View view, c0 c0Var) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), c0Var.b());
            return c0Var;
        }
    }

    class e extends a.h.k.a {
        e() {
        }

        public void g(View view, a.h.k.d0.d dVar) {
            super.g(view, dVar);
            dVar.a(1048576);
            dVar.f0(true);
        }

        public boolean j(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.j(view, i, bundle);
            }
            BaseTransientBottomBar.this.e();
            return true;
        }
    }

    class f implements b.C0099b {
        f() {
        }

        public void a(int i) {
            Handler handler = BaseTransientBottomBar.j;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        public void show() {
            Handler handler = BaseTransientBottomBar.j;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    class g implements SwipeDismissBehavior.b {
        g() {
        }

        public void a(View view) {
            view.setVisibility(8);
            BaseTransientBottomBar.this.f(0);
        }

        public void b(int i) {
            if (i == 0) {
                b.c().k(BaseTransientBottomBar.this.i);
            } else if (i == 1 || i == 2) {
                b.c().j(BaseTransientBottomBar.this.i);
            }
        }
    }

    class h implements n {

        class a implements Runnable {
            a() {
            }

            public void run() {
                BaseTransientBottomBar.this.o(3);
            }
        }

        h() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.n()) {
                BaseTransientBottomBar.j.post(new a());
            }
        }
    }

    class i implements o {
        i() {
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            BaseTransientBottomBar.this.f11059c.setOnLayoutChangeListener((o) null);
            if (BaseTransientBottomBar.this.r()) {
                BaseTransientBottomBar.this.c();
            } else {
                BaseTransientBottomBar.this.p();
            }
        }
    }

    class j extends AnimatorListenerAdapter {
        j() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.p();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f11060d.a(70, 180);
        }
    }

    class k implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private int f11079a = this.f11080b;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11080b;

        k(int i) {
            this.f11080b = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.k) {
                u.O(BaseTransientBottomBar.this.f11059c, intValue - this.f11079a);
            } else {
                BaseTransientBottomBar.this.f11059c.setTranslationY((float) intValue);
            }
            this.f11079a = intValue;
        }
    }

    public static abstract class l<B> {
        public void a(B b2, int i) {
        }

        public void b(B b2) {
        }
    }

    public static class m {

        /* renamed from: a  reason: collision with root package name */
        private b.C0099b f11082a;

        public m(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.K(0.1f);
            swipeDismissBehavior.I(0.6f);
            swipeDismissBehavior.L(0);
        }

        public boolean a(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    b.c().k(this.f11082a);
                }
            } else if (coordinatorLayout.F(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                b.c().j(this.f11082a);
            }
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f11082a = baseTransientBottomBar.i;
        }
    }

    protected interface n {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    protected interface o {
        void a(View view, int i, int i2, int i3, int i4);
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        k = i2 >= 16 && i2 <= 19;
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f11057a = viewGroup;
            this.f11060d = aVar;
            Context context = viewGroup.getContext();
            this.f11058b = context;
            com.google.android.material.internal.k.a(context);
            SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(this.f11058b).inflate(j(), this.f11057a, false);
            this.f11059c = snackbarBaseLayout;
            snackbarBaseLayout.addView(view);
            u.a0(this.f11059c, 1);
            u.i0(this.f11059c, 1);
            u.g0(this.f11059c, true);
            u.l0(this.f11059c, new d(this));
            u.Z(this.f11059c, new e());
            this.h = (AccessibilityManager) this.f11058b.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    private void d(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, k()});
        valueAnimator.setInterpolator(b.c.a.d.l.a.f2364b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new a(i2));
        valueAnimator.addUpdateListener(new b());
        valueAnimator.start();
    }

    private int k() {
        int height = this.f11059c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f11059c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        int k2 = k();
        if (k) {
            u.O(this.f11059c, k2);
        } else {
            this.f11059c.setTranslationY((float) k2);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{k2, 0});
        valueAnimator.setInterpolator(b.c.a.d.l.a.f2364b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new j());
        valueAnimator.addUpdateListener(new k(k2));
        valueAnimator.start();
    }

    public void e() {
        f(3);
    }

    /* access modifiers changed from: protected */
    public void f(int i2) {
        b.c().b(this.i, i2);
    }

    public Context g() {
        return this.f11058b;
    }

    public int h() {
        return this.f11061e;
    }

    /* access modifiers changed from: protected */
    public SwipeDismissBehavior<? extends View> i() {
        return new Behavior();
    }

    /* access modifiers changed from: protected */
    public int j() {
        return l() ? b.c.a.d.h.mtrl_layout_snackbar : b.c.a.d.h.design_layout_snackbar;
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        TypedArray obtainStyledAttributes = this.f11058b.obtainStyledAttributes(l);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void m(int i2) {
        if (!r() || this.f11059c.getVisibility() != 0) {
            o(i2);
        } else {
            d(i2);
        }
    }

    public boolean n() {
        return b.c().e(this.i);
    }

    /* access modifiers changed from: package-private */
    public void o(int i2) {
        b.c().h(this.i);
        List<l<B>> list = this.f11062f;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f11062f.get(size).a(this, i2);
            }
        }
        ViewParent parent = this.f11059c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f11059c);
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        b.c().i(this.i);
        List<l<B>> list = this.f11062f;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f11062f.get(size).b(this);
            }
        }
    }

    public B q(int i2) {
        this.f11061e = i2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.h.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    public void s() {
        b.c().m(h(), this.i);
    }

    /* access modifiers changed from: package-private */
    public final void t() {
        if (this.f11059c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f11059c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
                SwipeDismissBehavior swipeDismissBehavior = this.g;
                if (swipeDismissBehavior == null) {
                    swipeDismissBehavior = i();
                }
                if (swipeDismissBehavior instanceof Behavior) {
                    ((Behavior) swipeDismissBehavior).N(this);
                }
                swipeDismissBehavior.J(new g());
                fVar.o(swipeDismissBehavior);
                fVar.g = 80;
            }
            this.f11057a.addView(this.f11059c);
        }
        this.f11059c.setOnAttachStateChangeListener(new h());
        if (!u.I(this.f11059c)) {
            this.f11059c.setOnLayoutChangeListener(new i());
        } else if (r()) {
            c();
        } else {
            p();
        }
    }
}
