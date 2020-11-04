package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.c;

/* compiled from: CircularRevealCompat */
public final class a {

    /* renamed from: com.google.android.material.circularreveal.a$a  reason: collision with other inner class name */
    /* compiled from: CircularRevealCompat */
    static class C0094a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f10954a;

        C0094a(c cVar) {
            this.f10954a = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f10954a.b();
        }

        public void onAnimationStart(Animator animator) {
            this.f10954a.a();
        }
    }

    public static Animator a(c cVar, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, c.C0095c.f10963a, c.b.f10961b, new c.e[]{new c.e(f2, f3, f4)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        c.e revealInfo = cVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f2, (int) f3, revealInfo.f10967c, f4);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    public static Animator.AnimatorListener b(c cVar) {
        return new C0094a(cVar);
    }
}
