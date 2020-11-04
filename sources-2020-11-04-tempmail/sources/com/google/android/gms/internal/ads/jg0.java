package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class jg0 extends ng0<zzxm> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4325b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzvp f4326c;

    jg0(zzvp zzvp, Context context) {
        this.f4326c = zzvp;
        this.f4325b = context;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zza(ObjectWrapper.h0(this.f4325b), 201604000);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object c() {
        zzvp.f(this.f4325b, "mobile_ads_settings");
        return new zzzk();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f4326c.f9385c.c(this.f4325b);
    }
}
