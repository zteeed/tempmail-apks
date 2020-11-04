package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public enum zzui implements zzegg {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f9168b;

    private zzui(int i) {
        this.f9168b = i;
    }

    public static zzui f(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static zzegi g() {
        return tf0.f4983a;
    }

    public final int i() {
        return this.f9168b;
    }

    public final String toString() {
        return "<" + zzui.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f9168b + " name=" + name() + '>';
    }
}
