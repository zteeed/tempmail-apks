package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrx;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbsd implements zzela<zzbrx.zza> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbrx f6618a;

    private zzbsd(zzbrx zzbrx) {
        this.f6618a = zzbrx;
    }

    public static zzbsd a(zzbrx zzbrx) {
        return new zzbsd(zzbrx);
    }

    public final /* synthetic */ Object get() {
        zzbrx.zza a2 = this.f6618a.a();
        zzelg.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
