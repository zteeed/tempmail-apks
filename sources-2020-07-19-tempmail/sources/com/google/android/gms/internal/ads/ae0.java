package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ae0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3372b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f3373c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f3374d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzqe f3375e;

    ae0(zzqe zzqe, String str, long j, long j2) {
        this.f3375e = zzqe;
        this.f3372b = str;
        this.f3373c = j;
        this.f3374d = j2;
    }

    public final void run() {
        this.f3375e.f9028b.b(this.f3372b, this.f3373c, this.f3374d);
    }
}
