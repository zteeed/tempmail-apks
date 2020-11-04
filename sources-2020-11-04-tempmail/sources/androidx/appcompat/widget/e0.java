package androidx.appcompat.widget;

import a.h.k.u;
import a.h.k.v;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* compiled from: TooltipCompatHandler */
class e0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static e0 k;
    private static e0 l;

    /* renamed from: b  reason: collision with root package name */
    private final View f1121b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f1122c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1123d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f1124e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f1125f = new b();
    private int g;
    private int h;
    private f0 i;
    private boolean j;

    /* compiled from: TooltipCompatHandler */
    class a implements Runnable {
        a() {
        }

        public void run() {
            e0.this.g(false);
        }
    }

    /* compiled from: TooltipCompatHandler */
    class b implements Runnable {
        b() {
        }

        public void run() {
            e0.this.c();
        }
    }

    private e0(View view, CharSequence charSequence) {
        this.f1121b = view;
        this.f1122c = charSequence;
        this.f1123d = v.c(ViewConfiguration.get(view.getContext()));
        b();
        this.f1121b.setOnLongClickListener(this);
        this.f1121b.setOnHoverListener(this);
    }

    private void a() {
        this.f1121b.removeCallbacks(this.f1124e);
    }

    private void b() {
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
    }

    private void d() {
        this.f1121b.postDelayed(this.f1124e, (long) ViewConfiguration.getLongPressTimeout());
    }

    private static void e(e0 e0Var) {
        e0 e0Var2 = k;
        if (e0Var2 != null) {
            e0Var2.a();
        }
        k = e0Var;
        if (e0Var != null) {
            e0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        e0 e0Var = k;
        if (e0Var != null && e0Var.f1121b == view) {
            e((e0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            e0 e0Var2 = l;
            if (e0Var2 != null && e0Var2.f1121b == view) {
                e0Var2.c();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new e0(view, charSequence);
    }

    private boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.g) <= this.f1123d && Math.abs(y - this.h) <= this.f1123d) {
            return false;
        }
        this.g = x;
        this.h = y;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (l == this) {
            l = null;
            f0 f0Var = this.i;
            if (f0Var != null) {
                f0Var.c();
                this.i = null;
                b();
                this.f1121b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            e((e0) null);
        }
        this.f1121b.removeCallbacks(this.f1125f);
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z) {
        long j2;
        int i2;
        long j3;
        if (u.H(this.f1121b)) {
            e((e0) null);
            e0 e0Var = l;
            if (e0Var != null) {
                e0Var.c();
            }
            l = this;
            this.j = z;
            f0 f0Var = new f0(this.f1121b.getContext());
            this.i = f0Var;
            f0Var.e(this.f1121b, this.g, this.h, this.j, this.f1122c);
            this.f1121b.addOnAttachStateChangeListener(this);
            if (this.j) {
                j2 = 2500;
            } else {
                if ((u.A(this.f1121b) & 1) == 1) {
                    j3 = 3000;
                    i2 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j3 = 15000;
                    i2 = ViewConfiguration.getLongPressTimeout();
                }
                j2 = j3 - ((long) i2);
            }
            this.f1121b.removeCallbacks(this.f1125f);
            this.f1121b.postDelayed(this.f1125f, j2);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.i != null && this.j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1121b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f1121b.isEnabled() && this.i == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.g = view.getWidth() / 2;
        this.h = view.getHeight() / 2;
        g(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
