package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: UnsafeUtil */
final class u {

    /* renamed from: a  reason: collision with root package name */
    private static final Unsafe f12175a = g();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f12176b = k();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f12177c = j();

    /* renamed from: d  reason: collision with root package name */
    private static final long f12178d = ((long) a());

    /* compiled from: UnsafeUtil */
    static class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        /* renamed from: a */
        public Unsafe run() throws Exception {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    static {
        c(b(Buffer.class, "address"));
    }

    private static int a() {
        if (f12177c) {
            return f12175a.arrayBaseOffset(byte[].class);
        }
        return -1;
    }

    private static Field b(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long c(Field field) {
        Unsafe unsafe;
        if (field == null || (unsafe = f12175a) == null) {
            return -1;
        }
        return unsafe.objectFieldOffset(field);
    }

    static long d() {
        return f12178d;
    }

    static byte e(byte[] bArr, long j) {
        return f12175a.getByte(bArr, j);
    }

    static long f(byte[] bArr, long j) {
        return f12175a.getLong(bArr, j);
    }

    private static Unsafe g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean h() {
        return f12177c;
    }

    static boolean i() {
        return f12176b;
    }

    private static boolean j() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f12175a;
        if (unsafe != null) {
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls2.getMethod("getByte", new Class[]{cls, Long.TYPE});
                cls2.getMethod("putByte", new Class[]{cls, Long.TYPE, Byte.TYPE});
                cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
                cls2.getMethod("copyMemory", new Class[]{cls, Long.TYPE, cls, Long.TYPE, Long.TYPE});
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static boolean k() {
        Unsafe unsafe = f12175a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getByte", new Class[]{Long.TYPE});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
                cls.getMethod("getLong", new Class[]{Long.TYPE});
                cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
