package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.internal.b0;
import com.google.android.play.core.internal.n;

public final class c3 implements b0<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final b0<u2> f11211a;

    /* renamed from: b  reason: collision with root package name */
    private final b0<Context> f11212b;

    public c3(b0<u2> b0Var, b0<Context> b0Var2) {
        this.f11211a = b0Var;
        this.f11212b = b0Var2;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        u2 d2 = this.f11211a.d();
        Context b2 = ((e3) this.f11212b).d();
        u2 u2Var = d2;
        n.a(b2.getPackageManager(), new ComponentName(b2.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"));
        PlayCoreDialogWrapperActivity.a(b2);
        n.c(u2Var, "Cannot return null from a non-@Nullable @Provides method");
        return u2Var;
    }
}
