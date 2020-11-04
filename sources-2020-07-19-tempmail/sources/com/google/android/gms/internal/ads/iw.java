package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class iw extends AdMetadataListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzxx f4081a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzdjy f4082b;

    iw(zzdjy zzdjy, zzxx zzxx) {
        this.f4082b = zzdjy;
        this.f4081a = zzxx;
    }

    public final void onAdMetadataChanged() {
        if (this.f4082b.g != null) {
            try {
                this.f4081a.onAdMetadataChanged();
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        }
    }
}
