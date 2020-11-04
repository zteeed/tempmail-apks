package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class k4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzao f10277b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10278c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzgd f10279d;

    k4(zzgd zzgd, zzao zzao, String str) {
        this.f10279d = zzgd;
        this.f10277b = zzao;
        this.f10278c = str;
    }

    public final void run() {
        this.f10279d.f10642b.e0();
        this.f10279d.f10642b.q(this.f10277b, this.f10278c);
    }
}
