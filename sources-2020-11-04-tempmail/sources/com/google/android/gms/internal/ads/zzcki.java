package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcki implements zzela<zzckh> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zztm> f7326a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Map<zzdor, zzckj>> f7327b;

    private zzcki(zzelj<zztm> zzelj, zzelj<Map<zzdor, zzckj>> zzelj2) {
        this.f7326a = zzelj;
        this.f7327b = zzelj2;
    }

    public static zzcki a(zzelj<zztm> zzelj, zzelj<Map<zzdor, zzckj>> zzelj2) {
        return new zzcki(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzckh(this.f7326a.get(), this.f7327b.get());
    }
}
