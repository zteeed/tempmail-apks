package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class d implements DynamiteModule.VersionPolicy {
    d() {
    }

    public final DynamiteModule.VersionPolicy.zzb a(Context context, String str, DynamiteModule.VersionPolicy.zza zza) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.zzb zzb = new DynamiteModule.VersionPolicy.zzb();
        int a2 = zza.a(context, str);
        zzb.f3206a = a2;
        if (a2 != 0) {
            zzb.f3207b = zza.b(context, str, false);
        } else {
            zzb.f3207b = zza.b(context, str, true);
        }
        if (zzb.f3206a == 0 && zzb.f3207b == 0) {
            zzb.f3208c = 0;
        } else if (zzb.f3206a >= zzb.f3207b) {
            zzb.f3208c = -1;
        } else {
            zzb.f3208c = 1;
        }
        return zzb;
    }
}
