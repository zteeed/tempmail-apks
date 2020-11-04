package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzamg extends zzbhx {

    /* renamed from: b  reason: collision with root package name */
    private final AppMeasurementSdk f5787b;

    zzamg(AppMeasurementSdk appMeasurementSdk) {
        this.f5787b = appMeasurementSdk;
    }

    public final void A0(Bundle bundle) throws RemoteException {
        this.f5787b.p(bundle);
    }

    public final void C5(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException {
        this.f5787b.u(str, str2, iObjectWrapper != null ? ObjectWrapper.P(iObjectWrapper) : null);
    }

    public final void D5(String str) throws RemoteException {
        this.f5787b.a(str);
    }

    public final Map K3(String str, String str2, boolean z) throws RemoteException {
        return this.f5787b.n(str, str2, z);
    }

    public final void Q(String str, String str2, Bundle bundle) throws RemoteException {
        this.f5787b.o(str, str2, bundle);
    }

    public final String Q3() throws RemoteException {
        return this.f5787b.e();
    }

    public final String S1() throws RemoteException {
        return this.f5787b.f();
    }

    public final int T(String str) throws RemoteException {
        return this.f5787b.m(str);
    }

    public final String V3() throws RemoteException {
        return this.f5787b.j();
    }

    public final List X(String str, String str2) throws RemoteException {
        return this.f5787b.g(str, str2);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        this.f5787b.b(str, str2, bundle);
    }

    public final Bundle d2(Bundle bundle) throws RemoteException {
        return this.f5787b.q(bundle);
    }

    public final void l4(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        this.f5787b.t(iObjectWrapper != null ? (Activity) ObjectWrapper.P(iObjectWrapper) : null, str, str2);
    }

    public final long p2() throws RemoteException {
        return this.f5787b.d();
    }

    public final void r6(String str) throws RemoteException {
        this.f5787b.c(str);
    }

    public final String u2() throws RemoteException {
        return this.f5787b.i();
    }

    public final String w4() throws RemoteException {
        return this.f5787b.h();
    }

    public final void z4(Bundle bundle) throws RemoteException {
        this.f5787b.s(bundle);
    }
}
