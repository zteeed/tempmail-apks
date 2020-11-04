package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaxb implements zzaxd {
    public final zzdvf<String> a(String str, PackageInfo packageInfo) {
        return zzdux.g(str);
    }

    public final zzdvf<String> b(Context context, int i) {
        return zzdux.g(null);
    }

    public final zzdvf<AdvertisingIdClient.Info> c(Context context) {
        zzbbn zzbbn = new zzbbn();
        zzwg.a();
        if (zzbaq.n(context)) {
            zzbbf.f6320a.execute(new w4(this, context, zzbbn));
        }
        return zzbbn;
    }
}
