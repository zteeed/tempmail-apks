package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbma implements zzela<zzqn> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdkk> f6546a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbbd> f6547b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<JSONObject> f6548c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<String> f6549d;

    private zzbma(zzelj<zzdkk> zzelj, zzelj<zzbbd> zzelj2, zzelj<JSONObject> zzelj3, zzelj<String> zzelj4) {
        this.f6546a = zzelj;
        this.f6547b = zzelj2;
        this.f6548c = zzelj3;
        this.f6549d = zzelj4;
    }

    public static zzbma a(zzelj<zzdkk> zzelj, zzelj<zzbbd> zzelj2, zzelj<JSONObject> zzelj3, zzelj<String> zzelj4) {
        return new zzbma(zzelj, zzelj2, zzelj3, zzelj4);
    }

    public final /* synthetic */ Object get() {
        zzdkk zzdkk = this.f6546a.get();
        String str = this.f6549d.get();
        boolean equals = "native".equals(str);
        zzq.zzkw();
        zzqn zzqn = new zzqn(zzaye.q0(), this.f6547b.get(), str, this.f6548c.get(), false, equals);
        zzelg.b(zzqn, "Cannot return null from a non-@Nullable @Provides method");
        return zzqn;
    }
}
