package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzla;
import com.google.android.gms.internal.measurement.zzlf;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class i7 {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    private long f10061a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    private long f10062b;

    /* renamed from: c  reason: collision with root package name */
    private final f f10063c = new h7(this, this.f10064d.f10171a);

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzjv f10064d;

    public i7(zzjv zzjv) {
        this.f10064d = zzjv;
        long b2 = zzjv.n().b();
        this.f10061a = b2;
        this.f10062b = b2;
    }

    /* access modifiers changed from: private */
    public final void h() {
        this.f10064d.c();
        d(false, false, this.f10064d.n().b());
        this.f10064d.p().w(this.f10064d.n().b());
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f10063c.e();
        this.f10061a = 0;
        this.f10062b = 0;
    }

    /* access modifiers changed from: package-private */
    public final void b(long j) {
        this.f10064d.c();
        this.f10063c.e();
        this.f10061a = j;
        this.f10062b = j;
    }

    public final boolean d(boolean z, boolean z2, long j) {
        this.f10064d.c();
        this.f10064d.y();
        if (!zzkt.b() || !this.f10064d.l().t(zzaq.A0)) {
            j = this.f10064d.n().b();
        }
        if (!zzla.b() || !this.f10064d.l().t(zzaq.w0) || this.f10064d.f10171a.p()) {
            this.f10064d.k().u.b(this.f10064d.n().a());
        }
        long j2 = j - this.f10061a;
        if (z || j2 >= 1000) {
            if (this.f10064d.l().t(zzaq.U) && !z2) {
                j2 = (!zzlf.b() || !this.f10064d.l().t(zzaq.W) || !zzkt.b() || !this.f10064d.l().t(zzaq.A0)) ? e() : g(j);
            }
            this.f10064d.h().O().b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            zzii.P(this.f10064d.t().E(!this.f10064d.l().L().booleanValue()), bundle, true);
            if (this.f10064d.l().t(zzaq.U) && !this.f10064d.l().t(zzaq.V) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.f10064d.l().t(zzaq.V) || !z2) {
                this.f10064d.q().R("auto", "_e", bundle);
            }
            this.f10061a = j;
            this.f10063c.e();
            this.f10063c.c(3600000);
            return true;
        }
        this.f10064d.h().O().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final long e() {
        long b2 = this.f10064d.n().b();
        long j = b2 - this.f10062b;
        this.f10062b = b2;
        return j;
    }

    /* access modifiers changed from: package-private */
    public final void f(long j) {
        this.f10063c.e();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final long g(long j) {
        long j2 = j - this.f10062b;
        this.f10062b = j;
        return j2;
    }
}
