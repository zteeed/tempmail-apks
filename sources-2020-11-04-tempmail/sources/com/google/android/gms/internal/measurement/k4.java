package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class k4 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f9625a = Logger.getLogger(k4.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f9626b = t();

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f9627c = f1.c();

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f9628d = B(Long.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f9629e = B(Integer.TYPE);

    /* renamed from: f  reason: collision with root package name */
    private static final c f9630f;
    private static final boolean g = E();
    private static final boolean h = A();
    private static final long i = ((long) n(byte[].class));
    static final boolean j = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
    static final class a extends c {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            if (k4.j) {
                return k4.L(obj, j);
            }
            return k4.M(obj, j);
        }

        public final void b(Object obj, long j, byte b2) {
            if (k4.j) {
                k4.u(obj, j, b2);
            } else {
                k4.y(obj, j, b2);
            }
        }

        public final void c(Object obj, long j, double d2) {
            f(obj, j, Double.doubleToLongBits(d2));
        }

        public final void d(Object obj, long j, float f2) {
            e(obj, j, Float.floatToIntBits(f2));
        }

        public final void g(Object obj, long j, boolean z) {
            if (k4.j) {
                k4.z(obj, j, z);
            } else {
                k4.D(obj, j, z);
            }
        }

        public final boolean h(Object obj, long j) {
            if (k4.j) {
                return k4.N(obj, j);
            }
            return k4.O(obj, j);
        }

        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(k(obj, j));
        }

        public final double j(Object obj, long j) {
            return Double.longBitsToDouble(l(obj, j));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
    static final class b extends c {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            if (k4.j) {
                return k4.L(obj, j);
            }
            return k4.M(obj, j);
        }

        public final void b(Object obj, long j, byte b2) {
            if (k4.j) {
                k4.u(obj, j, b2);
            } else {
                k4.y(obj, j, b2);
            }
        }

        public final void c(Object obj, long j, double d2) {
            f(obj, j, Double.doubleToLongBits(d2));
        }

        public final void d(Object obj, long j, float f2) {
            e(obj, j, Float.floatToIntBits(f2));
        }

        public final void g(Object obj, long j, boolean z) {
            if (k4.j) {
                k4.z(obj, j, z);
            } else {
                k4.D(obj, j, z);
            }
        }

        public final boolean h(Object obj, long j) {
            if (k4.j) {
                return k4.N(obj, j);
            }
            return k4.O(obj, j);
        }

        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(k(obj, j));
        }

        public final double j(Object obj, long j) {
            return Double.longBitsToDouble(l(obj, j));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
    static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f9631a;

        c(Unsafe unsafe) {
            this.f9631a = unsafe;
        }

        public abstract byte a(Object obj, long j);

        public abstract void b(Object obj, long j, byte b2);

        public abstract void c(Object obj, long j, double d2);

        public abstract void d(Object obj, long j, float f2);

        public final void e(Object obj, long j, int i) {
            this.f9631a.putInt(obj, j, i);
        }

        public final void f(Object obj, long j, long j2) {
            this.f9631a.putLong(obj, j, j2);
        }

        public abstract void g(Object obj, long j, boolean z);

        public abstract boolean h(Object obj, long j);

        public abstract float i(Object obj, long j);

        public abstract double j(Object obj, long j);

        public final int k(Object obj, long j) {
            return this.f9631a.getInt(obj, j);
        }

        public final long l(Object obj, long j) {
            return this.f9631a.getLong(obj, j);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
    static final class d extends c {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            return this.f9631a.getByte(obj, j);
        }

        public final void b(Object obj, long j, byte b2) {
            this.f9631a.putByte(obj, j, b2);
        }

        public final void c(Object obj, long j, double d2) {
            this.f9631a.putDouble(obj, j, d2);
        }

        public final void d(Object obj, long j, float f2) {
            this.f9631a.putFloat(obj, j, f2);
        }

        public final void g(Object obj, long j, boolean z) {
            this.f9631a.putBoolean(obj, j, z);
        }

        public final boolean h(Object obj, long j) {
            return this.f9631a.getBoolean(obj, j);
        }

        public final float i(Object obj, long j) {
            return this.f9631a.getFloat(obj, j);
        }

        public final double j(Object obj, long j) {
            return this.f9631a.getDouble(obj, j);
        }
    }

    static {
        c cVar;
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        c cVar2 = null;
        if (f9626b != null) {
            if (!f1.b()) {
                cVar2 = new d(f9626b);
            } else if (f9628d) {
                cVar2 = new a(f9626b);
            } else if (f9629e) {
                cVar2 = new b(f9626b);
            }
        }
        f9630f = cVar2;
        n(cls6);
        s(cls6);
        n(cls5);
        s(cls5);
        n(cls4);
        s(cls4);
        n(cls3);
        s(cls3);
        n(cls2);
        s(cls2);
        n(cls);
        s(cls);
        Field G = G();
        if (!(G == null || (cVar = f9630f) == null)) {
            cVar.f9631a.objectFieldOffset(G);
        }
    }

    private k4() {
    }

    private static boolean A() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f9626b;
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
            if (f1.b()) {
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
            Logger logger = f9625a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean B(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!f1.b()) {
            return false;
        }
        try {
            Class<?> cls3 = f9627c;
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

    static double C(Object obj, long j2) {
        return f9630f.j(obj, j2);
    }

    /* access modifiers changed from: private */
    public static void D(Object obj, long j2, boolean z) {
        y(obj, j2, z ? (byte) 1 : 0);
    }

    private static boolean E() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f9626b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            if (G() == null) {
                return false;
            }
            if (f1.b()) {
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
            Logger logger = f9625a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    static Object F(Object obj, long j2) {
        return f9630f.f9631a.getObject(obj, j2);
    }

    private static Field G() {
        Field d2;
        if (f1.b() && (d2 = d(Buffer.class, "effectiveDirectAddress")) != null) {
            return d2;
        }
        Field d3 = d(Buffer.class, "address");
        if (d3 == null || d3.getType() != Long.TYPE) {
            return null;
        }
        return d3;
    }

    /* access modifiers changed from: private */
    public static byte L(Object obj, long j2) {
        return (byte) (b(obj, -4 & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte M(Object obj, long j2) {
        return (byte) (b(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static boolean N(Object obj, long j2) {
        return L(obj, j2) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean O(Object obj, long j2) {
        return M(obj, j2) != 0;
    }

    static byte a(byte[] bArr, long j2) {
        return f9630f.a(bArr, i + j2);
    }

    static int b(Object obj, long j2) {
        return f9630f.k(obj, j2);
    }

    static <T> T c(Class<T> cls) {
        try {
            return f9626b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static Field d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void f(Object obj, long j2, double d2) {
        f9630f.c(obj, j2, d2);
    }

    static void g(Object obj, long j2, float f2) {
        f9630f.d(obj, j2, f2);
    }

    static void h(Object obj, long j2, int i2) {
        f9630f.e(obj, j2, i2);
    }

    static void i(Object obj, long j2, long j3) {
        f9630f.f(obj, j2, j3);
    }

    static void j(Object obj, long j2, Object obj2) {
        f9630f.f9631a.putObject(obj, j2, obj2);
    }

    static void k(Object obj, long j2, boolean z) {
        f9630f.g(obj, j2, z);
    }

    static void l(byte[] bArr, long j2, byte b2) {
        f9630f.b(bArr, i + j2, b2);
    }

    static boolean m() {
        return h;
    }

    private static int n(Class<?> cls) {
        if (h) {
            return f9630f.f9631a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long o(Object obj, long j2) {
        return f9630f.l(obj, j2);
    }

    static boolean r() {
        return g;
    }

    private static int s(Class<?> cls) {
        if (h) {
            return f9630f.f9631a.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j4());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void u(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int b3 = b(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        h(obj, j3, ((255 & b2) << i2) | (b3 & (~(255 << i2))));
    }

    static boolean w(Object obj, long j2) {
        return f9630f.h(obj, j2);
    }

    static float x(Object obj, long j2) {
        return f9630f.i(obj, j2);
    }

    /* access modifiers changed from: private */
    public static void y(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        h(obj, j3, ((255 & b2) << i2) | (b(obj, j3) & (~(255 << i2))));
    }

    /* access modifiers changed from: private */
    public static void z(Object obj, long j2, boolean z) {
        u(obj, j2, z ? (byte) 1 : 0);
    }
}
