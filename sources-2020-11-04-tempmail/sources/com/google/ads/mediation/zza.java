package com.google.ads.mediation;

import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class zza extends AdMetadataListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractAdViewAdapter f2633a;

    zza(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f2633a = abstractAdViewAdapter;
    }

    public final void onAdMetadataChanged() {
        if (this.f2633a.zzmm != null && this.f2633a.zzmn != null) {
            this.f2633a.zzmn.zzb(this.f2633a.zzmm.getAdMetadata());
        }
    }
}
