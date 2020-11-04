package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public enum zziu {
    DOUBLE(zzjb.DOUBLE, 1),
    FLOAT(zzjb.FLOAT, 5),
    INT64(zzjb.LONG, 0),
    UINT64(zzjb.LONG, 0),
    INT32(zzjb.INT, 0),
    FIXED64(zzjb.LONG, 1),
    FIXED32(zzjb.INT, 5),
    BOOL(zzjb.BOOLEAN, 0),
    STRING(zzjb.STRING, 2),
    GROUP(zzjb.MESSAGE, 3),
    MESSAGE(zzjb.MESSAGE, 2),
    BYTES(zzjb.BYTE_STRING, 2),
    UINT32(zzjb.INT, 0),
    ENUM(zzjb.ENUM, 0),
    SFIXED32(zzjb.INT, 5),
    SFIXED64(zzjb.LONG, 1),
    SINT32(zzjb.INT, 0),
    SINT64(zzjb.LONG, 0);
    

    /* renamed from: b  reason: collision with root package name */
    private final zzjb f9850b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9851c;

    private zziu(zzjb zzjb, int i) {
        this.f9850b = zzjb;
        this.f9851c = i;
    }

    public final zzjb f() {
        return this.f9850b;
    }

    public final int g() {
        return this.f9851c;
    }
}
