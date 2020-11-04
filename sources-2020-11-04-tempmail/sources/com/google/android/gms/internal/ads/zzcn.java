package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public enum zzcn implements zzegg {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f7450b;

    private zzcn(int i) {
        this.f7450b = i;
    }

    public static zzcn f(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i == 2) {
            return ENUM_FAILURE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static zzegi g() {
        return mm.f4590a;
    }

    public final int i() {
        return this.f7450b;
    }

    public final String toString() {
        return "<" + zzcn.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7450b + " name=" + name() + '>';
    }
}
