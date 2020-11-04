package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzfm {

    /* renamed from: a  reason: collision with root package name */
    private final String f10616a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10617b;

    /* renamed from: c  reason: collision with root package name */
    private String f10618c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ q3 f10619d;

    public zzfm(q3 q3Var, String str, String str2) {
        this.f10619d = q3Var;
        Preconditions.g(str);
        this.f10616a = str;
    }

    public final String a() {
        if (!this.f10617b) {
            this.f10617b = true;
            this.f10618c = this.f10619d.C().getString(this.f10616a, (String) null);
        }
        return this.f10618c;
    }

    public final void b(String str) {
        if (this.f10619d.l().t(zzaq.x0) || !zzkr.A0(str, this.f10618c)) {
            SharedPreferences.Editor edit = this.f10619d.C().edit();
            edit.putString(this.f10616a, str);
            edit.apply();
            this.f10618c = str;
        }
    }
}
