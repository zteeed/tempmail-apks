package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class gf0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbbn f4073b;

    /* renamed from: c  reason: collision with root package name */
    private final Future f4074c;

    gf0(zzbbn zzbbn, Future future) {
        this.f4073b = zzbbn;
        this.f4074c = future;
    }

    public final void run() {
        zzbbn zzbbn = this.f4073b;
        Future future = this.f4074c;
        if (zzbbn.isCancelled()) {
            future.cancel(true);
        }
    }
}
