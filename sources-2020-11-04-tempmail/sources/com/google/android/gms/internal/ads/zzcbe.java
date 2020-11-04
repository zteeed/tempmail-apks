package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcbe implements zzela<Set<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzccv> f6969a;

    public zzcbe(zzelj<zzccv> zzelj) {
        this.f6969a = zzelj;
    }

    public static Set<String> a(zzccv zzccv) {
        Set<String> set;
        if (zzccv.d() != null) {
            set = Collections.singleton("banner");
        } else {
            set = Collections.emptySet();
        }
        zzelg.b(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }

    public final /* synthetic */ Object get() {
        return a(this.f6969a.get());
    }
}
