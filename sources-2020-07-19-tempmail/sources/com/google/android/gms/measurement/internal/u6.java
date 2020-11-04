package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class u6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzem f10269b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzji f10270c;

    u6(zzji zzji, zzem zzem) {
        this.f10270c = zzji;
        this.f10269b = zzem;
    }

    public final void run() {
        synchronized (this.f10270c) {
            boolean unused = this.f10270c.f10492a = false;
            if (!this.f10270c.f10494c.W()) {
                this.f10270c.f10494c.h().O().a("Connected to service");
                this.f10270c.f10494c.M(this.f10269b);
            }
        }
    }
}
