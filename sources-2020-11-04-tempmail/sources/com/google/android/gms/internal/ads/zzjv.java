package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzjv implements zzkc {

    /* renamed from: a  reason: collision with root package name */
    private final int f8987a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f8988b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f8989c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8990d;

    public zzjv(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f8988b = jArr;
        this.f8989c = jArr3;
        int length = iArr.length;
        this.f8987a = length;
        if (length > 0) {
            this.f8990d = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f8990d = 0;
        }
    }

    public final boolean b() {
        return true;
    }

    public final long d(long j) {
        return this.f8988b[zzpo.b(this.f8989c, j, true, true)];
    }

    public final long g() {
        return this.f8990d;
    }
}
