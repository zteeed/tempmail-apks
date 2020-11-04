package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* compiled from: StateListAnimator */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f11043a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private b f11044b = null;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f11045c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Animator.AnimatorListener f11046d = new a();

    /* compiled from: StateListAnimator */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            i iVar = i.this;
            if (iVar.f11045c == animator) {
                iVar.f11045c = null;
            }
        }
    }

    /* compiled from: StateListAnimator */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int[] f11048a;

        /* renamed from: b  reason: collision with root package name */
        final ValueAnimator f11049b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f11048a = iArr;
            this.f11049b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f11045c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11045c = null;
        }
    }

    private void e(b bVar) {
        ValueAnimator valueAnimator = bVar.f11049b;
        this.f11045c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f11046d);
        this.f11043a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.f11045c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f11045c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f11043a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f11043a.get(i);
            if (StateSet.stateSetMatches(bVar.f11048a, iArr)) {
                break;
            }
            i++;
        }
        b bVar2 = this.f11044b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                b();
            }
            this.f11044b = bVar;
            if (bVar != null) {
                e(bVar);
            }
        }
    }
}
