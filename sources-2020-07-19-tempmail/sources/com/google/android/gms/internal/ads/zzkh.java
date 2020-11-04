package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzkh {

    /* renamed from: a  reason: collision with root package name */
    public final int f8813a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f8814b;

    public zzkh(int i, byte[] bArr) {
        this.f8814b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkh.class == obj.getClass()) {
            zzkh zzkh = (zzkh) obj;
            return this.f8813a == zzkh.f8813a && Arrays.equals(this.f8814b, zzkh.f8814b);
        }
    }

    public final int hashCode() {
        return (this.f8813a * 31) + Arrays.hashCode(this.f8814b);
    }
}
