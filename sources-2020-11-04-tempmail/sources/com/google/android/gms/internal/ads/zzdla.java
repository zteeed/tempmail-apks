package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdla {

    /* renamed from: a  reason: collision with root package name */
    public final zzxk f8346a;

    /* renamed from: b  reason: collision with root package name */
    public final zzaaa f8347b;

    /* renamed from: c  reason: collision with root package name */
    public final zzaio f8348c;

    /* renamed from: d  reason: collision with root package name */
    public final zzve f8349d;

    /* renamed from: e  reason: collision with root package name */
    public final zzvh f8350e;

    /* renamed from: f  reason: collision with root package name */
    public final String f8351f;
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
        this.f8350e = zzdlc.f8353b;
        this.f8351f = zzdlc.f8355d;
        this.f8346a = zzdlc.f8354c;
        this.f8349d = new zzve(zzdlc.f8352a.f9366b, zzdlc.f8352a.f9367c, zzdlc.f8352a.f9368d, zzdlc.f8352a.f9369e, zzdlc.f8352a.f9370f, zzdlc.f8352a.g, zzdlc.f8352a.h, zzdlc.f8352a.i || zzdlc.f8357f, zzdlc.f8352a.j, zzdlc.f8352a.k, zzdlc.f8352a.l, zzdlc.f8352a.m, zzdlc.f8352a.n, zzdlc.f8352a.o, zzdlc.f8352a.p, zzdlc.f8352a.q, zzdlc.f8352a.r, zzdlc.f8352a.s, zzdlc.f8352a.t, zzdlc.f8352a.u, zzdlc.f8352a.v, zzdlc.f8352a.w);
        if (zzdlc.f8356e != null) {
            zzaaa = zzdlc.f8356e;
        } else {
            zzaaa = zzdlc.i != null ? zzdlc.i.g : null;
        }
        this.f8347b = zzaaa;
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
        this.f8348c = zzdlc.n;
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
