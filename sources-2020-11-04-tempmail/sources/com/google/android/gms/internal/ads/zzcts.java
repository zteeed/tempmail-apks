package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcts {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Clock f7706a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zzctu f7707b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f7708c = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7709d;

    public zzcts(Clock clock, zzctu zzctu) {
        this.f7706a = clock;
        this.f7707b = zzctu;
        this.f7709d = ((Boolean) zzwg.e().c(zzaav.E3)).booleanValue();
    }

    /* access modifiers changed from: private */
    public final void d(String str, int i, long j, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 1 + String.valueOf(str2).length());
            sb3.append(sb2);
            sb3.append(".");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        this.f7708c.add(sb2);
    }

    /* access modifiers changed from: package-private */
    public final <T> zzdvf<T> b(zzdkm zzdkm, zzdkk zzdkk, zzdvf<T> zzdvf) {
        long b2 = this.f7706a.b();
        String str = zzdkk.t;
        if (str != null) {
            zzdux.f(zzdvf, new so(this, str, b2, zzdkk, zzdkm), zzbbf.f6325f);
        }
        return zzdvf;
    }

    public final String e() {
        return TextUtils.join("_", this.f7708c);
    }
}
