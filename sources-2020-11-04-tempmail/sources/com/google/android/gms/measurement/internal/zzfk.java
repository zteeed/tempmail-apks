package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzfk {

    /* renamed from: a  reason: collision with root package name */
    private final String f10606a;

    /* renamed from: b  reason: collision with root package name */
    private final long f10607b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10608c;

    /* renamed from: d  reason: collision with root package name */
    private long f10609d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ q3 f10610e;

    public zzfk(q3 q3Var, String str, long j) {
        this.f10610e = q3Var;
        Preconditions.g(str);
        this.f10606a = str;
        this.f10607b = j;
    }

    public final long a() {
        if (!this.f10608c) {
            this.f10608c = true;
            this.f10609d = this.f10610e.C().getLong(this.f10606a, this.f10607b);
        }
        return this.f10609d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.f10610e.C().edit();
        edit.putLong(this.f10606a, j);
        edit.apply();
        this.f10609d = j;
    }
}
