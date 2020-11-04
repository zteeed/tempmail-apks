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
    static final C0155b f14387d;

    /* renamed from: e  reason: collision with root package name */
    static final h f14388e;

    /* renamed from: f  reason: collision with root package name */
    static final int f14389f = f(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());
    static final c g;

    /* renamed from: b  reason: collision with root package name */
    final ThreadFactory f14390b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<C0155b> f14391c;

    /* compiled from: ComputationScheduler */
    static final class a extends t.c {

        /* renamed from: b  reason: collision with root package name */
        private final e f14392b = new e();

        /* renamed from: c  reason: collision with root package name */
        private final d.a.y.a f14393c = new d.a.y.a();

        /* renamed from: d  reason: collision with root package name */
        private final e f14394d;

        /* renamed from: e  reason: collision with root package name */
        private final c f14395e;

        /* renamed from: f  reason: collision with root package name */
        volatile boolean f14396f;

        a(c cVar) {
            this.f14395e = cVar;
            e eVar = new e();
            this.f14394d = eVar;
            eVar.b(this.f14392b);
            this.f14394d.b(this.f14393c);
        }

        public d.a.y.b b(Runnable runnable) {
            if (this.f14396f) {
                return d.INSTANCE;
            }
            return this.f14395e.e(runnable, 0, TimeUnit.MILLISECONDS, this.f14392b);
        }

        public d.a.y.b c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f14396f) {
                return d.INSTANCE;
            }
            return this.f14395e.e(runnable, j, timeUnit, this.f14393c);
        }

        public void dispose() {
            if (!this.f14396f) {
                this.f14396f = true;
                this.f14394d.dispose();
            }
        }
    }

    /* renamed from: d.a.a0.g.b$b  reason: collision with other inner class name */
    /* compiled from: ComputationScheduler */
    static final class C0155b {

        /* renamed from: a  reason: collision with root package name */
        final int f14397a;

        /* renamed from: b  reason: collision with root package name */
        final c[] f14398b;

        /* renamed from: c  reason: collision with root package name */
        long f14399c;

        C0155b(int i, ThreadFactory threadFactory) {
            this.f14397a = i;
            this.f14398b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f14398b[i2] = new c(threadFactory);
            }
        }

        public c a() {
            int i = this.f14397a;
            if (i == 0) {
                return b.g;
            }
            c[] cVarArr = this.f14398b;
            long j = this.f14399c;
            this.f14399c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        public void b() {
            for (c dispose : this.f14398b) {
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
        f14388e = hVar;
        C0155b bVar = new C0155b(0, hVar);
        f14387d = bVar;
        bVar.b();
    }

    public b() {
        this(f14388e);
    }

    static int f(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    public t.c a() {
        return new a(this.f14391c.get().a());
    }

    public d.a.y.b d(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f14391c.get().a().f(runnable, j, timeUnit);
    }

    public d.a.y.b e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f14391c.get().a().g(runnable, j, j2, timeUnit);
    }

    public void g() {
        C0155b bVar = new C0155b(f14389f, this.f14390b);
        if (!this.f14391c.compareAndSet(f14387d, bVar)) {
            bVar.b();
        }
    }

    public b(ThreadFactory threadFactory) {
        this.f14390b = threadFactory;
        this.f14391c = new AtomicReference<>(f14387d);
        g();
    }
}
