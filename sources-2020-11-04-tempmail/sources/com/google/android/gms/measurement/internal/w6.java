package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class w6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzem f10491b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzji f10492c;

    w6(zzji zzji, zzem zzem) {
        this.f10492c = zzji;
        this.f10491b = zzem;
    }

    public final void run() {
        synchronized (this.f10492c) {
            boolean unused = this.f10492c.f10678a = false;
            if (!this.f10492c.f10680c.W()) {
                this.f10492c.f10680c.h().N().a("Connected to remote service");
                this.f10492c.f10680c.M(this.f10491b);
            }
        }
    }
}
