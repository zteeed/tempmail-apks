package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class k4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzao f10091b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10092c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzgd f10093d;

    k4(zzgd zzgd, zzao zzao, String str) {
        this.f10093d = zzgd;
        this.f10091b = zzao;
        this.f10092c = str;
    }

    public final void run() {
        this.f10093d.f10456b.e0();
        this.f10093d.f10456b.q(this.f10091b, this.f10092c);
    }
}
