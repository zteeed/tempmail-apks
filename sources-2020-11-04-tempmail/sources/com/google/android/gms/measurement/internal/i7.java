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
    private long f10247a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    private long f10248b;

    /* renamed from: c  reason: collision with root package name */
    private final f f10249c = new h7(this, this.f10250d.f10357a);

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzjv f10250d;

    public i7(zzjv zzjv) {
        this.f10250d = zzjv;
        long b2 = zzjv.n().b();
        this.f10247a = b2;
        this.f10248b = b2;
    }

    /* access modifiers changed from: private */
    public final void h() {
        this.f10250d.c();
        d(false, false, this.f10250d.n().b());
        this.f10250d.p().w(this.f10250d.n().b());
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f10249c.e();
        this.f10247a = 0;
        this.f10248b = 0;
    }

    /* access modifiers changed from: package-private */
    public final void b(long j) {
        this.f10250d.c();
        this.f10249c.e();
        this.f10247a = j;
        this.f10248b = j;
    }

    public final boolean d(boolean z, boolean z2, long j) {
        this.f10250d.c();
        this.f10250d.y();
        if (!zzkt.b() || !this.f10250d.l().t(zzaq.A0)) {
            j = this.f10250d.n().b();
        }
        if (!zzla.b() || !this.f10250d.l().t(zzaq.w0) || this.f10250d.f10357a.p()) {
            this.f10250d.k().u.b(this.f10250d.n().a());
        }
        long j2 = j - this.f10247a;
        if (z || j2 >= 1000) {
            if (this.f10250d.l().t(zzaq.U) && !z2) {
                j2 = (!zzlf.b() || !this.f10250d.l().t(zzaq.W) || !zzkt.b() || !this.f10250d.l().t(zzaq.A0)) ? e() : g(j);
            }
            this.f10250d.h().O().b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            zzii.P(this.f10250d.t().E(!this.f10250d.l().L().booleanValue()), bundle, true);
            if (this.f10250d.l().t(zzaq.U) && !this.f10250d.l().t(zzaq.V) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.f10250d.l().t(zzaq.V) || !z2) {
                this.f10250d.q().R("auto", "_e", bundle);
            }
            this.f10247a = j;
            this.f10249c.e();
            this.f10249c.c(3600000);
            return true;
        }
        this.f10250d.h().O().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final long e() {
        long b2 = this.f10250d.n().b();
        long j = b2 - this.f10248b;
        this.f10248b = b2;
        return j;
    }

    /* access modifiers changed from: package-private */
    public final void f(long j) {
        this.f10249c.e();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final long g(long j) {
        long j2 = j - this.f10248b;
        this.f10248b = j;
        return j2;
    }
}
