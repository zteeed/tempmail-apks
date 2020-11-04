package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public enum zzeav implements zzegg {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f8649b;

    private zzeav(int i2) {
        this.f8649b = i2;
    }

    public static zzeav f(int i2) {
        if (i2 == 0) {
            return UNKNOWN_HASH;
        }
        if (i2 == 1) {
            return SHA1;
        }
        if (i2 == 2) {
            return SHA384;
        }
        if (i2 == 3) {
            return SHA256;
        }
        if (i2 != 4) {
            return null;
        }
        return SHA512;
    }

    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f8649b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzeav.class.getName());
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
