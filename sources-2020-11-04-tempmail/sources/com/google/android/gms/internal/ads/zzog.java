package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzog {

    /* renamed from: a  reason: collision with root package name */
    public final zznr f9117a;

    /* renamed from: b  reason: collision with root package name */
    public final zzof f9118b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f9119c;

    /* renamed from: d  reason: collision with root package name */
    public final zzhx[] f9120d;

    public zzog(zznr zznr, zzof zzof, Object obj, zzhx[] zzhxArr) {
        this.f9117a = zznr;
        this.f9118b = zzof;
        this.f9119c = obj;
        this.f9120d = zzhxArr;
    }

    public final boolean a(zzog zzog, int i) {
        if (zzog != null && zzpo.g(this.f9118b.a(i), zzog.f9118b.a(i)) && zzpo.g(this.f9120d[i], zzog.f9120d[i])) {
            return true;
        }
        return false;
    }
}
