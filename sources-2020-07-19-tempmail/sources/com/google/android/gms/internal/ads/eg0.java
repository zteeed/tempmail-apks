package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class eg0 extends ng0<zzaqi> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Activity f3726b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzvp f3727c;

    eg0(zzvp zzvp, Activity activity) {
        this.f3727c = zzvp;
        this.f3726b = activity;
    }

    public final /* synthetic */ Object a(zzxf zzxf) throws RemoteException {
        return zzxf.zzb(ObjectWrapper.b0(this.f3726b));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object c() {
        zzvp.f(this.f3726b, "ad_overlay");
        return null;
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return this.f3727c.f9205f.c(this.f3726b);
    }
}
