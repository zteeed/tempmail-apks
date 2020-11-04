package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class u8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5043b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5044c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f5045d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzbes f5046e;

    u8(zzbes zzbes, String str, String str2, long j) {
        this.f5046e = zzbes;
        this.f5043b = str;
        this.f5044c = str2;
        this.f5045d = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f5043b);
        hashMap.put("cachedSrc", this.f5044c);
        hashMap.put("totalDuration", Long.toString(this.f5045d));
        this.f5046e.m("onPrecacheEvent", hashMap);
    }
}
