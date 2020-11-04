package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f11168b;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            AnimatorSet unused = ExpandableTransformationBehavior.this.f11168b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* access modifiers changed from: protected */
    public boolean G(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f11168b != null;
        if (z3) {
            this.f11168b.cancel();
        }
        AnimatorSet I = I(view, view2, z, z3);
        this.f11168b = I;
        I.addListener(new a());
        this.f11168b.start();
        if (!z2) {
            this.f11168b.end();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract AnimatorSet I(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
