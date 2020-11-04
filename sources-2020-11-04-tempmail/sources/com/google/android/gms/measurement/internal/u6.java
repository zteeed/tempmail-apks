package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class u6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzem f10455b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzji f10456c;

    u6(zzji zzji, zzem zzem) {
        this.f10456c = zzji;
        this.f10455b = zzem;
    }

    public final void run() {
        synchronized (this.f10456c) {
            boolean unused = this.f10456c.f10678a = false;
            if (!this.f10456c.f10680c.W()) {
                this.f10456c.f10680c.h().O().a("Connected to service");
                this.f10456c.f10680c.M(this.f10455b);
            }
        }
    }
}
