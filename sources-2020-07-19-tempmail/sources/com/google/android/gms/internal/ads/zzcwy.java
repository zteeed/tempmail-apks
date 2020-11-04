package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcwy implements zzuu {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private zzwi f7667b;

    public final synchronized void a(zzwi zzwi) {
        this.f7667b = zzwi;
    }

    public final synchronized void onAdClicked() {
        if (this.f7667b != null) {
            try {
                this.f7667b.onAdClicked();
            } catch (RemoteException e2) {
                zzbba.d("Remote Exception at onAdClicked.", e2);
            }
        }
    }
}