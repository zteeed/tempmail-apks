package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class v80 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f5300a = Logger.getLogger(v80.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f5301b = o();

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f5302c = l50.b();

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f5303d = C(Long.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f5304e = C(Integer.TYPE);

    /* renamed from: f  reason: collision with root package name */
    private static final d f5305f;
    private static final boolean g = q();
    private static final boolean h = p();
    private static final long i = ((long) y(byte[].class));
    static final boolean j = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        public final void a(Object obj, long j, double d2) {
            c(obj, j, Double.doubleToLongBits(d2));
        }

        public final void b(Object obj, long j, float f2) {
            e(obj, j, Float.floatToIntBits(f2));
        }

        public final void d(Object obj, long j, boolean z) {
            if (v80.j) {
                v80.l(obj, j, z);
            } else {
                v80.t(obj, j, z);
            }
        }

        public final void f(Object obj, long j, byte b2) {
            if (v80.j) {
                v80.b(obj, j, b2);
            } else {
                v80.j(obj, j, b2);
            }
        }

        public final boolean i(Object obj, long j) {
            if (v80.j) {
                return v80.J(obj, j);
            }
            return v80.K(obj, j);
        }

        public final float j(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        public final double k(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        public final byte l(Object obj, long j) {
            if (v80.j) {
                return v80.H(obj, j);
            }
            return v80.I(obj, j);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public final void a(Object obj, long j, double d2) {
            this.f5306a.putDouble(obj, j, d2);
        }

        public final void b(Object obj, long j, float f2) {
            this.f5306a.putFloat(obj, j, f2);
        }

        public final void d(Object obj, long j, boolean z) {
            this.f5306a.putBoolean(obj, j, z);
        }

        public final void f(Object obj, long j, byte b2) {
            this.f5306a.putByte(obj, j, b2);
        }

        public final boolean i(Object obj, long j) {
            return this.f5306a.getBoolean(obj, j);
        }

        public final float j(Object obj, long j) {
            return this.f5306a.getFloat(obj, j);
        }

        public final double k(Object obj, long j) {
            return this.f5306a.getDouble(obj, j);
        }

        public final byte l(Object obj, long j) {
            return this.f5306a.getByte(obj, j);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public final void a(Object obj, long j, double d2) {
            c(obj, j, Double.doubleToLongBits(d2));
        }

        public final void b(Object obj, long j, float f2) {
            e(obj, j, Float.floatToIntBits(f2));
        }

        public final void d(Object obj, long j, boolean z) {
            if (v80.j) {
                v80.l(obj, j, z);
            } else {
                v80.t(obj, j, z);
            }
        }

        public final void f(Object obj, long j, byte b2) {
            if (v80.j) {
                v80.b(obj, j, b2);
            } else {
                v80.j(obj, j, b2);
            }
        }

        public final boolean i(Object obj, long j) {
            if (v80.j) {
                return v80.J(obj, j);
            }
            return v80.K(obj, j);
        }

        public final float j(Object obj, long j) {
            return Float.intBitsToFloat(g(obj, j));
        }

        public final double k(Object obj, long j) {
            return Double.longBitsToDouble(h(obj, j));
        }

        public final byte l(Object obj, long j) {
            if (v80.j) {
                return v80.H(obj, j);
            }
            return v80.I(obj, j);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f5306a;

        d(Unsafe unsafe) {
            this.f5306a = unsafe;
        }

        public abstract void a(Object obj, long j, double d2);

        public abstract void b(Object obj, long j, float f2);

        public final void c(Object obj, long j, long j2) {
            this.f5306a.putLong(obj, j, j2);
        }

        public abstract void d(Object obj, long j, boolean z);

        public final void e(Object obj, long j, int i) {
            this.f5306a.putInt(obj, j, i);
        }

        public abstract void f(Object obj, long j, byte b2);

        public final int g(Object obj, long j) {
            return this.f5306a.getInt(obj, j);
        }

        public final long h(Object obj, long j) {
            return this.f5306a.getLong(obj, j);
        }

        public abstract boolean i(Object obj, long j);

        public abstract float j(Object obj, long j);

        public abstract double k(Object obj, long j);

        public abstract byte l(Object obj, long j);
    }

    static {
        d dVar;
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        d dVar2 = null;
        if (f5301b != null) {
            if (!l50.a()) {
                dVar2 = new b(f5301b);
            } else if (f5303d) {
                dVar2 = new c(f5301b);
            } else if (f5304e) {
                dVar2 = new a(f5301b);
            }
        }
        f5305f = dVar2;
        y(cls6);
        A(cls6);
        y(cls5);
        A(cls5);
        y(cls4);
        A(cls4);
        y(cls3);
        A(cls3);
        y(cls2);
        A(cls2);
        y(cls);
        A(cls);
        Field r = r();
        if (!(r == null || (dVar = f5305f) == null)) {
            dVar.f5306a.objectFieldOffset(r);
        }
    }

    private v80() {
    }

    private static int A(Class<?> cls) {
        if (h) {
            return f5305f.f5306a.arrayIndexScale(cls);
        }
        return -1;
    }

    static long B(Object obj, long j2) {
        return f5305f.h(obj, j2);
    }

    private static boolean C(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!l50.a()) {
            return false;
        }
        try {
            Class<?> cls3 = f5302c;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean D(Object obj, long j2) {
        return f5305f.i(obj, j2);
    }

    static float E(Object obj, long j2) {
        return f5305f.j(obj, j2);
    }

    static double F(Object obj, long j2) {
        return f5305f.k(obj, j2);
    }

    static Object G(Object obj, long j2) {
        return f5305f.f5306a.getObject(obj, j2);
    }

    /* access modifiers changed from: private */
    public static byte H(Object obj, long j2) {
        return (byte) (z(obj, -4 & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte I(Object obj, long j2) {
        return (byte) (z(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static boolean J(Object obj, long j2) {
        return H(obj, j2) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean K(Object obj, long j2) {
        return I(obj, j2) != 0;
    }

    static byte a(byte[] bArr, long j2) {
        return f5305f.l(bArr, i + j2);
    }

    /* access modifiers changed from: private */
    public static void b(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int z = z(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        k(obj, j3, ((255 & b2) << i2) | (z & (~(255 << i2))));
    }

    static void c(Object obj, long j2, double d2) {
        f5305f.a(obj, j2, d2);
    }

    static void d(Object obj, long j2, float f2) {
        f5305f.b(obj, j2, f2);
    }

    static void e(Object obj, long j2, long j3) {
        f5305f.c(obj, j2, j3);
    }

    static void f(Object obj, long j2, Object obj2) {
        f5305f.f5306a.putObject(obj, j2, obj2);
    }

    static void g(Object obj, long j2, boolean z) {
        f5305f.d(obj, j2, z);
    }

    static void h(byte[] bArr, long j2, byte b2) {
        f5305f.f(bArr, i + j2, b2);
    }

    private static Field i(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void j(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        k(obj, j3, ((255 & b2) << i2) | (z(obj, j3) & (~(255 << i2))));
    }

    static void k(Object obj, long j2, int i2) {
        f5305f.e(obj, j2, i2);
    }

    /* access modifiers changed from: private */
    public static void l(Object obj, long j2, boolean z) {
        b(obj, j2, z ? (byte) 1 : 0);
    }

    static boolean m() {
        return h;
    }

    static boolean n() {
        return g;
    }

    static Unsafe o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new x80());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean p() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f5301b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls2.getMethod("getInt", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putInt", new Class[]{cls, Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putLong", new Class[]{cls, Long.TYPE, Long.TYPE});
            cls2.getMethod("getObject", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putObject", new Class[]{cls, Long.TYPE, cls});
            if (l50.a()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putByte", new Class[]{cls, Long.TYPE, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putBoolean", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putFloat", new Class[]{cls, Long.TYPE, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putDouble", new Class[]{cls, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f5300a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean q() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f5301b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            if (r() == null) {
                return false;
            }
            if (l50.a()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{Long.TYPE});
            cls2.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{Long.TYPE});
            cls2.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{Long.TYPE});
            cls2.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls2.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls2.getMethod("copyMemory", new Class[]{cls, Long.TYPE, cls, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f5300a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static Field r() {
        Field i2;
        if (l50.a() && (i2 = i(Buffer.class, "effectiveDirectAddress")) != null) {
            return i2;
        }
        Field i3 = i(Buffer.class, "address");
        if (i3 == null || i3.getType() != Long.TYPE) {
            return null;
        }
        return i3;
    }

    /* access modifiers changed from: private */
    public static void t(Object obj, long j2, boolean z) {
        j(obj, j2, z ? (byte) 1 : 0);
    }

    static <T> T x(Class<T> cls) {
        try {
            return f5301b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static int y(Class<?> cls) {
        if (h) {
            return f5305f.f5306a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static int z(Object obj, long j2) {
        return f5305f.g(obj, j2);
    }
}
