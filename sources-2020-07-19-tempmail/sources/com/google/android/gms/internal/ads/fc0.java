package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class fc0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f3784a;

    /* renamed from: b  reason: collision with root package name */
    public int f3785b;

    /* renamed from: c  reason: collision with root package name */
    public int f3786c;

    /* renamed from: d  reason: collision with root package name */
    public long f3787d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3788e;

    /* renamed from: f  reason: collision with root package name */
    private final zzpi f3789f;
    private final zzpi g;
    private int h;
    private int i;

    public fc0(zzpi zzpi, zzpi zzpi2, boolean z) {
        this.g = zzpi;
        this.f3789f = zzpi2;
        this.f3788e = z;
        zzpi2.l(12);
        this.f3784a = zzpi2.v();
        zzpi.l(12);
        this.i = zzpi.v();
        zzpb.f(zzpi.d() != 1 ? false : true, "first_chunk must be 1");
        this.f3785b = -1;
    }

    public final boolean a() {
        long j;
        int i2 = this.f3785b + 1;
        this.f3785b = i2;
        if (i2 == this.f3784a) {
            return false;
        }
        if (this.f3788e) {
            j = this.f3789f.w();
        } else {
            j = this.f3789f.s();
        }
        this.f3787d = j;
        if (this.f3785b == this.h) {
            this.f3786c = this.g.v();
            this.g.m(4);
            int i3 = this.i - 1;
            this.i = i3;
            this.h = i3 > 0 ? this.g.v() - 1 : -1;
        }
        return true;
    }
}
