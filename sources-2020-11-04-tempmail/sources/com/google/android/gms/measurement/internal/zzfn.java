package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzfn {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    private final String f10620a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10621b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10622c;

    /* renamed from: d  reason: collision with root package name */
    private final long f10623d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ q3 f10624e;

    private zzfn(q3 q3Var, String str, long j) {
        this.f10624e = q3Var;
        Preconditions.g(str);
        Preconditions.a(j > 0);
        this.f10620a = String.valueOf(str).concat(":start");
        this.f10621b = String.valueOf(str).concat(":count");
        this.f10622c = String.valueOf(str).concat(":value");
        this.f10623d = j;
    }

    private final void c() {
        this.f10624e.c();
        long a2 = this.f10624e.n().a();
        SharedPreferences.Editor edit = this.f10624e.C().edit();
        edit.remove(this.f10621b);
        edit.remove(this.f10622c);
        edit.putLong(this.f10620a, a2);
        edit.apply();
    }

    private final long d() {
        return this.f10624e.C().getLong(this.f10620a, 0);
    }

    public final Pair<String, Long> a() {
        long j;
        this.f10624e.c();
        this.f10624e.c();
        long d2 = d();
        if (d2 == 0) {
            c();
            j = 0;
        } else {
            j = Math.abs(d2 - this.f10624e.n().a());
        }
        long j2 = this.f10623d;
        if (j < j2) {
            return null;
        }
        if (j > (j2 << 1)) {
            c();
            return null;
        }
        String string = this.f10624e.C().getString(this.f10622c, (String) null);
        long j3 = this.f10624e.C().getLong(this.f10621b, 0);
        c();
        if (string == null || j3 <= 0) {
            return q3.D;
        }
        return new Pair<>(string, Long.valueOf(j3));
    }

    public final void b(String str, long j) {
        this.f10624e.c();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f10624e.C().getLong(this.f10621b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f10624e.C().edit();
            edit.putString(this.f10622c, str);
            edit.putLong(this.f10621b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.f10624e.j().H0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.f10624e.C().edit();
        if (z) {
            edit2.putString(this.f10622c, str);
        }
        edit2.putLong(this.f10621b, j3);
        edit2.apply();
    }
}
