package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class bg0 extends ng0<zzaui> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3650b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f3651c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzamr f3652d;

    bg0(zzvp zzvp, Context context, String str, zzamr zzamr) {
        this.f3650b = context;
        this.f3651c = str;
        this.f3652d = zzamr;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zzb(ObjectWrapper.h0(this.f3650b), this.f3651c, this.f3652d, 201604000);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object c() {
        zzvp.f(this.f3650b, "rewarded");
        return new zzzo();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return zzauy.a(this.f3650b, this.f3651c, this.f3652d);
    }
}
