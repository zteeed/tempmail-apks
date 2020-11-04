package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzbzk {

    /* renamed from: a  reason: collision with root package name */
    private final zzcam f6715a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbfn f6716b;

    public zzbzk(zzcam zzcam) {
        this(zzcam, (zzbfn) null);
    }

    public Set<zzbyg<zzbsl>> a(zzcaq zzcaq) {
        return Collections.singleton(zzbyg.a(zzcaq, zzbbf.f6142f));
    }

    public final zzbfn b() {
        return this.f6716b;
    }

    public final zzcam c() {
        return this.f6715a;
    }

    public final View d() {
        zzbfn zzbfn = this.f6716b;
        if (zzbfn != null) {
            return zzbfn.getWebView();
        }
        return null;
    }

    public final View e() {
        zzbfn zzbfn = this.f6716b;
        if (zzbfn == null) {
            return null;
        }
        return zzbfn.getWebView();
    }

    public final zzbyg<zzbwd> f(Executor executor) {
        return new zzbyg<>(new lg(this.f6716b), executor);
    }

    public zzbzk(zzcam zzcam, zzbfn zzbfn) {
        this.f6715a = zzcam;
        this.f6716b = zzbfn;
    }
}
