package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcgj extends zzaek {

    /* renamed from: b  reason: collision with root package name */
    private final String f7194b;

    /* renamed from: c  reason: collision with root package name */
    private final zzccd f7195c;

    /* renamed from: d  reason: collision with root package name */
    private final zzcck f7196d;

    public zzcgj(String str, zzccd zzccd, zzcck zzcck) {
        this.f7194b = str;
        this.f7195c = zzccd;
        this.f7196d = zzcck;
    }

    public final boolean A(Bundle bundle) throws RemoteException {
        return this.f7195c.G(bundle);
    }

    public final void F(Bundle bundle) throws RemoteException {
        this.f7195c.F(bundle);
    }

    public final void destroy() throws RemoteException {
        this.f7195c.a();
    }

    public final String e() throws RemoteException {
        return this.f7196d.g();
    }

    public final IObjectWrapper f() throws RemoteException {
        return this.f7196d.c0();
    }

    public final zzadl g() throws RemoteException {
        return this.f7196d.b0();
    }

    public final Bundle getExtras() throws RemoteException {
        return this.f7196d.f();
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f7194b;
    }

    public final zzyi getVideoController() throws RemoteException {
        return this.f7196d.n();
    }

    public final String i() throws RemoteException {
        return this.f7196d.d();
    }

    public final String j() throws RemoteException {
        return this.f7196d.c();
    }

    public final List<?> k() throws RemoteException {
        return this.f7196d.h();
    }

    public final zzadt n0() throws RemoteException {
        return this.f7196d.d0();
    }

    public final IObjectWrapper o() throws RemoteException {
        return ObjectWrapper.h0(this.f7195c);
    }

    public final String q() throws RemoteException {
        return this.f7196d.b();
    }

    public final void u(Bundle bundle) throws RemoteException {
        this.f7195c.D(bundle);
    }
}
