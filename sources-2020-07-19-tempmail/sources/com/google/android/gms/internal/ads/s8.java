package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class s8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f4870b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f4871c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f4872d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ int f4873e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ long f4874f;
    private final /* synthetic */ long g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ int i;
    private final /* synthetic */ int j;
    private final /* synthetic */ zzbes k;

    s8(zzbes zzbes, String str, String str2, int i2, int i3, long j2, long j3, boolean z, int i4, int i5) {
        this.k = zzbes;
        this.f4870b = str;
        this.f4871c = str2;
        this.f4872d = i2;
        this.f4873e = i3;
        this.f4874f = j2;
        this.g = j3;
        this.h = z;
        this.i = i4;
        this.j = i5;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f4870b);
        hashMap.put("cachedSrc", this.f4871c);
        hashMap.put("bytesLoaded", Integer.toString(this.f4872d));
        hashMap.put("totalBytes", Integer.toString(this.f4873e));
        hashMap.put("bufferedDuration", Long.toString(this.f4874f));
        hashMap.put("totalDuration", Long.toString(this.g));
        hashMap.put("cacheReady", this.h ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.i));
        hashMap.put("playerPreparedCount", Integer.toString(this.j));
        this.k.m("onPrecacheEvent", hashMap);
    }
}
