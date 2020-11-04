package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbmb implements zzela<Set<zzbyg<zzbtd>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzblu> f6550a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6551b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<JSONObject> f6552c;

    private zzbmb(zzelj<zzblu> zzelj, zzelj<Executor> zzelj2, zzelj<JSONObject> zzelj3) {
        this.f6550a = zzelj;
        this.f6551b = zzelj2;
        this.f6552c = zzelj3;
    }

    public static zzbmb a(zzelj<zzblu> zzelj, zzelj<Executor> zzelj2, zzelj<JSONObject> zzelj3) {
        return new zzbmb(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        Set set;
        zzblu zzblu = this.f6550a.get();
        Executor executor = this.f6551b.get();
        if (this.f6552c.get() == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzbyg(zzblu, executor));
        }
        zzelg.b(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
