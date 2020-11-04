package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public enum zzcm implements zzegg {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4),
    DG_XTEA(5);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f7237b;

    private zzcm(int i2) {
        this.f7237b = i2;
    }

    public static zzcm f(int i2) {
        if (i2 == 0) {
            return UNKNOWN_ENCRYPTION_METHOD;
        }
        if (i2 == 1) {
            return BITSLICER;
        }
        if (i2 == 2) {
            return TINK_HYBRID;
        }
        if (i2 == 3) {
            return UNENCRYPTED;
        }
        if (i2 == 4) {
            return DG;
        }
        if (i2 != 5) {
            return null;
        }
        return DG_XTEA;
    }

    public static zzegi g() {
        return vl.f5156a;
    }

    public final int i() {
        return this.f7237b;
    }

    public final String toString() {
        return "<" + zzcm.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7237b + " name=" + name() + '>';
    }
}
