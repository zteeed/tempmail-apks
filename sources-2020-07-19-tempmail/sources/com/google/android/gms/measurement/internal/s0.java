package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class s0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10222b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f10223c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zza f10224d;

    s0(zza zza, String str, long j) {
        this.f10224d = zza;
        this.f10222b = str;
        this.f10223c = j;
    }

    public final void run() {
        this.f10224d.F(this.f10222b, this.f10223c);
    }
}
