package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdcp implements zzddz<Bundle>, zzdec<zzddz<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final ApplicationInfo f8052a;

    /* renamed from: b  reason: collision with root package name */
    private final PackageInfo f8053b;

    zzdcp(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f8052a = applicationInfo;
        this.f8053b = packageInfo;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f8052a.packageName;
        PackageInfo packageInfo = this.f8053b;
        String str2 = null;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
        }
        if (((Boolean) zzwg.e().c(zzaav.O2)).booleanValue()) {
            PackageInfo packageInfo2 = this.f8053b;
            if (packageInfo2 != null) {
                str2 = packageInfo2.versionName;
            }
            if (str2 != null) {
                bundle.putString("vnm", str2);
            }
        }
    }

    public final zzdvf<zzddz<Bundle>> b() {
        return zzdux.g(this);
    }
}
