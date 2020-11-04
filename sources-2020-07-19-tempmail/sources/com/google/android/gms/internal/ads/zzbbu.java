package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzbbu<T> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbbn<T> f6145a = new zzbbn<>();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f6146b = new AtomicInteger(0);

    public zzbbu() {
        zzdux.f(this.f6145a, new u6(this), zzbbf.f6142f);
    }

    @Deprecated
    public final int a() {
        return this.f6146b.get();
    }

    @Deprecated
    public final void b() {
        this.f6145a.c(new Exception());
    }

    @Deprecated
    public final void d(zzbbr<T> zzbbr, zzbbp zzbbp) {
        zzdux.f(this.f6145a, new v6(this, zzbbr, zzbbp), zzbbf.f6142f);
    }

    @Deprecated
    public final void e(T t) {
        this.f6145a.a(t);
    }
}
