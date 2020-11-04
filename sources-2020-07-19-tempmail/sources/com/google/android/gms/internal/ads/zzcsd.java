package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcsd extends zzamw implements zzbtt {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private zzamx f7446b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private zzbtw f7447c;

    public final synchronized void A6(zzamx zzamx) {
        this.f7446b = zzamx;
    }

    public final synchronized void D3() throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.D3();
        }
    }

    public final synchronized void F0(zzamy zzamy) throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.F0(zzamy);
        }
    }

    public final synchronized void K2() throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.K2();
        }
    }

    public final synchronized void O(zzaud zzaud) throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.O(zzaud);
        }
    }

    public final synchronized void R3(zzaub zzaub) throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.R3(zzaub);
        }
    }

    public final synchronized void S() throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.S();
        }
    }

    public final synchronized void V(zzaep zzaep, String str) throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.V(zzaep, str);
        }
    }

    public final synchronized void W1(int i) throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.W1(i);
        }
    }

    public final synchronized void o2(int i, String str) throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.o2(i, str);
        }
        if (this.f7447c != null) {
            this.f7447c.a(i, str);
        }
    }

    public final synchronized void onAdClicked() throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.onAdClicked();
        }
    }

    public final synchronized void onAdClosed() throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.onAdClosed();
        }
    }

    public final synchronized void onAdFailedToLoad(int i) throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.onAdFailedToLoad(i);
        }
        if (this.f7447c != null) {
            this.f7447c.a(i, (String) null);
        }
    }

    public final synchronized void onAdImpression() throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.onAdImpression();
        }
    }

    public final synchronized void onAdLeftApplication() throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.onAdLeftApplication();
        }
    }

    public final synchronized void onAdLoaded() throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.onAdLoaded();
        }
        if (this.f7447c != null) {
            this.f7447c.onAdLoaded();
        }
    }

    public final synchronized void onAdOpened() throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.onAdOpened();
        }
    }

    public final synchronized void onAppEvent(String str, String str2) throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.onAppEvent(str, str2);
        }
    }

    public final synchronized void onVideoPause() throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.onVideoPause();
        }
    }

    public final synchronized void onVideoPlay() throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.onVideoPlay();
        }
    }

    public final synchronized void u1(String str) throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.u1(str);
        }
    }

    public final synchronized void x0(String str) throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.x0(str);
        }
    }

    public final synchronized void y(zzbtw zzbtw) {
        this.f7447c = zzbtw;
    }

    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.f7446b != null) {
            this.f7446b.zzb(bundle);
        }
    }
}
