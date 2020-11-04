package okhttp3.internal.connection;

import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import e.a0;
import e.d0;
import e.e0;
import e.g0;
import e.h0;
import e.i0;
import e.j;
import e.k0;
import e.m0.c;
import e.m0.i.a;
import e.m0.l.d;
import e.n;
import e.v;
import e.x;
import e.z;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.http2.e;
import okhttp3.internal.http2.h;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* compiled from: RealConnection */
public final class f extends e.j implements n {

    /* renamed from: b  reason: collision with root package name */
    public final g f14838b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f14839c;

    /* renamed from: d  reason: collision with root package name */
    private Socket f14840d;

    /* renamed from: e  reason: collision with root package name */
    private Socket f14841e;

    /* renamed from: f  reason: collision with root package name */
    private x f14842f;
    private e0 g;
    private e h;
    private BufferedSource i;
    private BufferedSink j;
    boolean k;
    int l;
    int m;
    private int n;
    private int o = 1;
    final List<Reference<j>> p = new ArrayList();
    long q = Long.MAX_VALUE;

    public f(g gVar, k0 k0Var) {
        this.f14838b = gVar;
        this.f14839c = k0Var;
    }

    private void f(int i2, int i3, j jVar, v vVar) throws IOException {
        Socket socket;
        Proxy b2 = this.f14839c.b();
        e.e a2 = this.f14839c.a();
        if (b2.type() == Proxy.Type.DIRECT || b2.type() == Proxy.Type.HTTP) {
            socket = a2.j().createSocket();
        } else {
            socket = new Socket(b2);
        }
        this.f14840d = socket;
        vVar.f(jVar, this.f14839c.d(), b2);
        this.f14840d.setSoTimeout(i3);
        try {
            e.m0.j.f.j().h(this.f14840d, this.f14839c.d(), i2);
            try {
                this.i = Okio.buffer(Okio.source(this.f14840d));
                this.j = Okio.buffer(Okio.sink(this.f14840d));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f14839c.d());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0137 A[Catch:{ all -> 0x012e }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013d A[Catch:{ all -> 0x012e }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0140  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g(okhttp3.internal.connection.c r8) throws java.io.IOException {
        /*
            r7 = this;
            e.k0 r0 = r7.f14839c
            e.e r0 = r0.a()
            javax.net.ssl.SSLSocketFactory r1 = r0.k()
            r2 = 0
            java.net.Socket r3 = r7.f14840d     // Catch:{ AssertionError -> 0x0130 }
            e.z r4 = r0.l()     // Catch:{ AssertionError -> 0x0130 }
            java.lang.String r4 = r4.m()     // Catch:{ AssertionError -> 0x0130 }
            e.z r5 = r0.l()     // Catch:{ AssertionError -> 0x0130 }
            int r5 = r5.z()     // Catch:{ AssertionError -> 0x0130 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x0130 }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x0130 }
            e.p r8 = r8.a(r1)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            boolean r3 = r8.f()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            if (r3 == 0) goto L_0x0041
            e.m0.j.f r3 = e.m0.j.f.j()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            e.z r4 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r4 = r4.m()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.util.List r5 = r0.f()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r3.g(r1, r4, r5)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
        L_0x0041:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            e.x r4 = e.x.b(r3)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            javax.net.ssl.HostnameVerifier r5 = r0.e()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            e.z r6 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r6 = r6.m()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            if (r3 != 0) goto L_0x00d8
            java.util.List r8 = r4.d()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            boolean r2 = r8.isEmpty()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r3 = "Hostname "
            if (r2 != 0) goto L_0x00b6
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.<init>()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.append(r3)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            e.z r0 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = r0.m()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = e.l.c(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = "\n    DN: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.util.List r8 = e.m0.l.d.a(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r4.append(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r8 = r4.toString()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            throw r2     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
        L_0x00b6:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r2.<init>()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r2.append(r3)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            e.z r0 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = r0.m()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r2.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = r2.toString()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r8.<init>(r0)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            throw r8     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
        L_0x00d8:
            e.l r3 = r0.a()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            e.z r0 = r0.l()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r0 = r0.m()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.util.List r5 = r4.d()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r3.a(r0, r5)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            boolean r8 = r8.f()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            if (r8 == 0) goto L_0x00f9
            e.m0.j.f r8 = e.m0.j.f.j()     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.lang.String r2 = r8.l(r1)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
        L_0x00f9:
            r7.f14841e = r1     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            okio.Source r8 = okio.Okio.source((java.net.Socket) r1)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            okio.BufferedSource r8 = okio.Okio.buffer((okio.Source) r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r7.i = r8     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            java.net.Socket r8 = r7.f14841e     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            okio.Sink r8 = okio.Okio.sink((java.net.Socket) r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            okio.BufferedSink r8 = okio.Okio.buffer((okio.Sink) r8)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r7.j = r8     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            r7.f14842f = r4     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            if (r2 == 0) goto L_0x011a
            e.e0 r8 = e.e0.f(r2)     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            goto L_0x011c
        L_0x011a:
            e.e0 r8 = e.e0.HTTP_1_1     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
        L_0x011c:
            r7.g = r8     // Catch:{ AssertionError -> 0x012b, all -> 0x0128 }
            if (r1 == 0) goto L_0x0127
            e.m0.j.f r8 = e.m0.j.f.j()
            r8.a(r1)
        L_0x0127:
            return
        L_0x0128:
            r8 = move-exception
            r2 = r1
            goto L_0x013e
        L_0x012b:
            r8 = move-exception
            r2 = r1
            goto L_0x0131
        L_0x012e:
            r8 = move-exception
            goto L_0x013e
        L_0x0130:
            r8 = move-exception
        L_0x0131:
            boolean r0 = e.m0.e.z(r8)     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x013d
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x012e }
            r0.<init>(r8)     // Catch:{ all -> 0x012e }
            throw r0     // Catch:{ all -> 0x012e }
        L_0x013d:
            throw r8     // Catch:{ all -> 0x012e }
        L_0x013e:
            if (r2 == 0) goto L_0x0147
            e.m0.j.f r0 = e.m0.j.f.j()
            r0.a(r2)
        L_0x0147:
            e.m0.e.g(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.f.g(okhttp3.internal.connection.c):void");
    }

    private void h(int i2, int i3, int i4, j jVar, v vVar) throws IOException {
        g0 j2 = j();
        z i5 = j2.i();
        int i6 = 0;
        while (i6 < 21) {
            f(i2, i3, jVar, vVar);
            j2 = i(i3, i4, j2, i5);
            if (j2 != null) {
                e.m0.e.g(this.f14840d);
                this.f14840d = null;
                this.j = null;
                this.i = null;
                vVar.d(jVar, this.f14839c.d(), this.f14839c.b(), (e0) null);
                i6++;
            } else {
                return;
            }
        }
    }

    private g0 i(int i2, int i3, g0 g0Var, z zVar) throws IOException {
        String str = "CONNECT " + e.m0.e.r(zVar, true) + " HTTP/1.1";
        while (true) {
            a aVar = new a((d0) null, (f) null, this.i, this.j);
            this.i.timeout().timeout((long) i2, TimeUnit.MILLISECONDS);
            this.j.timeout().timeout((long) i3, TimeUnit.MILLISECONDS);
            aVar.B(g0Var.d(), str);
            aVar.b();
            i0.a e2 = aVar.e(false);
            e2.q(g0Var);
            i0 c2 = e2.c();
            aVar.A(c2);
            int d2 = c2.d();
            if (d2 != 200) {
                if (d2 == 407) {
                    g0 a2 = this.f14839c.a().h().a(this.f14839c, c2);
                    if (a2 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if ("close".equalsIgnoreCase(c2.f("Connection"))) {
                        return a2;
                    } else {
                        g0Var = a2;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c2.d());
                }
            } else if (this.i.getBuffer().exhausted() && this.j.buffer().exhausted()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private g0 j() throws IOException {
        g0.a aVar = new g0.a();
        aVar.i(this.f14839c.a().l());
        aVar.e("CONNECT", (h0) null);
        aVar.c("Host", e.m0.e.r(this.f14839c.a().l(), true));
        aVar.c("Proxy-Connection", "Keep-Alive");
        aVar.c(AbstractSpiCall.HEADER_USER_AGENT, e.m0.f.a());
        g0 a2 = aVar.a();
        i0.a aVar2 = new i0.a();
        aVar2.q(a2);
        aVar2.o(e0.HTTP_1_1);
        aVar2.g(407);
        aVar2.l("Preemptive Authenticate");
        aVar2.b(e.m0.e.f14670d);
        aVar2.r(-1);
        aVar2.p(-1);
        aVar2.i("Proxy-Authenticate", "OkHttp-Preemptive");
        g0 a3 = this.f14839c.a().h().a(this.f14839c, aVar2.c());
        return a3 != null ? a3 : a2;
    }

    private void k(c cVar, int i2, j jVar, v vVar) throws IOException {
        if (this.f14839c.a().k() != null) {
            vVar.x(jVar);
            g(cVar);
            vVar.w(jVar, this.f14842f);
            if (this.g == e0.HTTP_2) {
                u(i2);
            }
        } else if (this.f14839c.a().f().contains(e0.H2_PRIOR_KNOWLEDGE)) {
            this.f14841e = this.f14840d;
            this.g = e0.H2_PRIOR_KNOWLEDGE;
            u(i2);
        } else {
            this.f14841e = this.f14840d;
            this.g = e0.HTTP_1_1;
        }
    }

    private boolean s(List<k0> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            k0 k0Var = list.get(i2);
            if (k0Var.b().type() == Proxy.Type.DIRECT && this.f14839c.b().type() == Proxy.Type.DIRECT && this.f14839c.d().equals(k0Var.d())) {
                return true;
            }
        }
        return false;
    }

    private void u(int i2) throws IOException {
        this.f14841e.setSoTimeout(0);
        e.h hVar = new e.h(true);
        hVar.d(this.f14841e, this.f14839c.a().l().m(), this.i, this.j);
        hVar.b(this);
        hVar.c(i2);
        e a2 = hVar.a();
        this.h = a2;
        a2.L();
    }

    public e0 a() {
        return this.g;
    }

    public void b(e eVar) {
        synchronized (this.f14838b) {
            this.o = eVar.u();
        }
    }

    public void c(h hVar) throws IOException {
        hVar.d(okhttp3.internal.http2.a.REFUSED_STREAM, (IOException) null);
    }

    public void d() {
        e.m0.e.g(this.f14840d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090 A[Catch:{ IOException -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(int r17, int r18, int r19, int r20, boolean r21, e.j r22, e.v r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            e.e0 r0 = r7.g
            if (r0 != 0) goto L_0x0150
            e.k0 r0 = r7.f14839c
            e.e r0 = r0.a()
            java.util.List r0 = r0.b()
            okhttp3.internal.connection.c r10 = new okhttp3.internal.connection.c
            r10.<init>(r0)
            e.k0 r1 = r7.f14839c
            e.e r1 = r1.a()
            javax.net.ssl.SSLSocketFactory r1 = r1.k()
            if (r1 != 0) goto L_0x0074
            e.p r1 = e.p.h
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0067
            e.k0 r0 = r7.f14839c
            e.e r0 = r0.a()
            e.z r0 = r0.l()
            java.lang.String r0 = r0.m()
            e.m0.j.f r1 = e.m0.j.f.j()
            boolean r1 = r1.n(r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x0086
        L_0x0046:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0067:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0074:
            e.k0 r0 = r7.f14839c
            e.e r0 = r0.a()
            java.util.List r0 = r0.f()
            e.e0 r1 = e.e0.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0143
        L_0x0086:
            r11 = 0
            r12 = r11
        L_0x0088:
            e.k0 r0 = r7.f14839c     // Catch:{ IOException -> 0x00f9 }
            boolean r0 = r0.c()     // Catch:{ IOException -> 0x00f9 }
            if (r0 == 0) goto L_0x00a9
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.h(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f9 }
            java.net.Socket r0 = r7.f14840d     // Catch:{ IOException -> 0x00f9 }
            if (r0 != 0) goto L_0x00a4
            goto L_0x00c6
        L_0x00a4:
            r13 = r17
            r14 = r18
            goto L_0x00b0
        L_0x00a9:
            r13 = r17
            r14 = r18
            r7.f(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00f7 }
        L_0x00b0:
            r15 = r20
            r7.k(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00f5 }
            e.k0 r0 = r7.f14839c     // Catch:{ IOException -> 0x00f5 }
            java.net.InetSocketAddress r0 = r0.d()     // Catch:{ IOException -> 0x00f5 }
            e.k0 r1 = r7.f14839c     // Catch:{ IOException -> 0x00f5 }
            java.net.Proxy r1 = r1.b()     // Catch:{ IOException -> 0x00f5 }
            e.e0 r2 = r7.g     // Catch:{ IOException -> 0x00f5 }
            r9.d(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f5 }
        L_0x00c6:
            e.k0 r0 = r7.f14839c
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00e0
            java.net.Socket r0 = r7.f14840d
            if (r0 == 0) goto L_0x00d3
            goto L_0x00e0
        L_0x00d3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            throw r1
        L_0x00e0:
            okhttp3.internal.http2.e r0 = r7.h
            if (r0 == 0) goto L_0x00f4
            okhttp3.internal.connection.g r1 = r7.f14838b
            monitor-enter(r1)
            okhttp3.internal.http2.e r0 = r7.h     // Catch:{ all -> 0x00f1 }
            int r0 = r0.u()     // Catch:{ all -> 0x00f1 }
            r7.o = r0     // Catch:{ all -> 0x00f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f4
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            throw r0
        L_0x00f4:
            return
        L_0x00f5:
            r0 = move-exception
            goto L_0x0100
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fe
        L_0x00f9:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00fe:
            r15 = r20
        L_0x0100:
            java.net.Socket r1 = r7.f14841e
            e.m0.e.g(r1)
            java.net.Socket r1 = r7.f14840d
            e.m0.e.g(r1)
            r7.f14841e = r11
            r7.f14840d = r11
            r7.i = r11
            r7.j = r11
            r7.f14842f = r11
            r7.g = r11
            r7.h = r11
            e.k0 r1 = r7.f14839c
            java.net.InetSocketAddress r3 = r1.d()
            e.k0 r1 = r7.f14839c
            java.net.Proxy r4 = r1.b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.e(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0135
            okhttp3.internal.connection.RouteException r12 = new okhttp3.internal.connection.RouteException
            r12.<init>(r0)
            goto L_0x0138
        L_0x0135:
            r12.a(r0)
        L_0x0138:
            if (r21 == 0) goto L_0x0142
            boolean r0 = r10.b(r0)
            if (r0 == 0) goto L_0x0142
            goto L_0x0088
        L_0x0142:
            throw r12
        L_0x0143:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0150:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.f.e(int, int, int, int, boolean, e.j, e.v):void");
    }

    public x l() {
        return this.f14842f;
    }

    /* access modifiers changed from: package-private */
    public boolean m(e.e eVar, @Nullable List<k0> list) {
        if (this.p.size() >= this.o || this.k || !c.f14665a.e(this.f14839c.a(), eVar)) {
            return false;
        }
        if (eVar.l().m().equals(r().a().l().m())) {
            return true;
        }
        if (this.h == null || list == null || !s(list) || eVar.e() != d.f14748a || !v(eVar.l())) {
            return false;
        }
        try {
            eVar.a().a(eVar.l().m(), l().d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean n(boolean z) {
        int soTimeout;
        if (this.f14841e.isClosed() || this.f14841e.isInputShutdown() || this.f14841e.isOutputShutdown()) {
            return false;
        }
        e eVar = this.h;
        if (eVar != null) {
            return eVar.t(System.nanoTime());
        }
        if (z) {
            try {
                soTimeout = this.f14841e.getSoTimeout();
                this.f14841e.setSoTimeout(1);
                if (this.i.exhausted()) {
                    this.f14841e.setSoTimeout(soTimeout);
                    return false;
                }
                this.f14841e.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.f14841e.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    public boolean o() {
        return this.h != null;
    }

    /* access modifiers changed from: package-private */
    public e.m0.h.c p(d0 d0Var, a0.a aVar) throws SocketException {
        if (this.h != null) {
            return new okhttp3.internal.http2.f(d0Var, this, aVar, this.h);
        }
        this.f14841e.setSoTimeout(aVar.b());
        this.i.timeout().timeout((long) aVar.b(), TimeUnit.MILLISECONDS);
        this.j.timeout().timeout((long) aVar.c(), TimeUnit.MILLISECONDS);
        return new a(d0Var, this, this.i, this.j);
    }

    public void q() {
        synchronized (this.f14838b) {
            this.k = true;
        }
    }

    public k0 r() {
        return this.f14839c;
    }

    public Socket t() {
        return this.f14841e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f14839c.a().l().m());
        sb.append(":");
        sb.append(this.f14839c.a().l().z());
        sb.append(", proxy=");
        sb.append(this.f14839c.b());
        sb.append(" hostAddress=");
        sb.append(this.f14839c.d());
        sb.append(" cipherSuite=");
        x xVar = this.f14842f;
        sb.append(xVar != null ? xVar.a() : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }

    public boolean v(z zVar) {
        if (zVar.z() != this.f14839c.a().l().z()) {
            return false;
        }
        if (zVar.m().equals(this.f14839c.a().l().m())) {
            return true;
        }
        if (this.f14842f == null || !d.f14748a.c(zVar.m(), (X509Certificate) this.f14842f.d().get(0))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void w(@Nullable IOException iOException) {
        synchronized (this.f14838b) {
            if (iOException instanceof StreamResetException) {
                okhttp3.internal.http2.a aVar = ((StreamResetException) iOException).f14866b;
                if (aVar == okhttp3.internal.http2.a.REFUSED_STREAM) {
                    int i2 = this.n + 1;
                    this.n = i2;
                    if (i2 > 1) {
                        this.k = true;
                        this.l++;
                    }
                } else if (aVar != okhttp3.internal.http2.a.CANCEL) {
                    this.k = true;
                    this.l++;
                }
            } else if (!o() || (iOException instanceof ConnectionShutdownException)) {
                this.k = true;
                if (this.m == 0) {
                    if (iOException != null) {
                        this.f14838b.b(this.f14839c, iOException);
                    }
                    this.l++;
                }
            }
        }
    }
}
