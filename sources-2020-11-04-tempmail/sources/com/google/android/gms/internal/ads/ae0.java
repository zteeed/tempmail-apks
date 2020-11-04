package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ae0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3555b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f3556c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f3557d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzqe f3558e;

    ae0(zzqe zzqe, String str, long j, long j2) {
        this.f3558e = zzqe;
        this.f3555b = str;
        this.f3556c = j;
        this.f3557d = j2;
    }

    public final void run() {
        this.f3558e.f9211b.b(this.f3555b, this.f3556c, this.f3557d);
    }
}
