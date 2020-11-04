package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdej implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f8120a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8121b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8122c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8123d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f8124e;

    /* renamed from: f  reason: collision with root package name */
    private final int f8125f;

    public zzdej(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f8120a = str;
        this.f8121b = i;
        this.f8122c = i2;
        this.f8123d = i3;
        this.f8124e = z;
        this.f8125f = i4;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f8120a;
        boolean z = true;
        zzdlf.f(bundle, "carrier", str, !TextUtils.isEmpty(str));
        Integer valueOf = Integer.valueOf(this.f8121b);
        if (this.f8121b == -2) {
            z = false;
        }
        zzdlf.d(bundle, "cnt", valueOf, z);
        bundle.putInt("gnt", this.f8122c);
        bundle.putInt("pt", this.f8123d);
        Bundle a2 = zzdlf.a(bundle, "device");
        bundle.putBundle("device", a2);
        Bundle a3 = zzdlf.a(a2, "network");
        a2.putBundle("network", a3);
        a3.putInt("active_network_state", this.f8125f);
        a3.putBoolean("active_network_metered", this.f8124e);
    }
}
