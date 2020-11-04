package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdcs implements zzela<zzdcp> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<ApplicationInfo> f7872a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<PackageInfo> f7873b;

    private zzdcs(zzelj<ApplicationInfo> zzelj, zzelj<PackageInfo> zzelj2) {
        this.f7872a = zzelj;
        this.f7873b = zzelj2;
    }

    public static zzdcp a(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        return new zzdcp(applicationInfo, packageInfo);
    }

    public static zzdcs b(zzelj<ApplicationInfo> zzelj, zzelj<PackageInfo> zzelj2) {
        return new zzdcs(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return a(this.f7872a.get(), this.f7873b.get());
    }
}
