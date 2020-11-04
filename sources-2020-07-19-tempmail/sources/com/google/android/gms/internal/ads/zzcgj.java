package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcgj extends zzaek {

    /* renamed from: b  reason: collision with root package name */
    private final String f7011b;

    /* renamed from: c  reason: collision with root package name */
    private final zzccd f7012c;

    /* renamed from: d  reason: collision with root package name */
    private final zzcck f7013d;

    public zzcgj(String str, zzccd zzccd, zzcck zzcck) {
        this.f7011b = str;
        this.f7012c = zzccd;
        this.f7013d = zzcck;
    }

    public final void C(Bundle bundle) throws RemoteException {
        this.f7012c.F(bundle);
    }

    public final String d() throws RemoteException {
        return this.f7013d.g();
    }

    public final void destroy() throws RemoteException {
        this.f7012c.a();
    }

    public final IObjectWrapper e() throws RemoteException {
        return this.f7013d.c0();
    }

    public final zzadl f() throws RemoteException {
        return this.f7013d.b0();
    }

    public final Bundle getExtras() throws RemoteException {
        return this.f7013d.f();
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f7011b;
    }

    public final zzyi getVideoController() throws RemoteException {
        return this.f7013d.n();
    }

    public final String h() throws RemoteException {
        return this.f7013d.d();
    }

    public final zzadt h0() throws RemoteException {
        return this.f7013d.d0();
    }

    public final String i() throws RemoteException {
        return this.f7013d.c();
    }

    public final List<?> j() throws RemoteException {
        return this.f7013d.h();
    }

    public final IObjectWrapper m() throws RemoteException {
        return ObjectWrapper.b0(this.f7012c);
    }

    public final String o() throws RemoteException {
        return this.f7013d.b();
    }

    public final void s(Bundle bundle) throws RemoteException {
        this.f7012c.D(bundle);
    }

    public final boolean x(Bundle bundle) throws RemoteException {
        return this.f7012c.G(bundle);
    }
}
