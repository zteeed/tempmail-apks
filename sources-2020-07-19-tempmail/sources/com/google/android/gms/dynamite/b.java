package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class b implements DynamiteModule.VersionPolicy {
    b() {
    }

    public final DynamiteModule.VersionPolicy.zzb a(Context context, String str, DynamiteModule.VersionPolicy.zza zza) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.zzb zzb = new DynamiteModule.VersionPolicy.zzb();
        int b2 = zza.b(context, str, true);
        zzb.f3207b = b2;
        if (b2 != 0) {
            zzb.f3208c = 1;
        } else {
            int a2 = zza.a(context, str);
            zzb.f3206a = a2;
            if (a2 != 0) {
                zzb.f3208c = -1;
            }
        }
        return zzb;
    }
}
