package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class mg0 extends ng0<zzadx> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FrameLayout f4396b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FrameLayout f4397c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Context f4398d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzvp f4399e;

    mg0(zzvp zzvp, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f4399e = zzvp;
        this.f4396b = frameLayout;
        this.f4397c = frameLayout2;
        this.f4398d = context;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zza(ObjectWrapper.b0(this.f4396b), ObjectWrapper.b0(this.f4397c));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object c() {
        zzvp.f(this.f4398d, "native_ad_view_delegate");
        return new zzzm();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f4399e.f9203d.c(this.f4398d, this.f4396b, this.f4397c);
    }
}
