package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class k5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10280b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f10281c;

    k5(zzhc zzhc, AtomicReference atomicReference) {
        this.f10281c = zzhc;
        this.f10280b = atomicReference;
    }

    public final void run() {
        synchronized (this.f10280b) {
            try {
                this.f10280b.set(Double.valueOf(this.f10281c.l().w(this.f10281c.r().D(), zzaq.O)));
                this.f10280b.notify();
            } catch (Throwable th) {
                this.f10280b.notify();
                throw th;
            }
        }
    }
}
