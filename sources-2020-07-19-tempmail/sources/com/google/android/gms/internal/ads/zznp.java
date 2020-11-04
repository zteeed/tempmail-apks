package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zznp extends zzia {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f8907e = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final long f8908b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8909c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8910d;

    public zznp(long j, boolean z) {
        this(j, j, 0, 0, z, false);
    }

    public final zzib d(int i, zzib zzib, boolean z, long j) {
        zzpb.g(i, 0, 1);
        boolean z2 = this.f8910d;
        long j2 = this.f8909c;
        zzib.f8745a = null;
        zzib.f8746b = -9223372036854775807L;
        zzib.f8747c = -9223372036854775807L;
        zzib.f8748d = z2;
        zzib.f8749e = false;
        zzib.h = 0;
        zzib.i = j2;
        zzib.f8750f = 0;
        zzib.g = 0;
        zzib.j = 0;
        return zzib;
    }

    public final zzic e(int i, zzic zzic, boolean z) {
        zzpb.g(i, 0, 1);
        Object obj = z ? f8907e : null;
        zzic.a(obj, obj, 0, this.f8908b, 0, false);
        return zzic;
    }

    public final int f(Object obj) {
        return f8907e.equals(obj) ? 0 : -1;
    }

    public final int g() {
        return 1;
    }

    public final int h() {
        return 1;
    }

    private zznp(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f8908b = j;
        this.f8909c = j2;
        this.f8910d = z;
    }
}
