package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class ig0 extends ng0<zzww> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4237b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzvh f4238c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f4239d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzvp f4240e;

    ig0(zzvp zzvp, Context context, zzvh zzvh, String str) {
        this.f4240e = zzvp;
        this.f4237b = context;
        this.f4238c = zzvh;
        this.f4239d = str;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zza(ObjectWrapper.h0(this.f4237b), this.f4238c, this.f4239d, 201604000);
    }

    public final /* synthetic */ Object c() {
        zzvp.f(this.f4237b, "search");
        return new zzzi();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f4240e.f9383a.c(this.f4237b, this.f4238c, this.f4239d, (zzamr) null, 3);
    }
}
