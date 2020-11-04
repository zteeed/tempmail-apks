package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzddo implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f8095a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8096b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8097c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8098d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8099e;

    /* renamed from: f  reason: collision with root package name */
    private final int f8100f;
    private final int g;

    public zzddo(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.f8095a = z;
        this.f8096b = z2;
        this.f8097c = str;
        this.f8098d = z3;
        this.f8099e = i;
        this.f8100f = i2;
        this.g = i3;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f8097c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) zzwg.e().c(zzaav.t1));
        bundle.putInt("target_api", this.f8099e);
        bundle.putInt("dv", this.f8100f);
        bundle.putInt("lv", this.g);
        Bundle a2 = zzdlf.a(bundle, "sdk_env");
        a2.putBoolean("mf", zzacl.f5779a.a().booleanValue());
        a2.putBoolean("instant_app", this.f8095a);
        a2.putBoolean("lite", this.f8096b);
        a2.putBoolean("is_privileged_process", this.f8098d);
        bundle.putBundle("sdk_env", a2);
        Bundle a3 = zzdlf.a(a2, "build_meta");
        a3.putString("cl", "312401170");
        a3.putString("rapid_rc", "dev");
        a3.putString("rapid_rollup", "HEAD");
        a2.putBundle("build_meta", a3);
    }
}