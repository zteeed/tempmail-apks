package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcys implements zzela<Set<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzcym f7894a;

    public zzcys(zzcym zzcym) {
        this.f7894a = zzcym;
    }

    public final /* synthetic */ Object get() {
        Set<String> a2 = this.f7894a.a();
        zzelg.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
