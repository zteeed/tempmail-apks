package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class a6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzij f10099b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f10100c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzii f10101d;

    a6(zzii zzii, zzij zzij, long j) {
        this.f10101d = zzii;
        this.f10099b = zzij;
        this.f10100c = j;
    }

    public final void run() {
        this.f10101d.R(this.f10099b, false, this.f10100c);
        zzii zzii = this.f10101d;
        zzii.f10667e = null;
        zzii.s().O((zzij) null);
    }
}
