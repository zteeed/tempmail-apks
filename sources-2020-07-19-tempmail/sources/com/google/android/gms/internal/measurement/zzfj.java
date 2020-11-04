package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public enum zzfj {
    DOUBLE(0, h2.SCALAR, zzfy.DOUBLE),
    FLOAT(1, h2.SCALAR, zzfy.FLOAT),
    INT64(2, h2.SCALAR, zzfy.LONG),
    UINT64(3, h2.SCALAR, zzfy.LONG),
    INT32(4, h2.SCALAR, zzfy.INT),
    FIXED64(5, h2.SCALAR, zzfy.LONG),
    FIXED32(6, h2.SCALAR, zzfy.INT),
    BOOL(7, h2.SCALAR, zzfy.BOOLEAN),
    STRING(8, h2.SCALAR, zzfy.STRING),
    MESSAGE(9, h2.SCALAR, zzfy.MESSAGE),
    BYTES(10, h2.SCALAR, zzfy.BYTE_STRING),
    UINT32(11, h2.SCALAR, zzfy.INT),
    ENUM(12, h2.SCALAR, zzfy.ENUM),
    SFIXED32(13, h2.SCALAR, zzfy.INT),
    SFIXED64(14, h2.SCALAR, zzfy.LONG),
    SINT32(15, h2.SCALAR, zzfy.INT),
    SINT64(16, h2.SCALAR, zzfy.LONG),
    GROUP(17, h2.SCALAR, zzfy.MESSAGE),
    DOUBLE_LIST(18, h2.VECTOR, zzfy.DOUBLE),
    FLOAT_LIST(19, h2.VECTOR, zzfy.FLOAT),
    INT64_LIST(20, h2.VECTOR, zzfy.LONG),
    UINT64_LIST(21, h2.VECTOR, zzfy.LONG),
    INT32_LIST(22, h2.VECTOR, zzfy.INT),
    FIXED64_LIST(23, h2.VECTOR, zzfy.LONG),
    FIXED32_LIST(24, h2.VECTOR, zzfy.INT),
    BOOL_LIST(25, h2.VECTOR, zzfy.BOOLEAN),
    STRING_LIST(26, h2.VECTOR, zzfy.STRING),
    MESSAGE_LIST(27, h2.VECTOR, zzfy.MESSAGE),
    BYTES_LIST(28, h2.VECTOR, zzfy.BYTE_STRING),
    UINT32_LIST(29, h2.VECTOR, zzfy.INT),
    ENUM_LIST(30, h2.VECTOR, zzfy.ENUM),
    SFIXED32_LIST(31, h2.VECTOR, zzfy.INT),
    SFIXED64_LIST(32, h2.VECTOR, zzfy.LONG),
    SINT32_LIST(33, h2.VECTOR, zzfy.INT),
    SINT64_LIST(34, h2.VECTOR, zzfy.LONG),
    DOUBLE_LIST_PACKED(35, h2.PACKED_VECTOR, zzfy.DOUBLE),
    FLOAT_LIST_PACKED(36, h2.PACKED_VECTOR, zzfy.FLOAT),
    INT64_LIST_PACKED(37, h2.PACKED_VECTOR, zzfy.LONG),
    UINT64_LIST_PACKED(38, h2.PACKED_VECTOR, zzfy.LONG),
    INT32_LIST_PACKED(39, h2.PACKED_VECTOR, zzfy.INT),
    FIXED64_LIST_PACKED(40, h2.PACKED_VECTOR, zzfy.LONG),
    FIXED32_LIST_PACKED(41, h2.PACKED_VECTOR, zzfy.INT),
    BOOL_LIST_PACKED(42, h2.PACKED_VECTOR, zzfy.BOOLEAN),
    UINT32_LIST_PACKED(43, h2.PACKED_VECTOR, zzfy.INT),
    ENUM_LIST_PACKED(44, h2.PACKED_VECTOR, zzfy.ENUM),
    SFIXED32_LIST_PACKED(45, h2.PACKED_VECTOR, zzfy.INT),
    SFIXED64_LIST_PACKED(46, h2.PACKED_VECTOR, zzfy.LONG),
    SINT32_LIST_PACKED(47, h2.PACKED_VECTOR, zzfy.INT),
    SINT64_LIST_PACKED(48, h2.PACKED_VECTOR, zzfy.LONG),
    GROUP_LIST(49, h2.VECTOR, zzfy.MESSAGE),
    MAP(50, h2.MAP, zzfy.VOID);
    
    private static final zzfj[] b0 = null;

    /* renamed from: b  reason: collision with root package name */
    private final int f9630b;

    static {
        int i;
        zzfj[] values = values();
        b0 = new zzfj[values.length];
        for (zzfj zzfj : values) {
            b0[zzfj.f9630b] = zzfj;
        }
    }

    private zzfj(int i, h2 h2Var, zzfy zzfy) {
        int i2;
        this.f9630b = i;
        int i3 = f2.f9397a[h2Var.ordinal()];
        if (i3 == 1) {
            zzfy.f();
        } else if (i3 == 2) {
            zzfy.f();
        }
        if (h2Var == h2.SCALAR && (i2 = f2.f9398b[zzfy.ordinal()]) != 1 && i2 != 2) {
        }
    }

    public final int a() {
        return this.f9630b;
    }
}
