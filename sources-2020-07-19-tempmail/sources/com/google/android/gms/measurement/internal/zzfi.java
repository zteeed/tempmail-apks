package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzfi {

    /* renamed from: a  reason: collision with root package name */
    private final String f10415a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f10416b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10417c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10418d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ q3 f10419e;

    public zzfi(q3 q3Var, String str, boolean z) {
        this.f10419e = q3Var;
        Preconditions.g(str);
        this.f10415a = str;
        this.f10416b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.f10419e.C().edit();
        edit.putBoolean(this.f10415a, z);
        edit.apply();
        this.f10418d = z;
    }

    public final boolean b() {
        if (!this.f10417c) {
            this.f10417c = true;
            this.f10418d = this.f10419e.C().getBoolean(this.f10415a, this.f10416b);
        }
        return this.f10418d;
    }
}
