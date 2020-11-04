package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzno {

    /* renamed from: a  reason: collision with root package name */
    public final int f8904a;

    /* renamed from: b  reason: collision with root package name */
    private final zzhq[] f8905b;

    /* renamed from: c  reason: collision with root package name */
    private int f8906c;

    public zzno(zzhq... zzhqArr) {
        zzpb.e(zzhqArr.length > 0);
        this.f8905b = zzhqArr;
        this.f8904a = zzhqArr.length;
    }

    public final zzhq a(int i) {
        return this.f8905b[i];
    }

    public final int b(zzhq zzhq) {
        int i = 0;
        while (true) {
            zzhq[] zzhqArr = this.f8905b;
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
            return this.f8904a == zzno.f8904a && Arrays.equals(this.f8905b, zzno.f8905b);
        }
    }

    public final int hashCode() {
        if (this.f8906c == 0) {
            this.f8906c = Arrays.hashCode(this.f8905b) + 527;
        }
        return this.f8906c;
    }
}
