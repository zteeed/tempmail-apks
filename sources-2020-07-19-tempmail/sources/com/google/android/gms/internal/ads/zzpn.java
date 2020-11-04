package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpn implements zzpf {

    /* renamed from: a  reason: collision with root package name */
    private boolean f8991a;

    /* renamed from: b  reason: collision with root package name */
    private long f8992b;

    /* renamed from: c  reason: collision with root package name */
    private long f8993c;

    /* renamed from: d  reason: collision with root package name */
    private zzhw f8994d = zzhw.f8738d;

    public final void a() {
        if (!this.f8991a) {
            this.f8993c = SystemClock.elapsedRealtime();
            this.f8991a = true;
        }
    }

    public final void b() {
        if (this.f8991a) {
            d(t());
            this.f8991a = false;
        }
    }

    public final void c(zzpf zzpf) {
        d(zzpf.t());
        this.f8994d = zzpf.u();
    }

    public final void d(long j) {
        this.f8992b = j;
        if (this.f8991a) {
            this.f8993c = SystemClock.elapsedRealtime();
        }
    }

    public final zzhw k(zzhw zzhw) {
        if (this.f8991a) {
            d(t());
        }
        this.f8994d = zzhw;
        return zzhw;
    }

    public final long t() {
        long j;
        long j2 = this.f8992b;
        if (!this.f8991a) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f8993c;
        zzhw zzhw = this.f8994d;
        if (zzhw.f8739a == 1.0f) {
            j = zzhc.b(elapsedRealtime);
        } else {
            j = zzhw.a(elapsedRealtime);
        }
        return j2 + j;
    }

    public final zzhw u() {
        return this.f8994d;
    }
}
