package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class bg0 extends ng0<zzaui> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3467b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f3468c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzamr f3469d;

    bg0(zzvp zzvp, Context context, String str, zzamr zzamr) {
        this.f3467b = context;
        this.f3468c = str;
        this.f3469d = zzamr;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zzb(ObjectWrapper.b0(this.f3467b), this.f3468c, this.f3469d, 201604000);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object c() {
        zzvp.f(this.f3467b, "rewarded");
        return new zzzo();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return zzauy.a(this.f3467b, this.f3468c, this.f3469d);
    }
}
