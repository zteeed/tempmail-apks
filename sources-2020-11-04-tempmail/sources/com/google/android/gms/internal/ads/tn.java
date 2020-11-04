package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class tn extends zzaok {

    /* renamed from: b  reason: collision with root package name */
    private zzcqv<zzaox, zzcsd> f5185b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzcrp f5186c;

    private tn(zzcrp zzcrp, zzcqv<zzaox, zzcsd> zzcqv) {
        this.f5186c = zzcrp;
        this.f5185b = zzcqv;
    }

    public final void f3(IObjectWrapper iObjectWrapper) throws RemoteException {
        View unused = this.f5186c.f7600c = (View) ObjectWrapper.V(iObjectWrapper);
        ((zzcsd) this.f5185b.f7567c).onAdLoaded();
    }

    public final void s(String str) throws RemoteException {
        ((zzcsd) this.f5185b.f7567c).z2(0, str);
    }
}
