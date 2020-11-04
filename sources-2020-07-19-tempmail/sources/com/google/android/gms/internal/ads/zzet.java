package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzet extends zzcu<Integer, Object> {

    /* renamed from: b  reason: collision with root package name */
    public Long f8665b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f8666c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f8667d;

    public zzet() {
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Object> b() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f8665b);
        hashMap.put(1, this.f8666c);
        hashMap.put(2, this.f8667d);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void c(String str) {
        HashMap a2 = zzcu.a(str);
        if (a2 != null) {
            this.f8665b = (Long) a2.get(0);
            this.f8666c = (Boolean) a2.get(1);
            this.f8667d = (Boolean) a2.get(2);
        }
    }

    public zzet(String str) {
        c(str);
    }
}
