package com.google.android.material.floatingactionbutton;

import a.h.k.t;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.VisibilityAwareImageButton;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FloatingActionButtonImpl */
class a {
    static final TimeInterpolator B = b.c.a.d.l.a.f2267c;
    static final int[] C = {16842919, 16842910};
    static final int[] D = {16843623, 16842908, 16842910};
    static final int[] E = {16842908, 16842910};
    static final int[] F = {16843623, 16842910};
    static final int[] G = {16842910};
    static final int[] H = new int[0];
    private ViewTreeObserver.OnPreDrawListener A;

    /* renamed from: a  reason: collision with root package name */
    int f10792a = 0;

    /* renamed from: b  reason: collision with root package name */
    Animator f10793b;

    /* renamed from: c  reason: collision with root package name */
    b.c.a.d.l.h f10794c;

    /* renamed from: d  reason: collision with root package name */
    b.c.a.d.l.h f10795d;

    /* renamed from: e  reason: collision with root package name */
    private b.c.a.d.l.h f10796e;

    /* renamed from: f  reason: collision with root package name */
    private b.c.a.d.l.h f10797f;
    private final com.google.android.material.internal.i g;
    b.c.a.d.s.a h;
    private float i;
    Drawable j;
    Drawable k;
    com.google.android.material.internal.a l;
    Drawable m;
    float n;
    float o;
    float p;
    int q;
    float r = 1.0f;
    private ArrayList<Animator.AnimatorListener> s;
    private ArrayList<Animator.AnimatorListener> t;
    final VisibilityAwareImageButton u;
    final b.c.a.d.s.b v;
    private final Rect w = new Rect();
    private final RectF x = new RectF();
    private final RectF y = new RectF();
    private final Matrix z = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a  reason: collision with other inner class name */
    /* compiled from: FloatingActionButtonImpl */
    class C0097a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10798a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f10799b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f10800c;

        C0097a(boolean z, g gVar) {
            this.f10799b = z;
            this.f10800c = gVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f10798a = true;
        }

