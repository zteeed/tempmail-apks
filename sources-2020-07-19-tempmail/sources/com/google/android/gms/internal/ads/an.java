package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class an implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzcpx f3393b;

    private an(zzcpx zzcpx) {
        this.f3393b = zzcpx;
    }

    static Callable a(zzcpx zzcpx) {
        return new an(zzcpx);
    }

    public final Object call() {
        return this.f3393b.getWritableDatabase();
    }
}
