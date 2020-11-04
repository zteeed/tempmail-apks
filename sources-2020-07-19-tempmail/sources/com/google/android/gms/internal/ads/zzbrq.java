package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbrq {

    /* renamed from: a  reason: collision with root package name */
    private final zzdou f6586a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbbd f6587b;

    /* renamed from: c  reason: collision with root package name */
    private final ApplicationInfo f6588c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6589d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f6590e;

    /* renamed from: f  reason: collision with root package name */
    private final PackageInfo f6591f;
    private final zzeku<zzdvf<String>> g;
    private final zzaxx h;
    private final String i;
    private final zzdeb<Bundle> j;

    public zzbrq(zzdou zzdou, zzbbd zzbbd, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, zzeku<zzdvf<String>> zzeku, zzaxx zzaxx, String str2, zzdeb<Bundle> zzdeb) {
        this.f6586a = zzdou;
        this.f6587b = zzbbd;
        this.f6588c = applicationInfo;
        this.f6589d = str;
        this.f6590e = list;
        this.f6591f = packageInfo;
        this.g = zzeku;
        this.h = zzaxx;
        this.i = str2;
        this.j = zzdeb;
    }

    public final zzdvf<Bundle> a() {
        return this.f6586a.g(zzdor.SIGNALS).d(this.j.a(new Bundle())).f();
    }

    public final zzdvf<zzasm> b() {
        zzdvf<Bundle> a2 = a();
        return this.f6586a.a(zzdor.REQUEST_PARCEL, a2, this.g.get()).a(new cd(this, a2)).f();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzasm c(zzdvf zzdvf) throws Exception {
        return new zzasm((Bundle) zzdvf.get(), this.f6587b, this.f6588c, this.f6589d, this.f6590e, this.f6591f, (String) this.g.get().get(), this.h.j(), this.i, (zzdms) null, (String) null);
    }
}
