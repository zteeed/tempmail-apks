package com.google.ads.mediation;

import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class zza extends AdMetadataListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractAdViewAdapter f2445a;

    zza(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f2445a = abstractAdViewAdapter;
    }

    public final void onAdMetadataChanged() {
        if (this.f2445a.zzmm != null && this.f2445a.zzmn != null) {
            this.f2445a.zzmn.zzb(this.f2445a.zzmm.getAdMetadata());
        }
    }
}
