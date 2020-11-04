package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class rg implements zzbpc<zzbph> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, zzcqt<zzbph>> f5009a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, zzcqt<zzccd>> f5010b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, zzcsu<zzccd>> f5011c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzbpc<zzbnc>> f5012d;

    /* renamed from: e  reason: collision with root package name */
    private final zzccv f5013e;

    rg(Map<String, zzcqt<zzbph>> map, Map<String, zzcqt<zzccd>> map2, Map<String, zzcsu<zzccd>> map3, zzelj<zzbpc<zzbnc>> zzelj, zzccv zzccv) {
        this.f5009a = map;
        this.f5010b = map2;
        this.f5011c = map3;
        this.f5012d = zzelj;
        this.f5013e = zzccv;
    }

    public final zzcqt<zzbph> a(int i, String str) {
        zzcqt a2;
        zzcqt<zzbph> zzcqt = this.f5009a.get(str);
        if (zzcqt != null) {
            return zzcqt;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzcsu zzcsu = this.f5011c.get(str);
            if (zzcsu != null) {
                return zzbph.b(zzcsu);
            }
            zzcqt zzcqt2 = this.f5010b.get(str);
            if (zzcqt2 != null) {
                return zzbph.a(zzcqt2);
            }
            return null;
        } else if (this.f5013e.d() == null || (a2 = this.f5012d.get().a(i, str)) == null) {
            return null;
        } else {
            return zzbph.a(a2);
        }
    }
}
