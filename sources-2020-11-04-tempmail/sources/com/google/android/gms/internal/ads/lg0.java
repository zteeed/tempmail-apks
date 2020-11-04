package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class lg0 extends ng0<zzaea> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ View f4490b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ HashMap f4491c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ HashMap f4492d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzvp f4493e;

    lg0(zzvp zzvp, View view, HashMap hashMap, HashMap hashMap2) {
        this.f4493e = zzvp;
        this.f4490b = view;
        this.f4491c = hashMap;
        this.f4492d = hashMap2;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zza(ObjectWrapper.h0(this.f4490b), ObjectWrapper.h0(this.f4491c), ObjectWrapper.h0(this.f4492d));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object c() {
        zzvp.f(this.f4490b.getContext(), "native_ad_view_holder_delegate");
        return new zzzp();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f4493e.g.c(this.f4490b, this.f4491c, this.f4492d);
    }
}
