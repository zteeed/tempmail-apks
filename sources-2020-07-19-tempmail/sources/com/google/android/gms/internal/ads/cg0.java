package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class cg0 extends ng0<zzww> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3557b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzvh f3558c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f3559d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzamr f3560e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzvp f3561f;

    cg0(zzvp zzvp, Context context, zzvh zzvh, String str, zzamr zzamr) {
        this.f3561f = zzvp;
        this.f3557b = context;
        this.f3558c = zzvh;
        this.f3559d = str;
        this.f3560e = zzamr;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zza(ObjectWrapper.b0(this.f3557b), this.f3558c, this.f3559d, this.f3560e, 201604000);
    }

    public final /* synthetic */ Object c() {
        zzvp.f(this.f3557b, "banner");
        return new zzzi();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f3561f.f9200a.c(this.f3557b, this.f3558c, this.f3559d, this.f3560e, 1);
    }
}
