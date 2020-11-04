package e;

import e.m0.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.connection.j;
import okio.Timeout;

/* compiled from: RealCall */
final class f0 implements j {

    /* renamed from: b  reason: collision with root package name */
    final d0 f14018b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public j f14019c;

    /* renamed from: d  reason: collision with root package name */
    final g0 f14020d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f14021e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14022f;

    /* compiled from: RealCall */
    final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        private final k f14023c;

        /* renamed from: d  reason: collision with root package name */
        private volatile AtomicInteger f14024d = new AtomicInteger(0);

        static {
            Class<f0> cls = f0.class;
        }

        a(k kVar) {
            super("OkHttp %s", f0.this.f());
            this.f14023c = kVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0032 A[Catch:{ IOException -> 0x0055, all -> 0x0028, all -> 0x0053 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005a A[Catch:{ IOException -> 0x0055, all -> 0x0028, all -> 0x0053 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x007a A[Catch:{ IOException -> 0x0055, all -> 0x0028, all -> 0x0053 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void k() {
            /*
                r5 = this;
                e.f0 r0 = e.f0.this
                okhttp3.internal.connection.j r0 = r0.f14019c
                r0.q()
                r0 = 0
                e.f0 r1 = e.f0.this     // Catch:{ IOException -> 0x0055, all -> 0x0028 }
                e.i0 r0 = r1.d()     // Catch:{ IOException -> 0x0055, all -> 0x0028 }
                r1 = 1
                e.k r2 = r5.f14023c     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
                e.f0 r3 = e.f0.this     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
                r2.onResponse(r3, r0)     // Catch:{ IOException -> 0x0026, all -> 0x0024 }
            L_0x0018:
                e.f0 r0 = e.f0.this
                e.d0 r0 = r0.f14018b
                e.s r0 = r0.k()
                r0.f(r5)
                goto L_0x0082
            L_0x0024:
                r0 = move-exception
                goto L_0x002b
            L_0x0026:
                r0 = move-exception
                goto L_0x0058
            L_0x0028:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x002b:
                e.f0 r2 = e.f0.this     // Catch:{ all -> 0x0053 }
                r2.cancel()     // Catch:{ all -> 0x0053 }
                if (r1 != 0) goto L_0x0052
                java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0053 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0053 }
                r2.<init>()     // Catch:{ all -> 0x0053 }
                java.lang.String r3 = "canceled due to "
                r2.append(r3)     // Catch:{ all -> 0x0053 }
                r2.append(r0)     // Catch:{ all -> 0x0053 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0053 }
                r1.<init>(r2)     // Catch:{ all -> 0x0053 }
                r1.addSuppressed(r0)     // Catch:{ all -> 0x0053 }
                e.k r2 = r5.f14023c     // Catch:{ all -> 0x0053 }
                e.f0 r3 = e.f0.this     // Catch:{ all -> 0x0053 }
                r2.onFailure(r3, r1)     // Catch:{ all -> 0x0053 }
            L_0x0052:
                throw r0     // Catch:{ all -> 0x0053 }
            L_0x0053:
                r0 = move-exception
                goto L_0x0083
            L_0x0055:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x0058:
                if (r1 == 0) goto L_0x007a
                e.m0.j.f r1 = e.m0.j.f.j()     // Catch:{ all -> 0x0053 }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0053 }
                r3.<init>()     // Catch:{ all -> 0x0053 }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x0053 }
                e.f0 r4 = e.f0.this     // Catch:{ all -> 0x0053 }
                java.lang.String r4 = r4.g()     // Catch:{ all -> 0x0053 }
                r3.append(r4)     // Catch:{ all -> 0x0053 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0053 }
                r1.p(r2, r3, r0)     // Catch:{ all -> 0x0053 }
                goto L_0x0018
            L_0x007a:
                e.k r1 = r5.f14023c     // Catch:{ all -> 0x0053 }
                e.f0 r2 = e.f0.this     // Catch:{ all -> 0x0053 }
                r1.onFailure(r2, r0)     // Catch:{ all -> 0x0053 }
                goto L_0x0018
            L_0x0082:
                return
            L_0x0083:
                e.f0 r1 = e.f0.this
                e.d0 r1 = r1.f14018b
                e.s r1 = r1.k()
                r1.f(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f0.a.k():void");
        }

        /* access modifiers changed from: package-private */
        public AtomicInteger l() {
            return this.f14024d;
        }

        /* access modifiers changed from: package-private */
        public void m(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e2) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e2);
                f0.this.f14019c.l(interruptedIOException);
                this.f14023c.onFailure(f0.this, interruptedIOException);
                f0.this.f14018b.k().f(this);
            } catch (Throwable th) {
                f0.this.f14018b.k().f(this);
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        public f0 n() {
            return f0.this;
        }

        /* access modifiers changed from: package-private */
        public String o() {
            return f0.this.f14020d.i().m();
        }

        /* access modifiers changed from: package-private */
        public void p(a aVar) {
            this.f14024d = aVar.f14024d;
        }
    }

    private f0(d0 d0Var, g0 g0Var, boolean z) {
        this.f14018b = d0Var;
        this.f14020d = g0Var;
        this.f14021e = z;
    }

    static f0 e(d0 d0Var, g0 g0Var, boolean z) {
        f0 f0Var = new f0(d0Var, g0Var, z);
        f0Var.f14019c = new j(d0Var, f0Var);
        return f0Var;
    }

    /* renamed from: c */
    public f0 clone() {
        return e(this.f14018b, this.f14020d, this.f14021e);
    }

    public void cancel() {
        this.f14019c.d();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.i0 d() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            e.d0 r0 = r11.f14018b
            java.util.List r0 = r0.s()
            r1.addAll(r0)
            e.m0.h.j r0 = new e.m0.h.j
            e.d0 r2 = r11.f14018b
            r0.<init>(r2)
            r1.add(r0)
            e.m0.h.a r0 = new e.m0.h.a
            e.d0 r2 = r11.f14018b
            e.r r2 = r2.j()
            r0.<init>(r2)
            r1.add(r0)
            e.m0.g.a r0 = new e.m0.g.a
            e.d0 r2 = r11.f14018b
            e.m0.g.d r2 = r2.t()
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.connection.b r0 = new okhttp3.internal.connection.b
            e.d0 r2 = r11.f14018b
            r0.<init>(r2)
            r1.add(r0)
            boolean r0 = r11.f14021e
            if (r0 != 0) goto L_0x004b
            e.d0 r0 = r11.f14018b
            java.util.List r0 = r0.w()
            r1.addAll(r0)
        L_0x004b:
            e.m0.h.b r0 = new e.m0.h.b
            boolean r2 = r11.f14021e
            r0.<init>(r2)
            r1.add(r0)
            e.m0.h.g r10 = new e.m0.h.g
            okhttp3.internal.connection.j r2 = r11.f14019c
            r3 = 0
            r4 = 0
            e.g0 r5 = r11.f14020d
            e.d0 r0 = r11.f14018b
            int r7 = r0.f()
            e.d0 r0 = r11.f14018b
            int r8 = r0.H()
            e.d0 r0 = r11.f14018b
            int r9 = r0.P()
            r0 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            e.g0 r2 = r11.f14020d     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            e.i0 r2 = r10.d(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            okhttp3.internal.connection.j r3 = r11.f14019c     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            boolean r3 = r3.i()     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            if (r3 != 0) goto L_0x008a
            okhttp3.internal.connection.j r0 = r11.f14019c
            r0.l(r1)
            return r2
        L_0x008a:
            e.m0.e.f(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            throw r2     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
        L_0x0095:
            r2 = move-exception
            goto L_0x00a3
        L_0x0097:
            r0 = move-exception
            r2 = 1
            okhttp3.internal.connection.j r3 = r11.f14019c     // Catch:{ all -> 0x00a0 }
            java.io.IOException r0 = r3.l(r0)     // Catch:{ all -> 0x00a0 }
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L_0x00a3:
            if (r0 != 0) goto L_0x00aa
            okhttp3.internal.connection.j r0 = r11.f14019c
            r0.l(r1)
        L_0x00aa:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f0.d():e.i0");
    }

    public i0 execute() throws IOException {
        synchronized (this) {
            if (!this.f14022f) {
                this.f14022f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f14019c.q();
        this.f14019c.b();
        try {
            this.f14018b.k().b(this);
            return d();
        } finally {
            this.f14018b.k().g(this);
        }
    }

    /* access modifiers changed from: package-private */
    public String f() {
        return this.f14020d.i().C();
    }

    /* access modifiers changed from: package-private */
    public String g() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f14021e ? "web socket" : "call");
        sb.append(" to ");
        sb.append(f());
        return sb.toString();
    }

    public boolean isCanceled() {
        return this.f14019c.i();
    }

    public g0 request() {
        return this.f14020d;
    }

    public Timeout timeout() {
        return this.f14019c.o();
    }

    public void u(k kVar) {
        synchronized (this) {
            if (!this.f14022f) {
                this.f14022f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f14019c.b();
        this.f14018b.k().a(new a(kVar));
    }
}
