package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class iw extends AdMetadataListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzxx f4264a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzdjy f4265b;

    iw(zzdjy zzdjy, zzxx zzxx) {
        this.f4265b = zzdjy;
        this.f4264a = zzxx;
    }

    public final void onAdMetadataChanged() {
        if (this.f4265b.g != null) {
            try {
                this.f4264a.onAdMetadataChanged();
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        }
    }
}
