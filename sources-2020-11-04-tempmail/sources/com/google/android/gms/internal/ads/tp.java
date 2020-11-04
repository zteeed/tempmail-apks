package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zze;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class tp implements zze {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzbzl f5191a;

    tp(zzcwa zzcwa, zzbzl zzbzl) {
        this.f5191a = zzbzl;
    }

    public final void zzh(View view) {
    }

    public final void zzjz() {
        this.f5191a.c().onAdClicked();
    }

    public final void zzka() {
        this.f5191a.d().onAdImpression();
        this.f5191a.e().C0();
    }
}
