package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ya0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f5371b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f5372c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f5373d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzih f5374e;

    ya0(zzih zzih, int i, long j, long j2) {
        this.f5374e = zzih;
        this.f5371b = i;
        this.f5372c = j;
        this.f5373d = j2;
    }

    public final void run() {
        this.f5374e.f8762b.c(this.f5371b, this.f5372c, this.f5373d);
    }
}
