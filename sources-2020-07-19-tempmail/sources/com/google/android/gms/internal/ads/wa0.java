package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class wa0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5213b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f5214c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f5215d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzih f5216e;

    wa0(zzih zzih, String str, long j, long j2) {
        this.f5216e = zzih;
        this.f5213b = str;
        this.f5214c = j;
        this.f5215d = j2;
    }

    public final void run() {
        this.f5216e.f8762b.e(this.f5213b, this.f5214c, this.f5215d);
    }
}
