package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zzty;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcax implements zzela<zzcau> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzavv> f6766a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f6767b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzavy> f6768c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<View> f6769d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzty.zza.C0086zza> f6770e;

    private zzcax(zzelj<zzavv> zzelj, zzelj<Context> zzelj2, zzelj<zzavy> zzelj3, zzelj<View> zzelj4, zzelj<zzty.zza.C0086zza> zzelj5) {
        this.f6766a = zzelj;
        this.f6767b = zzelj2;
        this.f6768c = zzelj3;
        this.f6769d = zzelj4;
        this.f6770e = zzelj5;
    }

    public static zzcax a(zzelj<zzavv> zzelj, zzelj<Context> zzelj2, zzelj<zzavy> zzelj3, zzelj<View> zzelj4, zzelj<zzty.zza.C0086zza> zzelj5) {
        return new zzcax(zzelj, zzelj2, zzelj3, zzelj4, zzelj5);
    }

    public final /* synthetic */ Object get() {
        return new zzcau(this.f6766a.get(), this.f6767b.get(), this.f6768c.get(), this.f6769d.get(), this.f6770e.get());
    }
}
