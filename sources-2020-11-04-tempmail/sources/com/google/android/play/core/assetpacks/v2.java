package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.b0;
import com.google.android.play.core.internal.y;
import com.google.android.play.core.splitinstall.b;
import java.util.concurrent.Executor;

public final class v2 implements b0<u2> {

    /* renamed from: a  reason: collision with root package name */
    private final b0<b0> f11426a;

    /* renamed from: b  reason: collision with root package name */
    private final b0<j3> f11427b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<v> f11428c;

    /* renamed from: d  reason: collision with root package name */
    private final b0<b> f11429d;

    /* renamed from: e  reason: collision with root package name */
    private final b0<m1> f11430e;

    /* renamed from: f  reason: collision with root package name */
    private final b0<y0> f11431f;
    private final b0<n0> g;
    private final b0<Executor> h;

    public v2(b0<b0> b0Var, b0<j3> b0Var2, b0<v> b0Var3, b0<b> b0Var4, b0<m1> b0Var5, b0<y0> b0Var6, b0<n0> b0Var7, b0<Executor> b0Var8) {
        this.f11426a = b0Var;
        this.f11427b = b0Var2;
        this.f11428c = b0Var3;
        this.f11429d = b0Var4;
        this.f11430e = b0Var5;
        this.f11431f = b0Var6;
        this.g = b0Var7;
        this.h = b0Var8;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        b0 d2 = this.f11426a.d();
        y<j3> b2 = a0.b(this.f11427b);
        v d3 = this.f11428c.d();
        return new u2(d2, b2, d3, this.f11429d.d(), this.f11430e.d(), this.f11431f.d(), this.g.d(), a0.b(this.h));
    }
}
