package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdej implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f7937a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7938b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7939c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7940d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7941e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7942f;

    public zzdej(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f7937a = str;
        this.f7938b = i;
        this.f7939c = i2;
        this.f7940d = i3;
        this.f7941e = z;
        this.f7942f = i4;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f7937a;
        boolean z = true;
        zzdlf.f(bundle, "carrier", str, !TextUtils.isEmpty(str));
        Integer valueOf = Integer.valueOf(this.f7938b);
        if (this.f7938b == -2) {
            z = false;
        }
        zzdlf.d(bundle, "cnt", valueOf, z);
        bundle.putInt("gnt", this.f7939c);
        bundle.putInt("pt", this.f7940d);
        Bundle a2 = zzdlf.a(bundle, "device");
        bundle.putBundle("device", a2);
        Bundle a3 = zzdlf.a(a2, "network");
        a2.putBundle("network", a3);
        a3.putInt("active_network_state", this.f7942f);
        a3.putBoolean("active_network_metered", this.f7941e);
    }
}
