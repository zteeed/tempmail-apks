package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class fc0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f3967a;

    /* renamed from: b  reason: collision with root package name */
    public int f3968b;

    /* renamed from: c  reason: collision with root package name */
    public int f3969c;

    /* renamed from: d  reason: collision with root package name */
    public long f3970d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3971e;

    /* renamed from: f  reason: collision with root package name */
    private final zzpi f3972f;
    private final zzpi g;
    private int h;
    private int i;

    public fc0(zzpi zzpi, zzpi zzpi2, boolean z) {
        this.g = zzpi;
        this.f3972f = zzpi2;
        this.f3971e = z;
        zzpi2.l(12);
        this.f3967a = zzpi2.v();
        zzpi.l(12);
        this.i = zzpi.v();
        zzpb.f(zzpi.d() != 1 ? false : true, "first_chunk must be 1");
        this.f3968b = -1;
    }

    public final boolean a() {
        long j;
        int i2 = this.f3968b + 1;
        this.f3968b = i2;
        if (i2 == this.f3967a) {
            return false;
        }
        if (this.f3971e) {
            j = this.f3972f.w();
        } else {
            j = this.f3972f.s();
        }
        this.f3970d = j;
        if (this.f3968b == this.h) {
            this.f3969c = this.g.v();
            this.g.m(4);
            int i3 = this.i - 1;
            this.i = i3;
            this.h = i3 > 0 ? this.g.v() - 1 : -1;
        }
        return true;
    }
}
