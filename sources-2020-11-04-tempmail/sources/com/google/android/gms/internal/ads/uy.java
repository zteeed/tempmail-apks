package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcf;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class uy implements ty {

    /* renamed from: a  reason: collision with root package name */
    private static final zzcf.zza f5269a;

    static {
        zzcf.zza.C0073zza w0 = zzcf.zza.w0();
        w0.v0("E");
        f5269a = (zzcf.zza) ((zzegb) w0.O());
    }

    uy() {
    }

    public final zzcf.zza a() {
        return f5269a;
    }

    public final zzcf.zza b(Context context) throws PackageManager.NameNotFoundException {
        return zzdpt.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }
}
