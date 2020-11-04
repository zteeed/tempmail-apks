package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzckh implements zzdpa {

    /* renamed from: b  reason: collision with root package name */
    private Map<zzdor, zzckj> f7324b;

    /* renamed from: c  reason: collision with root package name */
    private zztm f7325c;

    zzckh(zztm zztm, Map<zzdor, zzckj> map) {
        this.f7324b = map;
        this.f7325c = zztm;
    }

    public final void a(zzdor zzdor, String str) {
    }

    public final void b(zzdor zzdor, String str) {
        if (this.f7324b.containsKey(zzdor)) {
            this.f7325c.a(this.f7324b.get(zzdor).f7328a);
        }
    }

    public final void c(zzdor zzdor, String str) {
        if (this.f7324b.containsKey(zzdor)) {
            this.f7325c.a(this.f7324b.get(zzdor).f7329b);
        }
    }

    public final void e(zzdor zzdor, String str, Throwable th) {
        if (this.f7324b.containsKey(zzdor)) {
            this.f7325c.a(this.f7324b.get(zzdor).f7330c);
        }
    }
}
