package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class u8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5226b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5227c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f5228d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzbes f5229e;

    u8(zzbes zzbes, String str, String str2, long j) {
        this.f5229e = zzbes;
        this.f5226b = str;
        this.f5227c = str2;
        this.f5228d = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f5226b);
        hashMap.put("cachedSrc", this.f5227c);
        hashMap.put("totalDuration", Long.toString(this.f5228d));
        this.f5229e.m("onPrecacheEvent", hashMap);
    }
}
