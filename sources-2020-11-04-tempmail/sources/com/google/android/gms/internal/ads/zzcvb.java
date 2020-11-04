package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcvb implements zzela<zzcuu> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7760a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7761b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzchm> f7762c;

    public zzcvb(zzelj<Context> zzelj, zzelj<Executor> zzelj2, zzelj<zzchm> zzelj3) {
        this.f7760a = zzelj;
        this.f7761b = zzelj2;
        this.f7762c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        return new zzcuu(this.f7760a.get(), this.f7761b.get(), this.f7762c.get());
    }
}
