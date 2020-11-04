package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxo implements zzela<Set<zzbyg<AppEventListener>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbxa f6689a;

    private zzbxo(zzbxa zzbxa) {
        this.f6689a = zzbxa;
    }

    public static zzbxo a(zzbxa zzbxa) {
        return new zzbxo(zzbxa);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<AppEventListener>> g = this.f6689a.g();
        zzelg.b(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }
}
