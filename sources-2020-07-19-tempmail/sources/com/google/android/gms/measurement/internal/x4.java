package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class x4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10315b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f10316c;

    x4(zzhc zzhc, AtomicReference atomicReference) {
        this.f10316c = zzhc;
        this.f10315b = atomicReference;
    }

    public final void run() {
        synchronized (this.f10315b) {
            try {
                this.f10315b.set(Boolean.valueOf(this.f10316c.l().K(this.f10316c.r().D())));
                this.f10315b.notify();
            } catch (Throwable th) {
                this.f10315b.notify();
                throw th;
            }
        }
    }
}
