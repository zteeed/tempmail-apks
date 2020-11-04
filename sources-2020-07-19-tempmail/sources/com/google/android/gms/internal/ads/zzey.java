package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzey extends zzcu<Integer, Long> {

    /* renamed from: b  reason: collision with root package name */
    public Long f8675b;

    /* renamed from: c  reason: collision with root package name */
    public Long f8676c;

    public zzey() {
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f8675b);
        hashMap.put(1, this.f8676c);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void c(String str) {
        HashMap a2 = zzcu.a(str);
        if (a2 != null) {
            this.f8675b = (Long) a2.get(0);
            this.f8676c = (Long) a2.get(1);
        }
    }

    public zzey(String str) {
        c(str);
    }
}
