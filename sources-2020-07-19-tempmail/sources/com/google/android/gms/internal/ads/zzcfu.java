package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcfu {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f6986a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbmh f6987b;

    /* renamed from: c  reason: collision with root package name */
    private final zzbyj f6988c;

    zzcfu(Executor executor, zzbmh zzbmh, zzbyj zzbyj) {
        this.f6986a = executor;
        this.f6988c = zzbyj;
        this.f6987b = zzbmh;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(zzbfn zzbfn, Map map) {
        this.f6987b.f();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(zzbfn zzbfn, Map map) {
        this.f6987b.k();
    }

    public final void c(zzbfn zzbfn) {
        if (zzbfn != null) {
            this.f6988c.C0(zzbfn.getView());
            this.f6988c.p0(new qi(zzbfn), this.f6986a);
            this.f6988c.p0(new pi(zzbfn), this.f6986a);
            this.f6988c.p0(this.f6987b, this.f6986a);
            this.f6987b.u(zzbfn);
            zzbfn.c("/trackActiveViewUnit", new si(this));
            zzbfn.c("/untrackActiveViewUnit", new ri(this));
        }
    }
}
