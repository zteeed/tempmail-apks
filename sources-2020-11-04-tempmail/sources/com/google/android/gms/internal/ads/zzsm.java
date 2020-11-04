package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzsm extends AppOpenAd {

    /* renamed from: a  reason: collision with root package name */
    private final zzsf f9269a;

    public zzsm(zzsf zzsf) {
        this.f9269a = zzsf;
    }

    /* access modifiers changed from: protected */
    public final void zza(zzsl zzsl) {
        try {
            this.f9269a.w5(zzsl);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    /* access modifiers changed from: protected */
    public final zzww zzdv() {
        try {
            return this.f9269a.i5();
        } catch (RemoteException e2) {
            zzbba.c("", e2);
            return null;
        }
    }
}
