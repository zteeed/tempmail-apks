package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzhw {

    /* renamed from: d  reason: collision with root package name */
    public static final zzhw f8738d = new zzhw(1.0f, 1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f8739a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8740b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8741c;

    public zzhw(float f2, float f3) {
        this.f8739a = f2;
        this.f8740b = f3;
        this.f8741c = Math.round(f2 * 1000.0f);
    }

    public final long a(long j) {
        return j * ((long) this.f8741c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhw.class == obj.getClass()) {
            zzhw zzhw = (zzhw) obj;
            return this.f8739a == zzhw.f8739a && this.f8740b == zzhw.f8740b;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f8739a) + 527) * 31) + Float.floatToRawIntBits(this.f8740b);
    }
}
