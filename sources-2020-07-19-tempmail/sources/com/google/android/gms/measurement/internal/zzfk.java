package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzfk {

    /* renamed from: a  reason: collision with root package name */
    private final String f10420a;

    /* renamed from: b  reason: collision with root package name */
    private final long f10421b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10422c;

    /* renamed from: d  reason: collision with root package name */
    private long f10423d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ q3 f10424e;

    public zzfk(q3 q3Var, String str, long j) {
        this.f10424e = q3Var;
        Preconditions.g(str);
        this.f10420a = str;
        this.f10421b = j;
    }

    public final long a() {
        if (!this.f10422c) {
            this.f10422c = true;
            this.f10423d = this.f10424e.C().getLong(this.f10420a, this.f10421b);
        }
        return this.f10423d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.f10424e.C().edit();
        edit.putLong(this.f10420a, j);
        edit.apply();
        this.f10423d = j;
    }
}
