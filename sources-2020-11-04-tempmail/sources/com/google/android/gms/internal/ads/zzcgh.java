package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcgh extends zzaeg {

    /* renamed from: b  reason: collision with root package name */
    private final String f7188b;

    /* renamed from: c  reason: collision with root package name */
    private final zzccd f7189c;

    /* renamed from: d  reason: collision with root package name */
    private final zzcck f7190d;

    public zzcgh(String str, zzccd zzccd, zzcck zzcck) {
        this.f7188b = str;
        this.f7189c = zzccd;
        this.f7190d = zzcck;
    }

    public final boolean A(Bundle bundle) throws RemoteException {
        return this.f7189c.G(bundle);
    }

    public final void F(Bundle bundle) throws RemoteException {
        this.f7189c.F(bundle);
    }

    public final void destroy() throws RemoteException {
        this.f7189c.a();
    }

    public final String e() throws RemoteException {
        return this.f7190d.g();
    }

    public final IObjectWrapper f() throws RemoteException {
        return this.f7190d.c0();
    }

    public final zzadl g() throws RemoteException {
        return this.f7190d.b0();
    }

    public final Bundle getExtras() throws RemoteException {
        return this.f7190d.f();
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f7188b;
    }

    public final zzyi getVideoController() throws RemoteException {
        return this.f7190d.n();
    }

    public final String i() throws RemoteException {
        return this.f7190d.d();
    }

    public final String j() throws RemoteException {
        return this.f7190d.c();
    }

    public final List<?> k() throws RemoteException {
        return this.f7190d.h();
    }

    public final zzadt m() throws RemoteException {
        return this.f7190d.a0();
    }

    public final String n() throws RemoteException {
        return this.f7190d.k();
    }

    public final IObjectWrapper o() throws RemoteException {
        return ObjectWrapper.h0(this.f7189c);
    }

    public final double p() throws RemoteException {
        return this.f7190d.l();
    }

    public final String r() throws RemoteException {
        return this.f7190d.m();
    }

    public final void u(Bundle bundle) throws RemoteException {
        this.f7189c.D(bundle);
    }
}
