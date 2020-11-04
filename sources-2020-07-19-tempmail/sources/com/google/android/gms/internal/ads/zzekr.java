package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzekr {
    public static final zzekr j = new zzekr(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzekr k = new zzekr(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzekr l = new zzekr(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzekr m = new zzekr(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a  reason: collision with root package name */
    private final double f8644a;

    /* renamed from: b  reason: collision with root package name */
    private final double f8645b;

    /* renamed from: c  reason: collision with root package name */
    private final double f8646c;

    /* renamed from: d  reason: collision with root package name */
    private final double f8647d;

    /* renamed from: e  reason: collision with root package name */
    private final double f8648e;

    /* renamed from: f  reason: collision with root package name */
    private final double f8649f;
    private final double g;
    private final double h;
    private final double i;

    private zzekr(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.f8644a = d6;
        this.f8645b = d7;
        this.f8646c = d8;
        this.f8647d = d2;
        this.f8648e = d3;
        this.f8649f = d4;
        this.g = d5;
        this.h = d9;
        this.i = d10;
    }

    public static zzekr a(ByteBuffer byteBuffer) {
        double e2 = zzbq.e(byteBuffer);
        double e3 = zzbq.e(byteBuffer);
        double f2 = zzbq.f(byteBuffer);
        return new zzekr(e2, e3, zzbq.e(byteBuffer), zzbq.e(byteBuffer), f2, zzbq.f(byteBuffer), zzbq.f(byteBuffer), zzbq.e(byteBuffer), zzbq.e(byteBuffer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzekr.class != obj.getClass()) {
            return false;
        }
        zzekr zzekr = (zzekr) obj;
        return Double.compare(zzekr.f8647d, this.f8647d) == 0 && Double.compare(zzekr.f8648e, this.f8648e) == 0 && Double.compare(zzekr.f8649f, this.f8649f) == 0 && Double.compare(zzekr.g, this.g) == 0 && Double.compare(zzekr.h, this.h) == 0 && Double.compare(zzekr.i, this.i) == 0 && Double.compare(zzekr.f8644a, this.f8644a) == 0 && Double.compare(zzekr.f8645b, this.f8645b) == 0 && Double.compare(zzekr.f8646c, this.f8646c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f8644a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f8645b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f8646c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f8647d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f8648e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f8649f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(j)) {
            return "Rotate 0°";
        }
        if (equals(k)) {
            return "Rotate 90°";
        }
        if (equals(l)) {
            return "Rotate 180°";
        }
        if (equals(m)) {
            return "Rotate 270°";
        }
        double d2 = this.f8644a;
        double d3 = this.f8645b;
        double d4 = this.f8646c;
        double d5 = this.f8647d;
        double d6 = this.f8648e;
        double d7 = this.f8649f;
        double d8 = this.g;
        double d9 = this.h;
        double d10 = this.i;
        double d11 = d8;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d2);
        sb.append(", v=");
        sb.append(d3);
        sb.append(", w=");
        sb.append(d4);
        sb.append(", a=");
        sb.append(d5);
        sb.append(", b=");
        sb.append(d6);
        sb.append(", c=");
        sb.append(d7);
        sb.append(", d=");
        sb.append(d11);
        sb.append(", tx=");
        sb.append(d9);
        sb.append(", ty=");
        sb.append(d10);
        sb.append("}");
        return sb.toString();
    }
}
