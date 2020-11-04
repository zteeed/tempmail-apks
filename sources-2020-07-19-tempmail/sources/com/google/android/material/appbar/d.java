package com.google.android.material.appbar;

import a.h.k.t;
import android.view.View;

/* compiled from: ViewOffsetHelper */
class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f10661a;

    /* renamed from: b  reason: collision with root package name */
    private int f10662b;

    /* renamed from: c  reason: collision with root package name */
    private int f10663c;

    /* renamed from: d  reason: collision with root package name */
    private int f10664d;

    /* renamed from: e  reason: collision with root package name */
    private int f10665e;

    public d(View view) {
        this.f10661a = view;
    }

    private void f() {
        View view = this.f10661a;
        t.O(view, this.f10664d - (view.getTop() - this.f10662b));
        View view2 = this.f10661a;
        t.N(view2, this.f10665e - (view2.getLeft() - this.f10663c));
    }

    public int a() {
        return this.f10662b;
    }

    public int b() {
        return this.f10664d;
    }

    public void c() {
        this.f10662b = this.f10661a.getTop();
        this.f10663c = this.f10661a.getLeft();
        f();
    }

    public boolean d(int i) {
        if (this.f10665e == i) {
            return false;
        }
        this.f10665e = i;
        f();
        return true;
    }

    public boolean e(int i) {
        if (this.f10664d == i) {
            return false;
        }
        this.f10664d = i;
        f();
        return true;
    }
}
