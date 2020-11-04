package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class mg0 extends ng0<zzadx> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FrameLayout f4579b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FrameLayout f4580c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Context f4581d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzvp f4582e;

    mg0(zzvp zzvp, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f4582e = zzvp;
        this.f4579b = frameLayout;
        this.f4580c = frameLayout2;
        this.f4581d = context;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zza(ObjectWrapper.h0(this.f4579b), ObjectWrapper.h0(this.f4580c));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object c() {
        zzvp.f(this.f4581d, "native_ad_view_delegate");
        return new zzzm();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f4582e.f9386d.c(this.f4581d, this.f4579b, this.f4580c);
    }
}
