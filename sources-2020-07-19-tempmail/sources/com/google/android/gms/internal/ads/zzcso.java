package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcso implements zzela<zzcsm> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7464a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbbd> f7465b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcae> f7466c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<Executor> f7467d;

    public zzcso(zzelj<Context> zzelj, zzelj<zzbbd> zzelj2, zzelj<zzcae> zzelj3, zzelj<Executor> zzelj4) {
        this.f7464a = zzelj;
        this.f7465b = zzelj2;
        this.f7466c = zzelj3;
        this.f7467d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        return new zzcsm(this.f7464a.get(), this.f7465b.get(), this.f7466c.get(), this.f7467d.get());
    }
}
