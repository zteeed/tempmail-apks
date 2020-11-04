package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class r implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10206b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f10207c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zza f10208d;

    r(zza zza, String str, long j) {
        this.f10208d = zza;
        this.f10206b = str;
        this.f10207c = j;
    }

    public final void run() {
        this.f10208d.G(this.f10206b, this.f10207c);
    }
}
