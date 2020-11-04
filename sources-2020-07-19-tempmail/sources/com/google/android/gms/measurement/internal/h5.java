package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class h5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10039b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f10040c;

    h5(zzhc zzhc, AtomicReference atomicReference) {
        this.f10040c = zzhc;
        this.f10039b = atomicReference;
    }

    public final void run() {
        synchronized (this.f10039b) {
            try {
                this.f10039b.set(Integer.valueOf(this.f10040c.l().v(this.f10040c.r().D(), zzaq.N)));
                this.f10039b.notify();
            } catch (Throwable th) {
                this.f10039b.notify();
                throw th;
            }
        }
    }
}
