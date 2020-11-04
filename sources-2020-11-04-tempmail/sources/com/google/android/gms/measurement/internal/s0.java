package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class s0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10408b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f10409c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zza f10410d;

    s0(zza zza, String str, long j) {
        this.f10410d = zza;
        this.f10408b = str;
        this.f10409c = j;
    }

    public final void run() {
        this.f10410d.F(this.f10408b, this.f10409c);
    }
}
