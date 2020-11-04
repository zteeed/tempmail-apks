package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class d7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f3793b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f3794c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzbbz f3795d;

    d7(zzbbz zzbbz, int i, int i2) {
        this.f3795d = zzbbz;
        this.f3793b = i;
        this.f3794c = i2;
    }

    public final void run() {
        if (this.f3795d.q != null) {
            this.f3795d.q.c(this.f3793b, this.f3794c);
        }
    }
}
