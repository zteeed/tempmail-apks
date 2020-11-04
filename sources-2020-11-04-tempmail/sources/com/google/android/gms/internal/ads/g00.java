package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class g00 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzdvf f4022b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f4023c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ h00 f4024d;

    g00(h00 h00, zzdvf zzdvf, int i) {
        this.f4024d = h00;
        this.f4022b = zzdvf;
        this.f4023c = i;
    }

    public final void run() {
        try {
            if (this.f4022b.isCancelled()) {
                zzdsr unused = this.f4024d.m = null;
                this.f4024d.cancel(false);
            } else {
                this.f4024d.K(this.f4023c, this.f4022b);
            }
        } finally {
            this.f4024d.L((zzdsr) null);
        }
    }
}
