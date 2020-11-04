package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.c.a.d.l.b;
import b.c.a.d.l.i;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private final i f11183c = new i(75, 150);

    /* renamed from: d  reason: collision with root package name */
    private final i f11184d = new i(0, 150);

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f11185a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f11186b;

        a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f11185a = z;
            this.f11186b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f11185a) {
                this.f11186b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f11185a) {
                this.f11186b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    private void J(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        i iVar = z ? this.f11183c : this.f11184d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.a(objectAnimator);
        list.add(objectAnimator);
    }

    public boolean C(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.C(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    public AnimatorSet I(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        J(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z, view2));
        return animatorSet;
    }

    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
