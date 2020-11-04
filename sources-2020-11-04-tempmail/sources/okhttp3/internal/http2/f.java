package okhttp3.internal.http2;

import e.a0;
import e.d0;
import e.e0;
import e.g0;
import e.i0;
import e.m0.e;
import e.m0.h.c;
import e.m0.h.i;
import e.m0.h.k;
import e.y;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okio.Sink;
import okio.Source;

/* compiled from: Http2ExchangeCodec */
public final class f implements c {
    private static final List<String> g = e.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    private static final List<String> h = e.t("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    private final a0.a f14942a;

    /* renamed from: b  reason: collision with root package name */
    private final okhttp3.internal.connection.f f14943b;

    /* renamed from: c  reason: collision with root package name */
    private final e f14944c;

    /* renamed from: d  reason: collision with root package name */
    private volatile h f14945d;

    /* renamed from: e  reason: collision with root package name */
    private final e0 f14946e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f14947f;

    public f(d0 d0Var, okhttp3.internal.connection.f fVar, a0.a aVar, e eVar) {
        e0 e0Var;
        this.f14943b = fVar;
        this.f14942a = aVar;
        this.f14944c = eVar;
        if (d0Var.C().contains(e0.H2_PRIOR_KNOWLEDGE)) {
            e0Var = e0.H2_PRIOR_KNOWLEDGE;
        } else {
            e0Var = e0.HTTP_2;
        }
        this.f14946e = e0Var;
    }

    public static List<b> i(g0 g0Var) {
        y d2 = g0Var.d();
        ArrayList arrayList = new ArrayList(d2.h() + 4);
        arrayList.add(new b(b.f14874f, g0Var.f()));
        arrayList.add(new b(b.g, i.c(g0Var.i())));
        String c2 = g0Var.c("Host");
        if (c2 != null) {
            arrayList.add(new b(b.i, c2));
        }
        arrayList.add(new b(b.h, g0Var.i().E()));
        int h2 = d2.h();
        for (int i = 0; i < h2; i++) {
            String lowerCase = d2.e(i).toLowerCase(Locale.US);
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && d2.i(i).equals("trailers"))) {
                arrayList.add(new b(lowerCase, d2.i(i)));
            }
        }
        return arrayList;
    }

    public static i0.a j(y yVar, e0 e0Var) throws IOException {
        y.a aVar = new y.a();
        int h2 = yVar.h();
        k kVar = null;
        for (int i = 0; i < h2; i++) {
            String e2 = yVar.e(i);
            String i2 = yVar.i(i);
            if (e2.equals(":status")) {
                kVar = k.a("HTTP/1.1 " + i2);
            } else if (!h.contains(e2)) {
                e.m0.c.f14665a.b(aVar, e2, i2);
            }
        }
        if (kVar != null) {
            i0.a aVar2 = new i0.a();
            aVar2.o(e0Var);
            aVar2.g(kVar.f14702b);
            aVar2.l(kVar.f14703c);
            aVar2.j(aVar.f());
            return aVar2;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public okhttp3.internal.connection.f a() {
        return this.f14943b;
    }

    public void b() throws IOException {
        this.f14945d.h().close();
    }

    public void c(g0 g0Var) throws IOException {
        if (this.f14945d == null) {
            this.f14945d = this.f14944c.x(i(g0Var), g0Var.a() != null);
            if (!this.f14947f) {
                this.f14945d.l().timeout((long) this.f14942a.b(), TimeUnit.MILLISECONDS);
                this.f14945d.r().timeout((long) this.f14942a.c(), TimeUnit.MILLISECONDS);
                return;
            }
            this.f14945d.f(a.CANCEL);
            throw new IOException("Canceled");
        }
    }

    public void cancel() {
        this.f14947f = true;
        if (this.f14945d != null) {
            this.f14945d.f(a.CANCEL);
        }
    }

    public Source d(i0 i0Var) {
        return this.f14945d.i();
    }

    public i0.a e(boolean z) throws IOException {
        i0.a j = j(this.f14945d.p(), this.f14946e);
        if (!z || e.m0.c.f14665a.d(j) != 100) {
            return j;
        }
        return null;
    }

    public void f() throws IOException {
        this.f14944c.flush();
    }

    public long g(i0 i0Var) {
        return e.m0.h.e.b(i0Var);
    }

    public Sink h(g0 g0Var, long j) {
        return this.f14945d.h();
    }
}
