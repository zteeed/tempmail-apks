package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.internal.c0;

public abstract class b {
    static b a(Bundle bundle, String str, y0 y0Var, z zVar) {
        return b(str, zVar.a(bundle.getInt(c0.a("status", str)), str), bundle.getInt(c0.a("error_code", str)), bundle.getLong(c0.a("bytes_downloaded", str)), bundle.getLong(c0.a("total_bytes_to_download", str)), y0Var.c(str));
    }

    public static b b(String str, int i, int i2, long j, long j2, double d2) {
        return new g0(str, i, i2, j, j2, (int) Math.rint(100.0d * d2));
    }

    public abstract long c();

    public abstract int d();

    public abstract String e();

    public abstract int f();

    public abstract long g();

    public abstract int h();
}
