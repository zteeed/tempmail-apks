package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ce0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f3552b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f3553c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzqe f3554d;

    ce0(zzqe zzqe, int i, long j) {
        this.f3554d = zzqe;
        this.f3552b = i;
        this.f3553c = j;
    }

    public final void run() {
        this.f3554d.f9028b.l(this.f3552b, this.f3553c);
    }
}
