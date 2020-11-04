package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbmm implements zzela<View> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbmn f6392a;

    public zzbmm(zzbmn zzbmn) {
        this.f6392a = zzbmn;
    }

    public static View a(zzbmn zzbmn) {
        View b2 = zzbmn.b();
        zzelg.b(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f6392a);
    }
}
