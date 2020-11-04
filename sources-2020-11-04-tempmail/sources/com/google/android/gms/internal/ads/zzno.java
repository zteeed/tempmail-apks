package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzno {

    /* renamed from: a  reason: collision with root package name */
    public final int f9087a;

    /* renamed from: b  reason: collision with root package name */
    private final zzhq[] f9088b;

    /* renamed from: c  reason: collision with root package name */
    private int f9089c;

    public zzno(zzhq... zzhqArr) {
        zzpb.e(zzhqArr.length > 0);
        this.f9088b = zzhqArr;
        this.f9087a = zzhqArr.length;
    }

    public final zzhq a(int i) {
        return this.f9088b[i];
    }

    public final int b(zzhq zzhq) {
        int i = 0;
        while (true) {
            zzhq[] zzhqArr = this.f9088b;
            if (i >= zzhqArr.length) {
                return -1;
            }
            if (zzhq == zzhqArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzno.class == obj.getClass()) {
            zzno zzno = (zzno) obj;
            return this.f9087a == zzno.f9087a && Arrays.equals(this.f9088b, zzno.f9088b);
        }
    }

    public final int hashCode() {
        if (this.f9089c == 0) {
            this.f9089c = Arrays.hashCode(this.f9088b) + 527;
        }
        return this.f9089c;
    }
}
