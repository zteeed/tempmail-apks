package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzfn {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    private final String f10434a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10435b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10436c;

    /* renamed from: d  reason: collision with root package name */
    private final long f10437d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ q3 f10438e;

    private zzfn(q3 q3Var, String str, long j) {
        this.f10438e = q3Var;
        Preconditions.g(str);
        Preconditions.a(j > 0);
        this.f10434a = String.valueOf(str).concat(":start");
        this.f10435b = String.valueOf(str).concat(":count");
        this.f10436c = String.valueOf(str).concat(":value");
        this.f10437d = j;
    }

    private final void c() {
        this.f10438e.c();
        long a2 = this.f10438e.n().a();
        SharedPreferences.Editor edit = this.f10438e.C().edit();
        edit.remove(this.f10435b);
        edit.remove(this.f10436c);
        edit.putLong(this.f10434a, a2);
        edit.apply();
    }

    private final long d() {
        return this.f10438e.C().getLong(this.f10434a, 0);
    }

    public final Pair<String, Long> a() {
        long j;
        this.f10438e.c();
        this.f10438e.c();
        long d2 = d();
        if (d2 == 0) {
            c();
            j = 0;
        } else {
            j = Math.abs(d2 - this.f10438e.n().a());
        }
        long j2 = this.f10437d;
        if (j < j2) {
            return null;
        }
        if (j > (j2 << 1)) {
            c();
            return null;
        }
        String string = this.f10438e.C().getString(this.f10436c, (String) null);
        long j3 = this.f10438e.C().getLong(this.f10435b, 0);
        c();
        if (string == null || j3 <= 0) {
            return q3.D;
        }
        return new Pair<>(string, Long.valueOf(j3));
    }

    public final void b(String str, long j) {
        this.f10438e.c();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f10438e.C().getLong(this.f10435b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f10438e.C().edit();
            edit.putString(this.f10436c, str);
            edit.putLong(this.f10435b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.f10438e.j().H0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.f10438e.C().edit();
        if (z) {
            edit2.putString(this.f10436c, str);
        }
        edit2.putLong(this.f10435b, j3);
        edit2.apply();
    }
}
