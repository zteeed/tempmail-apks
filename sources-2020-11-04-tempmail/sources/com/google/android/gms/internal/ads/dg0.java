package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class dg0 extends ng0<zzawr> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3829b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzamr f3830c;

    dg0(zzvp zzvp, Context context, zzamr zzamr) {
        this.f3829b = context;
        this.f3830c = zzamr;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final zzawr d() {
        try {
            return ((zzaww) zzbaz.a(this.f3829b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", gg0.f4076a)).J2(ObjectWrapper.h0(this.f3829b), this.f3830c, 201604000);
        } catch (RemoteException | zzbbb | NullPointerException unused) {
            return null;
        }
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zzb(ObjectWrapper.h0(this.f3829b), this.f3830c, 201604000);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c() {
        return null;
    }
}
