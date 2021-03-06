package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzff extends zzcu<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public Long f8865b;

    /* renamed from: c  reason: collision with root package name */
    public Long f8866c;

    /* renamed from: d  reason: collision with root package name */
    public Long f8867d;

    /* renamed from: e  reason: collision with root package name */
    public Long f8868e;

    public zzff() {
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f8865b);
        hashMap.put(1, this.f8866c);
        hashMap.put(2, this.f8867d);
        hashMap.put(3, this.f8868e);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void c(String str) {
        HashMap a2 = zzcu.a(str);
        if (a2 != null) {
            this.f8865b = (Long) a2.get(0);
            this.f8866c = (Long) a2.get(1);
            this.f8867d = (Long) a2.get(2);
            this.f8868e = (Long) a2.get(3);
        }
    }

    public zzff(String str) {
        c(str);
    }
}
