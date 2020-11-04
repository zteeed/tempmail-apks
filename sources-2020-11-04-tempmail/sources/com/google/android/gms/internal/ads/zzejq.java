package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public enum zzejq {
    DOUBLE(zzejt.DOUBLE, 1),
    FLOAT(zzejt.FLOAT, 5),
    INT64(zzejt.LONG, 0),
    UINT64(zzejt.LONG, 0),
    INT32(zzejt.INT, 0),
    FIXED64(zzejt.LONG, 1),
    FIXED32(zzejt.INT, 5),
    BOOL(zzejt.BOOLEAN, 0),
    STRING(zzejt.STRING, 2),
    GROUP(zzejt.MESSAGE, 3),
    MESSAGE(zzejt.MESSAGE, 2),
    BYTES(zzejt.BYTE_STRING, 2),
    UINT32(zzejt.INT, 0),
    ENUM(zzejt.ENUM, 0),
    SFIXED32(zzejt.INT, 5),
    SFIXED64(zzejt.LONG, 1),
    SINT32(zzejt.INT, 0),
    SINT64(zzejt.LONG, 0);
    

    /* renamed from: b  reason: collision with root package name */
    private final zzejt f8784b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8785c;

    private zzejq(zzejt zzejt, int i) {
        this.f8784b = zzejt;
        this.f8785c = i;
    }

    public final zzejt f() {
        return this.f8784b;
    }

    public final int g() {
        return this.f8785c;
    }
}
