package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public abstract class zzdi<T> implements Serializable {
    zzdi() {
    }

    public static <T> zzdi<T> a(T t) {
        zzdh.a(t);
        return new w0(t);
    }

    public static <T> zzdi<T> d() {
        return v0.f9507b;
    }

    public abstract boolean b();

    public abstract T c();
}
