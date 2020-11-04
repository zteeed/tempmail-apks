package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public enum zzcb implements zzegg {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f6965b;

    private zzcb(int i) {
        this.f6965b = i;
    }

    public static zzcb f(int i) {
        if (i == 0) {
            return ENUM_SIGNAL_SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        if (i == 2) {
            return ENUM_SIGNAL_SOURCE_ADSHIELD;
        }
        if (i == 3) {
            return ENUM_SIGNAL_SOURCE_GASS;
        }
        if (i != 4) {
            return null;
        }
        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
    }

    public static zzegi g() {
        return xg.f5492a;
    }

    public final int i() {
        return this.f6965b;
    }

    public final String toString() {
        return "<" + zzcb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f6965b + " name=" + name() + '>';
    }
}
