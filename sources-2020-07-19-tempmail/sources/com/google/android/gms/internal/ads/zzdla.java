package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdla {

    /* renamed from: a  reason: collision with root package name */
    public final zzxk f8163a;

    /* renamed from: b  reason: collision with root package name */
    public final zzaaa f8164b;

    /* renamed from: c  reason: collision with root package name */
    public final zzaio f8165c;

    /* renamed from: d  reason: collision with root package name */
    public final zzve f8166d;

    /* renamed from: e  reason: collision with root package name */
    public final zzvh f8167e;

    /* renamed from: f  reason: collision with root package name */
    public final String f8168f;
    public final ArrayList<String> g;
    public final ArrayList<String> h;
    public final zzadj i;
    public final zzvo j;
    public final int k;
    public final PublisherAdViewOptions l;
    public final zzxe m;
    public final zzdkn n;
    public final boolean o;

    private zzdla(zzdlc zzdlc) {
        zzaaa zzaaa;
        zzadj zzadj;
        this.f8167e = zzdlc.f8170b;
        this.f8168f = zzdlc.f8172d;
        this.f8163a = zzdlc.f8171c;
        this.f8166d = new zzve(zzdlc.f8169a.f9183b, zzdlc.f8169a.f9184c, zzdlc.f8169a.f9185d, zzdlc.f8169a.f9186e, zzdlc.f8169a.f9187f, zzdlc.f8169a.g, zzdlc.f8169a.h, zzdlc.f8169a.i || zzdlc.f8174f, zzdlc.f8169a.j, zzdlc.f8169a.k, zzdlc.f8169a.l, zzdlc.f8169a.m, zzdlc.f8169a.n, zzdlc.f8169a.o, zzdlc.f8169a.p, zzdlc.f8169a.q, zzdlc.f8169a.r, zzdlc.f8169a.s, zzdlc.f8169a.t, zzdlc.f8169a.u, zzdlc.f8169a.v, zzdlc.f8169a.w);
        if (zzdlc.f8173e != null) {
            zzaaa = zzdlc.f8173e;
        } else {
            zzaaa = zzdlc.i != null ? zzdlc.i.g : null;
        }
        this.f8164b = zzaaa;
        this.g = zzdlc.g;
        this.h = zzdlc.h;
        if (zzdlc.g == null) {
            zzadj = null;
        } else if (zzdlc.i == null) {
            zzadj = new zzadj(new NativeAdOptions.Builder().build());
        } else {
            zzadj = zzdlc.i;
        }
        this.i = zzadj;
        this.j = zzdlc.j;
        this.k = zzdlc.m;
        this.l = zzdlc.k;
        this.m = zzdlc.l;
        this.f8165c = zzdlc.n;
        this.n = new zzdkn(zzdlc.o);
        this.o = zzdlc.p;
    }

    public final zzafn a() {
        PublisherAdViewOptions publisherAdViewOptions = this.l;
        if (publisherAdViewOptions == null) {
            return null;
        }
        return publisherAdViewOptions.zzjv();
    }
}
