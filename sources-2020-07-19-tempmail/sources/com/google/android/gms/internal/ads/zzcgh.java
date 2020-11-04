package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcgh extends zzaeg {

    /* renamed from: b  reason: collision with root package name */
    private final String f7005b;

    /* renamed from: c  reason: collision with root package name */
    private final zzccd f7006c;

    /* renamed from: d  reason: collision with root package name */
    private final zzcck f7007d;

    public zzcgh(String str, zzccd zzccd, zzcck zzcck) {
        this.f7005b = str;
        this.f7006c = zzccd;
        this.f7007d = zzcck;
    }

    public final void C(Bundle bundle) throws RemoteException {
        this.f7006c.F(bundle);
    }

    public final String d() throws RemoteException {
        return this.f7007d.g();
    }

    public final void destroy() throws RemoteException {
        this.f7006c.a();
    }

    public final IObjectWrapper e() throws RemoteException {
        return this.f7007d.c0();
    }

    public final zzadl f() throws RemoteException {
        return this.f7007d.b0();
    }

    public final Bundle getExtras() throws RemoteException {
        return this.f7007d.f();
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f7005b;
    }

    public final zzyi getVideoController() throws RemoteException {
        return this.f7007d.n();
    }

    public final String h() throws RemoteException {
        return this.f7007d.d();
    }

    public final String i() throws RemoteException {
        return this.f7007d.c();
    }

    public final List<?> j() throws RemoteException {
        return this.f7007d.h();
    }

    public final zzadt k() throws RemoteException {
        return this.f7007d.a0();
    }

    public final String l() throws RemoteException {
        return this.f7007d.k();
    }

    public final IObjectWrapper m() throws RemoteException {
        return ObjectWrapper.b0(this.f7006c);
    }

    public final double n() throws RemoteException {
        return this.f7007d.l();
    }

    public final String p() throws RemoteException {
        return this.f7007d.m();
    }

    public final void s(Bundle bundle) throws RemoteException {
        this.f7006c.D(bundle);
    }

    public final boolean x(Bundle bundle) throws RemoteException {
        return this.f7006c.G(bundle);
    }
}
