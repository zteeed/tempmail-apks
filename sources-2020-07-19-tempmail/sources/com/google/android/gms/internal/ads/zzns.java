package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzns implements zzod {

    /* renamed from: a  reason: collision with root package name */
    private final zzno f8916a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8917b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f8918c;

    /* renamed from: d  reason: collision with root package name */
    private final zzhq[] f8919d;

    /* renamed from: e  reason: collision with root package name */
    private int f8920e;

    public zzns(zzno zzno, int... iArr) {
        int i = 0;
        zzpb.e(iArr.length > 0);
        zzpb.d(zzno);
        this.f8916a = zzno;
        int length = iArr.length;
        this.f8917b = length;
        this.f8919d = new zzhq[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f8919d[i2] = zzno.a(iArr[i2]);
        }
        Arrays.sort(this.f8919d, new od0());
        this.f8918c = new int[this.f8917b];
        while (true) {
            int i3 = this.f8917b;
            if (i < i3) {
                this.f8918c[i] = zzno.b(this.f8919d[i]);
                i++;
            } else {
                long[] jArr = new long[i3];
                return;
            }
        }
    }

    public final int a(int i) {
        return this.f8918c[0];
    }

    public final zzhq b(int i) {
        return this.f8919d[i];
    }

    public final zzno c() {
        return this.f8916a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzns zzns = (zzns) obj;
            return this.f8916a == zzns.f8916a && Arrays.equals(this.f8918c, zzns.f8918c);
        }
    }

    public int hashCode() {
        if (this.f8920e == 0) {
            this.f8920e = (System.identityHashCode(this.f8916a) * 31) + Arrays.hashCode(this.f8918c);
        }
        return this.f8920e;
    }

    public final int length() {
        return this.f8918c.length;
    }
}
