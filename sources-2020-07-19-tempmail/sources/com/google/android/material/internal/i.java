package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* compiled from: StateListAnimator */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f10857a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private b f10858b = null;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f10859c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Animator.AnimatorListener f10860d = new a();

    /* compiled from: StateListAnimator */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            i iVar = i.this;
            if (iVar.f10859c == animator) {
                iVar.f10859c = null;
            }
        }
    }

    /* compiled from: StateListAnimator */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int[] f10862a;

        /* renamed from: b  reason: collision with root package name */
        final ValueAnimator f10863b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f10862a = iArr;
            this.f10863b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f10859c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f10859c = null;
        }
    }

    private void e(b bVar) {
        ValueAnimator valueAnimator = bVar.f10863b;
        this.f10859c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f10860d);
        this.f10857a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.f10859c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f10859c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f10857a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f10857a.get(i);
            if (StateSet.stateSetMatches(bVar.f10862a, iArr)) {
                break;
            }
            i++;
        }
        b bVar2 = this.f10858b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                b();
            }
            this.f10858b = bVar;
            if (bVar != null) {
                e(bVar);
            }
        }
    }
}
