package okhttp3.internal.connection;

import e.a0;
import e.d0;
import e.e;
import e.g0;
import e.l;
import e.m0.c;
import e.m0.j.f;
import e.v;
import e.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okio.AsyncTimeout;
import okio.Timeout;

/* compiled from: Transmitter */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f14297a;

    /* renamed from: b  reason: collision with root package name */
    private final g f14298b;

    /* renamed from: c  reason: collision with root package name */
    private final e.j f14299c;

    /* renamed from: d  reason: collision with root package name */
    private final v f14300d;

    /* renamed from: e  reason: collision with root package name */
    private final AsyncTimeout f14301e = new a();
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private Object f14302f;
    private g0 g;
    private e h;
    public f i;
    @Nullable
    private d j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;

    /* compiled from: Transmitter */
    class a extends AsyncTimeout {
        a() {
        }

        /* access modifiers changed from: protected */
        public void timedOut() {
            j.this.d();
        }
    }

    /* compiled from: Transmitter */
    static final class b extends WeakReference<j> {

        /* renamed from: a  reason: collision with root package name */
        final Object f14304a;

        b(j jVar, Object obj) {
            super(jVar);
            this.f14304a = obj;
        }
    }

    public j(d0 d0Var, e.j jVar) {
        this.f14297a = d0Var;
        this.f14298b = c.f14102a.h(d0Var.g());
        this.f14299c = jVar;
        this.f14300d = d0Var.n().a(jVar);
        this.f14301e.timeout((long) d0Var.d(), TimeUnit.MILLISECONDS);
    }

    private e e(z zVar) {
        l lVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (zVar.n()) {
            SSLSocketFactory M = this.f14297a.M();
            hostnameVerifier = this.f14297a.r();
            sSLSocketFactory = M;
            lVar = this.f14297a.e();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            lVar = null;
        }
        return new e(zVar.m(), zVar.z(), this.f14297a.l(), this.f14297a.L(), sSLSocketFactory, hostnameVerifier, lVar, this.f14297a.E(), this.f14297a.D(), this.f14297a.C(), this.f14297a.i(), this.f14297a.F());
    }

    @Nullable
    private IOException j(@Nullable IOException iOException, boolean z) {
        f fVar;
        Socket n2;
        boolean z2;
        boolean z3;
        synchronized (this.f14298b) {
            if (z) {
                if (this.j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            fVar = this.i;
            n2 = (this.i == null || this.j != null || (!z && !this.o)) ? null : n();
            if (this.i != null) {
                fVar = null;
            }
            z2 = true;
            z3 = this.o && this.j == null;
        }
        e.m0.e.g(n2);
        if (fVar != null) {
            this.f14300d.h(this.f14299c, fVar);
        }
        if (z3) {
            if (iOException == null) {
                z2 = false;
            }
            iOException = r(iOException);
            if (z2) {
                this.f14300d.b(this.f14299c, iOException);
            } else {
                this.f14300d.a(this.f14299c);
            }
        }
        return iOException;
    }

    @Nullable
    private IOException r(@Nullable IOException iOException) {
        if (this.n || !this.f14301e.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: package-private */
    public void a(f fVar) {
        if (this.i == null) {
            this.i = fVar;
            fVar.p.add(new b(this, this.f14302f));
            return;
        }
        throw new IllegalStateException();
    }

    public void b() {
        this.f14302f = f.j().m("response.body().close()");
        this.f14300d.c(this.f14299c);
    }

    public boolean c() {
        return this.h.f() && this.h.e();
    }

    public void d() {
        d dVar;
        f fVar;
        synchronized (this.f14298b) {
            this.m = true;
            dVar = this.j;
            if (this.h == null || this.h.a() == null) {
                fVar = this.i;
            } else {
                fVar = this.h.a();
            }
        }
        if (dVar != null) {
            dVar.b();
        } else if (fVar != null) {
            fVar.d();
        }
    }

    public void f() {
        synchronized (this.f14298b) {
            if (!this.o) {
                this.j = null;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return j(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return r6;
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.IOException g(okhttp3.internal.connection.d r3, boolean r4, boolean r5, @javax.annotation.Nullable java.io.IOException r6) {
        /*
            r2 = this;
            okhttp3.internal.connection.g r0 = r2.f14298b
            monitor-enter(r0)
            okhttp3.internal.connection.d r1 = r2.j     // Catch:{ all -> 0x003f }
            if (r3 == r1) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return r6
        L_0x0009:
            r3 = 0
            r1 = 1
            if (r4 == 0) goto L_0x0013
            boolean r4 = r2.k     // Catch:{ all -> 0x003f }
            r4 = r4 ^ r1
            r2.k = r1     // Catch:{ all -> 0x003f }
            goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r5 == 0) goto L_0x001d
            boolean r5 = r2.l     // Catch:{ all -> 0x003f }
            if (r5 != 0) goto L_0x001b
            r4 = 1
        L_0x001b:
            r2.l = r1     // Catch:{ all -> 0x003f }
        L_0x001d:
            boolean r5 = r2.k     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0036
            boolean r5 = r2.l     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0036
            if (r4 == 0) goto L_0x0036
            okhttp3.internal.connection.d r4 = r2.j     // Catch:{ all -> 0x003f }
            okhttp3.internal.connection.f r4 = r4.c()     // Catch:{ all -> 0x003f }
            int r5 = r4.m     // Catch:{ all -> 0x003f }
            int r5 = r5 + r1
            r4.m = r5     // Catch:{ all -> 0x003f }
            r4 = 0
            r2.j = r4     // Catch:{ all -> 0x003f }
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003e
            java.io.IOException r6 = r2.j(r6, r3)
        L_0x003e:
            return r6
        L_0x003f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.j.g(okhttp3.internal.connection.d, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public boolean h() {
        boolean z;
        synchronized (this.f14298b) {
            z = this.j != null;
        }
        return z;
    }

    public boolean i() {
        boolean z;
        synchronized (this.f14298b) {
            z = this.m;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public d k(a0.a aVar, boolean z) {
        synchronized (this.f14298b) {
            if (this.o) {
                throw new IllegalStateException("released");
            } else if (this.j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        d dVar = new d(this, this.f14299c, this.f14300d, this.h, this.h.b(this.f14297a, aVar, z));
        synchronized (this.f14298b) {
            this.j = dVar;
            this.k = false;
            this.l = false;
        }
        return dVar;
    }

    @Nullable
    public IOException l(@Nullable IOException iOException) {
        synchronized (this.f14298b) {
            this.o = true;
        }
        return j(iOException, false);
    }

    public void m(g0 g0Var) {
        g0 g0Var2 = this.g;
        if (g0Var2 != null) {
            if (e.m0.e.D(g0Var2.i(), g0Var.i()) && this.h.e()) {
                return;
            }
            if (this.j != null) {
                throw new IllegalStateException();
            } else if (this.h != null) {
                j((IOException) null, true);
                this.h = null;
            }
        }
        this.g = g0Var;
        this.h = new e(this, this.f14298b, e(g0Var.i()), this.f14299c, this.f14300d);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public Socket n() {
        int i2 = 0;
        int size = this.i.p.size();
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.i.p.get(i2).get() == this) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            f fVar = this.i;
            fVar.p.remove(i2);
            this.i = null;
            if (!fVar.p.isEmpty()) {
                return null;
            }
            fVar.q = System.nanoTime();
            if (this.f14298b.c(fVar)) {
                return fVar.t();
            }
            return null;
        }
        throw new IllegalStateException();
    }

    public Timeout o() {
        return this.f14301e;
    }

    public void p() {
        if (!this.n) {
            this.n = true;
            this.f14301e.exit();
            return;
        }
        throw new IllegalStateException();
    }

    public void q() {
        this.f14301e.enter();
    }
}
