package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class kg0 extends ng0<zzwp> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4402b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f4403c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzamr f4404d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzvp f4405e;

    kg0(zzvp zzvp, Context context, String str, zzamr zzamr) {
        this.f4405e = zzvp;
        this.f4402b = context;
        this.f4403c = str;
        this.f4404d = zzamr;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zza(ObjectWrapper.h0(this.f4402b), this.f4403c, this.f4404d, 201604000);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object c() {
        zzvp.f(this.f4402b, "native_ad");
        return new zzze();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f4405e.f9384b.c(this.f4402b, this.f4403c, this.f4404d);
    }
}
