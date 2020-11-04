package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ce0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f3735b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f3736c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzqe f3737d;

    ce0(zzqe zzqe, int i, long j) {
        this.f3737d = zzqe;
        this.f3735b = i;
        this.f3736c = j;
    }

    public final void run() {
        this.f3737d.f9211b.l(this.f3735b, this.f3736c);
    }
}
