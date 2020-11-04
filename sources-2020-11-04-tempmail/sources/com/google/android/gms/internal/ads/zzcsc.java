package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcsc extends zzaua implements zzbtt {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private zzatx f7626b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private zzbtw f7627c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    private zzbyx f7628d;

    public final synchronized void B(zzbtw zzbtw) {
        this.f7627c = zzbtw;
    }

    public final synchronized void I0(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f7626b != null) {
            this.f7626b.I0(iObjectWrapper);
        }
        if (this.f7627c != null) {
            this.f7627c.onAdLoaded();
        }
    }

    public final synchronized void K6(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f7626b != null) {
            this.f7626b.K6(iObjectWrapper);
        }
    }

    public final synchronized void R1(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f7626b != null) {
            this.f7626b.R1(iObjectWrapper);
        }
    }

    public final synchronized void Y6(IObjectWrapper iObjectWrapper, zzaub zzaub) throws RemoteException {
        if (this.f7626b != null) {
            this.f7626b.Y6(iObjectWrapper, zzaub);
        }
    }

    public final synchronized void Z3(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f7626b != null) {
            this.f7626b.Z3(iObjectWrapper);
        }
    }

    public final synchronized void f7(zzatx zzatx) {
        this.f7626b = zzatx;
    }

    public final synchronized void g7(zzbyx zzbyx) {
        this.f7628d = zzbyx;
    }

    public final synchronized void h5(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f7626b != null) {
            this.f7626b.h5(iObjectWrapper);
        }
    }

    public final synchronized void h6(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f7626b != null) {
            this.f7626b.h6(iObjectWrapper);
        }
    }

    public final synchronized void j2(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.f7626b != null) {
            this.f7626b.j2(iObjectWrapper, i);
        }
        if (this.f7627c != null) {
            this.f7627c.onAdFailedToLoad(i);
        }
    }

    public final synchronized void o1(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.f7626b != null) {
            this.f7626b.o1(iObjectWrapper, i);
        }
        if (this.f7628d != null) {
            this.f7628d.a(i);
        }
    }

    public final synchronized void r2(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f7626b != null) {
            this.f7626b.r2(iObjectWrapper);
        }
    }

    public final synchronized void v3(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f7626b != null) {
            this.f7626b.v3(iObjectWrapper);
        }
        if (this.f7628d != null) {
            this.f7628d.onInitializationSucceeded();
        }
    }

    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.f7626b != null) {
            this.f7626b.zzb(bundle);
        }
    }
}
