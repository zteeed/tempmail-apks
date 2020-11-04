package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior */
class c<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private d f10844a;

    /* renamed from: b  reason: collision with root package name */
    private int f10845b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f10846c = 0;

    public c() {
    }

    public int D() {
        d dVar = this.f10844a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void E(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.M(v, i);
    }

    public boolean F(int i) {
        d dVar = this.f10844a;
        if (dVar != null) {
            return dVar.e(i);
        }
        this.f10845b = i;
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        E(coordinatorLayout, v, i);
        if (this.f10844a == null) {
            this.f10844a = new d(v);
        }
        this.f10844a.c();
        int i2 = this.f10845b;
        if (i2 != 0) {
            this.f10844a.e(i2);
            this.f10845b = 0;
        }
        int i3 = this.f10846c;
        if (i3 == 0) {
            return true;
        }
        this.f10844a.d(i3);
        this.f10846c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
