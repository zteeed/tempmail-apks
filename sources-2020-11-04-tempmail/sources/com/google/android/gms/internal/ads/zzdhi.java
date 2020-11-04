package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdhi implements zzbsq, zzbuf, zzdim {

    /* renamed from: b  reason: collision with root package name */
    private final zzdmi f8237b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<zzsg> f8238c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<zzsl> f8239d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicReference<zzbuf> f8240e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private zzdhi f8241f = null;

    public zzdhi(zzdmi zzdmi) {
        this.f8237b = zzdmi;
    }

    public static zzdhi d(zzdhi zzdhi) {
        zzdhi zzdhi2 = new zzdhi(zzdhi.f8237b);
        zzdhi2.b(zzdhi);
        return zzdhi2;
    }

    public final void a() {
        zzdhi zzdhi = this;
        while (true) {
            zzdhi zzdhi2 = zzdhi.f8241f;
            if (zzdhi2 != null) {
                zzdhi = zzdhi2;
            } else {
                zzdhi.f8237b.a();
                zzdib.a(zzdhi.f8239d, qu.f4938a);
                return;
            }
        }
    }

    public final void a1() {
        zzdhi zzdhi = this;
        while (true) {
            zzdhi zzdhi2 = zzdhi.f8241f;
            if (zzdhi2 != null) {
                zzdhi = zzdhi2;
            } else {
                zzdib.a(zzdhi.f8240e, su.f5114a);
                return;
            }
        }
    }

    public final void b(zzdim zzdim) {
        this.f8241f = (zzdhi) zzdim;
    }

    public final void c(zzbuf zzbuf) {
        this.f8240e.set(zzbuf);
    }

    public final void e(zzsf zzsf) {
        zzdhi zzdhi = this;
        while (true) {
            zzdhi zzdhi2 = zzdhi.f8241f;
            if (zzdhi2 != null) {
                zzdhi = zzdhi2;
            } else {
                zzdib.a(zzdhi.f8238c, new pu(zzsf));
                return;
            }
        }
    }

    public final void f(zzsg zzsg) {
        this.f8238c.set(zzsg);
    }

    public final void g(zzsl zzsl) {
        this.f8239d.set(zzsl);
    }

    public final void onAdFailedToLoad(int i) {
        zzdhi zzdhi = this;
        while (true) {
            zzdhi zzdhi2 = zzdhi.f8241f;
            if (zzdhi2 != null) {
                zzdhi = zzdhi2;
            } else {
                zzdib.a(zzdhi.f8238c, new ru(i));
                return;
            }
        }
    }
}
