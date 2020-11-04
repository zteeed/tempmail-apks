package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxj implements zzela<Set<zzbyg<zzbsz>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbxa f6684a;

    private zzbxj(zzbxa zzbxa) {
        this.f6684a = zzbxa;
    }

    public static zzbxj a(zzbxa zzbxa) {
        return new zzbxj(zzbxa);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<zzbsz>> e2 = this.f6684a.e();
        zzelg.b(e2, "Cannot return null from a non-@Nullable @Provides method");
        return e2;
    }
}
