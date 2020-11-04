package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class r implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10392b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f10393c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zza f10394d;

    r(zza zza, String str, long j) {
        this.f10394d = zza;
        this.f10392b = str;
        this.f10393c = j;
    }

    public final void run() {
        this.f10394d.G(this.f10392b, this.f10393c);
    }
}
