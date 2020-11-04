package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class jc0 implements ec0 {

    /* renamed from: a  reason: collision with root package name */
    private final zzpi f4310a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4311b = this.f4310a.v();

    /* renamed from: c  reason: collision with root package name */
    private final int f4312c = (this.f4310a.v() & 255);

    /* renamed from: d  reason: collision with root package name */
    private int f4313d;

    /* renamed from: e  reason: collision with root package name */
    private int f4314e;

    public jc0(dc0 dc0) {
        zzpi zzpi = dc0.P0;
        this.f4310a = zzpi;
        zzpi.l(12);
    }

    public final int a() {
        int i = this.f4312c;
        if (i == 8) {
            return this.f4310a.g();
        }
        if (i == 16) {
            return this.f4310a.h();
        }
        int i2 = this.f4313d;
        this.f4313d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f4314e & 15;
        }
        int g = this.f4310a.g();
        this.f4314e = g;
        return (g & 240) >> 4;
    }

    public final boolean b() {
        return false;
    }

    public final int c() {
        return this.f4311b;
    }
}
