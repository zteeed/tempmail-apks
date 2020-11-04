package okhttp3.internal.connection;

import e.g0;
import e.i0;
import e.j;
import e.j0;
import e.m0.h.c;
import e.m0.h.h;
import e.v;
import java.io.IOException;
import java.net.ProtocolException;
import javax.annotation.Nullable;
import okio.Buffer;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* compiled from: Exchange */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    final j f14816a;

    /* renamed from: b  reason: collision with root package name */
    final j f14817b;

    /* renamed from: c  reason: collision with root package name */
    final v f14818c;

    /* renamed from: d  reason: collision with root package name */
    final e f14819d;

    /* renamed from: e  reason: collision with root package name */
    final c f14820e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14821f;

    /* compiled from: Exchange */
    private final class a extends ForwardingSink {

        /* renamed from: b  reason: collision with root package name */
        private boolean f14822b;

        /* renamed from: c  reason: collision with root package name */
        private long f14823c;

        /* renamed from: d  reason: collision with root package name */
        private long f14824d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f14825e;

        a(Sink sink, long j) {
            super(sink);
            this.f14823c = j;
        }

        @Nullable
        private IOException a(@Nullable IOException iOException) {
            if (this.f14822b) {
                return iOException;
            }
            this.f14822b = true;
            return d.this.a(this.f14824d, false, true, iOException);
        }

        public void close() throws IOException {
            if (!this.f14825e) {
                this.f14825e = true;
                long j = this.f14823c;
                if (j == -1 || this.f14824d == j) {
                    try {
                        super.close();
                        a((IOException) null);
                    } catch (IOException e2) {
                        throw a(e2);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e2) {
                throw a(e2);
            }
        }

        public void write(Buffer buffer, long j) throws IOException {
            if (!this.f14825e) {
                long j2 = this.f14823c;
                if (j2 == -1 || this.f14824d + j <= j2) {
                    try {
                        super.write(buffer, j);
                        this.f14824d += j;
                    } catch (IOException e2) {
                        throw a(e2);
                    }
                } else {
                    throw new ProtocolException("expected " + this.f14823c + " bytes but received " + (this.f14824d + j));
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* compiled from: Exchange */
    final class b extends ForwardingSource {

        /* renamed from: b  reason: collision with root package name */
        private final long f14827b;

        /* renamed from: c  reason: collision with root package name */
        private long f14828c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f14829d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f14830e;

        b(Source source, long j) {
            super(source);
            this.f14827b = j;
            if (j == 0) {
                a((IOException) null);
            }
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public IOException a(@Nullable IOException iOException) {
            if (this.f14829d) {
                return iOException;
            }
            this.f14829d = true;
            return d.this.a(this.f14828c, true, false, iOException);
        }

        public void close() throws IOException {
            if (!this.f14830e) {
                this.f14830e = true;
                try {
                    super.close();
                    a((IOException) null);
                } catch (IOException e2) {
                    throw a(e2);
                }
            }
        }

        public long read(Buffer buffer, long j) throws IOException {
            if (!this.f14830e) {
                try {
                    long read = delegate().read(buffer, j);
                    if (read == -1) {
                        a((IOException) null);
                        return -1;
                    }
                    long j2 = this.f14828c + read;
                    if (this.f14827b != -1) {
                        if (j2 > this.f14827b) {
                            throw new ProtocolException("expected " + this.f14827b + " bytes but received " + j2);
                        }
                    }
                    this.f14828c = j2;
                    if (j2 == this.f14827b) {
                        a((IOException) null);
                    }
                    return read;
                } catch (IOException e2) {
                    throw a(e2);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    public d(j jVar, j jVar2, v vVar, e eVar, c cVar) {
        this.f14816a = jVar;
        this.f14817b = jVar2;
        this.f14818c = vVar;
        this.f14819d = eVar;
        this.f14820e = cVar;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public IOException a(long j, boolean z, boolean z2, @Nullable IOException iOException) {
        if (iOException != null) {
            o(iOException);
        }
        if (z2) {
            if (iOException != null) {
                this.f14818c.o(this.f14817b, iOException);
            } else {
                this.f14818c.m(this.f14817b, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.f14818c.t(this.f14817b, iOException);
            } else {
                this.f14818c.r(this.f14817b, j);
            }
        }
        return this.f14816a.g(this, z2, z, iOException);
    }

    public void b() {
        this.f14820e.cancel();
    }

    public f c() {
        return this.f14820e.a();
    }

    public Sink d(g0 g0Var, boolean z) throws IOException {
        this.f14821f = z;
        long contentLength = g0Var.a().contentLength();
        this.f14818c.n(this.f14817b);
        return new a(this.f14820e.h(g0Var, contentLength), contentLength);
    }

    public void e() {
        this.f14820e.cancel();
        this.f14816a.g(this, true, true, (IOException) null);
    }

    public void f() throws IOException {
        try {
            this.f14820e.b();
        } catch (IOException e2) {
            this.f14818c.o(this.f14817b, e2);
            o(e2);
            throw e2;
        }
    }

    public void g() throws IOException {
        try {
            this.f14820e.f();
        } catch (IOException e2) {
            this.f14818c.o(this.f14817b, e2);
            o(e2);
            throw e2;
        }
    }

    public boolean h() {
        return this.f14821f;
    }

    public void i() {
        this.f14820e.a().q();
    }

    public void j() {
        this.f14816a.g(this, true, false, (IOException) null);
    }

    public j0 k(i0 i0Var) throws IOException {
        try {
            this.f14818c.s(this.f14817b);
            String f2 = i0Var.f("Content-Type");
            long g = this.f14820e.g(i0Var);
            return new h(f2, g, Okio.buffer((Source) new b(this.f14820e.d(i0Var), g)));
        } catch (IOException e2) {
            this.f14818c.t(this.f14817b, e2);
            o(e2);
            throw e2;
        }
    }

    @Nullable
    public i0.a l(boolean z) throws IOException {
        try {
            i0.a e2 = this.f14820e.e(z);
            if (e2 != null) {
                e.m0.c.f14665a.g(e2, this);
            }
            return e2;
        } catch (IOException e3) {
            this.f14818c.t(this.f14817b, e3);
            o(e3);
            throw e3;
        }
    }

    public void m(i0 i0Var) {
        this.f14818c.u(this.f14817b, i0Var);
    }

    public void n() {
        this.f14818c.v(this.f14817b);
    }

    /* access modifiers changed from: package-private */
    public void o(IOException iOException) {
        this.f14819d.h();
        this.f14820e.a().w(iOException);
    }

    public void p(g0 g0Var) throws IOException {
        try {
            this.f14818c.q(this.f14817b);
            this.f14820e.c(g0Var);
            this.f14818c.p(this.f14817b, g0Var);
        } catch (IOException e2) {
            this.f14818c.o(this.f14817b, e2);
            o(e2);
            throw e2;
        }
    }
}
