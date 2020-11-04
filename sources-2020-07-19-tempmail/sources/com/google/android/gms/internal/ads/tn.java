package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class tn extends zzaok {

    /* renamed from: b  reason: collision with root package name */
    private zzcqv<zzaox, zzcsd> f5002b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzcrp f5003c;

    private tn(zzcrp zzcrp, zzcqv<zzaox, zzcsd> zzcqv) {
        this.f5003c = zzcrp;
        this.f5002b = zzcqv;
    }

    public final void T2(IObjectWrapper iObjectWrapper) throws RemoteException {
        View unused = this.f5003c.f7417c = (View) ObjectWrapper.P(iObjectWrapper);
        ((zzcsd) this.f5002b.f7384c).onAdLoaded();
    }

    public final void q(String str) throws RemoteException {
        ((zzcsd) this.f5002b.f7384c).o2(0, str);
    }
}
