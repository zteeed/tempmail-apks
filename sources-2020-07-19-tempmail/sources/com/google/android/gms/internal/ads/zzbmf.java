package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbmf implements zzela<Set<zzbyg<zzqs>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzblu> f6377a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6378b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<JSONObject> f6379c;

    private zzbmf(zzelj<zzblu> zzelj, zzelj<Executor> zzelj2, zzelj<JSONObject> zzelj3) {
        this.f6377a = zzelj;
        this.f6378b = zzelj2;
        this.f6379c = zzelj3;
    }

    public static zzbmf a(zzelj<zzblu> zzelj, zzelj<Executor> zzelj2, zzelj<JSONObject> zzelj3) {
        return new zzbmf(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        Set set;
        zzblu zzblu = this.f6377a.get();
        Executor executor = this.f6378b.get();
        if (this.f6379c.get() == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzbyg(zzblu, executor));
        }
        zzelg.b(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
