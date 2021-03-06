package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbyg<T> {

    /* renamed from: a  reason: collision with root package name */
    public T f6879a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f6880b;

    public zzbyg(T t, Executor executor) {
        this.f6879a = t;
        this.f6880b = executor;
    }

    public static <T> zzbyg<T> a(T t, Executor executor) {
        return new zzbyg<>(t, executor);
    }
}
