package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegb;
import com.google.android.gms.internal.ads.zzegb.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzegb<MessageType extends zzegb<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzeeh<MessageType, BuilderType> {
    private static Map<Object, zzegb<?, ?>> zziei = new ConcurrentHashMap();
    protected zzejc zzieg = zzejc.h();
    private int zzieh = -1;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    static final class a implements zzefw<a> {
        public final zzejt C() {
            throw new NoSuchMethodError();
        }

        public final boolean F() {
            throw new NoSuchMethodError();
        }

        public final zzehu M(zzehu zzehu, zzehu zzehu2) {
            throw new NoSuchMethodError();
        }

        public final zzeho U(zzeho zzeho, zzehl zzehl) {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final int i() {
            throw new NoSuchMethodError();
        }

        public final boolean j() {
            throw new NoSuchMethodError();
        }

        public final zzejq w() {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public static class zza<T extends zzegb<T, ?>> extends zzeei<T> {
        public zza(T t) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public static abstract class zzb<MessageType extends zzegb<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzeeg<MessageType, BuilderType> {

        /* renamed from: b  reason: collision with root package name */
        private final MessageType f8566b;

        /* renamed from: c  reason: collision with root package name */
        protected MessageType f8567c;

        /* renamed from: d  reason: collision with root package name */
        protected boolean f8568d = false;

        protected zzb(MessageType messagetype) {
            this.f8566b = messagetype;
            this.f8567c = (zzegb) messagetype.t(zze.f8572d, (Object) null, (Object) null);
        }

        private static void n(MessageType messagetype, MessageType messagetype2) {
            s70.b().a(messagetype).a(messagetype, messagetype2);
        }

        private final BuilderType p(byte[] bArr, int i, int i2, zzefo zzefo) throws zzegl {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            try {
                s70.b().a(this.f8567c).e(this.f8567c, bArr, 0, i2 + 0, new n50(zzefo));
                return this;
            } catch (zzegl e2) {
                throw e2;
            } catch (IndexOutOfBoundsException unused) {
                throw zzegl.a();
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            }
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzb = (zzb) this.f8566b.t(zze.f8573e, (Object) null, (Object) null);
            zzb.o((zzegb) K());
            return zzb;
        }

        public final /* synthetic */ zzehl d() {
            return this.f8566b;
        }

        public final boolean isInitialized() {
            return zzegb.y(this.f8567c, false);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ zzeeg j(zzeeh zzeeh) {
            o((zzegb) zzeeh);
            return this;
        }

        public final /* synthetic */ zzeeg k() {
            return (zzb) clone();
        }

        public final /* synthetic */ zzeeg l(byte[] bArr, int i, int i2, zzefo zzefo) throws zzegl {
            p(bArr, 0, i2, zzefo);
            return this;
        }

        public final BuilderType o(MessageType messagetype) {
            if (this.f8568d) {
                r();
                this.f8568d = false;
            }
            n(this.f8567c, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        public void r() {
            MessageType messagetype = (zzegb) this.f8567c.t(zze.f8572d, (Object) null, (Object) null);
            n(messagetype, this.f8567c);
            this.f8567c = messagetype;
        }

        /* renamed from: s */
        public MessageType K() {
            if (this.f8568d) {
                return this.f8567c;
            }
            MessageType messagetype = this.f8567c;
            s70.b().a(messagetype).b(messagetype);
            this.f8568d = true;
            return this.f8567c;
        }

        /* renamed from: t */
        public final MessageType O() {
            MessageType messagetype = (zzegb) K();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new zzeja(messagetype);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzegb<MessageType, BuilderType> implements zzehn {
        protected l60<a> zzien = l60.p();

        /* access modifiers changed from: package-private */
        public final l60<a> G() {
            if (this.zzien.b()) {
                this.zzien = (l60) this.zzien.clone();
            }
            return this.zzien;
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public static final class zze {

        /* renamed from: a  reason: collision with root package name */
        public static final int f8569a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f8570b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f8571c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f8572d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f8573e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f8574f = 6;
        public static final int g = 7;
        private static final /* synthetic */ int[] h = {1, 2, 3, 4, 5, 6, 7};
        public static final int i = 1;
        public static final int j = 2;
        public static final int k = 1;
        public static final int l = 2;

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public static class zzf<ContainingType extends zzehl, Type> extends zzefp<ContainingType, Type> {
    }

    protected static zzegh C() {
        return r60.i();
    }

    protected static zzegj D() {
        return y60.i();
    }

    protected static <E> zzegm<E> E() {
        return r70.h();
    }

    static <T extends zzegb<?, ?>> T F(Class<T> cls) {
        T t = (zzegb) zziei.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzegb) zziei.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = (zzegb) ((zzegb) v80.x(cls)).t(zze.f8574f, (Object) null, (Object) null);
            if (t != null) {
                zziei.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    private static <T extends zzegb<T, ?>> T k(T t) throws zzegl {
        if (t == null || t.isInitialized()) {
            return t;
        }
        zzegl zzegl = new zzegl(new zzeja(t).getMessage());
        zzegl.j(t);
        throw zzegl;
    }

    protected static <T extends zzegb<T, ?>> T l(T t, zzeer zzeer) throws zzegl {
        T z = z(t, zzeer, zzefo.b());
        k(z);
        k(z);
        return z;
    }

    protected static <T extends zzegb<T, ?>> T m(T t, zzeer zzeer, zzefo zzefo) throws zzegl {
        T z = z(t, zzeer, zzefo);
        k(z);
        return z;
    }

    private static <T extends zzegb<T, ?>> T n(T t, zzefc zzefc, zzefo zzefo) throws zzegl {
        T t2 = (zzegb) t.t(zze.f8572d, (Object) null, (Object) null);
        try {
            z70 a2 = s70.b().a(t2);
            a2.j(t2, d60.a(zzefc), zzefo);
            a2.b(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzegl) {
                throw ((zzegl) e2.getCause());
            }
            zzegl zzegl = new zzegl(e2.getMessage());
            zzegl.j(t2);
            throw zzegl;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof zzegl) {
                throw ((zzegl) e3.getCause());
            }
            throw e3;
        }
    }

    protected static <T extends zzegb<T, ?>> T o(T t, byte[] bArr) throws zzegl {
        T p = p(t, bArr, 0, bArr.length, zzefo.b());
        k(p);
        return p;
    }

    private static <T extends zzegb<T, ?>> T p(T t, byte[] bArr, int i, int i2, zzefo zzefo) throws zzegl {
        T t2 = (zzegb) t.t(zze.f8572d, (Object) null, (Object) null);
        try {
            z70 a2 = s70.b().a(t2);
            a2.e(t2, bArr, 0, i2, new n50(zzefo));
            a2.b(t2);
            if (t2.zzhzi == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzegl) {
                throw ((zzegl) e2.getCause());
            }
            zzegl zzegl = new zzegl(e2.getMessage());
            zzegl.j(t2);
            throw zzegl;
        } catch (IndexOutOfBoundsException unused) {
            zzegl a3 = zzegl.a();
            a3.j(t2);
            throw a3;
        }
    }

    protected static <T extends zzegb<T, ?>> T q(T t, byte[] bArr, zzefo zzefo) throws zzegl {
        T p = p(t, bArr, 0, bArr.length, zzefo);
        k(p);
        return p;
    }

    protected static zzegh r(zzegh zzegh) {
        int size = zzegh.size();
        return zzegh.x(size == 0 ? 10 : size << 1);
    }

    protected static <E> zzegm<E> s(zzegm<E> zzegm) {
        int size = zzegm.size();
        return zzegm.r(size == 0 ? 10 : size << 1);
    }

    protected static Object u(zzehl zzehl, String str, Object[] objArr) {
        return new u70(zzehl, str, objArr);
    }

    static Object w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static <T extends zzegb<?, ?>> void x(Class<T> cls, T t) {
        zziei.put(cls, t);
    }

    protected static final <T extends zzegb<T, ?>> boolean y(T t, boolean z) {
        byte byteValue = ((Byte) t.t(zze.f8569a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean h = s70.b().a(t).h(t);
        if (z) {
            t.t(zze.f8570b, h ? t : null, (Object) null);
        }
        return h;
    }

    private static <T extends zzegb<T, ?>> T z(T t, zzeer zzeer, zzefo zzefo) throws zzegl {
        T n;
        try {
            zzefc w = zzeer.w();
            n = n(t, w, zzefo);
            w.w(0);
            return n;
        } catch (zzegl e2) {
            e2.j(n);
            throw e2;
        } catch (zzegl e3) {
            throw e3;
        }
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzegb<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType A() {
        return (zzb) t(zze.f8573e, (Object) null, (Object) null);
    }

    public final BuilderType B() {
        BuilderType buildertype = (zzb) t(zze.f8573e, (Object) null, (Object) null);
        buildertype.o(this);
        return buildertype;
    }

    public final /* synthetic */ zzeho b() {
        zzb zzb2 = (zzb) t(zze.f8573e, (Object) null, (Object) null);
        zzb2.o(this);
        return zzb2;
    }

    public final /* synthetic */ zzeho c() {
        return (zzb) t(zze.f8573e, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzehl d() {
        return (zzegb) t(zze.f8574f, (Object) null, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return s70.b().a(this).f(this, (zzegb) obj);
        }
        return false;
    }

    public final int f() {
        if (this.zzieh == -1) {
            this.zzieh = s70.b().a(this).c(this);
        }
        return this.zzieh;
    }

    /* access modifiers changed from: package-private */
    public final int h() {
        return this.zzieh;
    }

    public int hashCode() {
        int i = this.zzhzi;
        if (i != 0) {
            return i;
        }
        int i2 = s70.b().a(this).i(this);
        this.zzhzi = i2;
        return i2;
    }

    public final void i(zzefl zzefl) throws IOException {
        s70.b().a(this).d(this, g60.a(zzefl));
    }

    public final boolean isInitialized() {
        return y(this, true);
    }

    /* access modifiers changed from: package-private */
    public final void j(int i) {
        this.zzieh = i;
    }

    /* access modifiers changed from: protected */
    public abstract Object t(int i, Object obj, Object obj2);

    public String toString() {
        return k70.a(this, super.toString());
    }
}
