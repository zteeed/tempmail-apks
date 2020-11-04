package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class r8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f4976b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f4977c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f4978d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ int f4979e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f4980f = false;
    private final /* synthetic */ zzbes g;

    r8(zzbes zzbes, String str, String str2, int i, int i2, boolean z) {
        this.g = zzbes;
        this.f4976b = str;
        this.f4977c = str2;
        this.f4978d = i;
        this.f4979e = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f4976b);
        hashMap.put("cachedSrc", this.f4977c);
        hashMap.put("bytesLoaded", Integer.toString(this.f4978d));
        hashMap.put("totalBytes", Integer.toString(this.f4979e));
        hashMap.put("cacheReady", this.f4980f ? "1" : "0");
        this.g.m("onPrecacheEvent", hashMap);
    }
}
