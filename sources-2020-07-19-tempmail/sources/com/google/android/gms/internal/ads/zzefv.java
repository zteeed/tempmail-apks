package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public enum zzefv {
    DOUBLE(0, m60.SCALAR, zzegn.DOUBLE),
    FLOAT(1, m60.SCALAR, zzegn.FLOAT),
    INT64(2, m60.SCALAR, zzegn.LONG),
    UINT64(3, m60.SCALAR, zzegn.LONG),
    INT32(4, m60.SCALAR, zzegn.INT),
    FIXED64(5, m60.SCALAR, zzegn.LONG),
    FIXED32(6, m60.SCALAR, zzegn.INT),
    BOOL(7, m60.SCALAR, zzegn.BOOLEAN),
    STRING(8, m60.SCALAR, zzegn.STRING),
    MESSAGE(9, m60.SCALAR, zzegn.MESSAGE),
    BYTES(10, m60.SCALAR, zzegn.BYTE_STRING),
    UINT32(11, m60.SCALAR, zzegn.INT),
    ENUM(12, m60.SCALAR, zzegn.ENUM),
    SFIXED32(13, m60.SCALAR, zzegn.INT),
    SFIXED64(14, m60.SCALAR, zzegn.LONG),
    SINT32(15, m60.SCALAR, zzegn.INT),
    SINT64(16, m60.SCALAR, zzegn.LONG),
    GROUP(17, m60.SCALAR, zzegn.MESSAGE),
    DOUBLE_LIST(18, m60.VECTOR, zzegn.DOUBLE),
    FLOAT_LIST(19, m60.VECTOR, zzegn.FLOAT),
    INT64_LIST(20, m60.VECTOR, zzegn.LONG),
    UINT64_LIST(21, m60.VECTOR, zzegn.LONG),
    INT32_LIST(22, m60.VECTOR, zzegn.INT),
    FIXED64_LIST(23, m60.VECTOR, zzegn.LONG),
    FIXED32_LIST(24, m60.VECTOR, zzegn.INT),
    BOOL_LIST(25, m60.VECTOR, zzegn.BOOLEAN),
    STRING_LIST(26, m60.VECTOR, zzegn.STRING),
    MESSAGE_LIST(27, m60.VECTOR, zzegn.MESSAGE),
    BYTES_LIST(28, m60.VECTOR, zzegn.BYTE_STRING),
    UINT32_LIST(29, m60.VECTOR, zzegn.INT),
    ENUM_LIST(30, m60.VECTOR, zzegn.ENUM),
    SFIXED32_LIST(31, m60.VECTOR, zzegn.INT),
    SFIXED64_LIST(32, m60.VECTOR, zzegn.LONG),
    SINT32_LIST(33, m60.VECTOR, zzegn.INT),
    SINT64_LIST(34, m60.VECTOR, zzegn.LONG),
    DOUBLE_LIST_PACKED(35, m60.PACKED_VECTOR, zzegn.DOUBLE),
    FLOAT_LIST_PACKED(36, m60.PACKED_VECTOR, zzegn.FLOAT),
    INT64_LIST_PACKED(37, m60.PACKED_VECTOR, zzegn.LONG),
    UINT64_LIST_PACKED(38, m60.PACKED_VECTOR, zzegn.LONG),
    INT32_LIST_PACKED(39, m60.PACKED_VECTOR, zzegn.INT),
    FIXED64_LIST_PACKED(40, m60.PACKED_VECTOR, zzegn.LONG),
    FIXED32_LIST_PACKED(41, m60.PACKED_VECTOR, zzegn.INT),
    BOOL_LIST_PACKED(42, m60.PACKED_VECTOR, zzegn.BOOLEAN),
    UINT32_LIST_PACKED(43, m60.PACKED_VECTOR, zzegn.INT),
    ENUM_LIST_PACKED(44, m60.PACKED_VECTOR, zzegn.ENUM),
    SFIXED32_LIST_PACKED(45, m60.PACKED_VECTOR, zzegn.INT),
    SFIXED64_LIST_PACKED(46, m60.PACKED_VECTOR, zzegn.LONG),
    SINT32_LIST_PACKED(47, m60.PACKED_VECTOR, zzegn.INT),
    SINT64_LIST_PACKED(48, m60.PACKED_VECTOR, zzegn.LONG),
    GROUP_LIST(49, m60.VECTOR, zzegn.MESSAGE),
    MAP(50, m60.MAP, zzegn.VOID);
    
    private static final zzefv[] b0 = null;

    /* renamed from: b  reason: collision with root package name */
    private final int f8561b;

    static {
        int i;
        zzefv[] values = values();
        b0 = new zzefv[values.length];
        for (zzefv zzefv : values) {
            b0[zzefv.f8561b] = zzefv;
        }
    }

    private zzefv(int i, m60 m60, zzegn zzegn) {
        int i2;
        this.f8561b = i;
        int i3 = n60.f4453a[m60.ordinal()];
        if (i3 == 1) {
            zzegn.f();
        } else if (i3 == 2) {
            zzegn.f();
        }
        if (m60 == m60.SCALAR && (i2 = n60.f4454b[zzegn.ordinal()]) != 1 && i2 != 2) {
        }
    }

    public final int f() {
        return this.f8561b;
    }
}
