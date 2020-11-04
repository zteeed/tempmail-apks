package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ua extends zzdeu {

    /* renamed from: a  reason: collision with root package name */
    private final zzdgd f5235a;

    /* renamed from: b  reason: collision with root package name */
    private zzelj<zzdeq> f5236b;

    /* renamed from: c  reason: collision with root package name */
    private zzelj<String> f5237c;

    /* renamed from: d  reason: collision with root package name */
    private zzelj<zzdfa> f5238d;

    /* renamed from: e  reason: collision with root package name */
    private zzelj<Integer> f5239e;

    /* renamed from: f  reason: collision with root package name */
    private zzelj<zzdfe> f5240f;
    private zzelj<zzdfk> g;
    private zzelj<zzdfp> h;
    private zzelj<Boolean> i;
    private zzelj<ApplicationInfo> j;
    private zzelj<zzdfy> k;
    private zzelj<zzdgc> l;
    private zzelj<zzdgq> m;
    private zzelj<String> n;
    private zzelj<zzckj> o;
    private zzelj<zzckj> p;
    private zzelj<zzckj> q;
    private zzelj<zzckj> r;
    private zzelj<Map<zzdor, zzckj>> s;
    private zzelj<Set<zzbyg<zzdpa>>> t;
    private zzelj<Set<zzbyg<zzdpa>>> u;
    private zzelj v;
    private zzelj<zzdou> w;
    private final /* synthetic */ zzbiz x;

    private ua(zzbiz zzbiz, zzdgd zzdgd) {
        this.x = zzbiz;
        this.f5235a = zzdgd;
        this.f5236b = new zzder(vb.f5316a, this.x.k, this.x.f6467f, zzdnu.a());
        this.f5237c = new zzdgg(zzdgd);
        this.f5238d = new zzdfc(ma.f4552a, this.x.k, this.f5237c, zzdnu.a());
        this.f5239e = new zzdgh(zzdgd);
        this.f5240f = new zzdfi(vb.f5316a, this.f5239e, this.x.k, this.x.E, this.x.f6467f, zzdnu.a());
        this.g = new zzdfm(sb.f5075a, zzdnu.a(), this.x.k);
        this.h = new zzdfr(tb.f5154a, zzdnu.a(), this.f5237c);
        this.i = new zzdgi(zzdgd);
        this.j = new zzdgf(zzdgd);
        this.k = new zzdga(this.x.G, this.x.f6467f, this.i, this.j);
        this.l = new zzdge(ub.f5241a, this.x.f6467f, this.x.k);
        this.m = new zzdgs(zzdnu.a());
        this.n = new zzdgk(zzdgd);
        this.o = zzekx.a(zzcjy.a());
        this.p = zzekx.a(zzcjw.a());
        this.q = zzekx.a(zzcka.a());
        this.r = zzekx.a(zzckc.a());
        zzele b2 = zzelc.b(4);
        b2.a(zzdor.GMS_SIGNALS, this.o);
        zzele zzele = b2;
        zzele.a(zzdor.BUILD_URL, this.p);
        zzele zzele2 = zzele;
        zzele2.a(zzdor.HTTP, this.q);
        zzele zzele3 = zzele2;
        zzele3.a(zzdor.PRE_PROCESS, this.r);
        this.s = zzele3.b();
        this.t = zzekx.a(new zzcke(this.n, this.x.k, zzdnu.a(), this.s));
        zzelh a2 = zzelf.a(0, 1);
        a2.b(this.t);
        zzelf c2 = a2.c();
        this.u = c2;
        this.v = zzdpc.a(c2);
        this.w = zzekx.a(zzdoz.a(zzdnu.a(), this.x.f6467f, this.v));
    }

    private final zzdft d() {
        zzaae zzaae = new zzaae();
        zzelg.b(zzaae, "Cannot return null from a non-@Nullable @Provides method");
        zzdvi b2 = zzdnu.b();
        List<String> e2 = this.f5235a.e();
        zzelg.b(e2, "Cannot return null from a non-@Nullable @Provides method");
        return new zzdft(zzaae, b2, e2);
    }

    private final zzdew e() {
        zzaxd a2 = zzbkw.a();
        zzdvi b2 = zzdnu.b();
        String b3 = this.f5235a.b();
        zzelg.b(b3, "Cannot return null from a non-@Nullable @Provides method");
        return new zzdew(a2, b2, b3, this.f5235a.c());
    }

    public final zzdeb<JSONObject> a() {
        zzdvi b2 = zzdnu.b();
        zzdcn zzdcn = new zzdcn(new zzdfp(zzbks.a(), zzdnu.b(), zzdgg.a(this.f5235a)), 0, (ScheduledExecutorService) this.x.f6467f.get());
        zzelg.b(zzdcn, "Cannot return null from a non-@Nullable @Provides method");
        zzdcn zzdcn2 = new zzdcn(new zzdfy(zzbkf.a(this.x.f6463b), (ScheduledExecutorService) this.x.f6467f.get(), this.f5235a.d(), zzdgf.a(this.f5235a)), ((Long) zzwg.e().c(zzaav.E1)).longValue(), (ScheduledExecutorService) this.x.f6467f.get());
        zzelg.b(zzdcn2, "Cannot return null from a non-@Nullable @Provides method");
        zzdcn zzdcn3 = new zzdcn(new zzdgc(zzbku.a(), (ScheduledExecutorService) this.x.f6467f.get(), zzbih.a(this.x.f6464c)), ((Long) zzwg.e().c(zzaav.J1)).longValue(), (ScheduledExecutorService) this.x.f6467f.get());
        zzelg.b(zzdcn3, "Cannot return null from a non-@Nullable @Provides method");
        zzdcn zzdcn4 = new zzdcn(new zzdeq(zzbkw.a(), zzbih.a(this.x.f6464c), (ScheduledExecutorService) this.x.f6467f.get(), zzdnu.b()), 0, (ScheduledExecutorService) this.x.f6467f.get());
        zzelg.b(zzdcn4, "Cannot return null from a non-@Nullable @Provides method");
        zzdcn zzdcn5 = new zzdcn(new zzdgq(zzdnu.b()), 0, (ScheduledExecutorService) this.x.f6467f.get());
        zzelg.b(zzdcn5, "Cannot return null from a non-@Nullable @Provides method");
        zzdec<? extends zzddz<JSONObject>> a2 = zzdgj.a();
        zzelg.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return zzdeg.a(b2, zzdsz.u(zzdcn, zzdcn2, zzdcn3, zzdcn4, zzdcn5, a2, new zzdfa((zzasp) null, zzbih.a(this.x.f6464c), zzdgg.a(this.f5235a), zzdnu.b()), new zzdfk(zzbkq.a(), zzdnu.b(), zzbih.a(this.x.f6464c)), d(), e(), new zzdfe(zzbkw.a(), this.f5235a.h(), zzbih.a(this.x.f6464c), (zzaxh) this.x.E.get(), (ScheduledExecutorService) this.x.f6467f.get(), zzdnu.b()), (zzdec) this.x.F.get()));
    }

    public final zzdeb<JSONObject> b() {
        return zzdgo.a(zzbks.a(), this.x.F.get(), e(), d(), zzekx.b(this.f5236b), zzekx.b(this.f5238d), zzekx.b(this.f5240f), zzekx.b(this.g), zzekx.b(this.h), zzekx.b(this.k), zzekx.b(this.l), zzekx.b(this.m), zzdnu.b(), (ScheduledExecutorService) this.x.f6467f.get());
    }

    public final zzdou c() {
        return this.w.get();
    }
}
