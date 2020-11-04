package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class w9 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbgh f5384b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5385c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5386d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f5387e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5388f;

    w9(zzbgh zzbgh, int i, int i2, boolean z, boolean z2) {
        this.f5384b = zzbgh;
        this.f5385c = i;
        this.f5386d = i2;
        this.f5387e = z;
        this.f5388f = z2;
    }

    public final void run() {
        this.f5384b.i7(this.f5385c, this.f5386d, this.f5387e, this.f5388f);
    }
}
