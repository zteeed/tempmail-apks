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
    final j f14255a;

    /* renamed from: b  reason: collision with root package name */
    final j f14256b;

    /* renamed from: c  reason: collision with root package name */
    final v f14257c;

    /* renamed from: d  reason: collision with root package name */
    final e f14258d;

    /* renamed from: e  reason: collision with root package name */
    final c f14259e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14260f;

    /* compiled from: Exchange */
    private final class a extends ForwardingSink {

        /* renamed from: b  reason: collision with root package name */
        private boolean f14261b;

        /* renamed from: c  reason: collision with root package name */
        private long f14262c;

        /* renamed from: d  reason: collision with root package name */
        private long f14263d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f14264e;

        a(Sink sink, long j) {
            super(sink);
            this.f14262c = j;
        }

        @Nullable
        private IOException a(@Nullable IOException iOException) {
            if (this.f14261b) {
                return iOException;
            }
            this.f14261b = true;
            return d.this.a(this.f14263d, false, true, iOException);
        }

        public void close() throws IOException {
            if (!this.f14264e) {
                this.f14264e = true;
                long j = this.f14262c;
                if (j == -1 || this.f14263d == j) {
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
            if (!this.f14264e) {
                long j2 = this.f14262c;
                if (j2 == -1 || this.f14263d + j <= j2) {
                    try {
                        super.write(buffer, j);
                        this.f14263d += j;
                    } catch (IOException e2) {
                        throw a(e2);
                    }
                } else {
                    throw new ProtocolException("expected " + this.f14262c + " bytes but received " + (this.f14263d + j));
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* compiled from: Exchange */
    final class b extends ForwardingSource {

        /* renamed from: b  reason: collision with root package name */
        private final long f14266b;

        /* renamed from: c  reason: collision with root package name */
        private long f14267c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f14268d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f14269e;

        b(Source source, long j) {
            super(source);
            this.f14266b = j;
            if (j == 0) {
                a((IOException) null);
            }
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public IOException a(@Nullable IOException iOException) {
            if (this.f14268d) {
                return iOException;
            }
            this.f14268d = true;
            return d.this.a(this.f14267c, true, false, iOException);
        }

        public void close() throws IOException {
            if (!this.f14269e) {
                this.f14269e = true;
                try {
                    super.close();
                    a((IOException) null);
                } catch (IOException e2) {
                    throw a(e2);
                }
            }
        }

        public long read(Buffer buffer, long j) throws IOException {
            if (!this.f14269e) {
                try {
                    long read = delegate().read(buffer, j);
                    if (read == -1) {
                        a((IOException) null);
                        return -1;
                    }
                    long j2 = this.f14267c + read;
                    if (this.f14266b != -1) {
                        if (j2 > this.f14266b) {
                            throw new ProtocolException("expected " + this.f14266b + " bytes but received " + j2);
                        }
                    }
                    this.f14267c = j2;
                    if (j2 == this.f14266b) {
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
        this.f14255a = jVar;
        this.f14256b = jVar2;
        this.f14257c = vVar;
        this.f14258d = eVar;
        this.f14259e = cVar;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public IOException a(long j, boolean z, boolean z2, @Nullable IOException iOException) {
        if (iOException != null) {
            o(iOException);
        }
        if (z2) {
            if (iOException != null) {
                this.f14257c.o(this.f14256b, iOException);
            } else {
                this.f14257c.m(this.f14256b, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.f14257c.t(this.f14256b, iOException);
            } else {
                this.f14257c.r(this.f14256b, j);
            }
        }
        return this.f14255a.g(this, z2, z, iOException);
    }

    public void b() {
        this.f14259e.cancel();
    }

    public f c() {
        return this.f14259e.a();
    }

    public Sink d(g0 g0Var, boolean z) throws IOException {
        this.f14260f = z;
        long contentLength = g0Var.a().contentLength();
        this.f14257c.n(this.f14256b);
        return new a(this.f14259e.h(g0Var, contentLength), contentLength);
    }

    public void e() {
        this.f14259e.cancel();
        this.f14255a.g(this, true, true, (IOException) null);
    }

    public void f() throws IOException {
        try {
            this.f14259e.b();
        } catch (IOException e2) {
            this.f14257c.o(this.f14256b, e2);
            o(e2);
            throw e2;
        }
    }

    public void g() throws IOException {
        try {
            this.f14259e.f();
        } catch (IOException e2) {
            this.f14257c.o(this.f14256b, e2);
            o(e2);
            throw e2;
        }
    }

    public boolean h() {
        return this.f14260f;
    }

    public void i() {
        this.f14259e.a().q();
    }

    public void j() {
        this.f14255a.g(this, true, false, (IOException) null);
    }

    public j0 k(i0 i0Var) throws IOException {
        try {
            this.f14257c.s(this.f14256b);
            String f2 = i0Var.f("Content-Type");
            long g = this.f14259e.g(i0Var);
            return new h(f2, g, Okio.buffer((Source) new b(this.f14259e.d(i0Var), g)));
        } catch (IOException e2) {
            this.f14257c.t(this.f14256b, e2);
            o(e2);
            throw e2;
        }
    }

    @Nullable
    public i0.a l(boolean z) throws IOException {
        try {
            i0.a e2 = this.f14259e.e(z);
            if (e2 != null) {
                e.m0.c.f14102a.g(e2, this);
            }
            return e2;
        } catch (IOException e3) {
            this.f14257c.t(this.f14256b, e3);
            o(e3);
            throw e3;
        }
    }

    public void m(i0 i0Var) {
        this.f14257c.u(this.f14256b, i0Var);
    }

    public void n() {
        this.f14257c.v(this.f14256b);
    }

    /* access modifiers changed from: package-private */
    public void o(IOException iOException) {
        this.f14258d.h();
        this.f14259e.a().w(iOException);
    }

    public void p(g0 g0Var) throws IOException {
        try {
            this.f14257c.q(this.f14256b);
            this.f14259e.c(g0Var);
            this.f14257c.p(this.f14256b, g0Var);
        } catch (IOException e2) {
            this.f14257c.o(this.f14256b, e2);
            o(e2);
            throw e2;
        }
    }
}
