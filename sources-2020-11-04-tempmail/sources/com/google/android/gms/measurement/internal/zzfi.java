package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzfi {

    /* renamed from: a  reason: collision with root package name */
    private final String f10601a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f10602b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10603c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10604d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ q3 f10605e;

    public zzfi(q3 q3Var, String str, boolean z) {
        this.f10605e = q3Var;
        Preconditions.g(str);
        this.f10601a = str;
        this.f10602b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.f10605e.C().edit();
        edit.putBoolean(this.f10601a, z);
        edit.apply();
        this.f10604d = z;
    }

    public final boolean b() {
        if (!this.f10603c) {
            this.f10603c = true;
            this.f10604d = this.f10605e.C().getBoolean(this.f10601a, this.f10602b);
        }
        return this.f10604d;
    }
}
