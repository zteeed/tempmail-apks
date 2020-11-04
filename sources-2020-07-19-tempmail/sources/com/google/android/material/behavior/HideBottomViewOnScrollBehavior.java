package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private int f10667a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f10668b = 2;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public ViewPropertyAnimator f10669c;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f10669c = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    private void E(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f10669c = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new a());
    }

    /* access modifiers changed from: protected */
    public void F(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f10669c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f10668b = 1;
        E(v, this.f10667a, 175, b.c.a.d.l.a.f2267c);
    }

    /* access modifiers changed from: protected */
    public void G(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f10669c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f10668b = 2;
        E(v, 0, 225, b.c.a.d.l.a.f2268d);
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f10667a = v.getMeasuredHeight();
        return super.l(coordinatorLayout, v, i);
    }

    public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (this.f10668b != 1 && i2 > 0) {
            F(v);
        } else if (this.f10668b != 2 && i2 < 0) {
            G(v);
        }
    }

    public boolean y(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
