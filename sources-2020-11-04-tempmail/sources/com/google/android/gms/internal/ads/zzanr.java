package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzanr extends zzamw {

    /* renamed from: b  reason: collision with root package name */
    private final Adapter f5996b;

    /* renamed from: c  reason: collision with root package name */
    private final zzatx f5997c;

    zzanr(Adapter adapter, zzatx zzatx) {
        this.f5996b = adapter;
        this.f5997c = zzatx;
    }

    public final void D0(String str) throws RemoteException {
    }

    public final void D1(String str) {
    }

    public final void L0(zzamy zzamy) throws RemoteException {
    }

    public final void R3() throws RemoteException {
        zzatx zzatx = this.f5997c;
        if (zzatx != null) {
            zzatx.h6(ObjectWrapper.h0(this.f5996b));
        }
    }

    public final void U(zzaud zzaud) throws RemoteException {
        zzatx zzatx = this.f5997c;
        if (zzatx != null) {
            zzatx.Y6(ObjectWrapper.h0(this.f5996b), new zzaub(zzaud.getType(), zzaud.getAmount()));
        }
    }

    public final void W2() throws RemoteException {
        zzatx zzatx = this.f5997c;
        if (zzatx != null) {
            zzatx.r2(ObjectWrapper.h0(this.f5996b));
        }
    }

    public final void Y() throws RemoteException {
    }

    public final void b0(zzaep zzaep, String str) throws RemoteException {
    }

    public final void g2(int i) throws RemoteException {
    }

    public final void i4(zzaub zzaub) throws RemoteException {
    }

    public final void onAdClicked() throws RemoteException {
        zzatx zzatx = this.f5997c;
        if (zzatx != null) {
            zzatx.Z3(ObjectWrapper.h0(this.f5996b));
        }
    }

    public final void onAdClosed() throws RemoteException {
        zzatx zzatx = this.f5997c;
        if (zzatx != null) {
            zzatx.K6(ObjectWrapper.h0(this.f5996b));
        }
    }

    public final void onAdFailedToLoad(int i) throws RemoteException {
        zzatx zzatx = this.f5997c;
        if (zzatx != null) {
            zzatx.j2(ObjectWrapper.h0(this.f5996b), i);
        }
    }

    public final void onAdImpression() throws RemoteException {
    }

    public final void onAdLeftApplication() throws RemoteException {
    }

    public final void onAdLoaded() throws RemoteException {
        zzatx zzatx = this.f5997c;
        if (zzatx != null) {
            zzatx.I0(ObjectWrapper.h0(this.f5996b));
        }
    }

    public final void onAdOpened() throws RemoteException {
        zzatx zzatx = this.f5997c;
        if (zzatx != null) {
            zzatx.R1(ObjectWrapper.h0(this.f5996b));
        }
    }

    public final void onAppEvent(String str, String str2) throws RemoteException {
    }

    public final void onVideoPause() throws RemoteException {
    }

    public final void onVideoPlay() throws RemoteException {
    }

    public final void z2(int i, String str) throws RemoteException {
    }

    public final void zzb(Bundle bundle) throws RemoteException {
    }
}
