package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class e implements DynamiteModule.VersionPolicy {
    e() {
    }

    public final DynamiteModule.VersionPolicy.zzb a(Context context, String str, DynamiteModule.VersionPolicy.zza zza) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.zzb zzb = new DynamiteModule.VersionPolicy.zzb();
        zzb.f3206a = zza.a(context, str);
        int b2 = zza.b(context, str, true);
        zzb.f3207b = b2;
        if (zzb.f3206a == 0 && b2 == 0) {
            zzb.f3208c = 0;
        } else if (zzb.f3207b >= zzb.f3206a) {
            zzb.f3208c = 1;
        } else {
            zzb.f3208c = -1;
        }
        return zzb;
    }
}
