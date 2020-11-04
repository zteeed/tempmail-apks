package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzcf;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ba0 implements zzdrl {

    /* renamed from: a  reason: collision with root package name */
    private final zzdpn f3439a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdpz f3440b;

    /* renamed from: c  reason: collision with root package name */
    private final zzfi f3441c;

    /* renamed from: d  reason: collision with root package name */
    private final zzev f3442d;

    ba0(zzdpn zzdpn, zzdpz zzdpz, zzfi zzfi, zzev zzev) {
        this.f3439a = zzdpn;
        this.f3440b = zzdpz;
        this.f3441c = zzfi;
        this.f3442d = zzev;
    }

    private final Map<String, Object> e() {
        HashMap hashMap = new HashMap();
        zzcf.zza g = this.f3440b.g();
        hashMap.put("v", this.f3439a.a());
        hashMap.put("gms", Boolean.valueOf(this.f3439a.d()));
        hashMap.put("int", g.c0());
        hashMap.put("up", Boolean.valueOf(this.f3442d.a()));
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    public final Map<String, Object> a() {
        Map<String, Object> e2 = e();
        zzcf.zza c2 = this.f3440b.c();
        e2.put("gai", Boolean.valueOf(this.f3439a.b()));
        e2.put("did", c2.m0());
        e2.put("dst", Integer.valueOf(c2.o0().i()));
        e2.put("doo", Boolean.valueOf(c2.r0()));
        return e2;
    }

    public final Map<String, Object> b() {
        return e();
    }

    public final Map<String, Object> c() {
        Map<String, Object> e2 = e();
        e2.put("lts", Long.valueOf(this.f3441c.e()));
        return e2;
    }

    /* access modifiers changed from: package-private */
    public final void d(View view) {
        this.f3441c.g(view);
    }
}
