package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbrq {

    /* renamed from: a  reason: collision with root package name */
    private final zzdou f6769a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbbd f6770b;

    /* renamed from: c  reason: collision with root package name */
    private final ApplicationInfo f6771c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6772d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f6773e;

    /* renamed from: f  reason: collision with root package name */
    private final PackageInfo f6774f;
    private final zzeku<zzdvf<String>> g;
    private final zzaxx h;
    private final String i;
    private final zzdeb<Bundle> j;

    public zzbrq(zzdou zzdou, zzbbd zzbbd, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, zzeku<zzdvf<String>> zzeku, zzaxx zzaxx, String str2, zzdeb<Bundle> zzdeb) {
        this.f6769a = zzdou;
        this.f6770b = zzbbd;
        this.f6771c = applicationInfo;
        this.f6772d = str;
        this.f6773e = list;
        this.f6774f = packageInfo;
        this.g = zzeku;
        this.h = zzaxx;
        this.i = str2;
        this.j = zzdeb;
    }

    public final zzdvf<Bundle> a() {
        return this.f6769a.g(zzdor.SIGNALS).d(this.j.a(new Bundle())).f();
    }

    public final zzdvf<zzasm> b() {
        zzdvf<Bundle> a2 = a();
        return this.f6769a.a(zzdor.REQUEST_PARCEL, a2, this.g.get()).a(new cd(this, a2)).f();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzasm c(zzdvf zzdvf) throws Exception {
        return new zzasm((Bundle) zzdvf.get(), this.f6770b, this.f6771c, this.f6772d, this.f6773e, this.f6774f, (String) this.g.get().get(), this.h.j(), this.i, (zzdms) null, (String) null);
    }
}
