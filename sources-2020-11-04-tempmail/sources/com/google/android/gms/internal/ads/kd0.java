package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class kd0 implements zzmy, zzmz {

    /* renamed from: b  reason: collision with root package name */
    public final zzmz[] f4390b;

    /* renamed from: c  reason: collision with root package name */
    private final IdentityHashMap<zznk, Integer> f4391c = new IdentityHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private zzmy f4392d;

    /* renamed from: e  reason: collision with root package name */
    private int f4393e;

    /* renamed from: f  reason: collision with root package name */
    private zznr f4394f;
    private zzmz[] g;
    private zznn h;

    public kd0(zzmz... zzmzArr) {
        this.f4390b = zzmzArr;
    }

    public final long a() {
        return this.h.a();
    }

    public final boolean b(long j) {
        return this.h.b(j);
    }

    public final void c(zzmz zzmz) {
        int i = this.f4393e - 1;
        this.f4393e = i;
        if (i <= 0) {
            int i2 = 0;
            for (zzmz q : this.f4390b) {
                i2 += q.q().f9096a;
            }
            zzno[] zznoArr = new zzno[i2];
            int i3 = 0;
            for (zzmz q2 : this.f4390b) {
                zznr q3 = q2.q();
                int i4 = q3.f9096a;
                int i5 = 0;
                while (i5 < i4) {
                    zznoArr[i3] = q3.b(i5);
                    i5++;
                    i3++;
                }
            }
            this.f4394f = new zznr(zznoArr);
            this.f4392d.c(this);
        }
    }

    public final long d(zzod[] zzodArr, boolean[] zArr, zznk[] zznkArr, boolean[] zArr2, long j) {
        int i;
        zzod[] zzodArr2 = zzodArr;
        zznk[] zznkArr2 = zznkArr;
        int[] iArr = new int[zzodArr2.length];
        int[] iArr2 = new int[zzodArr2.length];
        for (int i2 = 0; i2 < zzodArr2.length; i2++) {
            if (zznkArr2[i2] == null) {
                i = -1;
            } else {
                i = this.f4391c.get(zznkArr2[i2]).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            if (zzodArr2[i2] != null) {
                zzno c2 = zzodArr2[i2].c();
                int i3 = 0;
                while (true) {
                    zzmz[] zzmzArr = this.f4390b;
                    if (i3 >= zzmzArr.length) {
                        break;
                    } else if (zzmzArr[i3].q().a(c2) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.f4391c.clear();
        int length = zzodArr2.length;
        zznk[] zznkArr3 = new zznk[length];
        zznk[] zznkArr4 = new zznk[zzodArr2.length];
        zzod[] zzodArr3 = new zzod[zzodArr2.length];
        ArrayList arrayList = new ArrayList(this.f4390b.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.f4390b.length) {
            for (int i5 = 0; i5 < zzodArr2.length; i5++) {
                zzod zzod = null;
                zznkArr4[i5] = iArr[i5] == i4 ? zznkArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    zzod = zzodArr2[i5];
                }
                zzodArr3[i5] = zzod;
            }
            int i6 = i4;
            zzod[] zzodArr4 = zzodArr3;
            ArrayList arrayList2 = arrayList;
            long d2 = this.f4390b[i4].d(zzodArr3, zArr, zznkArr4, zArr2, j2);
            if (i6 == 0) {
                j2 = d2;
            } else if (d2 != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzodArr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    zzpb.e(zznkArr4[i7] != null);
                    zznkArr3[i7] = zznkArr4[i7];
                    this.f4391c.put(zznkArr4[i7], Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (zznkArr4[i7] != null) {
                        z2 = false;
                    }
                    zzpb.e(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f4390b[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zzodArr3 = zzodArr4;
            zznkArr2 = zznkArr;
        }
        zznk[] zznkArr5 = zznkArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zznkArr3, 0, zznkArr5, 0, length);
        zzmz[] zzmzArr2 = new zzmz[arrayList3.size()];
        this.g = zzmzArr2;
        arrayList3.toArray(zzmzArr2);
        this.h = new zzmm(this.g);
        return j2;
    }

    public final /* synthetic */ void e(zznn zznn) {
        if (this.f4394f != null) {
            this.f4392d.e(this);
        }
    }

    public final void g(long j) {
        for (zzmz g2 : this.g) {
            g2.g(j);
        }
    }

    public final long j(long j) {
        long j2 = this.g[0].j(j);
        int i = 1;
        while (true) {
            zzmz[] zzmzArr = this.g;
            if (i >= zzmzArr.length) {
                return j2;
            }
            if (zzmzArr[i].j(j2) == j2) {
                i++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
    }

    public final void l(zzmy zzmy, long j) {
        this.f4392d = zzmy;
        zzmz[] zzmzArr = this.f4390b;
        this.f4393e = zzmzArr.length;
        for (zzmz l : zzmzArr) {
            l.l(this, j);
        }
    }

    public final long m() {
        long m = this.f4390b[0].m();
        int i = 1;
        while (true) {
            zzmz[] zzmzArr = this.f4390b;
            if (i >= zzmzArr.length) {
                if (m != -9223372036854775807L) {
                    zzmz[] zzmzArr2 = this.g;
                    int length = zzmzArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        zzmz zzmz = zzmzArr2[i2];
                        if (zzmz == this.f4390b[0] || zzmz.j(m) == m) {
                            i2++;
                        } else {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return m;
            } else if (zzmzArr[i].m() == -9223372036854775807L) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
    }

    public final long n() {
        long j = Long.MAX_VALUE;
        for (zzmz n : this.g) {
            long n2 = n.n();
            if (n2 != Long.MIN_VALUE) {
                j = Math.min(j, n2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final void o() throws IOException {
        for (zzmz o : this.f4390b) {
            o.o();
        }
    }

    public final zznr q() {
        return this.f4394f;
    }
}
