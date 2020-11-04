package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class og0 extends ng0<zzatj> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4740b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzamr f4741c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzvp f4742d;

    og0(zzvp zzvp, Context context, zzamr zzamr) {
        this.f4742d = zzvp;
        this.f4740b = context;
        this.f4741c = zzamr;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zza(ObjectWrapper.h0(this.f4740b), this.f4741c, 201604000);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object c() {
        zzvp.f(this.f4740b, "rewarded_video");
        return new zzzq();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f4742d.f9387e.c(this.f4740b, this.f4741c);
    }
}
