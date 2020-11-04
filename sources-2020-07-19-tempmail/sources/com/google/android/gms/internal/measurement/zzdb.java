package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzdb {

    /* renamed from: a  reason: collision with root package name */
    final Uri f9598a;

    /* renamed from: b  reason: collision with root package name */
    final String f9599b;

    /* renamed from: c  reason: collision with root package name */
    final String f9600c;

    public zzdb(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (zzdf<Context, Boolean>) null);
    }

    public final zzcv<Double> a(String str, double d2) {
        return zzcv.i(this, str, -3.0d, true);
    }

    public final zzcv<Long> b(String str, long j) {
        return zzcv.j(this, str, j, true);
    }

    public final zzcv<String> c(String str, String str2) {
        return zzcv.k(this, str, str2, true);
    }

    public final zzcv<Boolean> d(String str, boolean z) {
        return zzcv.l(this, str, z, true);
    }

    private zzdb(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable zzdf<Context, Boolean> zzdf) {
        this.f9598a = uri;
        this.f9599b = str2;
        this.f9600c = str3;
    }
}
