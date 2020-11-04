package e.m0.h;

import e.a0;
import e.d0;
import e.g0;
import e.h0;
import e.i0;
import e.k0;
import e.m0.e;
import e.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.annotation.Nullable;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: RetryAndFollowUpInterceptor */
public final class j implements a0 {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f14700a;

    public j(d0 d0Var) {
        this.f14700a = d0Var;
    }

    private g0 b(i0 i0Var, @Nullable k0 k0Var) throws IOException {
        String f2;
        z D;
        Proxy proxy;
        if (i0Var != null) {
            int d2 = i0Var.d();
            String f3 = i0Var.q().f();
            h0 h0Var = null;
            if (d2 == 307 || d2 == 308) {
                if (!f3.equals("GET") && !f3.equals("HEAD")) {
                    return null;
                }
            } else if (d2 == 401) {
                return this.f14700a.c().a(k0Var, i0Var);
            } else {
                if (d2 != 503) {
                    if (d2 == 407) {
                        if (k0Var != null) {
                            proxy = k0Var.b();
                        } else {
                            proxy = this.f14700a.D();
                        }
                        if (proxy.type() == Proxy.Type.HTTP) {
                            return this.f14700a.E().a(k0Var, i0Var);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    } else if (d2 != 408) {
                        switch (d2) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!this.f14700a.I()) {
                        return null;
                    } else {
                        h0 a2 = i0Var.q().a();
                        if (a2 != null && a2.isOneShot()) {
                            return null;
                        }
                        if ((i0Var.o() == null || i0Var.o().d() != 408) && f(i0Var, 0) <= 0) {
                            return i0Var.q();
                        }
                        return null;
                    }
                } else if ((i0Var.o() == null || i0Var.o().d() != 503) && f(i0Var, Integer.MAX_VALUE) == 0) {
                    return i0Var.q();
                } else {
                    return null;
                }
            }
            if (!this.f14700a.o() || (f2 = i0Var.f("Location")) == null || (D = i0Var.q().i().D(f2)) == null) {
                return null;
            }
            if (!D.E().equals(i0Var.q().i().E()) && !this.f14700a.p()) {
                return null;
            }
            g0.a g = i0Var.q().g();
            if (f.b(f3)) {
                boolean d3 = f.d(f3);
                if (f.c(f3)) {
                    g.e("GET", (h0) null);
                } else {
                    if (d3) {
                        h0Var = i0Var.q().a();
                    }
                    g.e(f3, h0Var);
                }
                if (!d3) {
                    g.f("Transfer-Encoding");
                    g.f("Content-Length");
                    g.f("Content-Type");
                }
            }
            if (!e.D(i0Var.q().i(), D)) {
                g.f("Authorization");
            }
            g.i(D);
            return g.a();
        }
        throw new IllegalStateException();
    }

    private boolean c(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean d(IOException iOException, okhttp3.internal.connection.j jVar, boolean z, g0 g0Var) {
        if (!this.f14700a.I()) {
            return false;
        }
        if ((!z || !e(iOException, g0Var)) && c(iOException, z) && jVar.c()) {
            return true;
        }
        return false;
    }

    private boolean e(IOException iOException, g0 g0Var) {
        h0 a2 = g0Var.a();
        return (a2 != null && a2.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private int f(i0 i0Var, int i) {
        String f2 = i0Var.f("Retry-After");
        if (f2 == null) {
            return i;
        }
        if (f2.matches("\\d+")) {
            return Integer.valueOf(f2).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b1, code lost:
        r1.f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.i0 a(e.a0.a r9) throws java.io.IOException {
        /*
            r8 = this;
            e.g0 r0 = r9.request()
            e.m0.h.g r9 = (e.m0.h.g) r9
            okhttp3.internal.connection.j r1 = r9.h()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = 0
        L_0x000e:
            r1.m(r0)
            boolean r6 = r1.i()
            if (r6 != 0) goto L_0x00bf
            e.i0 r0 = r9.g(r0, r1, r3)     // Catch:{ RouteException -> 0x00a6, IOException -> 0x0096 }
            if (r4 == 0) goto L_0x0033
            e.i0$a r0 = r0.n()
            e.i0$a r4 = r4.n()
            r4.b(r3)
            e.i0 r4 = r4.c()
            r0.n(r4)
            e.i0 r0 = r0.c()
        L_0x0033:
            r4 = r0
            e.m0.c r0 = e.m0.c.f14665a
            okhttp3.internal.connection.d r0 = r0.f(r4)
            if (r0 == 0) goto L_0x0045
            okhttp3.internal.connection.f r6 = r0.c()
            e.k0 r6 = r6.r()
            goto L_0x0046
        L_0x0045:
            r6 = r3
        L_0x0046:
            e.g0 r6 = r8.b(r4, r6)
            if (r6 != 0) goto L_0x0058
            if (r0 == 0) goto L_0x0057
            boolean r9 = r0.h()
            if (r9 == 0) goto L_0x0057
            r1.p()
        L_0x0057:
            return r4
        L_0x0058:
            e.h0 r7 = r6.a()
            if (r7 == 0) goto L_0x0065
            boolean r7 = r7.isOneShot()
            if (r7 == 0) goto L_0x0065
            return r4
        L_0x0065:
            e.j0 r7 = r4.a()
            e.m0.e.f(r7)
            boolean r7 = r1.h()
            if (r7 == 0) goto L_0x0075
            r0.e()
        L_0x0075:
            int r5 = r5 + 1
            r0 = 20
            if (r5 > r0) goto L_0x007d
            r0 = r6
            goto L_0x000e
        L_0x007d:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Too many follow-up requests: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x0094:
            r9 = move-exception
            goto L_0x00bb
        L_0x0096:
            r6 = move-exception
            boolean r7 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0094 }
            if (r7 != 0) goto L_0x009d
            r7 = 1
            goto L_0x009e
        L_0x009d:
            r7 = 0
        L_0x009e:
            boolean r7 = r8.d(r6, r1, r7, r0)     // Catch:{ all -> 0x0094 }
            if (r7 == 0) goto L_0x00a5
            goto L_0x00b1
        L_0x00a5:
            throw r6     // Catch:{ all -> 0x0094 }
        L_0x00a6:
            r6 = move-exception
            java.io.IOException r7 = r6.c()     // Catch:{ all -> 0x0094 }
            boolean r7 = r8.d(r7, r1, r2, r0)     // Catch:{ all -> 0x0094 }
            if (r7 == 0) goto L_0x00b6
        L_0x00b1:
            r1.f()
            goto L_0x000e
        L_0x00b6:
            java.io.IOException r9 = r6.b()     // Catch:{ all -> 0x0094 }
            throw r9     // Catch:{ all -> 0x0094 }
        L_0x00bb:
            r1.f()
            throw r9
        L_0x00bf:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e.m0.h.j.a(e.a0$a):e.i0");
    }
}
