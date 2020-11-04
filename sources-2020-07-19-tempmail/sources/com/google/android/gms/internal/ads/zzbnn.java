package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbnn implements zzela<View> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbnj f6422a;

    public zzbnn(zzbnj zzbnj) {
        this.f6422a = zzbnj;
    }

    public static View a(zzbnj zzbnj) {
        View c2 = zzbnj.c();
        zzelg.b(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f6422a);
    }
}
