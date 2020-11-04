package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbmb implements zzela<Set<zzbyg<zzbtd>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzblu> f6367a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6368b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<JSONObject> f6369c;

    private zzbmb(zzelj<zzblu> zzelj, zzelj<Executor> zzelj2, zzelj<JSONObject> zzelj3) {
        this.f6367a = zzelj;
        this.f6368b = zzelj2;
        this.f6369c = zzelj3;
    }

    public static zzbmb a(zzelj<zzblu> zzelj, zzelj<Executor> zzelj2, zzelj<JSONObject> zzelj3) {
        return new zzbmb(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        Set set;
        zzblu zzblu = this.f6367a.get();
        Executor executor = this.f6368b.get();
        if (this.f6369c.get() == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzbyg(zzblu, executor));
        }
        zzelg.b(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
