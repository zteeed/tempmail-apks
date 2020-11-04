package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class hg0 extends ng0<zzww> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4152b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzvh f4153c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f4154d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzamr f4155e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzvp f4156f;

    hg0(zzvp zzvp, Context context, zzvh zzvh, String str, zzamr zzamr) {
        this.f4156f = zzvp;
        this.f4152b = context;
        this.f4153c = zzvh;
        this.f4154d = str;
        this.f4155e = zzamr;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zzb(ObjectWrapper.h0(this.f4152b), this.f4153c, this.f4154d, this.f4155e, 201604000);
    }

    public final /* synthetic */ Object c() {
        zzvp.f(this.f4152b, "interstitial");
        return new zzzi();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f4156f.f9383a.c(this.f4152b, this.f4153c, this.f4154d, this.f4155e, 2);
    }
}
