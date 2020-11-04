package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfo.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public abstract class zzfo<MessageType extends zzfo<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdw<MessageType, BuilderType> {
    private static Map<Object, zzfo<?, ?>> zzd = new ConcurrentHashMap();
    protected zzig zzb = zzig.a();
    private int zzc = -1;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
    static final class a implements zzfg<a> {
        public final zzgz Q(zzgz zzgz, zzgw zzgw) {
            throw new NoSuchMethodError();
        }

        public final int a() {
            throw new NoSuchMethodError();
        }

        public final zziu b() {
            throw new NoSuchMethodError();
        }

        public final zzjb c() {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final boolean d() {
            throw new NoSuchMethodError();
        }

        public final boolean e() {
            throw new NoSuchMethodError();
        }

        public final zzhf z(zzhf zzhf, zzhf zzhf2) {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
    public static abstract class zza<MessageType extends zzfo<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdv<MessageType, BuilderType> {

        /* renamed from: b  reason: collision with root package name */
        private final MessageType f9814b;

        /* renamed from: c  reason: collision with root package name */
        protected MessageType f9815c;

        /* renamed from: d  reason: collision with root package name */
        protected boolean f9816d = false;

        protected zza(MessageType messagetype) {
            this.f9814b = messagetype;
            this.f9815c = (zzfo) messagetype.r(zzf.f9820d, (Object) null, (Object) null);
        }

        private static void s(MessageType messagetype, MessageType messagetype2) {
            l3.a().c(messagetype).h(messagetype, messagetype2);
        }

        private final BuilderType t(zzes zzes, zzfb zzfb) throws IOException {
            if (this.f9816d) {
                x();
                this.f9816d = false;
            }
            try {
                l3.a().c(this.f9815c).d(this.f9815c, u1.P(zzes), zzfb);
                return this;
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof IOException) {
                    throw ((IOException) e2.getCause());
                }
                throw e2;
            }
        }

        private final BuilderType w(byte[] bArr, int i, int i2, zzfb zzfb) throws zzfw {
            if (this.f9816d) {
                x();
                this.f9816d = false;
            }
            try {
                l3.a().c(this.f9815c).j(this.f9815c, bArr, 0, i2 + 0, new h1(zzfb));
                return this;
            } catch (zzfw e2) {
                throw e2;
            } catch (IndexOutOfBoundsException unused) {
                throw zzfw.a();
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            }
        }

        public final /* synthetic */ zzgw b() {
            return this.f9814b;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zza = (zza) this.f9814b.r(zzf.f9821e, (Object) null, (Object) null);
            zza.r((zzfo) m());
            return zza;
        }

        public final boolean f() {
            return zzfo.v(this.f9815c, false);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ zzdv j(zzdw zzdw) {
            r((zzfo) zzdw);
            return this;
        }

        public final /* synthetic */ zzdv k(zzes zzes, zzfb zzfb) throws IOException {
            t(zzes, zzfb);
            return this;
        }

        public final /* synthetic */ zzdv l(byte[] bArr, int i, int i2) throws zzfw {
            w(bArr, 0, i2, zzfb.a());
            return this;
        }

        public final /* synthetic */ zzdv n(byte[] bArr, int i, int i2, zzfb zzfb) throws zzfw {
            w(bArr, 0, i2, zzfb);
            return this;
        }

        public final /* synthetic */ zzdv p() {
            return (zza) clone();
        }

        public final BuilderType r(MessageType messagetype) {
            if (this.f9816d) {
                x();
                this.f9816d = false;
            }
            s(this.f9815c, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        public void x() {
            MessageType messagetype = (zzfo) this.f9815c.r(zzf.f9820d, (Object) null, (Object) null);
            s(messagetype, this.f9815c);
            this.f9815c = messagetype;
        }

        /* renamed from: y */
        public MessageType m() {
            if (this.f9816d) {
                return this.f9815c;
            }
            MessageType messagetype = this.f9815c;
            l3.a().c(messagetype).f(messagetype);
            this.f9816d = true;
            return this.f9815c;
        }

        /* renamed from: z */
        public final MessageType q() {
            MessageType messagetype = (zzfo) m();
            if (messagetype.f()) {
                return messagetype;
            }
            throw new zzie(messagetype);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzfo<MessageType, BuilderType> implements zzgy {
        protected c2<a> zzc = c2.c();

        /* access modifiers changed from: package-private */
        public final c2<a> D() {
            if (this.zzc.o()) {
                this.zzc = (c2) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
    public static class zzc<T extends zzfo<T, ?>> extends zzdx<T> {
        public zzc(T t) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
    public static class zzd<ContainingType extends zzgw, Type> extends zzez<ContainingType, Type> {
    }

    /* 'enum' modifier removed */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
    public static final class zzf {

        /* renamed from: a  reason: collision with root package name */
        public static final int f9817a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f9818b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f9819c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f9820d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f9821e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f9822f = 6;
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

    protected static <E> zzfx<E> C() {
        return k3.j();
    }

    static <T extends zzfo<?, ?>> T n(Class<T> cls) {
        T t = (zzfo) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzfo) zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = (zzfo) ((zzfo) k4.c(cls)).r(zzf.f9822f, (Object) null, (Object) null);
            if (t != null) {
                zzd.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static zzfu o(zzfu zzfu) {
        int size = zzfu.size();
        return zzfu.D(size == 0 ? 10 : size << 1);
    }

    protected static <E> zzfx<E> p(zzfx<E> zzfx) {
        int size = zzfx.size();
        return zzfx.f(size == 0 ? 10 : size << 1);
    }

    protected static Object s(zzgw zzgw, String str, Object[] objArr) {
        return new n3(zzgw, str, objArr);
    }

    static Object t(Method method, Object obj, Object... objArr) {
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

    protected static <T extends zzfo<?, ?>> void u(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    protected static final <T extends zzfo<T, ?>> boolean v(T t, boolean z) {
        byte byteValue = ((Byte) t.r(zzf.f9817a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e2 = l3.a().c(t).e(t);
        if (z) {
            t.r(zzf.f9818b, e2 ? t : null, (Object) null);
        }
        return e2;
    }

    protected static zzfv y() {
        return k2.i();
    }

    protected static zzfu z() {
        return r2.i();
    }

    public final /* synthetic */ zzgw b() {
        return (zzfo) r(zzf.f9822f, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzgz c() {
        zza zza2 = (zza) r(zzf.f9821e, (Object) null, (Object) null);
        zza2.r(this);
        return zza2;
    }

    public final /* synthetic */ zzgz e() {
        return (zza) r(zzf.f9821e, (Object) null, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return l3.a().c(this).g(this, (zzfo) obj);
        }
        return false;
    }

    public final boolean f() {
        return v(this, true);
    }

    public final void g(zzev zzev) throws IOException {
        l3.a().c(this).i(this, y1.P(zzev));
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int c2 = l3.a().c(this).c(this);
        this.zza = c2;
        return c2;
    }

    public final int i() {
        if (this.zzc == -1) {
            this.zzc = l3.a().c(this).b(this);
        }
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final int k() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final void l(int i) {
        this.zzc = i;
    }

    /* access modifiers changed from: protected */
    public abstract Object r(int i, Object obj, Object obj2);

    public String toString() {
        return d3.a(this, super.toString());
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzfo<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType w() {
        return (zza) r(zzf.f9821e, (Object) null, (Object) null);
    }

    public final BuilderType x() {
        BuilderType buildertype = (zza) r(zzf.f9821e, (Object) null, (Object) null);
        buildertype.r(this);
        return buildertype;
    }
}
