package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class e implements DynamiteModule.VersionPolicy {
    e() {
    }

    public final DynamiteModule.VersionPolicy.zzb a(Context context, String str, DynamiteModule.VersionPolicy.zza zza) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.zzb zzb = new DynamiteModule.VersionPolicy.zzb();
        zzb.f3389a = zza.a(context, str);
        int b2 = zza.b(context, str, true);
        zzb.f3390b = b2;
        if (zzb.f3389a == 0 && b2 == 0) {
            zzb.f3391c = 0;
        } else if (zzb.f3390b >= zzb.f3389a) {
            zzb.f3391c = 1;
        } else {
            zzb.f3391c = -1;
        }
        return zzb;
    }
}
