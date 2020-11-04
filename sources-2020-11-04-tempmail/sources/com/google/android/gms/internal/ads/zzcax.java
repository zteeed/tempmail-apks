package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zzty;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcax implements zzela<zzcau> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzavv> f6949a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f6950b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzavy> f6951c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<View> f6952d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzty.zza.C0085zza> f6953e;

    private zzcax(zzelj<zzavv> zzelj, zzelj<Context> zzelj2, zzelj<zzavy> zzelj3, zzelj<View> zzelj4, zzelj<zzty.zza.C0085zza> zzelj5) {
        this.f6949a = zzelj;
        this.f6950b = zzelj2;
        this.f6951c = zzelj3;
        this.f6952d = zzelj4;
        this.f6953e = zzelj5;
    }

    public static zzcax a(zzelj<zzavv> zzelj, zzelj<Context> zzelj2, zzelj<zzavy> zzelj3, zzelj<View> zzelj4, zzelj<zzty.zza.C0085zza> zzelj5) {
        return new zzcax(zzelj, zzelj2, zzelj3, zzelj4, zzelj5);
    }

    public final /* synthetic */ Object get() {
        return new zzcau(this.f6949a.get(), this.f6950b.get(), this.f6951c.get(), this.f6952d.get(), this.f6953e.get());
    }
}
