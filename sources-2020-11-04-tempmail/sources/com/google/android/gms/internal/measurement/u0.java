package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final /* synthetic */ class u0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final zzde f9680a;

    u0(zzde zzde) {
        this.f9680a = zzde;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f9680a.c(sharedPreferences, str);
    }
}
