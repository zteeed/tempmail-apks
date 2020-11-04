package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class h4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzao f10222b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzn f10223c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzgd f10224d;

    h4(zzgd zzgd, zzao zzao, zzn zzn) {
        this.f10224d = zzgd;
        this.f10222b = zzao;
        this.f10223c = zzn;
    }

    public final void run() {
        zzao a1 = this.f10224d.a1(this.f10222b, this.f10223c);
        this.f10224d.f10642b.e0();
        this.f10224d.f10642b.p(a1, this.f10223c);
    }
}
