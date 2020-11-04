package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class rc0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f4992a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f4993b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f4994c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4995d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f4996e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f4997f;

    public rc0(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z = true;
        zzpb.a(iArr.length == jArr2.length);
        zzpb.a(jArr.length == jArr2.length);
        zzpb.a(iArr2.length != jArr2.length ? false : z);
        this.f4993b = jArr;
        this.f4994c = iArr;
        this.f4995d = i;
        this.f4996e = jArr2;
        this.f4997f = iArr2;
        this.f4992a = jArr.length;
    }

    public final int a(long j) {
        for (int b2 = zzpo.b(this.f4996e, j, true, false); b2 >= 0; b2--) {
            if ((this.f4997f[b2] & 1) != 0) {
                return b2;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int h = zzpo.h(this.f4996e, j, true, false); h < this.f4996e.length; h++) {
            if ((this.f4997f[h] & 1) != 0) {
                return h;
            }
        }
        return -1;
    }
}
