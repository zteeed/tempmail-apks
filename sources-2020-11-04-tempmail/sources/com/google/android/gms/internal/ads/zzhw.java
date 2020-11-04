package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzhw {

    /* renamed from: d  reason: collision with root package name */
    public static final zzhw f8921d = new zzhw(1.0f, 1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f8922a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8923b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8924c;

    public zzhw(float f2, float f3) {
        this.f8922a = f2;
        this.f8923b = f3;
        this.f8924c = Math.round(f2 * 1000.0f);
    }

    public final long a(long j) {
        return j * ((long) this.f8924c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhw.class == obj.getClass()) {
            zzhw zzhw = (zzhw) obj;
            return this.f8922a == zzhw.f8922a && this.f8923b == zzhw.f8923b;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f8922a) + 527) * 31) + Float.floatToRawIntBits(this.f8923b);
    }
}
