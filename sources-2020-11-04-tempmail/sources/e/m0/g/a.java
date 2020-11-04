package e.m0.g;

import e.a0;
import e.e0;
import e.g0;
import e.i0;
import e.j0;
import e.m0.c;
import e.m0.e;
import e.m0.g.c;
import e.m0.h.f;
import e.m0.h.h;
import e.y;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* compiled from: CacheInterceptor */
public final class a implements a0 {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    final d f14673a;

    /* renamed from: e.m0.g.a$a  reason: collision with other inner class name */
    /* compiled from: CacheInterceptor */
    class C0159a implements Source {

        /* renamed from: b  reason: collision with root package name */
        boolean f14674b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BufferedSource f14675c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f14676d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ BufferedSink f14677e;

        C0159a(a aVar, BufferedSource bufferedSource, b bVar, BufferedSink bufferedSink) {
            this.f14675c = bufferedSource;
            this.f14676d = bVar;
            this.f14677e = bufferedSink;
        }

        public void close() throws IOException {
            if (!this.f14674b && !e.o(this, 100, TimeUnit.MILLISECONDS)) {
                this.f14674b = true;
                this.f14676d.a();
            }
            this.f14675c.close();
        }

        public long read(Buffer buffer, long j) throws IOException {
            try {
                long read = this.f14675c.read(buffer, j);
                if (read == -1) {
                    if (!this.f14674b) {
                        this.f14674b = true;
                        this.f14677e.close();
                    }
                    return -1;
                }
                buffer.copyTo(this.f14677e.buffer(), buffer.size() - read, read);
                this.f14677e.emitCompleteSegments();
                return read;
            } catch (IOException e2) {
                if (!this.f14674b) {
                    this.f14674b = true;
                    this.f14676d.a();
                }
                throw e2;
            }
        }

        public Timeout timeout() {
            return this.f14675c.timeout();
        }
    }

    public a(@Nullable d dVar) {
        this.f14673a = dVar;
    }

    private i0 b(b bVar, i0 i0Var) throws IOException {
        Sink b2;
        if (bVar == null || (b2 = bVar.b()) == null) {
            return i0Var;
        }
        C0159a aVar = new C0159a(this, i0Var.a().source(), bVar, Okio.buffer(b2));
        String f2 = i0Var.f("Content-Type");
        long contentLength = i0Var.a().contentLength();
        i0.a n = i0Var.n();
        n.b(new h(f2, contentLength, Okio.buffer((Source) aVar)));
        return n.c();
    }

    private static y c(y yVar, y yVar2) {
        y.a aVar = new y.a();
        int h = yVar.h();
        for (int i = 0; i < h; i++) {
            String e2 = yVar.e(i);
            String i2 = yVar.i(i);
            if ((!"Warning".equalsIgnoreCase(e2) || !i2.startsWith("1")) && (d(e2) || !e(e2) || yVar2.c(e2) == null)) {
                c.f14665a.b(aVar, e2, i2);
            }
        }
        int h2 = yVar2.h();
        for (int i3 = 0; i3 < h2; i3++) {
            String e3 = yVar2.e(i3);
            if (!d(e3) && e(e3)) {
                c.f14665a.b(aVar, e3, yVar2.i(i3));
            }
        }
        return aVar.f();
    }

    static boolean d(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    static boolean e(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    private static i0 f(i0 i0Var) {
        if (i0Var == null || i0Var.a() == null) {
            return i0Var;
        }
        i0.a n = i0Var.n();
        n.b((j0) null);
        return n.c();
    }

    public i0 a(a0.a aVar) throws IOException {
        d dVar = this.f14673a;
        i0 e2 = dVar != null ? dVar.e(aVar.request()) : null;
        c c2 = new c.a(System.currentTimeMillis(), aVar.request(), e2).c();
        g0 g0Var = c2.f14678a;
        i0 i0Var = c2.f14679b;
        d dVar2 = this.f14673a;
        if (dVar2 != null) {
            dVar2.b(c2);
        }
        if (e2 != null && i0Var == null) {
            e.f(e2.a());
        }
        if (g0Var == null && i0Var == null) {
            i0.a aVar2 = new i0.a();
            aVar2.q(aVar.request());
            aVar2.o(e0.HTTP_1_1);
            aVar2.g(504);
            aVar2.l("Unsatisfiable Request (only-if-cached)");
            aVar2.b(e.f14670d);
            aVar2.r(-1);
            aVar2.p(System.currentTimeMillis());
            return aVar2.c();
        } else if (g0Var == null) {
            i0.a n = i0Var.n();
            n.d(f(i0Var));
            return n.c();
        } else {
            try {
                i0 d2 = aVar.d(g0Var);
                if (d2 == null && e2 != null) {
                }
                if (i0Var != null) {
                    if (d2.d() == 304) {
                        i0.a n2 = i0Var.n();
                        n2.j(c(i0Var.h(), d2.h()));
                        n2.r(d2.r());
                        n2.p(d2.p());
                        n2.d(f(i0Var));
                        n2.m(f(d2));
                        i0 c3 = n2.c();
                        d2.a().close();
                        this.f14673a.a();
                        this.f14673a.f(i0Var, c3);
                        return c3;
                    }
                    e.f(i0Var.a());
                }
                i0.a n3 = d2.n();
                n3.d(f(i0Var));
                n3.m(f(d2));
                i0 c4 = n3.c();
                if (this.f14673a != null) {
                    if (e.m0.h.e.c(c4) && c.a(c4, g0Var)) {
                        return b(this.f14673a.d(c4), c4);
                    }
                    if (f.a(g0Var.f())) {
                        try {
                            this.f14673a.c(g0Var);
                        } catch (IOException unused) {
                        }
                    }
                }
                return c4;
            } finally {
                if (e2 != null) {
                    e.f(e2.a());
                }
            }
        }
    }
}
