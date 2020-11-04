package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzanr extends zzamw {

    /* renamed from: b  reason: collision with root package name */
    private final Adapter f5813b;

    /* renamed from: c  reason: collision with root package name */
    private final zzatx f5814c;

    zzanr(Adapter adapter, zzatx zzatx) {
        this.f5813b = adapter;
        this.f5814c = zzatx;
    }

    public final void D3() throws RemoteException {
        zzatx zzatx = this.f5814c;
        if (zzatx != null) {
            zzatx.J5(ObjectWrapper.b0(this.f5813b));
        }
    }

    public final void F0(zzamy zzamy) throws RemoteException {
    }

    public final void K2() throws RemoteException {
        zzatx zzatx = this.f5814c;
        if (zzatx != null) {
            zzatx.h2(ObjectWrapper.b0(this.f5813b));
        }
    }

    public final void O(zzaud zzaud) throws RemoteException {
        zzatx zzatx = this.f5814c;
        if (zzatx != null) {
            zzatx.u6(ObjectWrapper.b0(this.f5813b), new zzaub(zzaud.getType(), zzaud.getAmount()));
        }
    }

    public final void R3(zzaub zzaub) throws RemoteException {
    }

    public final void S() throws RemoteException {
    }

    public final void V(zzaep zzaep, String str) throws RemoteException {
    }

    public final void W1(int i) throws RemoteException {
    }

    public final void o2(int i, String str) throws RemoteException {
    }

    public final void onAdClicked() throws RemoteException {
        zzatx zzatx = this.f5814c;
        if (zzatx != null) {
            zzatx.L3(ObjectWrapper.b0(this.f5813b));
        }
    }

    public final void onAdClosed() throws RemoteException {
        zzatx zzatx = this.f5814c;
        if (zzatx != null) {
            zzatx.i6(ObjectWrapper.b0(this.f5813b));
        }
    }

    public final void onAdFailedToLoad(int i) throws RemoteException {
        zzatx zzatx = this.f5814c;
        if (zzatx != null) {
            zzatx.Z1(ObjectWrapper.b0(this.f5813b), i);
        }
    }

    public final void onAdImpression() throws RemoteException {
    }

    public final void onAdLeftApplication() throws RemoteException {
    }

    public final void onAdLoaded() throws RemoteException {
        zzatx zzatx = this.f5814c;
        if (zzatx != null) {
            zzatx.C0(ObjectWrapper.b0(this.f5813b));
        }
    }

    public final void onAdOpened() throws RemoteException {
        zzatx zzatx = this.f5814c;
        if (zzatx != null) {
            zzatx.I1(ObjectWrapper.b0(this.f5813b));
        }
    }

    public final void onAppEvent(String str, String str2) throws RemoteException {
    }

    public final void onVideoPause() throws RemoteException {
    }

    public final void onVideoPlay() throws RemoteException {
    }

    public final void u1(String str) {
    }

    public final void x0(String str) throws RemoteException {
    }

    public final void zzb(Bundle bundle) throws RemoteException {
    }
}
