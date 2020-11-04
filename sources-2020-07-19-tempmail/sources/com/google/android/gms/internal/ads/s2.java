package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class s2 implements InitializationCompleteCallback {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaie f4857a;

    s2(zzann zzann, zzaie zzaie) {
        this.f4857a = zzaie;
    }

    public final void onInitializationFailed(String str) {
        try {
            this.f4857a.onInitializationFailed(str);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.f4857a.onInitializationSucceeded();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
