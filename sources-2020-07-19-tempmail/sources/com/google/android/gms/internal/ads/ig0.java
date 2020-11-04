package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class ig0 extends ng0<zzww> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4054b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzvh f4055c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f4056d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzvp f4057e;

    ig0(zzvp zzvp, Context context, zzvh zzvh, String str) {
        this.f4057e = zzvp;
        this.f4054b = context;
        this.f4055c = zzvh;
        this.f4056d = str;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zza(ObjectWrapper.b0(this.f4054b), this.f4055c, this.f4056d, 201604000);
    }

    public final /* synthetic */ Object c() {
        zzvp.f(this.f4054b, "search");
        return new zzzi();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f4057e.f9200a.c(this.f4054b, this.f4055c, this.f4056d, (zzamr) null, 3);
    }
}
