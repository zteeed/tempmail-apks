package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zznp extends zzia {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f9090e = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final long f9091b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9092c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9093d;

    public zznp(long j, boolean z) {
        this(j, j, 0, 0, z, false);
    }

    public final zzib d(int i, zzib zzib, boolean z, long j) {
        zzpb.g(i, 0, 1);
        boolean z2 = this.f9093d;
        long j2 = this.f9092c;
        zzib.f8928a = null;
        zzib.f8929b = -9223372036854775807L;
        zzib.f8930c = -9223372036854775807L;
        zzib.f8931d = z2;
        zzib.f8932e = false;
        zzib.h = 0;
        zzib.i = j2;
        zzib.f8933f = 0;
        zzib.g = 0;
        zzib.j = 0;
        return zzib;
    }

    public final zzic e(int i, zzic zzic, boolean z) {
        zzpb.g(i, 0, 1);
        Object obj = z ? f9090e : null;
        zzic.a(obj, obj, 0, this.f9091b, 0, false);
        return zzic;
    }

    public final int f(Object obj) {
        return f9090e.equals(obj) ? 0 : -1;
    }

    public final int g() {
        return 1;
    }

    public final int h() {
        return 1;
    }

    private zznp(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f9091b = j;
        this.f9092c = j2;
        this.f9093d = z;
    }
}
