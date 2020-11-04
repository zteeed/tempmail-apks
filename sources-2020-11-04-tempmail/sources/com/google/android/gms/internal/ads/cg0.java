package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class cg0 extends ng0<zzww> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3740b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzvh f3741c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f3742d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzamr f3743e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzvp f3744f;

    cg0(zzvp zzvp, Context context, zzvh zzvh, String str, zzamr zzamr) {
        this.f3744f = zzvp;
        this.f3740b = context;
        this.f3741c = zzvh;
        this.f3742d = str;
        this.f3743e = zzamr;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zza(ObjectWrapper.h0(this.f3740b), this.f3741c, this.f3742d, this.f3743e, 201604000);
    }

    public final /* synthetic */ Object c() {
        zzvp.f(this.f3740b, "banner");
        return new zzzi();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f3744f.f9383a.c(this.f3740b, this.f3741c, this.f3742d, this.f3743e, 1);
    }
}
