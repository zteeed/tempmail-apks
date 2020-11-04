package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcpo implements zzela<zzcoy> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7509a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7510b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzasz> f7511c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzblb> f7512d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzata> f7513e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<HashMap<String, zzcpn>> f7514f;

    private zzcpo(zzelj<Context> zzelj, zzelj<Executor> zzelj2, zzelj<zzasz> zzelj3, zzelj<zzblb> zzelj4, zzelj<zzata> zzelj5, zzelj<HashMap<String, zzcpn>> zzelj6) {
        this.f7509a = zzelj;
        this.f7510b = zzelj2;
        this.f7511c = zzelj3;
        this.f7512d = zzelj4;
        this.f7513e = zzelj5;
        this.f7514f = zzelj6;
    }

    public static zzcpo a(zzelj<Context> zzelj, zzelj<Executor> zzelj2, zzelj<zzasz> zzelj3, zzelj<zzblb> zzelj4, zzelj<zzata> zzelj5, zzelj<HashMap<String, zzcpn>> zzelj6) {
        return new zzcpo(zzelj, zzelj2, zzelj3, zzelj4, zzelj5, zzelj6);
    }

    public final /* synthetic */ Object get() {
        return new zzcoy(this.f7509a.get(), this.f7510b.get(), this.f7511c.get(), this.f7512d.get(), this.f7513e.get(), this.f7514f.get());
    }
}
