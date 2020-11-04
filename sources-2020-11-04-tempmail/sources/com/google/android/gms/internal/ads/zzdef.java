package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdef implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f8112a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8113b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8114c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8115d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f8116e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f8117f;
    private final String g;
    private final ArrayList<String> h;
    private final String i;
    private final String j;
    private final String k;
    private final boolean l;
    private final String m;
    private final long n;

    public zzdef(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList<String> arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z6, String str6, long j2) {
        this.f8112a = z;
        this.f8113b = z2;
        this.f8114c = str;
        this.f8115d = z3;
        this.f8116e = z4;
        this.f8117f = z5;
        this.g = str2;
        this.h = arrayList;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = z6;
        this.m = str6;
        this.n = j2;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f8112a);
        bundle.putBoolean("coh", this.f8113b);
        bundle.putString("gl", this.f8114c);
        bundle.putBoolean("simulator", this.f8115d);
        bundle.putBoolean("is_latchsky", this.f8116e);
        bundle.putBoolean("is_sidewinder", this.f8117f);
        bundle.putString("hl", this.g);
        if (!this.h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.h);
        }
        bundle.putString("mv", this.i);
        bundle.putString("submodel", this.m);
        Bundle a2 = zzdlf.a(bundle, "device");
        bundle.putBundle("device", a2);
        a2.putString("build", this.k);
        if (((Boolean) zzwg.e().c(zzaav.s1)).booleanValue()) {
            a2.putLong("remaining_data_partition_space", this.n);
        }
        Bundle a3 = zzdlf.a(a2, "browser");
        a2.putBundle("browser", a3);
        a3.putBoolean("is_browser_custom_tabs_capable", this.l);
        if (!TextUtils.isEmpty(this.j)) {
            Bundle a4 = zzdlf.a(a2, "play_store");
            a2.putBundle("play_store", a4);
            a4.putString("package_version", this.j);
        }
    }
}
