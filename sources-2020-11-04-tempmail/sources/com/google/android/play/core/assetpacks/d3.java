package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.b0;
import com.google.android.play.core.internal.n;

public final class d3 implements b0<j3> {

    /* renamed from: a  reason: collision with root package name */
    private final b0<Context> f11224a;

    /* renamed from: b  reason: collision with root package name */
    private final b0<q> f11225b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<u1> f11226c;

    public d3(b0<Context> b0Var, b0<q> b0Var2, b0<u1> b0Var3) {
        this.f11224a = b0Var;
        this.f11225b = b0Var2;
        this.f11226c = b0Var3;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        j3 j3Var = (j3) (z2.b(((e3) this.f11224a).d()) == null ? a0.b(this.f11225b).d() : a0.b(this.f11226c).d());
        n.c(j3Var, "Cannot return null from a non-@Nullable @Provides method");
        return j3Var;
    }
}
