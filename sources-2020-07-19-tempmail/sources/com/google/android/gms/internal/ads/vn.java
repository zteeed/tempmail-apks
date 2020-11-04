package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class vn implements zzcam {

    /* renamed from: a  reason: collision with root package name */
    private final zzbbn f5157a;

    vn(zzbbn zzbbn) {
        this.f5157a = zzbbn;
    }

    public final void a(boolean z, Context context) {
        zzbbn zzbbn = this.f5157a;
        try {
            zzq.zzkv();
            zzn.zza(context, (AdOverlayInfoParcel) zzbbn.get(), true);
        } catch (Exception unused) {
        }
    }
}
