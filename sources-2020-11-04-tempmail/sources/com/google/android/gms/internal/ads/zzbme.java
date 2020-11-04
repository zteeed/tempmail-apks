package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbme implements zzela<Set<zzbyg<zzo>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzblu> f6557a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6558b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<JSONObject> f6559c;

    private zzbme(zzelj<zzblu> zzelj, zzelj<Executor> zzelj2, zzelj<JSONObject> zzelj3) {
        this.f6557a = zzelj;
        this.f6558b = zzelj2;
        this.f6559c = zzelj3;
    }

    public static zzbme a(zzelj<zzblu> zzelj, zzelj<Executor> zzelj2, zzelj<JSONObject> zzelj3) {
        return new zzbme(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        Set set;
        zzblu zzblu = this.f6557a.get();
        Executor executor = this.f6558b.get();
        if (this.f6559c.get() == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzbyg(zzblu, executor));
        }
        zzelg.b(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
