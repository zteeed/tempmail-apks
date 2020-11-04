package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.b0;
import java.util.concurrent.Executor;

public final class n1 implements b0<m1> {

    /* renamed from: a  reason: collision with root package name */
    private final b0<b0> f11338a;

    /* renamed from: b  reason: collision with root package name */
    private final b0<j3> f11339b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<y0> f11340c;

    /* renamed from: d  reason: collision with root package name */
    private final b0<Executor> f11341d;

    public n1(b0<b0> b0Var, b0<j3> b0Var2, b0<y0> b0Var3, b0<Executor> b0Var4) {
        this.f11338a = b0Var;
        this.f11339b = b0Var2;
        this.f11340c = b0Var3;
        this.f11341d = b0Var4;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        b0 d2 = this.f11338a.d();
        return new m1(d2, a0.b(this.f11339b), this.f11340c.d(), a0.b(this.f11341d));
    }
}
