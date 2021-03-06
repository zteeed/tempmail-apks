package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzadp implements NativeCustomTemplateAd.DisplayOpenMeasurement {

    /* renamed from: a  reason: collision with root package name */
    private final zzaep f5642a;

    public zzadp(zzaep zzaep) {
        this.f5642a = zzaep;
        try {
            zzaep.g3();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final void setView(View view) {
        try {
            this.f5642a.E2(ObjectWrapper.b0(view));
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final boolean start() {
        try {
            return this.f5642a.b4();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return false;
        }
    }
}
