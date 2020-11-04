package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class i5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10057b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f10058c;

    i5(zzhc zzhc, AtomicReference atomicReference) {
        this.f10058c = zzhc;
        this.f10057b = atomicReference;
    }

    public final void run() {
        synchronized (this.f10057b) {
            try {
                this.f10057b.set(Long.valueOf(this.f10058c.l().q(this.f10058c.r().D(), zzaq.M)));
                this.f10057b.notify();
            } catch (Throwable th) {
                this.f10057b.notify();
                throw th;
            }
        }
    }
}
