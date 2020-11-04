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
    private final boolean f7929a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7930b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7931c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7932d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7933e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f7934f;
    private final String g;
    private final ArrayList<String> h;
    private final String i;
    private final String j;
    private final String k;
    private final boolean l;
    private final String m;
    private final long n;

    public zzdef(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList<String> arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z6, String str6, long j2) {
        this.f7929a = z;
        this.f7930b = z2;
        this.f7931c = str;
        this.f7932d = z3;
        this.f7933e = z4;
        this.f7934f = z5;
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
        bundle.putBoolean("cog", this.f7929a);
        bundle.putBoolean("coh", this.f7930b);
        bundle.putString("gl", this.f7931c);
        bundle.putBoolean("simulator", this.f7932d);
        bundle.putBoolean("is_latchsky", this.f7933e);
        bundle.putBoolean("is_sidewinder", this.f7934f);
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
