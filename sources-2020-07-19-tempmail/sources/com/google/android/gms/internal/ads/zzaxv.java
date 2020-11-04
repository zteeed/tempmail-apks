package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaxv extends zzbba {
    public static void l(String str, Throwable th) {
        if (n()) {
            Log.v("Ads", str, th);
        }
    }

    public static void m(String str) {
        if (n()) {
            Log.v("Ads", str);
        }
    }

    public static boolean n() {
        return zzbba.a(2) && zzack.f5595a.a().booleanValue();
    }
}