        public void onAnimationEnd(Animator animator) {
            a aVar = a.this;
            aVar.f10792a = 0;
            aVar.f10793b = null;
            if (!this.f10798a) {
                aVar.u.b(this.f10799b ? 8 : 4, this.f10799b);
                g gVar = this.f10800c;
                if (gVar != null) {
                    gVar.b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            a.this.u.b(0, this.f10799b);
            a aVar = a.this;
            aVar.f10792a = 1;
            aVar.f10793b = animator;
            this.f10798a = false;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f10802a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f10803b;

        b(boolean z, g gVar) {
            this.f10802a = z;
            this.f10803b = gVar;
        }

        public void onAnimationEnd(Animator animator) {
            a aVar = a.this;
            aVar.f10792a = 0;
            aVar.f10793b = null;
            g gVar = this.f10803b;
            if (gVar != null) {
                gVar.a();
            }
        }

        public void onAnimationStart(Animator animator) {
            a.this.u.b(0, this.f10802a);
            a aVar = a.this;
            aVar.f10792a = 2;
            aVar.f10793b = animator;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    class c implements ViewTreeObserver.OnPreDrawListener {
        c() {
        }

        public boolean onPreDraw() {
            a.this.D();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private class d extends i {
        d(a aVar) {
            super(aVar, (C0097a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private class e extends i {
        e() {
            super(a.this, (C0097a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            a aVar = a.this;
            return aVar.n + aVar.o;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private class f extends i {
        f() {
            super(a.this, (C0097a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            a aVar = a.this;
            return aVar.n + aVar.p;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    interface g {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl */
    private class h extends i {
        h() {
            super(a.this, (C0097a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            return a.this.n;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    private abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f10809a;

        /* renamed from: b  reason: collision with root package name */
        private float f10810b;

        /* renamed from: c  reason: collision with root package name */
        private float f10811c;

        private i() {
        }

        /* access modifiers changed from: protected */
        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            a.this.h.k(this.f10811c);
            this.f10809a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f10809a) {
                this.f10810b = a.this.h.h();
                this.f10811c = a();
                this.f10809a = true;
            }
            b.c.a.d.s.a aVar = a.this.h;
            float f2 = this.f10810b;
            aVar.k(f2 + ((this.f10811c - f2) * valueAnimator.getAnimatedFraction()));
        }

        /* synthetic */ i(a aVar, C0097a aVar2) {
            this();
        }
    }

    a(VisibilityAwareImageButton visibilityAwareImageButton, b.c.a.d.s.b bVar) {
        this.u = visibilityAwareImageButton;
        this.v = bVar;
        com.google.android.material.internal.i iVar = new com.google.android.material.internal.i();
        this.g = iVar;
        iVar.a(C, f(new f()));
        this.g.a(D, f(new e()));
        this.g.a(E, f(new e()));
        this.g.a(F, f(new e()));
        this.g.a(G, f(new h()));
        this.g.a(H, f(new d(this)));
        this.i = this.u.getRotation();
    }

    private boolean S() {
        return t.I(this.u) && !this.u.isInEditMode();
    }

    private void U() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.i % 90.0f != 0.0f) {
                if (this.u.getLayerType() != 1) {
                    this.u.setLayerType(1, (Paint) null);
                }
            } else if (this.u.getLayerType() != 0) {
                this.u.setLayerType(0, (Paint) null);
            }
        }
        b.c.a.d.s.a aVar = this.h;
        if (aVar != null) {
            aVar.j(-this.i);
        }
        com.google.android.material.internal.a aVar2 = this.l;
        if (aVar2 != null) {
            aVar2.e(-this.i);
        }
    }

    private void c(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.u.getDrawable();
        if (drawable != null && this.q != 0) {
            RectF rectF = this.x;
            RectF rectF2 = this.y;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i2 = this.q;
            rectF2.set(0.0f, 0.0f, (float) i2, (float) i2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i3 = this.q;
            matrix.postScale(f2, f2, ((float) i3) / 2.0f, ((float) i3) / 2.0f);
        }
    }

    private AnimatorSet d(b.c.a.d.l.h hVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.u, View.ALPHA, new float[]{f2});
        hVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.u, View.SCALE_X, new float[]{f3});
        hVar.e("scale").a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.u, View.SCALE_Y, new float[]{f3});
        hVar.e("scale").a(ofFloat3);
        arrayList.add(ofFloat3);
        c(f4, this.z);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.u, new b.c.a.d.l.f(), new b.c.a.d.l.g(), new Matrix[]{new Matrix(this.z)});
        hVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        b.c.a.d.l.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private ValueAnimator f(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(B);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    private void h() {
        if (this.A == null) {
            this.A = new c();
        }
    }

    private b.c.a.d.l.h j() {
        if (this.f10797f == null) {
            this.f10797f = b.c.a.d.l.h.c(this.u.getContext(), b.c.a.d.a.design_fab_hide_motion_spec);
        }
        return this.f10797f;
    }

    private b.c.a.d.l.h k() {
        if (this.f10796e == null) {
            this.f10796e = b.c.a.d.l.h.c(this.u.getContext(), b.c.a.d.a.design_fab_show_motion_spec);
        }
        return this.f10796e;
    }

    /* access modifiers changed from: package-private */
    public void A(int[] iArr) {
        this.g.d(iArr);
    }

    /* access modifiers changed from: package-private */
    public void B(float f2, float f3, float f4) {
        b.c.a.d.s.a aVar = this.h;
        if (aVar != null) {
            aVar.l(f2, this.p + f2);
            W();
        }
    }

    /* access modifiers changed from: package-private */
    public void C(Rect rect) {
    }

    /* access modifiers changed from: package-private */
    public void D() {
        float rotation = this.u.getRotation();
        if (this.i != rotation) {
            this.i = rotation;
            U();
        }
    }

    public void E(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.t;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* access modifiers changed from: package-private */
    public void F(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.s;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void H(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        Drawable[] drawableArr;
        Drawable r2 = androidx.core.graphics.drawable.a.r(g());
        this.j = r2;
        androidx.core.graphics.drawable.a.o(r2, colorStateList);
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(this.j, mode);
        }
        Drawable r3 = androidx.core.graphics.drawable.a.r(g());
        this.k = r3;
        androidx.core.graphics.drawable.a.o(r3, b.c.a.d.r.a.a(colorStateList2));
        if (i2 > 0) {
            com.google.android.material.internal.a e2 = e(i2, colorStateList);
            this.l = e2;
            drawableArr = new Drawable[]{e2, this.j, this.k};
        } else {
            this.l = null;
            drawableArr = new Drawable[]{this.j, this.k};
        }
        this.m = new LayerDrawable(drawableArr);
        Context context = this.u.getContext();
        Drawable drawable = this.m;
        float d2 = this.v.d();
        float f2 = this.n;
        b.c.a.d.s.a aVar = new b.c.a.d.s.a(context, drawable, d2, f2, f2 + this.p);
        this.h = aVar;
        aVar.i(false);
        this.v.c(this.h);
    }

    /* access modifiers changed from: package-private */
    public void I(ColorStateList colorStateList) {
        Drawable drawable = this.j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
        com.google.android.material.internal.a aVar = this.l;
        if (aVar != null) {
            aVar.b(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void J(PorterDuff.Mode mode) {
        Drawable drawable = this.j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public final void K(float f2) {
        if (this.n != f2) {
            this.n = f2;
            B(f2, this.o, this.p);
        }
    }

    /* access modifiers changed from: package-private */
    public final void L(b.c.a.d.l.h hVar) {
        this.f10795d = hVar;
    }

    /* access modifiers changed from: package-private */
    public final void M(float f2) {
        if (this.o != f2) {
            this.o = f2;
            B(this.n, f2, this.p);
        }
    }

    /* access modifiers changed from: package-private */
    public final void N(float f2) {
        this.r = f2;
        Matrix matrix = this.z;
        c(f2, matrix);
        this.u.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    public final void O(int i2) {
        if (this.q != i2) {
            this.q = i2;
            V();
        }
    }

    /* access modifiers changed from: package-private */
    public final void P(float f2) {
        if (this.p != f2) {
            this.p = f2;
            B(this.n, this.o, f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void Q(ColorStateList colorStateList) {
        Drawable drawable = this.k;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, b.c.a.d.r.a.a(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    public final void R(b.c.a.d.l.h hVar) {
        this.f10794c = hVar;
    }

    /* access modifiers changed from: package-private */
    public void T(g gVar, boolean z2) {
        if (!t()) {
            Animator animator = this.f10793b;
            if (animator != null) {
                animator.cancel();
            }
            if (S()) {
                if (this.u.getVisibility() != 0) {
                    this.u.setAlpha(0.0f);
                    this.u.setScaleY(0.0f);
                    this.u.setScaleX(0.0f);
                    N(0.0f);
                }
                b.c.a.d.l.h hVar = this.f10794c;
                if (hVar == null) {
                    hVar = k();
                }
                AnimatorSet d2 = d(hVar, 1.0f, 1.0f, 1.0f);
                d2.addListener(new b(z2, gVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        d2.addListener(it.next());
                    }
                }
                d2.start();
                return;
            }
            this.u.b(0, z2);
            this.u.setAlpha(1.0f);
            this.u.setScaleY(1.0f);
            this.u.setScaleX(1.0f);
            N(1.0f);
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void V() {
        N(this.r);
    }

    /* access modifiers changed from: package-private */
    public final void W() {
        Rect rect = this.w;
        o(rect);
        C(rect);
        this.v.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void a(Animator.AnimatorListener animatorListener) {
        if (this.t == null) {
            this.t = new ArrayList<>();
        }
        this.t.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public void b(Animator.AnimatorListener animatorListener) {
        if (this.s == null) {
            this.s = new ArrayList<>();
        }
        this.s.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public com.google.android.material.internal.a e(int i2, ColorStateList colorStateList) {
        Context context = this.u.getContext();
        com.google.android.material.internal.a v2 = v();
        v2.d(androidx.core.content.a.d(context, b.c.a.d.c.design_fab_stroke_top_outer_color), androidx.core.content.a.d(context, b.c.a.d.c.design_fab_stroke_top_inner_color), androidx.core.content.a.d(context, b.c.a.d.c.design_fab_stroke_end_inner_color), androidx.core.content.a.d(context, b.c.a.d.c.design_fab_stroke_end_outer_color));
        v2.c((float) i2);
        v2.b(colorStateList);
        return v2;
    }

    /* access modifiers changed from: package-private */
    public GradientDrawable g() {
        GradientDrawable w2 = w();
        w2.setShape(1);
        w2.setColor(-1);
        return w2;
    }

    /* access modifiers changed from: package-private */
    public final Drawable i() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public final b.c.a.d.l.h m() {
        return this.f10795d;
    }

    /* access modifiers changed from: package-private */
    public float n() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public void o(Rect rect) {
        this.h.getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    public float p() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public final b.c.a.d.l.h q() {
        return this.f10794c;
    }

    /* access modifiers changed from: package-private */
    public void r(g gVar, boolean z2) {
        if (!s()) {
            Animator animator = this.f10793b;
            if (animator != null) {
                animator.cancel();
            }
            if (S()) {
                b.c.a.d.l.h hVar = this.f10795d;
                if (hVar == null) {
                    hVar = j();
                }
                AnimatorSet d2 = d(hVar, 0.0f, 0.0f, 0.0f);
                d2.addListener(new C0097a(z2, gVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        d2.addListener(it.next());
                    }
                }
                d2.start();
                return;
            }
            this.u.b(z2 ? 8 : 4, z2);
            if (gVar != null) {
                gVar.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        if (this.u.getVisibility() == 0) {
            if (this.f10792a == 1) {
                return true;
            }
            return false;
        } else if (this.f10792a != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        if (this.u.getVisibility() != 0) {
            if (this.f10792a == 2) {
                return true;
            }
            return false;
        } else if (this.f10792a != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void u() {
        this.g.c();
    }

    /* access modifiers changed from: package-private */
    public com.google.android.material.internal.a v() {
        return new com.google.android.material.internal.a();
    }

    /* access modifiers changed from: package-private */
    public GradientDrawable w() {
        return new GradientDrawable();
    }

    /* access modifiers changed from: package-private */
    public void x() {
        if (G()) {
            h();
            this.u.getViewTreeObserver().addOnPreDrawListener(this.A);
        }
    }

    /* access modifiers changed from: package-private */
    public void y() {
    }

    /* access modifiers changed from: package-private */
    public void z() {
        if (this.A != null) {
            this.u.getViewTreeObserver().removeOnPreDrawListener(this.A);
            this.A = null;
        }
    }
}
