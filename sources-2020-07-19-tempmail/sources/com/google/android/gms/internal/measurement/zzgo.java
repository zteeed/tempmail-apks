package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public final class zzgo<K, V> {
    static <K, V> int a(w2<K, V> w2Var, K k, V v) {
        return c2.b(w2Var.f9516a, 1, k) + c2.b(w2Var.f9518c, 2, v);
    }

    static <K, V> void b(zzev zzev, w2<K, V> w2Var, K k, V v) throws IOException {
        c2.f(zzev, w2Var.f9516a, 1, k);
        c2.f(zzev, w2Var.f9518c, 2, v);
    }
}
