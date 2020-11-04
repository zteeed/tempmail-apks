package com.google.android.gms.internal.ads;

import android.os.Trace;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpp {
    public static void a(String str) {
        if (zzpo.f8995a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (zzpo.f8995a >= 18) {
            Trace.endSection();
        }
    }
}
