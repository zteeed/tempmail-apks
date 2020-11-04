package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.internal.VisibilityAwareImageButton;
import java.util.ArrayList;

/* compiled from: FloatingActionButtonImplLollipop */
class b extends a {
    private InsetDrawable I;

    /* compiled from: FloatingActionButtonImplLollipop */
    static class a extends GradientDrawable {
        a() {
        }

        public boolean isStateful() {
            return true;
        }
    }

    b(VisibilityAwareImageButton visibilityAwareImageButton, b.c.a.d.s.b bVar) {
        super(visibilityAwareImageButton, bVar);
    }

    private Animator X(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.u, "elevation", new float[]{f2}).setDuration(0)).with(ObjectAnimator.ofFloat(this.u, View.TRANSLATION_Z, new float[]{f3}).setDuration(100));
        animatorSet.setInterpolator(a.B);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    public void A(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.u.isEnabled()) {
            this.u.setElevation(this.n);
            if (this.u.isPressed()) {
                this.u.setTranslationZ(this.p);
            } else if (this.u.isFocused() || this.u.isHovered()) {
                this.u.setTranslationZ(this.o);
            } else {
                this.u.setTranslationZ(0.0f);
            }
        } else {
            this.u.setElevation(0.0f);
            this.u.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    public void B(float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT == 21) {
            this.u.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(a.C, X(f2, f4));
            stateListAnimator.addState(a.D, X(f2, f3));
            stateListAnimator.addState(a.E, X(f2, f3));
            stateListAnimator.addState(a.F, X(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.u, "elevation", new float[]{f2}).setDuration(0));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                VisibilityAwareImageButton visibilityAwareImageButton = this.u;
                arrayList.add(ObjectAnimator.ofFloat(visibilityAwareImageButton, View.TRANSLATION_Z, new float[]{visibilityAwareImageButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.u, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a.B);
            stateListAnimator.addState(a.G, animatorSet);
            stateListAnimator.addState(a.H, X(0.0f, 0.0f));
            this.u.setStateListAnimator(stateListAnimator);
        }
        if (this.v.b()) {
            W();
        }
    }

    /* access modifiers changed from: package-private */
    public void C(Rect rect) {
        if (this.v.b()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.k, rect.left, rect.top, rect.right, rect.bottom);
            this.I = insetDrawable;
            this.v.c(insetDrawable);
            return;
        }
        this.v.c(this.k);
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void H(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        Drawable r = androidx.core.graphics.drawable.a.r(g());
        this.j = r;
        androidx.core.graphics.drawable.a.o(r, colorStateList);
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(this.j, mode);
        }
        if (i > 0) {
            this.l = e(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{this.l, this.j});
        } else {
            this.l = null;
            drawable = this.j;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(b.c.a.d.r.a.a(colorStateList2), drawable, (Drawable) null);
        this.k = rippleDrawable;
        this.m = rippleDrawable;
        this.v.c(rippleDrawable);
    }

    /* access modifiers changed from: package-private */
    public void Q(ColorStateList colorStateList) {
        Drawable drawable = this.k;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(b.c.a.d.r.a.a(colorStateList));
        } else {
            super.Q(colorStateList);
        }
    }

    public float l() {
        return this.u.getElevation();
    }

    /* access modifiers changed from: package-private */
    public void o(Rect rect) {
        if (this.v.b()) {
            float d2 = this.v.d();
            float l = l() + this.p;
            int ceil = (int) Math.ceil((double) b.c.a.d.s.a.e(l, d2, false));
            int ceil2 = (int) Math.ceil((double) b.c.a.d.s.a.f(l, d2, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* access modifiers changed from: package-private */
    public void u() {
    }

    /* access modifiers changed from: package-private */
    public com.google.android.material.internal.a v() {
        return new com.google.android.material.internal.b();
    }

    /* access modifiers changed from: package-private */
    public GradientDrawable w() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    public void y() {
        W();
    }
}
