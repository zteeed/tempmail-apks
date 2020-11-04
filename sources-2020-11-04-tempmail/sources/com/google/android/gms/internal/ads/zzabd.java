package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzabd {
    public static boolean a(zzabi zzabi, zzabg zzabg, String... strArr) {
        if (zzabi == null || zzabg == null || !zzabi.f5735a || zzabg == null) {
            return false;
        }
        return zzabi.a(zzabg, zzq.zzld().b(), strArr);
    }

    public static zzabg b(zzabi zzabi) {
        if (zzabi == null) {
            return null;
        }
        return zzabi.c(zzq.zzld().b());
    }
}
