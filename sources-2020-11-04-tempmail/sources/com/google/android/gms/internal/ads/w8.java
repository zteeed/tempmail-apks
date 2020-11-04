package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class w8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5377b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5378c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f5379d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f5380e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzbes f5381f;

    w8(zzbes zzbes, String str, String str2, String str3, String str4) {
        this.f5381f = zzbes;
        this.f5377b = str;
        this.f5378c = str2;
        this.f5379d = str3;
        this.f5380e = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f5377b);
        if (!TextUtils.isEmpty(this.f5378c)) {
            hashMap.put("cachedSrc", this.f5378c);
        }
        hashMap.put("type", zzbes.x(this.f5379d));
        hashMap.put("reason", this.f5379d);
        if (!TextUtils.isEmpty(this.f5380e)) {
            hashMap.put("message", this.f5380e);
        }
        this.f5381f.m("onPrecacheEvent", hashMap);
    }
}
