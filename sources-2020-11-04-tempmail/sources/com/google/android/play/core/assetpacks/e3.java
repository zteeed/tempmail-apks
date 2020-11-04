package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.b0;
import com.google.android.play.core.internal.n;

public final class e3 implements b0<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final z2 f11238a;

    public e3(z2 z2Var) {
        this.f11238a = z2Var;
    }

    public static Context a(z2 z2Var) {
        Context a2 = z2Var.a();
        n.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: b */
    public final Context d() {
        return a(this.f11238a);
    }
}
