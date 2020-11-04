package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class h5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10225b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f10226c;

    h5(zzhc zzhc, AtomicReference atomicReference) {
        this.f10226c = zzhc;
        this.f10225b = atomicReference;
    }

    public final void run() {
        synchronized (this.f10225b) {
            try {
                this.f10225b.set(Integer.valueOf(this.f10226c.l().v(this.f10226c.r().D(), zzaq.N)));
                this.f10225b.notify();
            } catch (Throwable th) {
                this.f10225b.notify();
                throw th;
            }
        }
    }
}
