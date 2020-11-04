package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbmc implements zzela<Set<zzbyg<zzbtg>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzblu> f6370a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6371b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<JSONObject> f6372c;

    private zzbmc(zzelj<zzblu> zzelj, zzelj<Executor> zzelj2, zzelj<JSONObject> zzelj3) {
        this.f6370a = zzelj;
        this.f6371b = zzelj2;
        this.f6372c = zzelj3;
    }

    public static zzbmc a(zzelj<zzblu> zzelj, zzelj<Executor> zzelj2, zzelj<JSONObject> zzelj3) {
        return new zzbmc(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        Set set;
        zzblu zzblu = this.f6370a.get();
        Executor executor = this.f6371b.get();
        if (this.f6372c.get() == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzbyg(zzblu, executor));
        }
        zzelg.b(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
