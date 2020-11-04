package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzzs extends zzya {

    /* renamed from: b  reason: collision with root package name */
    private final OnAdMetadataChangedListener f9272b;

    public zzzs(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f9272b = onAdMetadataChangedListener;
    }

    public final void onAdMetadataChanged() throws RemoteException {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.f9272b;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
