package a.h.k;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: NestedScrollingParentHelper */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private int f405a;

    /* renamed from: b  reason: collision with root package name */
    private int f406b;

    public p(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f405a | this.f406b;
    }

    public void b(View view, View view2, int i) {
        c(view, view2, i, 0);
    }

    public void c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f406b = i;
        } else {
            this.f405a = i;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i) {
        if (i == 1) {
            this.f406b = 0;
        } else {
            this.f405a = 0;
        }
    }
}
