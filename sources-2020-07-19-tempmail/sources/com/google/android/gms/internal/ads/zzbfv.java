package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbfv {
    public static zzbfn a(Context context, zzbhg zzbhg, String str, boolean z, boolean z2, zzeg zzeg, zzbbd zzbbd, zzabi zzabi, zzi zzi, zza zza, zztm zztm, zzso zzso, boolean z3) throws zzbfz {
        zzaav.a(context);
        if (zzacw.f5617b.a().booleanValue()) {
            return zzbhm.a(context, zzbhg, str, z, z2, zzeg, zzbbd, (zzabi) null, zzi, zza, zztm, zzso, z3);
        }
        try {
            return (zzbfn) zzbai.b(new m9(context, zzbhg, str, z, z2, zzeg, zzbbd, (zzabi) null, zzi, zza, zztm, zzso, z3));
        } catch (Throwable th) {
            throw new zzbfz("Webview initialization failed.", th);
        }
    }

    public static zzdvf<zzbfn> b(Context context, zzbbd zzbbd, String str, zzeg zzeg, zza zza) {
        return zzdux.j(zzdux.g(null), new n9(context, zzeg, zzbbd, zza, str), zzbbf.f6141e);
    }
}
