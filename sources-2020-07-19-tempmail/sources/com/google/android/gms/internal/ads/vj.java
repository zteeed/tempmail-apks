package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class vj implements zzbhc {

    /* renamed from: a  reason: collision with root package name */
    private final zzbbn f5150a;

    vj(zzbbn zzbbn) {
        this.f5150a = zzbbn;
    }

    public final void zzak(boolean z) {
        zzbbn zzbbn = this.f5150a;
        if (z) {
            zzbbn.a(null);
        } else {
            zzbbn.c(new Exception("Ad Web View failed to load."));
        }
    }
}
