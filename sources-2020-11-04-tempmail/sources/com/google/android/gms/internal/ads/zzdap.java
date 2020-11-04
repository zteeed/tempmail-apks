package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdap implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final double f7978a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7979b;

    public zzdap(double d2, boolean z) {
        this.f7978a = d2;
        this.f7979b = z;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a2 = zzdlf.a(bundle, "device");
        bundle.putBundle("device", a2);
        Bundle a3 = zzdlf.a(a2, "battery");
        a2.putBundle("battery", a3);
        a3.putBoolean("is_charging", this.f7979b);
        a3.putDouble("battery_level", this.f7978a);
    }
}
