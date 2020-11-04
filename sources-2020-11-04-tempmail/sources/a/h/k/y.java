package a.h.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f428a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f429b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f430c = null;

    /* renamed from: d  reason: collision with root package name */
    int f431d = -1;

    /* compiled from: ViewPropertyAnimatorCompat */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f432a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f433b;

        a(y yVar, z zVar, View view) {
            this.f432a = zVar;
            this.f433b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f432a.a(this.f433b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f432a.b(this.f433b);
        }

        public void onAnimationStart(Animator animator) {
            this.f432a.c(this.f433b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f434a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f435b;

        b(y yVar, b0 b0Var, View view) {
            this.f434a = b0Var;
            this.f435b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f434a.a(this.f435b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    static class c implements z {

        /* renamed from: a  reason: collision with root package name */
        y f436a;

        /* renamed from: b  reason: collision with root package name */
        boolean f437b;

        c(y yVar) {
            this.f436a = yVar;
        }

        public void a(View view) {
            Object tag = view.getTag(2113929216);
            z zVar = tag instanceof z ? (z) tag : null;
            if (zVar != null) {
                zVar.a(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: a.h.k.z} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(android.view.View r4) {
            /*
                r3 = this;
                a.h.k.y r0 = r3.f436a
                int r0 = r0.f431d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                a.h.k.y r0 = r3.f436a
                r0.f431d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.f437b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                a.h.k.y r0 = r3.f436a
                java.lang.Runnable r1 = r0.f430c
                if (r1 == 0) goto L_0x0024
                r0.f430c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof a.h.k.z
                if (r1 == 0) goto L_0x0031
                r2 = r0
                a.h.k.z r2 = (a.h.k.z) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.b(r4)
            L_0x0036:
                r4 = 1
                r3.f437b = r4
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.h.k.y.c.b(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: a.h.k.z} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f437b = r0
                a.h.k.y r0 = r3.f436a
                int r0 = r0.f431d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                a.h.k.y r0 = r3.f436a
                java.lang.Runnable r2 = r0.f429b
                if (r2 == 0) goto L_0x001a
                r0.f429b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof a.h.k.z
                if (r2 == 0) goto L_0x0027
                r1 = r0
                a.h.k.z r1 = (a.h.k.z) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.c(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.h.k.y.c.c(android.view.View):void");
        }
    }

    y(View view) {
        this.f428a = new WeakReference<>(view);
    }

    private void g(View view, z zVar) {
        if (zVar != null) {
            view.animate().setListener(new a(this, zVar, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public y a(float f2) {
        View view = (View) this.f428a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = (View) this.f428a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = (View) this.f428a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public y d(long j) {
        View view = (View) this.f428a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public y e(Interpolator interpolator) {
        View view = (View) this.f428a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public y f(z zVar) {
        View view = (View) this.f428a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                g(view, zVar);
            } else {
                view.setTag(2113929216, zVar);
                g(view, new c(this));
            }
        }
        return this;
    }

    public y h(long j) {
        View view = (View) this.f428a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public y i(b0 b0Var) {
        View view = (View) this.f428a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            b bVar = null;
            if (b0Var != null) {
                bVar = new b(this, b0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public void j() {
        View view = (View) this.f428a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public y k(float f2) {
        View view = (View) this.f428a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
