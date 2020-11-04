package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class w6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzem f10305b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzji f10306c;

    w6(zzji zzji, zzem zzem) {
        this.f10306c = zzji;
        this.f10305b = zzem;
    }

    public final void run() {
        synchronized (this.f10306c) {
            boolean unused = this.f10306c.f10492a = false;
            if (!this.f10306c.f10494c.W()) {
                this.f10306c.f10494c.h().N().a("Connected to remote service");
                this.f10306c.f10494c.M(this.f10305b);
            }
        }
    }
}
