package d.a.a0.g;

import d.a.a0.a.d;
import d.a.a0.a.e;
import d.a.t;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ComputationScheduler */
public final class b extends t {

    /* renamed from: d  reason: collision with root package name */
    static final C0155b f13791d;

    /* renamed from: e  reason: collision with root package name */
    static final h f13792e;

    /* renamed from: f  reason: collision with root package name */
    static final int f13793f = f(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());
    static final c g;

    /* renamed from: b  reason: collision with root package name */
    final ThreadFactory f13794b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<C0155b> f13795c;

    /* compiled from: ComputationScheduler */
    static final class a extends t.c {

        /* renamed from: b  reason: collision with root package name */
        private final e f13796b = new e();

        /* renamed from: c  reason: collision with root package name */
        private final d.a.y.a f13797c = new d.a.y.a();

        /* renamed from: d  reason: collision with root package name */
        private final e f13798d;

        /* renamed from: e  reason: collision with root package name */
        private final c f13799e;

        /* renamed from: f  reason: collision with root package name */
        volatile boolean f13800f;

        a(c cVar) {
            this.f13799e = cVar;
            e eVar = new e();
            this.f13798d = eVar;
            eVar.b(this.f13796b);
            this.f13798d.b(this.f13797c);
        }

        public d.a.y.b b(Runnable runnable) {
            if (this.f13800f) {
                return d.INSTANCE;
            }
            return this.f13799e.e(runnable, 0, TimeUnit.MILLISECONDS, this.f13796b);
        }

        public d.a.y.b c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f13800f) {
                return d.INSTANCE;
            }
            return this.f13799e.e(runnable, j, timeUnit, this.f13797c);
        }

        public void dispose() {
            if (!this.f13800f) {
                this.f13800f = true;
                this.f13798d.dispose();
            }
        }
    }

    /* renamed from: d.a.a0.g.b$b  reason: collision with other inner class name */
    /* compiled from: ComputationScheduler */
    static final class C0155b {

        /* renamed from: a  reason: collision with root package name */
        final int f13801a;

        /* renamed from: b  reason: collision with root package name */
        final c[] f13802b;

        /* renamed from: c  reason: collision with root package name */
        long f13803c;

        C0155b(int i, ThreadFactory threadFactory) {
            this.f13801a = i;
            this.f13802b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f13802b[i2] = new c(threadFactory);
            }
        }

        public c a() {
            int i = this.f13801a;
            if (i == 0) {
                return b.g;
            }
            c[] cVarArr = this.f13802b;
            long j = this.f13803c;
            this.f13803c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        public void b() {
            for (c dispose : this.f13802b) {
                dispose.dispose();
            }
        }
    }

    /* compiled from: ComputationScheduler */
    static final class c extends f {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new h("RxComputationShutdown"));
        g = cVar;
        cVar.dispose();
        h hVar = new h("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f13792e = hVar;
        C0155b bVar = new C0155b(0, hVar);
        f13791d = bVar;
        bVar.b();
    }

    public b() {
        this(f13792e);
    }

    static int f(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    public t.c a() {
        return new a(this.f13795c.get().a());
    }

    public d.a.y.b d(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f13795c.get().a().f(runnable, j, timeUnit);
    }

    public d.a.y.b e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f13795c.get().a().g(runnable, j, j2, timeUnit);
    }

    public void g() {
        C0155b bVar = new C0155b(f13793f, this.f13794b);
        if (!this.f13795c.compareAndSet(f13791d, bVar)) {
            bVar.b();
        }
    }

    public b(ThreadFactory threadFactory) {
        this.f13794b = threadFactory;
        this.f13795c = new AtomicReference<>(f13791d);
        g();
    }
}
