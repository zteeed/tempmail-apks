package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzty;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcje implements zzela<zztm> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7114a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<String> f7115b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzbbd> f7116c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzty.zza.C0086zza> f7117d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<String> f7118e;

    private zzcje(zzelj<Context> zzelj, zzelj<String> zzelj2, zzelj<zzbbd> zzelj3, zzelj<zzty.zza.C0086zza> zzelj4, zzelj<String> zzelj5) {
        this.f7114a = zzelj;
        this.f7115b = zzelj2;
        this.f7116c = zzelj3;
        this.f7117d = zzelj4;
        this.f7118e = zzelj5;
    }

    public static zzcje a(zzelj<Context> zzelj, zzelj<String> zzelj2, zzelj<zzbbd> zzelj3, zzelj<zzty.zza.C0086zza> zzelj4, zzelj<String> zzelj5) {
        return new zzcje(zzelj, zzelj2, zzelj3, zzelj4, zzelj5);
    }

    public final /* synthetic */ Object get() {
        String str = this.f7115b.get();
        zzbbd zzbbd = this.f7116c.get();
        zzty.zza.C0086zza zza = this.f7117d.get();
        String str2 = this.f7118e.get();
        zztm zztm = new zztm(new zztr(this.f7114a.get()));
        zzty.zzu.zza P = zzty.zzu.P();
        P.w(zzbbd.f6132c);
        P.x(zzbbd.f6133d);
        P.y(zzbbd.f6134e ? 0 : 2);
        zztm.b(new ak(zza, str, (zzty.zzu) ((zzegb) P.O()), str2));
        zzelg.b(zztm, "Cannot return null from a non-@Nullable @Provides method");
        return zztm;
    }
}
