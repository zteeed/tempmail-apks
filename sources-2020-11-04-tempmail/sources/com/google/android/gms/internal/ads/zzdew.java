package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdew implements zzdec<zzdet> {

    /* renamed from: a  reason: collision with root package name */
    private final zzaxd f8143a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f8144b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8145c;

    /* renamed from: d  reason: collision with root package name */
    private final PackageInfo f8146d;

    public zzdew(zzaxd zzaxd, Executor executor, String str, PackageInfo packageInfo) {
        this.f8143a = zzaxd;
        this.f8144b = executor;
        this.f8145c = str;
        this.f8146d = packageInfo;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf a(Throwable th) throws Exception {
        return zzdux.g(new zzdet(this.f8145c));
    }

    public final zzdvf<zzdet> b() {
        return zzdux.k(zzdux.i(this.f8143a.a(this.f8145c, this.f8146d), nt.f4689a, this.f8144b), Throwable.class, new ot(this), this.f8144b);
    }
}
