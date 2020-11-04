package com.google.android.material.appbar;

import a.h.k.u;
import android.view.View;

/* compiled from: ViewOffsetHelper */
class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f10847a;

    /* renamed from: b  reason: collision with root package name */
    private int f10848b;

    /* renamed from: c  reason: collision with root package name */
    private int f10849c;

    /* renamed from: d  reason: collision with root package name */
    private int f10850d;

    /* renamed from: e  reason: collision with root package name */
    private int f10851e;

    public d(View view) {
        this.f10847a = view;
    }

    private void f() {
        View view = this.f10847a;
        u.O(view, this.f10850d - (view.getTop() - this.f10848b));
        View view2 = this.f10847a;
        u.N(view2, this.f10851e - (view2.getLeft() - this.f10849c));
    }

    public int a() {
        return this.f10848b;
    }

    public int b() {
        return this.f10850d;
    }

    public void c() {
        this.f10848b = this.f10847a.getTop();
        this.f10849c = this.f10847a.getLeft();
        f();
    }

    public boolean d(int i) {
        if (this.f10851e == i) {
            return false;
        }
        this.f10851e = i;
        f();
        return true;
    }

    public boolean e(int i) {
        if (this.f10850d == i) {
            return false;
        }
        this.f10850d = i;
        f();
        return true;
    }
}
