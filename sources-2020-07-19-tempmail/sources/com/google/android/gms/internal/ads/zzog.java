package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzog {

    /* renamed from: a  reason: collision with root package name */
    public final zznr f8934a;

    /* renamed from: b  reason: collision with root package name */
    public final zzof f8935b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8936c;

    /* renamed from: d  reason: collision with root package name */
    public final zzhx[] f8937d;

    public zzog(zznr zznr, zzof zzof, Object obj, zzhx[] zzhxArr) {
        this.f8934a = zznr;
        this.f8935b = zzof;
        this.f8936c = obj;
        this.f8937d = zzhxArr;
    }

    public final boolean a(zzog zzog, int i) {
        if (zzog != null && zzpo.g(this.f8935b.a(i), zzog.f8935b.a(i)) && zzpo.g(this.f8937d[i], zzog.f8937d[i])) {
            return true;
        }
        return false;
    }
}
