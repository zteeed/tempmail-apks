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
    private final String f7018b;

    /* renamed from: c  reason: collision with root package name */
    private final zzccd f7019c;

    /* renamed from: d  reason: collision with root package name */
    private final zzcck f7020d;

    public zzcgm(String str, zzccd zzccd, zzcck zzcck) {
        this.f7018b = str;
        this.f7019c = zzccd;
        this.f7020d = zzcck;
    }

    public final void C(Bundle bundle) throws RemoteException {
        this.f7019c.F(bundle);
    }

    public final void G() {
        this.f7019c.H();
    }

    public final void J() throws RemoteException {
        this.f7019c.g();
    }

    public final void M(zzxp zzxp) throws RemoteException {
        this.f7019c.o(zzxp);
    }

    public final void W(zzxt zzxt) throws RemoteException {
        this.f7019c.p(zzxt);
    }

    public final void Z(zzafo zzafo) throws RemoteException {
        this.f7019c.m(zzafo);
    }

    public final String d() throws RemoteException {
        return this.f7020d.g();
    }

    public final void destroy() throws RemoteException {
        this.f7019c.a();
    }

    public final IObjectWrapper e() throws RemoteException {
        return this.f7020d.c0();
    }

    public final zzadl f() throws RemoteException {
        return this.f7020d.b0();
    }

    public final zzado f0() throws RemoteException {
        return this.f7019c.w().b();
    }

    public final boolean f2() throws RemoteException {
        return !this.f7020d.j().isEmpty() && this.f7020d.D() != null;
    }

    public final boolean g0() {
        return this.f7019c.h();
    }

    public final Bundle getExtras() throws RemoteException {
        return this.f7020d.f();
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f7018b;
    }

    public final zzyi getVideoController() throws RemoteException {
        return this.f7020d.n();
    }

    public final String h() throws RemoteException {
        return this.f7020d.d();
    }

    public final void h6() {
        this.f7019c.i();
    }

    public final String i() throws RemoteException {
        return this.f7020d.c();
    }

    public final List<?> j() throws RemoteException {
        return this.f7020d.h();
    }

    public final List<?> j4() throws RemoteException {
        if (f2()) {
            return this.f7020d.j();
        }
        return Collections.emptyList();
    }

    public final zzadt k() throws RemoteException {
        return this.f7020d.a0();
    }

    public final String l() throws RemoteException {
        return this.f7020d.k();
    }

    public final IObjectWrapper m() throws RemoteException {
        return ObjectWrapper.b0(this.f7019c);
    }

    public final double n() throws RemoteException {
        return this.f7020d.l();
    }

    public final String o() throws RemoteException {
        return this.f7020d.b();
    }

    public final String p() throws RemoteException {
        return this.f7020d.m();
    }

    public final void s(Bundle bundle) throws RemoteException {
        this.f7019c.D(bundle);
    }

    public final boolean x(Bundle bundle) throws RemoteException {
        return this.f7019c.G(bundle);
    }

    public final void zza(zzyc zzyc) throws RemoteException {
        this.f7019c.q(zzyc);
    }

    public final zzyd zzkj() throws RemoteException {
        if (!((Boolean) zzwg.e().c(zzaav.C3)).booleanValue()) {
            return null;
        }
        return this.f7019c.d();
    }
}
