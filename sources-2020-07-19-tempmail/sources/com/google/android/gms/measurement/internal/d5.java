package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class d5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f9965b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f9966c;

    d5(zzhc zzhc, AtomicReference atomicReference) {
        this.f9966c = zzhc;
        this.f9965b = atomicReference;
    }

    public final void run() {
        synchronized (this.f9965b) {
            try {
                this.f9965b.set(this.f9966c.l().M(this.f9966c.r().D()));
                this.f9965b.notify();
            } catch (Throwable th) {
                this.f9965b.notify();
                throw th;
            }
        }
    }
}
