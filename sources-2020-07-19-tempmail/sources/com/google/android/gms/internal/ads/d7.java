package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class d7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f3610b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f3611c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzbbz f3612d;

    d7(zzbbz zzbbz, int i, int i2) {
        this.f3612d = zzbbz;
        this.f3610b = i;
        this.f3611c = i2;
    }

    public final void run() {
        if (this.f3612d.q != null) {
            this.f3612d.q.c(this.f3610b, this.f3611c);
        }
    }
}
