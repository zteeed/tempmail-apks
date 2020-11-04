package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzadp implements NativeCustomTemplateAd.DisplayOpenMeasurement {

    /* renamed from: a  reason: collision with root package name */
    private final zzaep f5825a;

    public zzadp(zzaep zzaep) {
        this.f5825a = zzaep;
        try {
            zzaep.w3();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final void setView(View view) {
        try {
            this.f5825a.P2(ObjectWrapper.h0(view));
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final boolean start() {
        try {
            return this.f5825a.v4();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return false;
        }
    }
}
