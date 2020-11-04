package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class x5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f10503b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzii f10504c;

    x5(zzii zzii, long j) {
        this.f10504c = zzii;
        this.f10503b = j;
    }

    public final void run() {
        this.f10504c.p().w(this.f10503b);
        this.f10504c.f10667e = null;
    }
}
