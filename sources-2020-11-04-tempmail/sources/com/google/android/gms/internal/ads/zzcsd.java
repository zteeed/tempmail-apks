package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcsd extends zzamw implements zzbtt {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private zzamx f7629b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private zzbtw f7630c;

    public final synchronized void B(zzbtw zzbtw) {
        this.f7630c = zzbtw;
    }

    public final synchronized void D0(String str) throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.D0(str);
        }
    }

    public final synchronized void D1(String str) throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.D1(str);
        }
    }

    public final synchronized void L0(zzamy zzamy) throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.L0(zzamy);
        }
    }

    public final synchronized void R3() throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.R3();
        }
    }

    public final synchronized void U(zzaud zzaud) throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.U(zzaud);
        }
    }

    public final synchronized void W2() throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.W2();
        }
    }

    public final synchronized void Y() throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.Y();
        }
    }

    public final synchronized void b0(zzaep zzaep, String str) throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.b0(zzaep, str);
        }
    }

    public final synchronized void f7(zzamx zzamx) {
        this.f7629b = zzamx;
    }

    public final synchronized void g2(int i) throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.g2(i);
        }
    }

    public final synchronized void i4(zzaub zzaub) throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.i4(zzaub);
        }
    }

    public final synchronized void onAdClicked() throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.onAdClicked();
        }
    }

    public final synchronized void onAdClosed() throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.onAdClosed();
        }
    }

    public final synchronized void onAdFailedToLoad(int i) throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.onAdFailedToLoad(i);
        }
        if (this.f7630c != null) {
            this.f7630c.a(i, (String) null);
        }
    }

    public final synchronized void onAdImpression() throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.onAdImpression();
        }
    }

    public final synchronized void onAdLeftApplication() throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.onAdLeftApplication();
        }
    }

    public final synchronized void onAdLoaded() throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.onAdLoaded();
        }
        if (this.f7630c != null) {
            this.f7630c.onAdLoaded();
        }
    }

    public final synchronized void onAdOpened() throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.onAdOpened();
        }
    }

    public final synchronized void onAppEvent(String str, String str2) throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.onAppEvent(str, str2);
        }
    }

    public final synchronized void onVideoPause() throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.onVideoPause();
        }
    }

    public final synchronized void onVideoPlay() throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.onVideoPlay();
        }
    }

    public final synchronized void z2(int i, String str) throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.z2(i, str);
        }
        if (this.f7630c != null) {
            this.f7630c.a(i, str);
        }
    }

    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.f7629b != null) {
            this.f7629b.zzb(bundle);
        }
    }
}
