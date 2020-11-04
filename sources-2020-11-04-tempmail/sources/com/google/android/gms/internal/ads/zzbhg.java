package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbhg {

    /* renamed from: a  reason: collision with root package name */
    private final int f6432a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6433b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6434c;

    private zzbhg(int i, int i2, int i3) {
        this.f6432a = i;
        this.f6434c = i2;
        this.f6433b = i3;
    }

    public static zzbhg b() {
        return new zzbhg(0, 0, 0);
    }

    public static zzbhg c() {
        return new zzbhg(4, 0, 0);
    }

    public static zzbhg d() {
        return new zzbhg(5, 0, 0);
    }

    public static zzbhg i(zzvh zzvh) {
        if (zzvh.f9375e) {
            return new zzbhg(3, 0, 0);
        }
        if (zzvh.j) {
            return new zzbhg(2, 0, 0);
        }
        if (zzvh.i) {
            return b();
        }
        return j(zzvh.g, zzvh.f9374d);
    }

    public static zzbhg j(int i, int i2) {
        return new zzbhg(1, i, i2);
    }

    public final boolean a() {
        return this.f6432a == 2;
    }

    public final boolean e() {
        return this.f6432a == 3;
    }

    public final boolean f() {
        return this.f6432a == 0;
    }

    public final boolean g() {
        return this.f6432a == 4;
    }

    public final boolean h() {
        return this.f6432a == 5;
    }
}
