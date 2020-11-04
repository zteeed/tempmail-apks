package e.m0.h;

import e.a0;
import e.g0;
import e.i0;
import e.m0.e;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.internal.connection.d;
import okio.BufferedSink;
import okio.Okio;

/* compiled from: CallServerInterceptor */
public final class b implements a0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14687a;

    public b(boolean z) {
        this.f14687a = z;
    }

    public i0 a(a0.a aVar) throws IOException {
        boolean z;
        i0 i0Var;
        g gVar = (g) aVar;
        d f2 = gVar.f();
        g0 request = gVar.request();
        long currentTimeMillis = System.currentTimeMillis();
        f2.p(request);
        i0.a aVar2 = null;
        if (!f.b(request.f()) || request.a() == null) {
            f2.j();
            z = false;
        } else {
            if ("100-continue".equalsIgnoreCase(request.c("Expect"))) {
                f2.g();
                f2.n();
                aVar2 = f2.l(true);
                z = true;
            } else {
                z = false;
            }
            if (aVar2 != null) {
                f2.j();
                if (!f2.c().o()) {
                    f2.i();
                }
            } else if (request.a().isDuplex()) {
                f2.g();
                request.a().writeTo(Okio.buffer(f2.d(request, true)));
            } else {
                BufferedSink buffer = Okio.buffer(f2.d(request, false));
                request.a().writeTo(buffer);
                buffer.close();
            }
        }
        if (request.a() == null || !request.a().isDuplex()) {
            f2.f();
        }
        if (!z) {
            f2.n();
        }
        if (aVar2 == null) {
            aVar2 = f2.l(false);
        }
        aVar2.q(request);
        aVar2.h(f2.c().l());
        aVar2.r(currentTimeMillis);
        aVar2.p(System.currentTimeMillis());
        i0 c2 = aVar2.c();
        int d2 = c2.d();
        if (d2 == 100) {
            i0.a l = f2.l(false);
            l.q(request);
            l.h(f2.c().l());
            l.r(currentTimeMillis);
            l.p(System.currentTimeMillis());
            c2 = l.c();
            d2 = c2.d();
        }
        f2.m(c2);
        if (!this.f14687a || d2 != 101) {
            i0.a n = c2.n();
            n.b(f2.k(c2));
            i0Var = n.c();
        } else {
            i0.a n2 = c2.n();
            n2.b(e.f14670d);
            i0Var = n2.c();
        }
        if ("close".equalsIgnoreCase(i0Var.q().c("Connection")) || "close".equalsIgnoreCase(i0Var.f("Connection"))) {
            f2.i();
        }
        if ((d2 != 204 && d2 != 205) || i0Var.a().contentLength() <= 0) {
            return i0Var;
        }
        throw new ProtocolException("HTTP " + d2 + " had non-zero Content-Length: " + i0Var.a().contentLength());
    }
}
