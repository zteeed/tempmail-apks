package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdew implements zzdec<zzdet> {

    /* renamed from: a  reason: collision with root package name */
    private final zzaxd f7960a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f7961b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7962c;

    /* renamed from: d  reason: collision with root package name */
    private final PackageInfo f7963d;

    public zzdew(zzaxd zzaxd, Executor executor, String str, PackageInfo packageInfo) {
        this.f7960a = zzaxd;
        this.f7961b = executor;
        this.f7962c = str;
        this.f7963d = packageInfo;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf a(Throwable th) throws Exception {
        return zzdux.g(new zzdet(this.f7962c));
    }

    public final zzdvf<zzdet> b() {
        return zzdux.k(zzdux.i(this.f7960a.a(this.f7962c, this.f7963d), nt.f4506a, this.f7961b), Throwable.class, new ot(this), this.f7961b);
    }
}
