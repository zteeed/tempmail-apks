package e.m0.h;

import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import e.a0;
import e.b0;
import e.g0;
import e.h0;
import e.i0;
import e.m0.e;
import e.m0.f;
import e.q;
import e.r;
import e.y;
import java.io.IOException;
import java.util.List;
import okio.GzipSource;
import okio.Okio;
import okio.Source;

/* compiled from: BridgeInterceptor */
public final class a implements a0 {

    /* renamed from: a  reason: collision with root package name */
    private final r f14686a;

    public a(r rVar) {
        this.f14686a = rVar;
    }

    private String b(List<q> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            q qVar = list.get(i);
            sb.append(qVar.c());
            sb.append('=');
            sb.append(qVar.k());
        }
        return sb.toString();
    }

    public i0 a(a0.a aVar) throws IOException {
        g0 request = aVar.request();
        g0.a g = request.g();
        h0 a2 = request.a();
        if (a2 != null) {
            b0 contentType = a2.contentType();
            if (contentType != null) {
                g.c("Content-Type", contentType.toString());
            }
            long contentLength = a2.contentLength();
            if (contentLength != -1) {
                g.c("Content-Length", Long.toString(contentLength));
                g.f("Transfer-Encoding");
            } else {
                g.c("Transfer-Encoding", "chunked");
                g.f("Content-Length");
            }
        }
        boolean z = false;
        if (request.c("Host") == null) {
            g.c("Host", e.r(request.i(), false));
        }
        if (request.c("Connection") == null) {
            g.c("Connection", "Keep-Alive");
        }
        if (request.c("Accept-Encoding") == null && request.c("Range") == null) {
            z = true;
            g.c("Accept-Encoding", "gzip");
        }
        List<q> b2 = this.f14686a.b(request.i());
        if (!b2.isEmpty()) {
            g.c("Cookie", b(b2));
        }
        if (request.c(AbstractSpiCall.HEADER_USER_AGENT) == null) {
            g.c(AbstractSpiCall.HEADER_USER_AGENT, f.a());
        }
        i0 d2 = aVar.d(g.a());
        e.e(this.f14686a, request.i(), d2.h());
        i0.a n = d2.n();
        n.q(request);
        if (z && "gzip".equalsIgnoreCase(d2.f("Content-Encoding")) && e.c(d2)) {
            GzipSource gzipSource = new GzipSource(d2.a().source());
            y.a f2 = d2.h().f();
            f2.g("Content-Encoding");
            f2.g("Content-Length");
            n.j(f2.f());
            n.b(new h(d2.f("Content-Type"), -1, Okio.buffer((Source) gzipSource)));
        }
        return n.c();
    }
}
