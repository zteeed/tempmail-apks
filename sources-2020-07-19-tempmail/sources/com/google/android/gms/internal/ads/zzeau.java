package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public enum zzeau implements zzegg {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f8461b;

    private zzeau(int i2) {
        this.f8461b = i2;
    }

    public static zzeau f(int i2) {
        if (i2 == 0) {
            return UNKNOWN_CURVE;
        }
        if (i2 == 2) {
            return NIST_P256;
        }
        if (i2 == 3) {
            return NIST_P384;
        }
        if (i2 == 4) {
            return NIST_P521;
        }
        if (i2 != 5) {
            return null;
        }
        return CURVE25519;
    }

    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f8461b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzeau.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(i());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
