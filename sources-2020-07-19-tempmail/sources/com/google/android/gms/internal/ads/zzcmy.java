package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcmy implements zzela<PackageInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7261a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<ApplicationInfo> f7262b;

    private zzcmy(zzelj<Context> zzelj, zzelj<ApplicationInfo> zzelj2) {
        this.f7261a = zzelj;
        this.f7262b = zzelj2;
    }

    public static zzcmy a(zzelj<Context> zzelj, zzelj<ApplicationInfo> zzelj2) {
        return new zzcmy(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return zzcmo.a(this.f7261a.get(), this.f7262b.get());
    }
}
