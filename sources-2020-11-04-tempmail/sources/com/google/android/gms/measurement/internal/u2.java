package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class u2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f10448b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zza f10449c;

    u2(zza zza, long j) {
        this.f10449c = zza;
        this.f10448b = j;
    }

    public final void run() {
        this.f10449c.C(this.f10448b);
    }
}
