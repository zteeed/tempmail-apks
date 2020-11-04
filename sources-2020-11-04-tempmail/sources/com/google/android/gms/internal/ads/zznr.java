package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zznr {

    /* renamed from: d  reason: collision with root package name */
    public static final zznr f9095d = new zznr(new zzno[0]);

    /* renamed from: a  reason: collision with root package name */
    public final int f9096a;

    /* renamed from: b  reason: collision with root package name */
    private final zzno[] f9097b;

    /* renamed from: c  reason: collision with root package name */
    private int f9098c;

    public zznr(zzno... zznoArr) {
        this.f9097b = zznoArr;
        this.f9096a = zznoArr.length;
    }

    public final int a(zzno zzno) {
        for (int i = 0; i < this.f9096a; i++) {
            if (this.f9097b[i] == zzno) {
                return i;
            }
        }
        return -1;
    }

    public final zzno b(int i) {
        return this.f9097b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zznr.class == obj.getClass()) {
            zznr zznr = (zznr) obj;
            return this.f9096a == zznr.f9096a && Arrays.equals(this.f9097b, zznr.f9097b);
        }
    }

    public final int hashCode() {
        if (this.f9098c == 0) {
            this.f9098c = Arrays.hashCode(this.f9097b);
        }
        return this.f9098c;
    }
}
