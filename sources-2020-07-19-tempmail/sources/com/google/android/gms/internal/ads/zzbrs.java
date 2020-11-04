package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbrs implements zzela<zzbrq> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdou> f6595a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbbd> f6596b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<ApplicationInfo> f6597c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<String> f6598d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<List<String>> f6599e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<PackageInfo> f6600f;
    private final zzelj<zzdvf<String>> g;
    private final zzelj<zzaxx> h;
    private final zzelj<String> i;
    private final zzelj<zzdeb<Bundle>> j;

    private zzbrs(zzelj<zzdou> zzelj, zzelj<zzbbd> zzelj2, zzelj<ApplicationInfo> zzelj3, zzelj<String> zzelj4, zzelj<List<String>> zzelj5, zzelj<PackageInfo> zzelj6, zzelj<zzdvf<String>> zzelj7, zzelj<zzaxx> zzelj8, zzelj<String> zzelj9, zzelj<zzdeb<Bundle>> zzelj10) {
        this.f6595a = zzelj;
        this.f6596b = zzelj2;
        this.f6597c = zzelj3;
        this.f6598d = zzelj4;
        this.f6599e = zzelj5;
        this.f6600f = zzelj6;
        this.g = zzelj7;
        this.h = zzelj8;
        this.i = zzelj9;
        this.j = zzelj10;
    }

    public static zzbrs a(zzelj<zzdou> zzelj, zzelj<zzbbd> zzelj2, zzelj<ApplicationInfo> zzelj3, zzelj<String> zzelj4, zzelj<List<String>> zzelj5, zzelj<PackageInfo> zzelj6, zzelj<zzdvf<String>> zzelj7, zzelj<zzaxx> zzelj8, zzelj<String> zzelj9, zzelj<zzdeb<Bundle>> zzelj10) {
        return new zzbrs(zzelj, zzelj2, zzelj3, zzelj4, zzelj5, zzelj6, zzelj7, zzelj8, zzelj9, zzelj10);
    }

    public final /* synthetic */ Object get() {
        return new zzbrq(this.f6595a.get(), this.f6596b.get(), this.f6597c.get(), this.f6598d.get(), this.f6599e.get(), this.f6600f.get(), zzekx.b(this.g), this.h.get(), this.i.get(), this.j.get());
    }
}
