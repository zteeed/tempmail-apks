package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public enum zzcs implements zzegg {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f7437b;

    private zzcs(int i) {
        this.f7437b = i;
    }

    public static zzcs f(int i) {
        if (i == 0) {
            return UNKNOWN_PROTO;
        }
        if (i == 1) {
            return AFMA_SIGNALS;
        }
        if (i == 2) {
            return UNITY_SIGNALS;
        }
        if (i != 3) {
            return null;
        }
        return PARTNER_SIGNALS;
    }

    public static zzegi g() {
        return no.f4500a;
    }

    public final int i() {
        return this.f7437b;
    }

    public final String toString() {
        return "<" + zzcs.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7437b + " name=" + name() + '>';
    }
}
