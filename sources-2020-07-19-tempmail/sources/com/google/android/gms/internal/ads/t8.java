package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class t8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f4956b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f4957c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f4958d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ long f4959e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f4960f;
    private final /* synthetic */ int g;
    private final /* synthetic */ int h;
    private final /* synthetic */ zzbes i;

    t8(zzbes zzbes, String str, String str2, long j, long j2, boolean z, int i2, int i3) {
        this.i = zzbes;
        this.f4956b = str;
        this.f4957c = str2;
        this.f4958d = j;
        this.f4959e = j2;
        this.f4960f = z;
        this.g = i2;
        this.h = i3;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f4956b);
        hashMap.put("cachedSrc", this.f4957c);
        hashMap.put("bufferedDuration", Long.toString(this.f4958d));
        hashMap.put("totalDuration", Long.toString(this.f4959e));
        hashMap.put("cacheReady", this.f4960f ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.g));
        hashMap.put("playerPreparedCount", Integer.toString(this.h));
        this.i.m("onPrecacheEvent", hashMap);
    }
}
