package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.a0;
import com.google.android.play.core.internal.b0;
import java.io.File;
import java.util.concurrent.Executor;

public final class v1 implements b0<u1> {

    /* renamed from: a  reason: collision with root package name */
    private final b0<String> f11420a;

    /* renamed from: b  reason: collision with root package name */
    private final b0<v> f11421b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<y0> f11422c;

    /* renamed from: d  reason: collision with root package name */
    private final b0<Context> f11423d;

    /* renamed from: e  reason: collision with root package name */
    private final b0<e2> f11424e;

    /* renamed from: f  reason: collision with root package name */
    private final b0<Executor> f11425f;

    public v1(b0<String> b0Var, b0<v> b0Var2, b0<y0> b0Var3, b0<Context> b0Var4, b0<e2> b0Var5, b0<Executor> b0Var6) {
        this.f11420a = b0Var;
        this.f11421b = b0Var2;
        this.f11422c = b0Var3;
        this.f11423d = b0Var4;
        this.f11424e = b0Var5;
        this.f11425f = b0Var6;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        String d2 = this.f11420a.d();
        v d3 = this.f11421b.d();
        y0 d4 = this.f11422c.d();
        Context b2 = ((e3) this.f11423d).d();
        e2 d5 = this.f11424e.d();
        return new u1(d2 != null ? new File(b2.getExternalFilesDir((String) null), d2) : b2.getExternalFilesDir((String) null), d3, d4, b2, d5, a0.b(this.f11425f));
    }
}
