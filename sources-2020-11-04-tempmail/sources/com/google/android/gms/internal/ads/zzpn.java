package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpn implements zzpf {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9174a;

    /* renamed from: b  reason: collision with root package name */
    private long f9175b;

    /* renamed from: c  reason: collision with root package name */
    private long f9176c;

    /* renamed from: d  reason: collision with root package name */
    private zzhw f9177d = zzhw.f8921d;

    public final void a() {
        if (!this.f9174a) {
            this.f9176c = SystemClock.elapsedRealtime();
            this.f9174a = true;
        }
    }

    public final void b() {
        if (this.f9174a) {
            d(t());
            this.f9174a = false;
        }
    }

    public final void c(zzpf zzpf) {
        d(zzpf.t());
        this.f9177d = zzpf.u();
    }

    public final void d(long j) {
        this.f9175b = j;
        if (this.f9174a) {
            this.f9176c = SystemClock.elapsedRealtime();
        }
    }

    public final zzhw k(zzhw zzhw) {
        if (this.f9174a) {
            d(t());
        }
        this.f9177d = zzhw;
        return zzhw;
    }

    public final long t() {
        long j;
        long j2 = this.f9175b;
        if (!this.f9174a) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f9176c;
        zzhw zzhw = this.f9177d;
        if (zzhw.f8922a == 1.0f) {
            j = zzhc.b(elapsedRealtime);
        } else {
            j = zzhw.a(elapsedRealtime);
        }
        return j2 + j;
    }

    public final zzhw u() {
        return this.f9177d;
    }
}
