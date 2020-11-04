package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbpz<T> {

    /* renamed from: a  reason: collision with root package name */
    private final zzcni f6515a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcns f6516b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdla f6517c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdou f6518d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbla f6519e;

    /* renamed from: f  reason: collision with root package name */
    private final zzctz<T> f6520f;
    /* access modifiers changed from: private */
    public final zzbwo g;
    private final zzdkw h;
    private final zzcoo i;
    private final zzbrq j;
    private final Executor k;
    private final zzcol l;

    zzbpz(zzcni zzcni, zzcns zzcns, zzdla zzdla, zzdou zzdou, zzbla zzbla, zzctz<T> zzctz, zzbwo zzbwo, zzdkw zzdkw, zzcoo zzcoo, zzbrq zzbrq, Executor executor, zzcol zzcol) {
        this.f6515a = zzcni;
        this.f6516b = zzcns;
        this.f6517c = zzdla;
        this.f6518d = zzdou;
        this.f6519e = zzbla;
        this.f6520f = zzctz;
        this.g = zzbwo;
        this.h = zzdkw;
        this.i = zzcoo;
        this.j = zzbrq;
        this.k = executor;
        this.l = zzcol;
    }

    private final zzdvf<zzdkw> e(zzdvf<zzasm> zzdvf) {
        if (this.h != null) {
            return this.f6518d.g(zzdor.SERVER_TRANSACTION).d(zzdux.g(this.h)).f();
        }
        zzq.zzlc().l();
        if (this.f6517c.f8166d.t != null) {
            return this.f6518d.g(zzdor.SERVER_TRANSACTION).d(this.f6516b.a()).f();
        }
        if (!((Boolean) zzwg.e().c(zzaav.a4)).booleanValue()) {
            return this.f6518d.b(zzdor.SERVER_TRANSACTION, zzdvf).b(this.f6515a).f();
        }
        zzdom<I> b2 = this.f6518d.b(zzdor.SERVER_TRANSACTION, zzdvf);
        zzcol zzcol = this.l;
        zzcol.getClass();
        return b2.b(wc.b(zzcol)).f();
    }

    public final zzdvf<zzdkw> b(zzasm zzasm) {
        return e(zzdux.g(zzasm));
    }

    public final zzdvf<zzasm> c(zzdms zzdms) {
        zzdod<E, O2> f2 = this.f6518d.b(zzdor.GET_CACHE_KEY, this.j.b()).b(new yc(this, zzdms)).f();
        zzdux.f(f2, new xc(this), this.k);
        return f2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf d(zzdms zzdms, zzasm zzasm) throws Exception {
        zzasm.k = zzdms;
        return this.i.c(zzasm);
    }

    public final zzdvf<zzdkw> f() {
        return e(this.j.b());
    }

    public final zzdvf<T> g() {
        return j(f());
    }

    public final zzbwo h() {
        return this.g;
    }

    public final zzdvf<T> i(zzasm zzasm) {
        return j(b(zzasm));
    }

    public final zzdvf<T> j(zzdvf<zzdkw> zzdvf) {
        if (((Boolean) zzwg.e().c(zzaav.x2)).booleanValue()) {
            return this.f6518d.b(zzdor.RENDERER, zzdvf).b(this.f6519e).b(this.f6520f).f();
        }
        return this.f6518d.b(zzdor.RENDERER, zzdvf).b(this.f6519e).b(this.f6520f).a((long) ((Integer) zzwg.e().c(zzaav.y2)).intValue(), TimeUnit.SECONDS).f();
    }

    public final zzdvf<Void> k(zzasm zzasm) {
        zzdod<E, I> f2 = this.f6518d.b(zzdor.NOTIFY_CACHE_HIT, this.i.d(zzasm)).f();
        zzdux.f(f2, new zc(this), this.k);
        return f2;
    }
}
