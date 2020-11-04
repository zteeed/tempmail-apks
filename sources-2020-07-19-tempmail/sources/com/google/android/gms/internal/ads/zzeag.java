package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public enum zzeag implements zzegg {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f8456b;

    private zzeag(int i) {
        this.f8456b = i;
    }

    public static zzeag f(int i) {
        if (i == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i == 1) {
            return UNCOMPRESSED;
        }
        if (i == 2) {
            return COMPRESSED;
        }
        if (i != 3) {
            return null;
        }
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    }

    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f8456b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzeag.class.getName());
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
