package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class hg0 extends ng0<zzww> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3969b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzvh f3970c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f3971d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzamr f3972e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzvp f3973f;

    hg0(zzvp zzvp, Context context, zzvh zzvh, String str, zzamr zzamr) {
        this.f3973f = zzvp;
        this.f3969b = context;
        this.f3970c = zzvh;
        this.f3971d = str;
        this.f3972e = zzamr;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zzb(ObjectWrapper.b0(this.f3969b), this.f3970c, this.f3971d, this.f3972e, 201604000);
    }

    public final /* synthetic */ Object c() {
        zzvp.f(this.f3969b, "interstitial");
        return new zzzi();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f3973f.f9200a.c(this.f3969b, this.f3970c, this.f3971d, this.f3972e, 2);
    }
}
