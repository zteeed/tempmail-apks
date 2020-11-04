package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcfu {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f7169a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbmh f7170b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbyj f7171c;

    zzcfu(Executor executor, zzbmh zzbmh, zzbyj zzbyj) {
        this.f7169a = executor;
        this.f7171c = zzbyj;
        this.f7170b = zzbmh;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(zzbfn zzbfn, Map map) {
        this.f7170b.f();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(zzbfn zzbfn, Map map) {
        this.f7170b.k();
    }

    public final void c(zzbfn zzbfn) {
        if (zzbfn != null) {
            this.f7171c.C0(zzbfn.getView());
            this.f7171c.p0(new qi(zzbfn), this.f7169a);
            this.f7171c.p0(new pi(zzbfn), this.f7169a);
            this.f7171c.p0(this.f7170b, this.f7169a);
            this.f7170b.u(zzbfn);
            zzbfn.c("/trackActiveViewUnit", new si(this));
            zzbfn.c("/untrackActiveViewUnit", new ri(this));
        }
    }
}
