package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcvb implements zzela<zzcuu> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7577a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7578b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzchm> f7579c;

    public zzcvb(zzelj<Context> zzelj, zzelj<Executor> zzelj2, zzelj<zzchm> zzelj3) {
        this.f7577a = zzelj;
        this.f7578b = zzelj2;
        this.f7579c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        return new zzcuu(this.f7577a.get(), this.f7578b.get(), this.f7579c.get());
    }
}
