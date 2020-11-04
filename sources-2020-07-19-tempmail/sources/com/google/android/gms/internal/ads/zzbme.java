package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbme implements zzela<Set<zzbyg<zzo>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzblu> f6374a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f6375b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<JSONObject> f6376c;

    private zzbme(zzelj<zzblu> zzelj, zzelj<Executor> zzelj2, zzelj<JSONObject> zzelj3) {
        this.f6374a = zzelj;
        this.f6375b = zzelj2;
        this.f6376c = zzelj3;
    }

    public static zzbme a(zzelj<zzblu> zzelj, zzelj<Executor> zzelj2, zzelj<JSONObject> zzelj3) {
        return new zzbme(zzelj, zzelj2, zzelj3);
    }

    public final /* synthetic */ Object get() {
        Set set;
        zzblu zzblu = this.f6374a.get();
        Executor executor = this.f6375b.get();
        if (this.f6376c.get() == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzbyg(zzblu, executor));
        }
        zzelg.b(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
