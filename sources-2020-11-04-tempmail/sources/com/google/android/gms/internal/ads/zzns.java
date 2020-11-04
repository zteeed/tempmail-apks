package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzns implements zzod {

    /* renamed from: a  reason: collision with root package name */
    private final zzno f9099a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9100b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f9101c;

    /* renamed from: d  reason: collision with root package name */
    private final zzhq[] f9102d;

    /* renamed from: e  reason: collision with root package name */
    private int f9103e;

    public zzns(zzno zzno, int... iArr) {
        int i = 0;
        zzpb.e(iArr.length > 0);
        zzpb.d(zzno);
        this.f9099a = zzno;
        int length = iArr.length;
        this.f9100b = length;
        this.f9102d = new zzhq[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f9102d[i2] = zzno.a(iArr[i2]);
        }
        Arrays.sort(this.f9102d, new od0());
        this.f9101c = new int[this.f9100b];
        while (true) {
            int i3 = this.f9100b;
            if (i < i3) {
                this.f9101c[i] = zzno.b(this.f9102d[i]);
                i++;
            } else {
                long[] jArr = new long[i3];
                return;
            }
        }
    }

    public final int a(int i) {
        return this.f9101c[0];
    }

    public final zzhq b(int i) {
        return this.f9102d[i];
    }

    public final zzno c() {
        return this.f9099a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzns zzns = (zzns) obj;
            return this.f9099a == zzns.f9099a && Arrays.equals(this.f9101c, zzns.f9101c);
        }
    }

    public int hashCode() {
        if (this.f9103e == 0) {
            this.f9103e = (System.identityHashCode(this.f9099a) * 31) + Arrays.hashCode(this.f9101c);
        }
        return this.f9103e;
    }

    public final int length() {
        return this.f9101c.length;
    }
}
