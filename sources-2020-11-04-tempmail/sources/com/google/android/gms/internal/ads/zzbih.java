package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbih implements zzela<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbie f6452a;

    public zzbih(zzbie zzbie) {
        this.f6452a = zzbie;
    }

    public static Context a(zzbie zzbie) {
        Context a2 = zzbie.a();
        zzelg.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f6452a);
    }
}
