package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzalw {

    /* renamed from: a  reason: collision with root package name */
    private zzakh f5964a;

    /* renamed from: b  reason: collision with root package name */
    private zzdvf<zzalf> f5965b;

    zzalw(zzakh zzakh) {
        this.f5964a = zzakh;
    }

    private final void d() {
        if (this.f5965b == null) {
            zzbbn zzbbn = new zzbbn();
            this.f5965b = zzbbn;
            this.f5964a.h((zzeg) null).d(new k2(zzbbn), new j2(zzbbn));
        }
    }

    public final <I, O> zzamd<I, O> a(String str, zzalk<I> zzalk, zzall<O> zzall) {
        d();
        return new zzamd<>(this.f5965b, str, zzalk, zzall);
    }

    public final void b(String str, zzahc<? super zzalf> zzahc) {
        d();
        this.f5965b = zzdux.j(this.f5965b, new m2(str, zzahc), zzbbf.f6325f);
    }

    public final void c(String str, zzahc<? super zzalf> zzahc) {
        this.f5965b = zzdux.i(this.f5965b, new l2(str, zzahc), zzbbf.f6325f);
    }
}
