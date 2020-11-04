package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class h4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzao f10036b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzn f10037c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzgd f10038d;

    h4(zzgd zzgd, zzao zzao, zzn zzn) {
        this.f10038d = zzgd;
        this.f10036b = zzao;
        this.f10037c = zzn;
    }

    public final void run() {
        zzao U0 = this.f10038d.U0(this.f10036b, this.f10037c);
        this.f10038d.f10456b.e0();
        this.f10038d.f10456b.p(U0, this.f10037c);
    }
}
