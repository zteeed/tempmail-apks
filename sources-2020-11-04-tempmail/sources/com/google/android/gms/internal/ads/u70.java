package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class u70 implements g70 {

    /* renamed from: a  reason: collision with root package name */
    private final zzehl f5222a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5223b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f5224c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5225d;

    u70(zzehl zzehl, String str, Object[] objArr) {
        this.f5222a = zzehl;
        this.f5223b = str;
        this.f5224c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5225d = charAt;
            return;
        }
        char c2 = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c2 |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f5225d = c2 | (charAt2 << i);
                return;
            }
        }
    }

    public final int a() {
        return (this.f5225d & 1) == 1 ? zzegb.zze.i : zzegb.zze.j;
    }

    public final boolean b() {
        return (this.f5225d & 2) == 2;
    }

    public final zzehl c() {
        return this.f5222a;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return this.f5223b;
    }

    /* access modifiers changed from: package-private */
    public final Object[] e() {
        return this.f5224c;
    }
}
