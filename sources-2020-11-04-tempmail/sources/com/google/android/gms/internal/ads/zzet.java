package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzet extends zzcu<Integer, Object> {

    /* renamed from: b  reason: collision with root package name */
    public Long f8848b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f8849c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f8850d;

    public zzet() {
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Object> b() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f8848b);
        hashMap.put(1, this.f8849c);
        hashMap.put(2, this.f8850d);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void c(String str) {
        HashMap a2 = zzcu.a(str);
        if (a2 != null) {
            this.f8848b = (Long) a2.get(0);
            this.f8849c = (Boolean) a2.get(1);
            this.f8850d = (Boolean) a2.get(2);
        }
    }

    public zzet(String str) {
        c(str);
    }
}
