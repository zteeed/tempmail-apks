package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdca implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdki f7848a;

    public zzdca(zzdki zzdki) {
        this.f7848a = zzdki;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzdki zzdki = this.f7848a;
        if (zzdki != null) {
            bundle.putBoolean("render_in_browser", zzdki.b());
            bundle.putBoolean("disable_ml", this.f7848a.c());
        }
    }
}
