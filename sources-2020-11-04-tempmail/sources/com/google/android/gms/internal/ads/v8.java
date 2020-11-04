package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class v8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5296b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5297c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f5298d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzbes f5299e;

    v8(zzbes zzbes, String str, String str2, int i) {
        this.f5299e = zzbes;
        this.f5296b = str;
        this.f5297c = str2;
        this.f5298d = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f5296b);
        hashMap.put("cachedSrc", this.f5297c);
        hashMap.put("totalBytes", Integer.toString(this.f5298d));
        this.f5299e.m("onPrecacheEvent", hashMap);
    }
}
