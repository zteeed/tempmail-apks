package a.h.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f424a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f425b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f426c = null;

    /* renamed from: d  reason: collision with root package name */
    int f427d = -1;

    /* compiled from: ViewPropertyAnimatorCompat */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f428a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f429b;

        a(x xVar, y yVar, View view) {
            this.f428a = yVar;
            this.f429b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f428a.a(this.f429b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f428a.b(this.f429b);
        }

        public void onAnimationStart(Animator animator) {
            this.f428a.c(this.f429b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a0 f430a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f431b;

        b(x xVar, a0 a0Var, View view) {
            this.f430a = a0Var;
            this.f431b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f430a.a(this.f431b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    static class c implements y {

        /* renamed from: a  reason: collision with root package name */
        x f432a;

        /* renamed from: b  reason: collision with root package name */
        boolean f433b;

        c(x xVar) {
            this.f432a = xVar;
        }

        public void a(View view) {
            Object tag = view.getTag(2113929216);
            y yVar = tag instanceof y ? (y) tag : null;
            if (yVar != null) {
                yVar.a(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: a.h.k.y} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(android.view.View r4) {
            /*
                r3 = this;
                a.h.k.x r0 = r3.f432a
                int r0 = r0.f427d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                a.h.k.x r0 = r3.f432a
                r0.f427d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.f433b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                a.h.k.x r0 = r3.f432a
                java.lang.Runnable r1 = r0.f426c
                if (r1 == 0) goto L_0x0024
                r0.f426c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof a.h.k.y
                if (r1 == 0) goto L_0x0031
                r2 = r0
                a.h.k.y r2 = (a.h.k.y) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.b(r4)
            L_0x0036:
                r4 = 1
                r3.f433b = r4
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.h.k.x.c.b(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: a.h.k.y} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f433b = r0
                a.h.k.x r0 = r3.f432a
                int r0 = r0.f427d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                a.h.k.x r0 = r3.f432a
                java.lang.Runnable r2 = r0.f425b
                if (r2 == 0) goto L_0x001a
                r0.f425b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof a.h.k.y
                if (r2 == 0) goto L_0x0027
                r1 = r0
                a.h.k.y r1 = (a.h.k.y) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.c(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.h.k.x.c.c(android.view.View):void");
        }
    }

    x(View view) {
        this.f424a = new WeakReference<>(view);
    }

    private void g(View view, y yVar) {
        if (yVar != null) {
            view.animate().setListener(new a(this, yVar, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public x a(float f2) {
        View view = (View) this.f424a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = (View) this.f424a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = (View) this.f424a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public x d(long j) {
        View view = (View) this.f424a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public x e(Interpolator interpolator) {
        View view = (View) this.f424a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public x f(y yVar) {
        View view = (View) this.f424a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                g(view, yVar);
            } else {
                view.setTag(2113929216, yVar);
                g(view, new c(this));
            }
        }
        return this;
    }

    public x h(long j) {
        View view = (View) this.f424a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public x i(a0 a0Var) {
        View view = (View) this.f424a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            b bVar = null;
            if (a0Var != null) {
                bVar = new b(this, a0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public void j() {
        View view = (View) this.f424a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public x k(float f2) {
        View view = (View) this.f424a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
