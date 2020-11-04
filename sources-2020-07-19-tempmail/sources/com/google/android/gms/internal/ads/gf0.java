package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class gf0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbbn f3890b;

    /* renamed from: c  reason: collision with root package name */
    private final Future f3891c;

    gf0(zzbbn zzbbn, Future future) {
        this.f3890b = zzbbn;
        this.f3891c = future;
    }

    public final void run() {
        zzbbn zzbbn = this.f3890b;
        Future future = this.f3891c;
        if (zzbbn.isCancelled()) {
            future.cancel(true);
        }
    }
}
