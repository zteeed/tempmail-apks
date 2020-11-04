package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdlx {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, zzdlz> f8190a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Context f8191b;

    /* renamed from: c  reason: collision with root package name */
    private final zzaxh f8192c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbbd f8193d;

    public zzdlx(Context context, zzbbd zzbbd, zzaxh zzaxh) {
        this.f8191b = context;
        this.f8193d = zzbbd;
        this.f8192c = zzaxh;
    }

    private final zzdlz a() {
        return new zzdlz(this.f8191b, this.f8192c.r(), this.f8192c.t());
    }

    private final zzdlz c(String str) {
        zzatd b2 = zzatd.b(this.f8191b);
        try {
            b2.a(str);
            zzaya zzaya = new zzaya();
            zzaya.a(this.f8191b, str, false);
            zzayb zzayb = new zzayb(this.f8192c.r(), zzaya);
            return new zzdlz(b2, zzayb, new zzaxs(zzbaq.z(), zzayb));
        } catch (PackageManager.NameNotFoundException unused) {
            return a();
        }
    }

    public final zzdlz b(String str) {
        if (str == null) {
            return a();
        }
        if (this.f8190a.containsKey(str)) {
            return this.f8190a.get(str);
        }
        zzdlz c2 = c(str);
        this.f8190a.put(str, c2);
        return c2;
    }
}
