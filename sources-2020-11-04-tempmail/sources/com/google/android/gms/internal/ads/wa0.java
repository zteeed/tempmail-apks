package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class wa0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5396b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f5397c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f5398d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzih f5399e;

    wa0(zzih zzih, String str, long j, long j2) {
        this.f5399e = zzih;
        this.f5396b = str;
        this.f5397c = j;
        this.f5398d = j2;
    }

    public final void run() {
        this.f5399e.f8945b.e(this.f5396b, this.f5397c, this.f5398d);
    }
}
