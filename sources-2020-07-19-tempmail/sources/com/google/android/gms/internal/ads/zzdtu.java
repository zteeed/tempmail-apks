package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzdtu<V> extends zzdwa implements zzdvf<V> {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f8375e;

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f8376f = Logger.getLogger(zzdtu.class.getName());
    /* access modifiers changed from: private */
    public static final b g;
    private static final Object h = new Object();
    /* access modifiers changed from: private */
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f8377b;
    /* access modifiers changed from: private */
    @NullableDecl

    /* renamed from: c  reason: collision with root package name */
    public volatile e f8378c;
    /* access modifiers changed from: private */
    @NullableDecl

    /* renamed from: d  reason: collision with root package name */
    public volatile l f8379d;

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(l lVar, l lVar2);

        /* access modifiers changed from: package-private */
        public abstract void b(l lVar, Thread thread);

        /* access modifiers changed from: package-private */
        public abstract boolean c(zzdtu<?> zzdtu, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean d(zzdtu<?> zzdtu, l lVar, l lVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean e(zzdtu<?> zzdtu, Object obj, Object obj2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static final class c {

        /* renamed from: b  reason: collision with root package name */
        static final c f8380b = new c(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f8381a;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        class a extends Throwable {
            a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        c(Throwable th) {
            zzdsh.b(th);
            this.f8381a = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static final class d {

        /* renamed from: c  reason: collision with root package name */
        static final d f8382c;

        /* renamed from: d  reason: collision with root package name */
        static final d f8383d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f8384a;
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        final Throwable f8385b;

        static {
            if (zzdtu.f8375e) {
                f8383d = null;
                f8382c = null;
                return;
            }
            f8383d = new d(false, (Throwable) null);
            f8382c = new d(true, (Throwable) null);
        }

        d(boolean z, @NullableDecl Throwable th) {
            this.f8384a = z;
            this.f8385b = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f8386d = new e((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f8387a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f8388b;
        @NullableDecl

        /* renamed from: c  reason: collision with root package name */
        e f8389c;

        e(Runnable runnable, Executor executor) {
            this.f8387a = runnable;
            this.f8388b = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static final class f<V> implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final zzdtu<V> f8390b;

        /* renamed from: c  reason: collision with root package name */
        final zzdvf<? extends V> f8391c;

        f(zzdtu<V> zzdtu, zzdvf<? extends V> zzdvf) {
            this.f8390b = zzdtu;
            this.f8391c = zzdvf;
        }

        public final void run() {
            if (this.f8390b.f8377b == this) {
                if (zzdtu.g.e(this.f8390b, this, zzdtu.c(this.f8391c))) {
                    zzdtu.q(this.f8390b);
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static final class g extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, Thread> f8392a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, l> f8393b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<zzdtu, l> f8394c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<zzdtu, e> f8395d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<zzdtu, Object> f8396e;

        g(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<zzdtu, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<zzdtu, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<zzdtu, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f8392a = atomicReferenceFieldUpdater;
            this.f8393b = atomicReferenceFieldUpdater2;
            this.f8394c = atomicReferenceFieldUpdater3;
            this.f8395d = atomicReferenceFieldUpdater4;
            this.f8396e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public final void a(l lVar, l lVar2) {
            this.f8393b.lazySet(lVar, lVar2);
        }

        /* access modifiers changed from: package-private */
        public final void b(l lVar, Thread thread) {
            this.f8392a.lazySet(lVar, thread);
        }

        /* access modifiers changed from: package-private */
        public final boolean c(zzdtu<?> zzdtu, e eVar, e eVar2) {
            return this.f8395d.compareAndSet(zzdtu, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public final boolean d(zzdtu<?> zzdtu, l lVar, l lVar2) {
            return this.f8394c.compareAndSet(zzdtu, lVar, lVar2);
        }

        /* access modifiers changed from: package-private */
        public final boolean e(zzdtu<?> zzdtu, Object obj, Object obj2) {
            return this.f8396e.compareAndSet(zzdtu, obj, obj2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    interface h<V> extends zzdvf<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static final class i extends b {
        private i() {
            super();
        }

        /* access modifiers changed from: package-private */
        public final void a(l lVar, l lVar2) {
            lVar.f8405b = lVar2;
        }

        /* access modifiers changed from: package-private */
        public final void b(l lVar, Thread thread) {
            lVar.f8404a = thread;
        }

        /* access modifiers changed from: package-private */
        public final boolean c(zzdtu<?> zzdtu, e eVar, e eVar2) {
            synchronized (zzdtu) {
                if (zzdtu.f8378c != eVar) {
                    return false;
                }
                e unused = zzdtu.f8378c = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean d(zzdtu<?> zzdtu, l lVar, l lVar2) {
            synchronized (zzdtu) {
                if (zzdtu.f8379d != lVar) {
                    return false;
                }
                l unused = zzdtu.f8379d = lVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean e(zzdtu<?> zzdtu, Object obj, Object obj2) {
            synchronized (zzdtu) {
                if (zzdtu.f8377b != obj) {
                    return false;
                }
                Object unused = zzdtu.f8377b = obj2;
                return true;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static final class j extends b {

        /* renamed from: a  reason: collision with root package name */
        static final Unsafe f8397a;

        /* renamed from: b  reason: collision with root package name */
        static final long f8398b;

        /* renamed from: c  reason: collision with root package name */
        static final long f8399c;

        /* renamed from: d  reason: collision with root package name */
        static final long f8400d;

        /* renamed from: e  reason: collision with root package name */
        static final long f8401e;

        /* renamed from: f  reason: collision with root package name */
        static final long f8402f;

        /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
        class a implements PrivilegedExceptionAction<Unsafe> {
            a() {
            }

            public /* synthetic */ Object run() throws Exception {
                Class<Unsafe> cls = Unsafe.class;
                for (Field field : cls.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get((Object) null);
                    if (cls.isInstance(obj)) {
                        return cls.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.zzdtu.j.a());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<com.google.android.gms.internal.ads.zzdtu$l> r0 = com.google.android.gms.internal.ads.zzdtu.l.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                com.google.android.gms.internal.ads.zzdtu$j$a r1 = new com.google.android.gms.internal.ads.zzdtu$j$a     // Catch:{ PrivilegedActionException -> 0x005d }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005d }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005d }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005d }
            L_0x0012:
                java.lang.Class<com.google.android.gms.internal.ads.zzdtu> r2 = com.google.android.gms.internal.ads.zzdtu.class
                java.lang.String r3 = "d"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f8399c = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "c"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f8398b = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "b"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f8400d = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "a"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f8401e = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "b"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
                f8402f = r2     // Catch:{ Exception -> 0x0053 }
                f8397a = r1     // Catch:{ Exception -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                com.google.android.gms.internal.ads.zzdsk.e(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdtu.j.<clinit>():void");
        }

        private j() {
            super();
        }

        /* access modifiers changed from: package-private */
        public final void a(l lVar, l lVar2) {
            f8397a.putObject(lVar, f8402f, lVar2);
        }

        /* access modifiers changed from: package-private */
        public final void b(l lVar, Thread thread) {
            f8397a.putObject(lVar, f8401e, thread);
        }

        /* access modifiers changed from: package-private */
        public final boolean c(zzdtu<?> zzdtu, e eVar, e eVar2) {
            return f8397a.compareAndSwapObject(zzdtu, f8398b, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public final boolean d(zzdtu<?> zzdtu, l lVar, l lVar2) {
            return f8397a.compareAndSwapObject(zzdtu, f8399c, lVar, lVar2);
        }

        /* access modifiers changed from: package-private */
        public final boolean e(zzdtu<?> zzdtu, Object obj, Object obj2) {
            return f8397a.compareAndSwapObject(zzdtu, f8400d, obj, obj2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static abstract class k<V> extends zzdtu<V> implements h<V> {
        k() {
        }

        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return zzdtu.super.get(j, timeUnit);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static final class l {

        /* renamed from: c  reason: collision with root package name */
        static final l f8403c = new l(false);
        @NullableDecl

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f8404a;
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        volatile l f8405b;

        private l(boolean z) {
        }

        /* access modifiers changed from: package-private */
        public final void a(l lVar) {
            zzdtu.g.a(this, lVar);
        }

        l() {
            zzdtu.g.b(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        b bVar;
        Class<l> cls = l.class;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f8375e = z;
        try {
            bVar = new j();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            th = th3;
            th2 = th;
            bVar = new i();
        }
        g = bVar;
        if (th != null) {
            f8376f.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            f8376f.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    protected zzdtu() {
    }

    /* access modifiers changed from: private */
    public static Object c(zzdvf<?> zzdvf) {
        Throwable a2;
        if (zzdvf instanceof h) {
            Object obj = ((zzdtu) zzdvf).f8377b;
            if (!(obj instanceof d)) {
                return obj;
            }
            d dVar = (d) obj;
            if (!dVar.f8384a) {
                return obj;
            }
            if (dVar.f8385b != null) {
                return new d(false, dVar.f8385b);
            }
            return d.f8383d;
        } else if ((zzdvf instanceof zzdwa) && (a2 = zzdvz.a((zzdwa) zzdvf)) != null) {
            return new c(a2);
        } else {
            boolean isCancelled = zzdvf.isCancelled();
            if ((!f8375e) && isCancelled) {
                return d.f8383d;
            }
            try {
                Object d2 = d(zzdvf);
                if (!isCancelled) {
                    return d2 == null ? h : d2;
                }
                String valueOf = String.valueOf(zzdvf);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new d(false, new IllegalArgumentException(sb.toString()));
            } catch (ExecutionException e2) {
                if (!isCancelled) {
                    return new c(e2.getCause());
                }
                String valueOf2 = String.valueOf(zzdvf);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf2);
                return new d(false, new IllegalArgumentException(sb2.toString(), e2));
            } catch (CancellationException e3) {
                if (isCancelled) {
                    return new d(false, e3);
                }
                String valueOf3 = String.valueOf(zzdvf);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 77);
                sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb3.append(valueOf3);
                return new c(new IllegalArgumentException(sb3.toString(), e3));
            } catch (Throwable th) {
                return new c(th);
            }
        }
    }

    private static <V> V d(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private final void p(l lVar) {
        lVar.f8404a = null;
        while (true) {
            l lVar2 = this.f8379d;
            if (lVar2 != l.f8403c) {
                l lVar3 = null;
                while (lVar2 != null) {
                    l lVar4 = lVar2.f8405b;
                    if (lVar2.f8404a != null) {
                        lVar3 = lVar2;
                    } else if (lVar3 != null) {
                        lVar3.f8405b = lVar4;
                        if (lVar3.f8404a == null) {
                        }
                    } else if (g.d(this, lVar2, lVar4)) {
                    }
                    lVar2 = lVar4;
                }
                return;
            }
            return;
        }
    }

    /* access modifiers changed from: private */
    public static void q(zzdtu<?> zzdtu) {
        zzdtu<V> zzdtu2;
        e eVar;
        e eVar2;
        e eVar3 = null;
        zzdtu<?> zzdtu3 = zzdtu;
        while (true) {
            l lVar = zzdtu3.f8379d;
            if (g.d(zzdtu3, lVar, l.f8403c)) {
                while (lVar != null) {
                    Thread thread = lVar.f8404a;
                    if (thread != null) {
                        lVar.f8404a = null;
                        LockSupport.unpark(thread);
                    }
                    lVar = lVar.f8405b;
                }
                zzdtu3.b();
                do {
                    eVar = zzdtu3.f8378c;
                } while (!g.c(zzdtu3, eVar, e.f8386d));
                while (true) {
                    eVar2 = eVar3;
                    eVar3 = eVar;
                    if (eVar3 == null) {
                        break;
                    }
                    eVar = eVar3.f8389c;
                    eVar3.f8389c = eVar2;
                }
                while (eVar2 != null) {
                    eVar3 = eVar2.f8389c;
                    Runnable runnable = eVar2.f8387a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        zzdtu<V> zzdtu4 = fVar.f8390b;
                        if (zzdtu4.f8377b == fVar) {
                            if (g.e(zzdtu4, fVar, c(fVar.f8391c))) {
                                zzdtu2 = zzdtu4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        r(runnable, eVar2.f8388b);
                    }
                    eVar2 = eVar3;
                }
                return;
            }
            zzdtu2 = zzdtu3;
            zzdtu3 = zzdtu2;
        }
    }

    private static void r(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f8376f;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), e2);
        }
    }

    private final void s(StringBuilder sb) {
        try {
            Object d2 = d(this);
            sb.append("SUCCESS, result=[");
            t(sb, d2);
            sb.append("]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void t(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e2) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e2.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    private static V u(Object obj) throws ExecutionException {
        if (obj instanceof d) {
            Throwable th = ((d) obj).f8385b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f8381a);
        } else if (obj == h) {
            return null;
        } else {
            return obj;
        }
    }

    /* access modifiers changed from: protected */
    @NullableDecl
    public final Throwable a() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.f8377b;
        if (obj instanceof c) {
            return ((c) obj).f8381a;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.android.gms.internal.ads.zzdvf<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f8377b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzdtu.f
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f8375e
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzdtu$d r3 = new com.google.android.gms.internal.ads.zzdtu$d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzdtu$d r3 = com.google.android.gms.internal.ads.zzdtu.d.f8382c
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.zzdtu$d r3 = com.google.android.gms.internal.ads.zzdtu.d.f8383d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            com.google.android.gms.internal.ads.zzdtu$b r6 = g
            boolean r6 = r6.e(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.e()
        L_0x0035:
            q(r4)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzdtu.f
            if (r4 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.zzdtu$f r0 = (com.google.android.gms.internal.ads.zzdtu.f) r0
            com.google.android.gms.internal.ads.zzdvf<? extends V> r0 = r0.f8391c
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzdtu.h
            if (r4 == 0) goto L_0x0055
            r4 = r0
            com.google.android.gms.internal.ads.zzdtu r4 = (com.google.android.gms.internal.ads.zzdtu) r4
            java.lang.Object r0 = r4.f8377b
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzdtu.f
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f8377b
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzdtu.f
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdtu.cancel(boolean):boolean");
    }

    /* access modifiers changed from: protected */
    public void e() {
    }

    public void f(Runnable runnable, Executor executor) {
        e eVar;
        zzdsh.c(runnable, "Runnable was null.");
        zzdsh.c(executor, "Executor was null.");
        if (isDone() || (eVar = this.f8378c) == e.f8386d) {
            r(runnable, executor);
        }
        e eVar2 = new e(runnable, executor);
        do {
            eVar2.f8389c = eVar;
            if (!g.c(this, eVar, eVar2)) {
                eVar = this.f8378c;
            } else {
                return;
            }
        } while (eVar != e.f8386d);
        r(runnable, executor);
    }

    /* access modifiers changed from: package-private */
    public final void g(@NullableDecl Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(l());
        }
    }

    public V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j3 = j2;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f8377b;
            if ((obj != null) && (!(obj instanceof f))) {
                return u(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                l lVar = this.f8379d;
                if (lVar != l.f8403c) {
                    l lVar2 = new l();
                    do {
                        lVar2.a(lVar);
                        if (g.d(this, lVar, lVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f8377b;
                                    if ((obj2 != null) && (!(obj2 instanceof f))) {
                                        return u(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    p(lVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            p(lVar2);
                        } else {
                            lVar = this.f8379d;
                        }
                    } while (lVar != l.f8403c);
                }
                return u(this.f8377b);
            }
            while (nanos > 0) {
                Object obj3 = this.f8377b;
                if ((obj3 != null) && (!(obj3 instanceof f))) {
                    return u(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String zzdtu = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j3);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j4 = -nanos;
                long convert = timeUnit2.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit2.toNanos(convert);
                int i2 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(zzdtu).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(zzdtu);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    /* access modifiers changed from: protected */
    @NullableDecl
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public boolean i(@NullableDecl V v) {
        if (v == null) {
            v = h;
        }
        if (!g.e(this, (Object) null, v)) {
            return false;
        }
        q(this);
        return true;
    }

    public boolean isCancelled() {
        return this.f8377b instanceof d;
    }

    public boolean isDone() {
        Object obj = this.f8377b;
        return (!(obj instanceof f)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    public boolean j(Throwable th) {
        zzdsh.b(th);
        if (!g.e(this, (Object) null, new c(th))) {
            return false;
        }
        q(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean k(zzdvf<? extends V> zzdvf) {
        f fVar;
        c cVar;
        zzdsh.b(zzdvf);
        Object obj = this.f8377b;
        if (obj == null) {
            if (zzdvf.isDone()) {
                if (!g.e(this, (Object) null, c(zzdvf))) {
                    return false;
                }
                q(this);
                return true;
            }
            fVar = new f(this, zzdvf);
            if (g.e(this, (Object) null, fVar)) {
                try {
                    zzdvf.f(fVar, q00.INSTANCE);
                } catch (Throwable unused) {
                    cVar = c.f8380b;
                }
                return true;
            }
            obj = this.f8377b;
        }
        if (obj instanceof d) {
            zzdvf.cancel(((d) obj).f8384a);
        }
        return false;
        g.e(this, fVar, cVar);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean l() {
        Object obj = this.f8377b;
        return (obj instanceof d) && ((d) obj).f8384a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            s(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f8377b;
            if (obj instanceof f) {
                sb.append(", setFuture=[");
                t(sb, ((f) obj).f8391c);
                sb.append("]");
            } else {
                try {
                    str = zzdsi.a(h());
                } catch (RuntimeException | StackOverflowError e2) {
                    String valueOf = String.valueOf(e2.getClass());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(valueOf);
                    str = sb2.toString();
                }
                if (str != null) {
                    sb.append(", info=[");
                    sb.append(str);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                s(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f8377b;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return u(obj2);
            }
            l lVar = this.f8379d;
            if (lVar != l.f8403c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (g.d(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f8377b;
                            } else {
                                p(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return u(obj);
                    }
                    lVar = this.f8379d;
                } while (lVar != l.f8403c);
            }
            return u(this.f8377b);
        }
        throw new InterruptedException();
    }
}
