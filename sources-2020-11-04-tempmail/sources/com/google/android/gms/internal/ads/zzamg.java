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
    private final AppMeasurementSdk f5970b;

    zzamg(AppMeasurementSdk appMeasurementSdk) {
        this.f5970b = appMeasurementSdk;
    }

    public final long A2() throws RemoteException {
        return this.f5970b.d();
    }

    public final void F4(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        this.f5970b.t(iObjectWrapper != null ? (Activity) ObjectWrapper.V(iObjectWrapper) : null, str, str2);
    }

    public final void G0(Bundle bundle) throws RemoteException {
        this.f5970b.p(bundle);
    }

    public final String H2() throws RemoteException {
        return this.f5970b.i();
    }

    public final String Q4() throws RemoteException {
        return this.f5970b.h();
    }

    public final void T4(Bundle bundle) throws RemoteException {
        this.f5970b.s(bundle);
    }

    public final void V6(String str) throws RemoteException {
        this.f5970b.c(str);
    }

    public final void W(String str, String str2, Bundle bundle) throws RemoteException {
        this.f5970b.o(str, str2, bundle);
    }

    public final Map Y3(String str, String str2, boolean z) throws RemoteException {
        return this.f5970b.n(str, str2, z);
    }

    public final int Z(String str) throws RemoteException {
        return this.f5970b.m(str);
    }

    public final void a6(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException {
        this.f5970b.u(str, str2, iObjectWrapper != null ? ObjectWrapper.V(iObjectWrapper) : null);
    }

    public final String b2() throws RemoteException {
        return this.f5970b.f();
    }

    public final void b6(String str) throws RemoteException {
        this.f5970b.a(str);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        this.f5970b.b(str, str2, bundle);
    }

    public final List d0(String str, String str2) throws RemoteException {
        return this.f5970b.g(str, str2);
    }

    public final String h4() throws RemoteException {
        return this.f5970b.e();
    }

    public final Bundle n2(Bundle bundle) throws RemoteException {
        return this.f5970b.q(bundle);
    }

    public final String p4() throws RemoteException {
        return this.f5970b.j();
    }
}
