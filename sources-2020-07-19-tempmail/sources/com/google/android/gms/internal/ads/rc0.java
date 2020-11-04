package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class rc0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f4809a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f4810b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f4811c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4812d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f4813e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f4814f;

    public rc0(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z = true;
        zzpb.a(iArr.length == jArr2.length);
        zzpb.a(jArr.length == jArr2.length);
        zzpb.a(iArr2.length != jArr2.length ? false : z);
        this.f4810b = jArr;
        this.f4811c = iArr;
        this.f4812d = i;
        this.f4813e = jArr2;
        this.f4814f = iArr2;
        this.f4809a = jArr.length;
    }

    public final int a(long j) {
        for (int b2 = zzpo.b(this.f4813e, j, true, false); b2 >= 0; b2--) {
            if ((this.f4814f[b2] & 1) != 0) {
                return b2;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int h = zzpo.h(this.f4813e, j, true, false); h < this.f4813e.length; h++) {
            if ((this.f4814f[h] & 1) != 0) {
                return h;
            }
        }
        return -1;
    }
}
