package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zznr {

    /* renamed from: d  reason: collision with root package name */
    public static final zznr f8912d = new zznr(new zzno[0]);

    /* renamed from: a  reason: collision with root package name */
    public final int f8913a;

    /* renamed from: b  reason: collision with root package name */
    private final zzno[] f8914b;

    /* renamed from: c  reason: collision with root package name */
    private int f8915c;

    public zznr(zzno... zznoArr) {
        this.f8914b = zznoArr;
        this.f8913a = zznoArr.length;
    }

    public final int a(zzno zzno) {
        for (int i = 0; i < this.f8913a; i++) {
            if (this.f8914b[i] == zzno) {
                return i;
            }
        }
        return -1;
    }

    public final zzno b(int i) {
        return this.f8914b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zznr.class == obj.getClass()) {
            zznr zznr = (zznr) obj;
            return this.f8913a == zznr.f8913a && Arrays.equals(this.f8914b, zznr.f8914b);
        }
    }

    public final int hashCode() {
        if (this.f8915c == 0) {
            this.f8915c = Arrays.hashCode(this.f8914b);
        }
        return this.f8915c;
    }
}
