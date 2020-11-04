package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class lg0 extends ng0<zzaea> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ View f4307b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ HashMap f4308c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ HashMap f4309d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzvp f4310e;

    lg0(zzvp zzvp, View view, HashMap hashMap, HashMap hashMap2) {
        this.f4310e = zzvp;
        this.f4307b = view;
        this.f4308c = hashMap;
        this.f4309d = hashMap2;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zza(ObjectWrapper.b0(this.f4307b), ObjectWrapper.b0(this.f4308c), ObjectWrapper.b0(this.f4309d));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object c() {
        zzvp.f(this.f4307b.getContext(), "native_ad_view_holder_delegate");
        return new zzzp();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f4310e.g.c(this.f4307b, this.f4308c, this.f4309d);
    }
}
