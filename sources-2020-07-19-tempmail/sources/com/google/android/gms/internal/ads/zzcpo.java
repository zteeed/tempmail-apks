package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcpo implements zzela<zzcoy> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7326a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7327b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzasz> f7328c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzblb> f7329d;

    /* renamed from: e  reason: collision with root package name */
    private final zzelj<zzata> f7330e;

    /* renamed from: f  reason: collision with root package name */
    private final zzelj<HashMap<String, zzcpn>> f7331f;

    private zzcpo(zzelj<Context> zzelj, zzelj<Executor> zzelj2, zzelj<zzasz> zzelj3, zzelj<zzblb> zzelj4, zzelj<zzata> zzelj5, zzelj<HashMap<String, zzcpn>> zzelj6) {
        this.f7326a = zzelj;
        this.f7327b = zzelj2;
        this.f7328c = zzelj3;
        this.f7329d = zzelj4;
        this.f7330e = zzelj5;
        this.f7331f = zzelj6;
    }

    public static zzcpo a(zzelj<Context> zzelj, zzelj<Executor> zzelj2, zzelj<zzasz> zzelj3, zzelj<zzblb> zzelj4, zzelj<zzata> zzelj5, zzelj<HashMap<String, zzcpn>> zzelj6) {
        return new zzcpo(zzelj, zzelj2, zzelj3, zzelj4, zzelj5, zzelj6);
    }

    public final /* synthetic */ Object get() {
        return new zzcoy(this.f7326a.get(), this.f7327b.get(), this.f7328c.get(), this.f7329d.get(), this.f7330e.get(), this.f7331f.get());
    }
}
