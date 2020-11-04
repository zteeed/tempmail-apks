package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class jc0 implements ec0 {

    /* renamed from: a  reason: collision with root package name */
    private final zzpi f4127a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4128b = this.f4127a.v();

    /* renamed from: c  reason: collision with root package name */
    private final int f4129c = (this.f4127a.v() & 255);

    /* renamed from: d  reason: collision with root package name */
    private int f4130d;

    /* renamed from: e  reason: collision with root package name */
    private int f4131e;

    public jc0(dc0 dc0) {
        zzpi zzpi = dc0.P0;
        this.f4127a = zzpi;
        zzpi.l(12);
    }

    public final int a() {
        int i = this.f4129c;
        if (i == 8) {
            return this.f4127a.g();
        }
        if (i == 16) {
            return this.f4127a.h();
        }
        int i2 = this.f4130d;
        this.f4130d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f4131e & 15;
        }
        int g = this.f4127a.g();
        this.f4131e = g;
        return (g & 240) >> 4;
    }

    public final boolean b() {
        return false;
    }

    public final int c() {
        return this.f4128b;
    }
}
