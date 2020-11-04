package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final /* synthetic */ class tg0 implements InitializationStatus {

    /* renamed from: a  reason: collision with root package name */
    private final zzyt f5168a;

    tg0(zzyt zzyt) {
        this.f5168a = zzyt;
    }

    public final Map getAdapterStatusMap() {
        zzyt zzyt = this.f5168a;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.gms.ads.MobileAds", new sg0(zzyt));
        return hashMap;
    }
}
