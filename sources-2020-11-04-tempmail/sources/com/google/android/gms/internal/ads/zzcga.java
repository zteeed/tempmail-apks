package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcga implements zzela<zzcfp> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdla> f7172a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7173b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzchw> f7174c;

    public zzcga(zzelj<zzdla> zzelj, zzelj<Executor> zzelj2, zzelj<zzchw> zzelj3) {
        this.f7172a = zzelj;
        this.f7173b = zzelj2;
        this.f7174c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        return new zzcfp(this.f7172a.get(), this.f7173b.get(), this.f7174c.get());
    }
}
