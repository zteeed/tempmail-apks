package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zza;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbkd implements zzela<zza> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbkb f6475a;

    public zzbkd(zzbkb zzbkb) {
        this.f6475a = zzbkb;
    }

    public final /* synthetic */ Object get() {
        zza e2 = this.f6475a.e();
        zzelg.b(e2, "Cannot return null from a non-@Nullable @Provides method");
        return e2;
    }
}
