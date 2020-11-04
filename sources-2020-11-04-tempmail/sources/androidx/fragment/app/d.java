package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.a;
import androidx.fragment.app.r;

/* compiled from: FragmentAnim */
class d {

    /* compiled from: FragmentAnim */
    static class a implements a.C0042a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f1509a;

        a(Fragment fragment) {
            this.f1509a = fragment;
        }

        public void a() {
            if (this.f1509a.E() != null) {
                View E = this.f1509a.E();
                this.f1509a.T1((View) null);
                E.clearAnimation();
            }
            this.f1509a.U1((Animator) null);
        }
    }

    /* compiled from: FragmentAnim */
    static class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1510a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f1511b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r.g f1512c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.a f1513d;

        /* compiled from: FragmentAnim */
        class a implements Runnable {
            a() {
            }

            public void run() {
                if (b.this.f1511b.E() != null) {
                    b.this.f1511b.T1((View) null);
                    b bVar = b.this;
                    bVar.f1512c.a(bVar.f1511b, bVar.f1513d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, r.g gVar, androidx.core.os.a aVar) {
            this.f1510a = viewGroup;
            this.f1511b = fragment;
            this.f1512c = gVar;
            this.f1513d = aVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f1510a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: FragmentAnim */
    static class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1516b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1517c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r.g f1518d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.a f1519e;

        c(ViewGroup viewGroup, View view, Fragment fragment, r.g gVar, androidx.core.os.a aVar) {
            this.f1515a = viewGroup;
            this.f1516b = view;
            this.f1517c = fragment;
            this.f1518d = gVar;
            this.f1519e = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1515a.endViewTransition(this.f1516b);
            Animator F = this.f1517c.F();
            this.f1517c.U1((Animator) null);
            if (F != null && this.f1515a.indexOfChild(this.f1516b) < 0) {
                this.f1518d.a(this.f1517c, this.f1519e);
            }
        }
    }

    static void a(Fragment fragment, C0045d dVar, r.g gVar) {
        View view = fragment.H;
        ViewGroup viewGroup = fragment.G;
        viewGroup.startViewTransition(view);
        androidx.core.os.a aVar = new androidx.core.os.a();
        aVar.c(new a(fragment));
        gVar.b(fragment, aVar);
        if (dVar.f1520a != null) {
            e eVar = new e(dVar.f1520a, viewGroup, view);
            fragment.T1(fragment.H);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, aVar));
            fragment.H.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f1521b;
        fragment.U1(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, aVar));
        animator.setTarget(fragment.H);
        animator.start();
    }

    static C0045d b(Context context, e eVar, Fragment fragment, boolean z) {
        int c2;
        int Z = fragment.Z();
        int Y = fragment.Y();
        boolean z2 = false;
        fragment.Z1(0);
        View b2 = eVar.b(fragment.x);
        if (!(b2 == null || b2.getTag(a.k.b.visible_removing_fragment_view_tag) == null)) {
            b2.setTag(a.k.b.visible_removing_fragment_view_tag, (Object) null);
        }
        ViewGroup viewGroup = fragment.G;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation N0 = fragment.N0(Z, z, Y);
        if (N0 != null) {
            return new C0045d(N0);
        }
        Animator O0 = fragment.O0(Z, z, Y);
        if (O0 != null) {
            return new C0045d(O0);
        }
        if (Y != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(Y));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, Y);
                    if (loadAnimation != null) {
                        return new C0045d(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, Y);
                    if (loadAnimator != null) {
                        return new C0045d(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, Y);
                        if (loadAnimation2 != null) {
                            return new C0045d(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (Z != 0 && (c2 = c(Z, z)) >= 0) {
            return new C0045d(AnimationUtils.loadAnimation(context, c2));
        }
        return null;
    }

    private static int c(int i, boolean z) {
        if (i == 4097) {
            return z ? a.k.a.fragment_open_enter : a.k.a.fragment_open_exit;
        }
        if (i == 4099) {
            return z ? a.k.a.fragment_fade_enter : a.k.a.fragment_fade_exit;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? a.k.a.fragment_close_enter : a.k.a.fragment_close_exit;
    }

    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    /* compiled from: FragmentAnim */
    static class C0045d {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f1520a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f1521b;

        C0045d(Animation animation) {
            this.f1520a = animation;
            this.f1521b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C0045d(Animator animator) {
            this.f1520a = null;
            this.f1521b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: FragmentAnim */
    private static class e extends AnimationSet implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final ViewGroup f1522b;

        /* renamed from: c  reason: collision with root package name */
        private final View f1523c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1524d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1525e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1526f = true;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1522b = viewGroup;
            this.f1523c = view;
            addAnimation(animation);
            this.f1522b.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f1526f = true;
            if (this.f1524d) {
                return !this.f1525e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f1524d = true;
                a.h.k.r.a(this.f1522b, this);
            }
            return true;
        }

        public void run() {
            if (this.f1524d || !this.f1526f) {
                this.f1522b.endViewTransition(this.f1523c);
                this.f1525e = true;
                return;
            }
            this.f1526f = false;
            this.f1522b.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f2) {
            this.f1526f = true;
            if (this.f1524d) {
                return !this.f1525e;
            }
            if (!super.getTransformation(j, transformation, f2)) {
                this.f1524d = true;
                a.h.k.r.a(this.f1522b, this);
            }
            return true;
        }
    }
}
