package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcmy implements zzela<PackageInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7444a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<ApplicationInfo> f7445b;

    private zzcmy(zzelj<Context> zzelj, zzelj<ApplicationInfo> zzelj2) {
        this.f7444a = zzelj;
        this.f7445b = zzelj2;
    }

    public static zzcmy a(zzelj<Context> zzelj, zzelj<ApplicationInfo> zzelj2) {
        return new zzcmy(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return zzcmo.a(this.f7444a.get(), this.f7445b.get());
    }
}
