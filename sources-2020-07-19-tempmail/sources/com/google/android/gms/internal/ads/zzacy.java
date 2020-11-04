package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzacy {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference<zzacz> f5620a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    static final AtomicBoolean f5621b = new AtomicBoolean();

    public static void a(zzacz zzacz) {
        f5620a.set(zzacz);
    }

    static zzacz b() {
        return f5620a.get();
    }
}
