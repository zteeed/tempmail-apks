package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class w9 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbgh f5201b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5202c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5203d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f5204e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5205f;

    w9(zzbgh zzbgh, int i, int i2, boolean z, boolean z2) {
        this.f5201b = zzbgh;
        this.f5202c = i;
        this.f5203d = i2;
        this.f5204e = z;
        this.f5205f = z2;
    }

    public final void run() {
        this.f5201b.D6(this.f5202c, this.f5203d, this.f5204e, this.f5205f);
    }
}
