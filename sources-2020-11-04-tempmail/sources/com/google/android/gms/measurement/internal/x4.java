package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class x4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10501b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f10502c;

    x4(zzhc zzhc, AtomicReference atomicReference) {
        this.f10502c = zzhc;
        this.f10501b = atomicReference;
    }

    public final void run() {
        synchronized (this.f10501b) {
            try {
                this.f10501b.set(Boolean.valueOf(this.f10502c.l().K(this.f10502c.r().D())));
                this.f10501b.notify();
            } catch (Throwable th) {
                this.f10501b.notify();
                throw th;
            }
        }
    }
}
