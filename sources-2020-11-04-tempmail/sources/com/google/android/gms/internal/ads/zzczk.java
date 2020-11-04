package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzczk implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final zzvh f7924a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7925b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7926c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7927d;

    /* renamed from: e  reason: collision with root package name */
    private final float f7928e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7929f;
    private final int g;
    private final String h;
    private final boolean i;

    public zzczk(zzvh zzvh, String str, boolean z, String str2, float f2, int i2, int i3, String str3, boolean z2) {
        Preconditions.l(zzvh, "the adSize must not be null");
        this.f7924a = zzvh;
        this.f7925b = str;
        this.f7926c = z;
        this.f7927d = str2;
        this.f7928e = f2;
        this.f7929f = i2;
        this.g = i3;
        this.h = str3;
        this.i = z2;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzdlf.f(bundle, "smart_w", "full", this.f7924a.f9376f == -1);
        zzdlf.f(bundle, "smart_h", "auto", this.f7924a.f9373c == -2);
        zzdlf.c(bundle, "ene", Boolean.TRUE, this.f7924a.k);
        zzdlf.f(bundle, "rafmt", "102", this.f7924a.n);
        zzdlf.f(bundle, "rafmt", "103", this.f7924a.o);
        zzdlf.c(bundle, "inline_adaptive_slot", Boolean.TRUE, this.i);
        zzdlf.e(bundle, "format", this.f7925b);
        zzdlf.f(bundle, "fluid", "height", this.f7926c);
        String str = this.f7927d;
        zzdlf.f(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.f7928e);
        bundle.putInt("sw", this.f7929f);
        bundle.putInt("sh", this.g);
        String str2 = this.h;
        zzdlf.f(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList arrayList = new ArrayList();
        zzvh[] zzvhArr = this.f7924a.h;
        if (zzvhArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f7924a.f9373c);
            bundle2.putInt("width", this.f7924a.f9376f);
            bundle2.putBoolean("is_fluid_height", this.f7924a.j);
            arrayList.add(bundle2);
        } else {
            for (zzvh zzvh : zzvhArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzvh.j);
                bundle3.putInt("height", zzvh.f9373c);
                bundle3.putInt("width", zzvh.f9376f);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
