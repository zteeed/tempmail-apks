package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class kg0 extends ng0<zzwp> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4219b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f4220c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzamr f4221d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzvp f4222e;

    kg0(zzvp zzvp, Context context, String str, zzamr zzamr) {
        this.f4222e = zzvp;
        this.f4219b = context;
        this.f4220c = str;
        this.f4221d = zzamr;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zza(ObjectWrapper.b0(this.f4219b), this.f4220c, this.f4221d, 201604000);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object c() {
        zzvp.f(this.f4219b, "native_ad");
        return new zzze();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f4222e.f9201b.c(this.f4219b, this.f4220c, this.f4221d);
    }
}
