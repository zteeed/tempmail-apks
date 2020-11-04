package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbct extends zzbcl {
    public final zzbcm a(Context context, zzbdb zzbdb, int i, boolean z, zzabi zzabi, zzbdc zzbdc) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(applicationInfo == null || applicationInfo.targetSdkVersion >= 11)) {
            return null;
        }
        zzbde zzbde = new zzbde(context, zzbdb.a(), zzbdb.getRequestId(), zzabi, zzbdb.p0());
        if (i == 2) {
            return new zzbdi(context, zzbde, zzbdb, z, zzbcl.b(zzbdb), zzbdc);
        }
        return new zzbbz(context, z, zzbcl.b(zzbdb), zzbdc, new zzbde(context, zzbdb.a(), zzbdb.getRequestId(), zzabi, zzbdb.p0()));
    }
}
