package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class d5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10151b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f10152c;

    d5(zzhc zzhc, AtomicReference atomicReference) {
        this.f10152c = zzhc;
        this.f10151b = atomicReference;
    }

    public final void run() {
        synchronized (this.f10151b) {
            try {
                this.f10151b.set(this.f10152c.l().M(this.f10152c.r().D()));
                this.f10151b.notify();
            } catch (Throwable th) {
                this.f10151b.notify();
                throw th;
            }
        }
    }
}
