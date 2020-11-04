package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzain implements InitializationStatus {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, AdapterStatus> f5728a;

    public zzain(Map<String, AdapterStatus> map) {
        this.f5728a = map;
    }

    public final Map<String, AdapterStatus> getAdapterStatusMap() {
        return this.f5728a;
    }
}
