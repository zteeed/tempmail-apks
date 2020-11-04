package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class h0 implements zzahc<Object> {
    h0() {
    }

    public final void a(Object obj, Map<String, String> map) {
        String valueOf = String.valueOf(map.get("string"));
        zzbba.h(valueOf.length() != 0 ? "Received log message: ".concat(valueOf) : new String("Received log message: "));
    }
}
