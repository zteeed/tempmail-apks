package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class v8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5113b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5114c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f5115d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzbes f5116e;

    v8(zzbes zzbes, String str, String str2, int i) {
        this.f5116e = zzbes;
        this.f5113b = str;
        this.f5114c = str2;
        this.f5115d = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f5113b);
        hashMap.put("cachedSrc", this.f5114c);
        hashMap.put("totalBytes", Integer.toString(this.f5115d));
        this.f5116e.m("onPrecacheEvent", hashMap);
    }
}
