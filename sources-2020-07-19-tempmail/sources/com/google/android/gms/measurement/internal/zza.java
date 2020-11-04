package com.google.android.gms.measurement.internal;

import a.e.a;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zza extends t1 {

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Long> f10358b = new a();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Integer> f10359c = new a();

    /* renamed from: d  reason: collision with root package name */
    private long f10360d;

    public zza(zzfy zzfy) {
        super(zzfy);
    }

    private final void B(String str, long j, zzij zzij) {
        if (zzij == null) {
            h().O().a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            h().O().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            zzii.P(zzij, bundle, true);
            q().R("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void C(long j) {
        for (String put : this.f10358b.keySet()) {
            this.f10358b.put(put, Long.valueOf(j));
        }
        if (!this.f10358b.isEmpty()) {
            this.f10360d = j;
        }
    }

    /* access modifiers changed from: private */
    public final void F(String str, long j) {
        a();
        c();
        Preconditions.g(str);
        if (this.f10359c.isEmpty()) {
            this.f10360d = j;
        }
        Integer num = this.f10359c.get(str);
        if (num != null) {
            this.f10359c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f10359c.size() >= 100) {
            h().J().a("Too many ads visible");
        } else {
            this.f10359c.put(str, 1);
            this.f10358b.put(str, Long.valueOf(j));
        }
    }

    /* access modifiers changed from: private */
    public final void G(String str, long j) {
        a();
        c();
        Preconditions.g(str);
        Integer num = this.f10359c.get(str);
        if (num != null) {
            zzij E = t().E(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f10359c.remove(str);
                Long l = this.f10358b.get(str);
                if (l == null) {
                    h().G().a("First ad unit exposure time was never set");
                } else {
                    this.f10358b.remove(str);
                    B(str, j - l.longValue(), E);
                }
                if (this.f10359c.isEmpty()) {
                    long j2 = this.f10360d;
                    if (j2 == 0) {
                        h().G().a("First ad exposure time was never set");
                        return;
                    }
                    x(j - j2, E);
                    this.f10360d = 0;
                    return;
                }
                return;
            }
            this.f10359c.put(str, Integer.valueOf(intValue));
            return;
        }
        h().G().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void x(long j, zzij zzij) {
        if (zzij == null) {
            h().O().a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            h().O().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            zzii.P(zzij, bundle, true);
            q().R("am", "_xa", bundle);
        }
    }

    public final void A(String str, long j) {
        if (str == null || str.length() == 0) {
            h().G().a("Ad unit id must be a non-empty string");
        } else {
            g().z(new s0(this, str, j));
        }
    }

    public final void E(String str, long j) {
        if (str == null || str.length() == 0) {
            h().G().a("Ad unit id must be a non-empty string");
        } else {
            g().z(new r(this, str, j));
        }
    }

    public final void w(long j) {
        zzij E = t().E(false);
        for (String next : this.f10358b.keySet()) {
            B(next, j - this.f10358b.get(next).longValue(), E);
        }
        if (!this.f10358b.isEmpty()) {
            x(j - this.f10360d, E);
        }
        C(j);
    }
}
