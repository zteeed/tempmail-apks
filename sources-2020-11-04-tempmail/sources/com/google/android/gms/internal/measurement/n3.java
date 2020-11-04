package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfo;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class n3 implements z2 {

    /* renamed from: a  reason: collision with root package name */
    private final zzgw f9647a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9648b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f9649c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9650d;

    n3(zzgw zzgw, String str, Object[] objArr) {
        this.f9647a = zzgw;
        this.f9648b = str;
        this.f9649c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f9650d = charAt;
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
                this.f9650d = c2 | (charAt2 << i);
                return;
            }
        }
    }

    public final int a() {
        return (this.f9650d & 1) == 1 ? zzfo.zzf.i : zzfo.zzf.j;
    }

    public final boolean b() {
        return (this.f9650d & 2) == 2;
    }

    public final zzgw c() {
        return this.f9647a;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return this.f9648b;
    }

    /* access modifiers changed from: package-private */
    public final Object[] e() {
        return this.f9649c;
    }
}
