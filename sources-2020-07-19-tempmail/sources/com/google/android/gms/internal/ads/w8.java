package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class w8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5194b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5195c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f5196d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f5197e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzbes f5198f;

    w8(zzbes zzbes, String str, String str2, String str3, String str4) {
        this.f5198f = zzbes;
        this.f5194b = str;
        this.f5195c = str2;
        this.f5196d = str3;
        this.f5197e = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f5194b);
        if (!TextUtils.isEmpty(this.f5195c)) {
            hashMap.put("cachedSrc", this.f5195c);
        }
        hashMap.put("type", zzbes.x(this.f5196d));
        hashMap.put("reason", this.f5196d);
        if (!TextUtils.isEmpty(this.f5197e)) {
            hashMap.put("message", this.f5197e);
        }
        this.f5198f.m("onPrecacheEvent", hashMap);
    }
}
