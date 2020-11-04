package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class r8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f4793b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f4794c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f4795d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ int f4796e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f4797f = false;
    private final /* synthetic */ zzbes g;

    r8(zzbes zzbes, String str, String str2, int i, int i2, boolean z) {
        this.g = zzbes;
        this.f4793b = str;
        this.f4794c = str2;
        this.f4795d = i;
        this.f4796e = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f4793b);
        hashMap.put("cachedSrc", this.f4794c);
        hashMap.put("bytesLoaded", Integer.toString(this.f4795d));
        hashMap.put("totalBytes", Integer.toString(this.f4796e));
        hashMap.put("cacheReady", this.f4797f ? "1" : "0");
        this.g.m("onPrecacheEvent", hashMap);
    }
}
