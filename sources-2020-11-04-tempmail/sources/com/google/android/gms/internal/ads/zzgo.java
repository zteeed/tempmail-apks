package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public enum zzgo implements zzegg {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f8892b;

    private zzgo(int i) {
        this.f8892b = i;
    }

    public final int i() {
        return this.f8892b;
    }

    public final String toString() {
        return "<" + zzgo.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8892b + " name=" + name() + '>';
    }
}
