package com.google.android.material.transformation;

import a.h.k.t;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f10955a = 0;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f10956b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10957c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b.c.a.d.o.a f10958d;

        a(View view, int i, b.c.a.d.o.a aVar) {
            this.f10956b = view;
            this.f10957c = i;
            this.f10958d = aVar;
        }

        public boolean onPreDraw() {
            this.f10956b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f10955a == this.f10957c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                b.c.a.d.o.a aVar = this.f10958d;
                expandableBehavior.G((View) aVar, this.f10956b, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    private boolean E(boolean z) {
        if (z) {
            int i = this.f10955a;
            return i == 0 || i == 2;
        } else if (this.f10955a == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public b.c.a.d.o.a F(CoordinatorLayout coordinatorLayout, View view) {
        List<View> v = coordinatorLayout.v(view);
        int size = v.size();
        for (int i = 0; i < size; i++) {
            View view2 = v.get(i);
            if (e(coordinatorLayout, view, view2)) {
                return (b.c.a.d.o.a) view2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract boolean G(View view, View view2, boolean z, boolean z2);

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b.c.a.d.o.a aVar = (b.c.a.d.o.a) view2;
        if (!E(aVar.a())) {
            return false;
        }
        this.f10955a = aVar.a() ? 1 : 2;
        return G((View) aVar, view, aVar.a(), true);
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        b.c.a.d.o.a F;
        if (t.I(view) || (F = F(coordinatorLayout, view)) == null || !E(F.a())) {
            return false;
        }
        int i2 = F.a() ? 1 : 2;
        this.f10955a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i2, F));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
