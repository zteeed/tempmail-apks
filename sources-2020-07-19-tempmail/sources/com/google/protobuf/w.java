package com.google.protobuf;

/* compiled from: WireFormat */
public final class w {

    /* compiled from: WireFormat */
    public enum b {
        DOUBLE(c.DOUBLE, 1),
        FLOAT(c.FLOAT, 5),
        INT64(c.LONG, 0),
        UINT64(c.LONG, 0),
        INT32(c.INT, 0),
        FIXED64(c.LONG, 1),
        FIXED32(c.INT, 5),
        BOOL(c.BOOLEAN, 0),
        STRING(c.STRING, 2) {
        },
        GROUP(c.MESSAGE, 3) {
        },
        MESSAGE(c.MESSAGE, 2) {
        },
        BYTES(c.BYTE_STRING, 2) {
        },
        UINT32(c.INT, 0),
        ENUM(c.ENUM, 0),
        SFIXED32(c.INT, 5),
        SFIXED64(c.LONG, 1),
        SINT32(c.INT, 0),
        SINT64(c.LONG, 0);
        

        /* renamed from: b  reason: collision with root package name */
        private final c f11635b;

        public c f() {
            return this.f11635b;
        }

        private b(c cVar, int i) {
            this.f11635b = cVar;
        }
    }

    /* compiled from: WireFormat */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(d.f11556c),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: b  reason: collision with root package name */
        private final Object f11640b;

        private c(Object obj) {
            this.f11640b = obj;
        }
    }

    static {
        c(1, 3);
        c(1, 4);
        c(2, 0);
        c(3, 2);
    }

    public static int a(int i) {
        return i >>> 3;
    }

    public static int b(int i) {
        return i & 7;
    }

    static int c(int i, int i2) {
        return (i << 3) | i2;
    }
}
