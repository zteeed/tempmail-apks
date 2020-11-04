package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class g00 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzdvf f3839b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f3840c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ h00 f3841d;

    g00(h00 h00, zzdvf zzdvf, int i) {
        this.f3841d = h00;
        this.f3839b = zzdvf;
        this.f3840c = i;
    }

    public final void run() {
        try {
            if (this.f3839b.isCancelled()) {
                zzdsr unused = this.f3841d.m = null;
                this.f3841d.cancel(false);
            } else {
                this.f3841d.K(this.f3840c, this.f3839b);
            }
        } finally {
            this.f3841d.L((zzdsr) null);
        }
    }
}
