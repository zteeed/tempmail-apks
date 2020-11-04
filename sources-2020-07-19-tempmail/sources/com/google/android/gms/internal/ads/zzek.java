package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzek extends zzcu<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public long f8627b;

    /* renamed from: c  reason: collision with root package name */
    public long f8628c;

    public zzek() {
        this.f8627b = -1;
        this.f8628c = -1;
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.f8627b));
        hashMap.put(1, Long.valueOf(this.f8628c));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void c(String str) {
        HashMap a2 = zzcu.a(str);
        if (a2 != null) {
            this.f8627b = ((Long) a2.get(0)).longValue();
            this.f8628c = ((Long) a2.get(1)).longValue();
        }
    }

    public zzek(String str) {
        this();
        c(str);
    }
}
