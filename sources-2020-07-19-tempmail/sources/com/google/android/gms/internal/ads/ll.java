package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class ll implements zzduh {

    /* renamed from: a  reason: collision with root package name */
    static final zzduh f4317a = new ll();

    private ll() {
    }

    public final zzdvf zzf(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        return zzdux.a(new zzcmi(zzdls.f8184e, "Timed out waiting for ad response."));
    }
}
