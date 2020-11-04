package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class rg implements zzbpc<zzbph> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, zzcqt<zzbph>> f4826a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, zzcqt<zzccd>> f4827b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, zzcsu<zzccd>> f4828c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzbpc<zzbnc>> f4829d;

    /* renamed from: e  reason: collision with root package name */
    private final zzccv f4830e;

    rg(Map<String, zzcqt<zzbph>> map, Map<String, zzcqt<zzccd>> map2, Map<String, zzcsu<zzccd>> map3, zzelj<zzbpc<zzbnc>> zzelj, zzccv zzccv) {
        this.f4826a = map;
        this.f4827b = map2;
        this.f4828c = map3;
        this.f4829d = zzelj;
        this.f4830e = zzccv;
    }

    public final zzcqt<zzbph> a(int i, String str) {
        zzcqt a2;
        zzcqt<zzbph> zzcqt = this.f4826a.get(str);
        if (zzcqt != null) {
            return zzcqt;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzcsu zzcsu = this.f4828c.get(str);
            if (zzcsu != null) {
                return zzbph.b(zzcsu);
            }
            zzcqt zzcqt2 = this.f4827b.get(str);
            if (zzcqt2 != null) {
                return zzbph.a(zzcqt2);
            }
            return null;
        } else if (this.f4830e.d() == null || (a2 = this.f4829d.get().a(i, str)) == null) {
            return null;
        } else {
            return zzbph.a(a2);
        }
    }
}
