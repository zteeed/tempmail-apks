package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzfm {

    /* renamed from: a  reason: collision with root package name */
    private final String f10430a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10431b;

    /* renamed from: c  reason: collision with root package name */
    private String f10432c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ q3 f10433d;

    public zzfm(q3 q3Var, String str, String str2) {
        this.f10433d = q3Var;
        Preconditions.g(str);
        this.f10430a = str;
    }

    public final String a() {
        if (!this.f10431b) {
            this.f10431b = true;
            this.f10432c = this.f10433d.C().getString(this.f10430a, (String) null);
        }
        return this.f10432c;
    }

    public final void b(String str) {
        if (this.f10433d.l().t(zzaq.x0) || !zzkr.A0(str, this.f10432c)) {
            SharedPreferences.Editor edit = this.f10433d.C().edit();
            edit.putString(this.f10430a, str);
            edit.apply();
            this.f10432c = str;
        }
    }
}
