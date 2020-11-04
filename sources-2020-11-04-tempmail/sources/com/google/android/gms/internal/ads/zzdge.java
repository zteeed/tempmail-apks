package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdge implements zzela<zzdgc> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzaqq> f8203a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<ScheduledExecutorService> f8204b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Context> f8205c;

    public zzdge(zzelj<zzaqq> zzelj, zzelj<ScheduledExecutorService> zzelj2, zzelj<Context> zzelj3) {
        this.f8203a = zzelj;
        this.f8204b = zzelj2;
        this.f8205c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        return new zzdgc(this.f8203a.get(), this.f8204b.get(), this.f8205c.get());
    }
}
