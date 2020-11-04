package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class k5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10094b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f10095c;

    k5(zzhc zzhc, AtomicReference atomicReference) {
        this.f10095c = zzhc;
        this.f10094b = atomicReference;
    }

    public final void run() {
        synchronized (this.f10094b) {
            try {
                this.f10094b.set(Double.valueOf(this.f10095c.l().w(this.f10095c.r().D(), zzaq.O)));
                this.f10094b.notify();
            } catch (Throwable th) {
                this.f10094b.notify();
                throw th;
            }
        }
    }
}
