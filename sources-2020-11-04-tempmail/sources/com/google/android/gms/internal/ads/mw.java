package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class mw extends AdMetadataListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzwz f4607a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzdke f4608b;

    mw(zzdke zzdke, zzwz zzwz) {
        this.f4608b = zzdke;
        this.f4607a = zzwz;
    }

    public final void onAdMetadataChanged() {
        if (this.f4608b.f8302e != null) {
            try {
                this.f4607a.onAdMetadataChanged();
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        }
    }
}
