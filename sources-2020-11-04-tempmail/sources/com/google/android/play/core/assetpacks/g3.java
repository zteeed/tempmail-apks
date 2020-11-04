package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.b0;
import com.google.android.play.core.internal.n;
import com.google.android.play.core.splitinstall.b;

public final class g3 implements b0<b> {

    /* renamed from: a  reason: collision with root package name */
    private final b0<Context> f11265a;

    public g3(b0<Context> b0Var) {
        this.f11265a = b0Var;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        Context b2 = ((e3) this.f11265a).d();
        b bVar = new b(b2, b2.getPackageName());
        n.c(bVar, "Cannot return null from a non-@Nullable @Provides method");
        return bVar;
    }
}
