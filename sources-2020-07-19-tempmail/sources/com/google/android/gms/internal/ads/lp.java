package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class lp implements zzbtw {

    /* renamed from: a  reason: collision with root package name */
    private boolean f4321a = false;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzbbn f4322b;

    lp(zzcve zzcve, zzbbn zzbbn) {
        this.f4322b = zzbbn;
    }

    private final void b(int i, String str) {
        int i2 = zzdls.f8180a;
        if (((Boolean) zzwg.e().c(zzaav.v2)).booleanValue()) {
            i2 = zzdls.f8182c;
        }
        this.f4322b.c(new zzcqx(i2, i, str));
    }

    public final synchronized void a(int i, String str) {
        this.f4321a = true;
        b(i, str);
    }

    public final void onAdFailedToLoad(int i) {
        if (!this.f4321a) {
            b(i, (String) null);
        }
    }

    public final synchronized void onAdLoaded() {
        this.f4322b.a(null);
    }
}
