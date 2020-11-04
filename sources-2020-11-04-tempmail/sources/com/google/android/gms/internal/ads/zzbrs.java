package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbrs implements zzela<zzbrq> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdou> f6778a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbbd> f6779b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<ApplicationInfo> f6780c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<String> f6781d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<List<String>> f6782e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<PackageInfo> f6783f;
    private final zzelj<zzdvf<String>> g;
    private final zzelj<zzaxx> h;
    private final zzelj<String> i;
    private final zzelj<zzdeb<Bundle>> j;

    private zzbrs(zzelj<zzdou> zzelj, zzelj<zzbbd> zzelj2, zzelj<ApplicationInfo> zzelj3, zzelj<String> zzelj4, zzelj<List<String>> zzelj5, zzelj<PackageInfo> zzelj6, zzelj<zzdvf<String>> zzelj7, zzelj<zzaxx> zzelj8, zzelj<String> zzelj9, zzelj<zzdeb<Bundle>> zzelj10) {
        this.f6778a = zzelj;
        this.f6779b = zzelj2;
        this.f6780c = zzelj3;
        this.f6781d = zzelj4;
        this.f6782e = zzelj5;
        this.f6783f = zzelj6;
        this.g = zzelj7;
        this.h = zzelj8;
        this.i = zzelj9;
        this.j = zzelj10;
    }

    public static zzbrs a(zzelj<zzdou> zzelj, zzelj<zzbbd> zzelj2, zzelj<ApplicationInfo> zzelj3, zzelj<String> zzelj4, zzelj<List<String>> zzelj5, zzelj<PackageInfo> zzelj6, zzelj<zzdvf<String>> zzelj7, zzelj<zzaxx> zzelj8, zzelj<String> zzelj9, zzelj<zzdeb<Bundle>> zzelj10) {
        return new zzbrs(zzelj, zzelj2, zzelj3, zzelj4, zzelj5, zzelj6, zzelj7, zzelj8, zzelj9, zzelj10);
    }

    public final /* synthetic */ Object get() {
        return new zzbrq(this.f6778a.get(), this.f6779b.get(), this.f6780c.get(), this.f6781d.get(), this.f6782e.get(), this.f6783f.get(), zzekx.b(this.g), this.h.get(), this.i.get(), this.j.get());
    }
}
