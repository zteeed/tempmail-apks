package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class nc implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference f4473b;

    nc(AtomicReference atomicReference) {
        this.f4473b = atomicReference;
    }

    public final void run() {
        Runnable runnable = (Runnable) this.f4473b.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
