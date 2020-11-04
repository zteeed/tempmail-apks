package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class fg0 extends ng0<zzww> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3986b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzvh f3987c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f3988d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzamr f3989e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzvp f3990f;

    fg0(zzvp zzvp, Context context, zzvh zzvh, String str, zzamr zzamr) {
        this.f3990f = zzvp;
        this.f3986b = context;
        this.f3987c = zzvh;
        this.f3988d = str;
        this.f3989e = zzamr;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zzc(ObjectWrapper.h0(this.f3986b), this.f3987c, this.f3988d, this.f3989e, 201604000);
    }

    public final /* synthetic */ Object c() {
        zzvp.f(this.f3986b, "app_open");
        return new zzzi();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f3990f.f9383a.c(this.f3986b, this.f3987c, this.f3988d, this.f3989e, 4);
    }
}
