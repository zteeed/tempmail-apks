package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzczq implements zzela<kr> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<String>> f7752a;

    private zzczq(zzelj<Set<String>> zzelj) {
        this.f7752a = zzelj;
    }

    public static zzczq a(zzelj<Set<String>> zzelj) {
        return new zzczq(zzelj);
    }

    public static kr b(Set<String> set) {
        return new kr(set);
    }

    public final /* synthetic */ Object get() {
        return b(this.f7752a.get());
    }
}
