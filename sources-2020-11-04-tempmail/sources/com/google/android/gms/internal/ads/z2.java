package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class z2 implements SignalCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaoy f5614a;

    z2(zzapc zzapc, zzaoy zzaoy) {
        this.f5614a = zzaoy;
    }

    public final void onFailure(String str) {
        try {
            this.f5614a.onFailure(str);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final void onSuccess(String str) {
        try {
            this.f5614a.V4(str);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
