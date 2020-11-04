package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ya0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f5554b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f5555c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f5556d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzih f5557e;

    ya0(zzih zzih, int i, long j, long j2) {
        this.f5557e = zzih;
        this.f5554b = i;
        this.f5555c = j;
        this.f5556d = j2;
    }

    public final void run() {
        this.f5557e.f8945b.c(this.f5554b, this.f5555c, this.f5556d);
    }
}
