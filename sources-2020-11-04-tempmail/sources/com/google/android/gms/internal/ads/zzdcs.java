package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdcs implements zzela<zzdcp> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<ApplicationInfo> f8055a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<PackageInfo> f8056b;

    private zzdcs(zzelj<ApplicationInfo> zzelj, zzelj<PackageInfo> zzelj2) {
        this.f8055a = zzelj;
        this.f8056b = zzelj2;
    }

    public static zzdcp a(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        return new zzdcp(applicationInfo, packageInfo);
    }

    public static zzdcs b(zzelj<ApplicationInfo> zzelj, zzelj<PackageInfo> zzelj2) {
        return new zzdcs(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return a(this.f8055a.get(), this.f8056b.get());
    }
}
