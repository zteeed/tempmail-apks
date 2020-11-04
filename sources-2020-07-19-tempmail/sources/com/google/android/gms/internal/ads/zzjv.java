package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzjv implements zzkc {

    /* renamed from: a  reason: collision with root package name */
    private final int f8804a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f8805b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f8806c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8807d;

    public zzjv(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f8805b = jArr;
        this.f8806c = jArr3;
        int length = iArr.length;
        this.f8804a = length;
        if (length > 0) {
            this.f8807d = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f8807d = 0;
        }
    }

    public final boolean b() {
        return true;
    }

    public final long d(long j) {
        return this.f8805b[zzpo.b(this.f8806c, j, true, true)];
    }

    public final long g() {
        return this.f8807d;
    }
}
