package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcsc extends zzaua implements zzbtt {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private zzatx f7443b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private zzbtw f7444c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    private zzbyx f7445d;

    public final synchronized void A6(zzatx zzatx) {
        this.f7443b = zzatx;
    }

    public final synchronized void B6(zzbyx zzbyx) {
        this.f7445d = zzbyx;
    }

    public final synchronized void C0(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f7443b != null) {
            this.f7443b.C0(iObjectWrapper);
        }
        if (this.f7444c != null) {
            this.f7444c.onAdLoaded();
        }
    }

    public final synchronized void I1(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f7443b != null) {
            this.f7443b.I1(iObjectWrapper);
        }
    }

    public final synchronized void J5(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f7443b != null) {
            this.f7443b.J5(iObjectWrapper);
        }
    }

    public final synchronized void L3(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f7443b != null) {
            this.f7443b.L3(iObjectWrapper);
        }
    }

    public final synchronized void N4(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f7443b != null) {
            this.f7443b.N4(iObjectWrapper);
        }
    }

    public final synchronized void Z1(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.f7443b != null) {
            this.f7443b.Z1(iObjectWrapper, i);
        }
        if (this.f7444c != null) {
            this.f7444c.onAdFailedToLoad(i);
        }
    }

    public final synchronized void f3(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f7443b != null) {
            this.f7443b.f3(iObjectWrapper);
        }
        if (this.f7445d != null) {
            this.f7445d.onInitializationSucceeded();
        }
    }

    public final synchronized void h2(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f7443b != null) {
            this.f7443b.h2(iObjectWrapper);
        }
    }

    public final synchronized void i1(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.f7443b != null) {
            this.f7443b.i1(iObjectWrapper, i);
        }
        if (this.f7445d != null) {
            this.f7445d.a(i);
        }
    }

    public final synchronized void i6(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f7443b != null) {
            this.f7443b.i6(iObjectWrapper);
        }
    }

    public final synchronized void u6(IObjectWrapper iObjectWrapper, zzaub zzaub) throws RemoteException {
        if (this.f7443b != null) {
            this.f7443b.u6(iObjectWrapper, zzaub);
        }
    }

    public final synchronized void y(zzbtw zzbtw) {
        this.f7444c = zzbtw;
    }

    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.f7443b != null) {
            this.f7443b.zzb(bundle);
        }
    }
}
