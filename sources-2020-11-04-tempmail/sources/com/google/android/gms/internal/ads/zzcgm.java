package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcgm extends zzafs {

    /* renamed from: b  reason: collision with root package name */
    private final String f7201b;

    /* renamed from: c  reason: collision with root package name */
    private final zzccd f7202c;

    /* renamed from: d  reason: collision with root package name */
    private final zzcck f7203d;

    public zzcgm(String str, zzccd zzccd, zzcck zzcck) {
        this.f7201b = str;
        this.f7202c = zzccd;
        this.f7203d = zzcck;
    }

    public final boolean A(Bundle bundle) throws RemoteException {
        return this.f7202c.G(bundle);
    }

    public final List<?> D4() throws RemoteException {
        if (p2()) {
            return this.f7203d.j();
        }
        return Collections.emptyList();
    }

    public final void F(Bundle bundle) throws RemoteException {
        this.f7202c.F(bundle);
    }

    public final void J() {
        this.f7202c.H();
    }

    public final void J6() {
        this.f7202c.i();
    }

    public final void N() throws RemoteException {
        this.f7202c.g();
    }

    public final void R(zzxp zzxp) throws RemoteException {
        this.f7202c.o(zzxp);
    }

    public final void c0(zzxt zzxt) throws RemoteException {
        this.f7202c.p(zzxt);
    }

    public final void destroy() throws RemoteException {
        this.f7202c.a();
    }

    public final String e() throws RemoteException {
        return this.f7203d.g();
    }

    public final IObjectWrapper f() throws RemoteException {
        return this.f7203d.c0();
    }

    public final void f0(zzafo zzafo) throws RemoteException {
        this.f7202c.m(zzafo);
    }

    public final zzadl g() throws RemoteException {
        return this.f7203d.b0();
    }

    public final Bundle getExtras() throws RemoteException {
        return this.f7203d.f();
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f7201b;
    }

    public final zzyi getVideoController() throws RemoteException {
        return this.f7203d.n();
    }

    public final String i() throws RemoteException {
        return this.f7203d.d();
    }

    public final String j() throws RemoteException {
        return this.f7203d.c();
    }

    public final List<?> k() throws RemoteException {
        return this.f7203d.h();
    }

    public final zzado l0() throws RemoteException {
        return this.f7202c.w().b();
    }

    public final zzadt m() throws RemoteException {
        return this.f7203d.a0();
    }

    public final boolean m0() {
        return this.f7202c.h();
    }

    public final String n() throws RemoteException {
        return this.f7203d.k();
    }

    public final IObjectWrapper o() throws RemoteException {
        return ObjectWrapper.h0(this.f7202c);
    }

    public final double p() throws RemoteException {
        return this.f7203d.l();
    }

    public final boolean p2() throws RemoteException {
        return !this.f7203d.j().isEmpty() && this.f7203d.D() != null;
    }

    public final String q() throws RemoteException {
        return this.f7203d.b();
    }

    public final String r() throws RemoteException {
        return this.f7203d.m();
    }

    public final void u(Bundle bundle) throws RemoteException {
        this.f7202c.D(bundle);
    }

    public final void zza(zzyc zzyc) throws RemoteException {
        this.f7202c.q(zzyc);
    }

    public final zzyd zzkj() throws RemoteException {
        if (!((Boolean) zzwg.e().c(zzaav.C3)).booleanValue()) {
            return null;
        }
        return this.f7202c.d();
    }
}
