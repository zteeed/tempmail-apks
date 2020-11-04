package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzkh {

    /* renamed from: a  reason: collision with root package name */
    public final int f8996a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f8997b;

    public zzkh(int i, byte[] bArr) {
        this.f8997b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkh.class == obj.getClass()) {
            zzkh zzkh = (zzkh) obj;
            return this.f8996a == zzkh.f8996a && Arrays.equals(this.f8997b, zzkh.f8997b);
        }
    }

    public final int hashCode() {
        return (this.f8996a * 31) + Arrays.hashCode(this.f8997b);
    }
}
