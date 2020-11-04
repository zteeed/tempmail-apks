package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzalw {

    /* renamed from: a  reason: collision with root package name */
    private zzakh f5781a;

    /* renamed from: b  reason: collision with root package name */
    private zzdvf<zzalf> f5782b;

    zzalw(zzakh zzakh) {
        this.f5781a = zzakh;
    }

    private final void d() {
        if (this.f5782b == null) {
            zzbbn zzbbn = new zzbbn();
            this.f5782b = zzbbn;
            this.f5781a.h((zzeg) null).d(new k2(zzbbn), new j2(zzbbn));
        }
    }

    public final <I, O> zzamd<I, O> a(String str, zzalk<I> zzalk, zzall<O> zzall) {
        d();
        return new zzamd<>(this.f5782b, str, zzalk, zzall);
    }

    public final void b(String str, zzahc<? super zzalf> zzahc) {
        d();
        this.f5782b = zzdux.j(this.f5782b, new m2(str, zzahc), zzbbf.f6142f);
    }

    public final void c(String str, zzahc<? super zzalf> zzahc) {
        this.f5782b = zzdux.i(this.f5782b, new l2(str, zzahc), zzbbf.f6142f);
    }
}
