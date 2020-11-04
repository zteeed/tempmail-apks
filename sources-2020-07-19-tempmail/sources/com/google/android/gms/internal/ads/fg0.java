package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class fg0 extends ng0<zzww> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3803b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzvh f3804c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f3805d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzamr f3806e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzvp f3807f;

    fg0(zzvp zzvp, Context context, zzvh zzvh, String str, zzamr zzamr) {
        this.f3807f = zzvp;
        this.f3803b = context;
        this.f3804c = zzvh;
        this.f3805d = str;
        this.f3806e = zzamr;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zzc(ObjectWrapper.b0(this.f3803b), this.f3804c, this.f3805d, this.f3806e, 201604000);
    }

    public final /* synthetic */ Object c() {
        zzvp.f(this.f3803b, "app_open");
        return new zzzi();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f3807f.f9200a.c(this.f3803b, this.f3804c, this.f3805d, this.f3806e, 4);
    }
}
