package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzczk implements zzddz<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final zzvh f7741a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7742b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7743c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7744d;

    /* renamed from: e  reason: collision with root package name */
    private final float f7745e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7746f;
    private final int g;
    private final String h;
    private final boolean i;

    public zzczk(zzvh zzvh, String str, boolean z, String str2, float f2, int i2, int i3, String str3, boolean z2) {
        Preconditions.l(zzvh, "the adSize must not be null");
        this.f7741a = zzvh;
        this.f7742b = str;
        this.f7743c = z;
        this.f7744d = str2;
        this.f7745e = f2;
        this.f7746f = i2;
        this.g = i3;
        this.h = str3;
        this.i = z2;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzdlf.f(bundle, "smart_w", "full", this.f7741a.f9193f == -1);
        zzdlf.f(bundle, "smart_h", "auto", this.f7741a.f9190c == -2);
        zzdlf.c(bundle, "ene", Boolean.TRUE, this.f7741a.k);
        zzdlf.f(bundle, "rafmt", "102", this.f7741a.n);
        zzdlf.f(bundle, "rafmt", "103", this.f7741a.o);
        zzdlf.c(bundle, "inline_adaptive_slot", Boolean.TRUE, this.i);
        zzdlf.e(bundle, "format", this.f7742b);
        zzdlf.f(bundle, "fluid", "height", this.f7743c);
        String str = this.f7744d;
        zzdlf.f(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.f7745e);
        bundle.putInt("sw", this.f7746f);
        bundle.putInt("sh", this.g);
        String str2 = this.h;
        zzdlf.f(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList arrayList = new ArrayList();
        zzvh[] zzvhArr = this.f7741a.h;
        if (zzvhArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f7741a.f9190c);
            bundle2.putInt("width", this.f7741a.f9193f);
            bundle2.putBoolean("is_fluid_height", this.f7741a.j);
            arrayList.add(bundle2);
        } else {
            for (zzvh zzvh : zzvhArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzvh.j);
                bundle3.putInt("height", zzvh.f9190c);
                bundle3.putInt("width", zzvh.f9193f);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
