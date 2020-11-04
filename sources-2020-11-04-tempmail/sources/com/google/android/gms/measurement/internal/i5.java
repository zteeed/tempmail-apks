package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class i5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10243b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f10244c;

    i5(zzhc zzhc, AtomicReference atomicReference) {
        this.f10244c = zzhc;
        this.f10243b = atomicReference;
    }

    public final void run() {
        synchronized (this.f10243b) {
            try {
                this.f10243b.set(Long.valueOf(this.f10244c.l().q(this.f10244c.r().D(), zzaq.M)));
                this.f10243b.notify();
            } catch (Throwable th) {
                this.f10243b.notify();
                throw th;
            }
        }
    }
}
