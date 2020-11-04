package e;

import e.m0.e;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* compiled from: ConnectionSpec */
public final class p {

    /* renamed from: e  reason: collision with root package name */
    private static final m[] f14750e = {m.q, m.r, m.s, m.k, m.m, m.l, m.n, m.p, m.o};

    /* renamed from: f  reason: collision with root package name */
    private static final m[] f14751f = {m.q, m.r, m.s, m.k, m.m, m.l, m.n, m.p, m.o, m.i, m.j, m.g, m.h, m.f14659e, m.f14660f, m.f14658d};
    public static final p g;
    public static final p h = new a(false).a();

    /* renamed from: a  reason: collision with root package name */
    final boolean f14752a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f14753b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    final String[] f14754c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    final String[] f14755d;

    static {
        a aVar = new a(true);
        aVar.c(f14750e);
        aVar.f(l0.TLS_1_3, l0.TLS_1_2);
        aVar.d(true);
        aVar.a();
        a aVar2 = new a(true);
        aVar2.c(f14751f);
        aVar2.f(l0.TLS_1_3, l0.TLS_1_2);
        aVar2.d(true);
        g = aVar2.a();
        a aVar3 = new a(true);
        aVar3.c(f14751f);
        aVar3.f(l0.TLS_1_3, l0.TLS_1_2, l0.TLS_1_1, l0.TLS_1_0);
        aVar3.d(true);
        aVar3.a();
    }

    p(a aVar) {
        this.f14752a = aVar.f14756a;
        this.f14754c = aVar.f14757b;
        this.f14755d = aVar.f14758c;
        this.f14753b = aVar.f14759d;
    }

    private p e(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.f14754c != null) {
            strArr = e.y(m.f14656b, sSLSocket.getEnabledCipherSuites(), this.f14754c);
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f14755d != null) {
            strArr2 = e.y(e.i, sSLSocket.getEnabledProtocols(), this.f14755d);
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int v = e.v(m.f14656b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && v != -1) {
            strArr = e.h(strArr, supportedCipherSuites[v]);
        }
        a aVar = new a(this);
        aVar.b(strArr);
        aVar.e(strArr2);
        return aVar.a();
    }

    /* access modifiers changed from: package-private */
    public void a(SSLSocket sSLSocket, boolean z) {
        p e2 = e(sSLSocket, z);
        String[] strArr = e2.f14755d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e2.f14754c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Nullable
    public List<m> b() {
        String[] strArr = this.f14754c;
        if (strArr != null) {
            return m.b(strArr);
        }
        return null;
    }

    public boolean c(SSLSocket sSLSocket) {
        if (!this.f14752a) {
            return false;
        }
        String[] strArr = this.f14755d;
        if (strArr != null && !e.B(e.i, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f14754c;
        if (strArr2 == null || e.B(m.f14656b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    public boolean d() {
        return this.f14752a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        p pVar = (p) obj;
        boolean z = this.f14752a;
        if (z != pVar.f14752a) {
            return false;
        }
        return !z || (Arrays.equals(this.f14754c, pVar.f14754c) && Arrays.equals(this.f14755d, pVar.f14755d) && this.f14753b == pVar.f14753b);
    }

    public boolean f() {
        return this.f14753b;
    }

    @Nullable
    public List<l0> g() {
        String[] strArr = this.f14755d;
        if (strArr != null) {
            return l0.g(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f14752a) {
            return ((((527 + Arrays.hashCode(this.f14754c)) * 31) + Arrays.hashCode(this.f14755d)) * 31) + (this.f14753b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f14752a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(g(), "[all enabled]") + ", supportsTlsExtensions=" + this.f14753b + ")";
    }

    /* compiled from: ConnectionSpec */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f14756a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        String[] f14757b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        String[] f14758c;

        /* renamed from: d  reason: collision with root package name */
        boolean f14759d;

        a(boolean z) {
            this.f14756a = z;
        }

        public p a() {
            return new p(this);
        }

        public a b(String... strArr) {
            if (!this.f14756a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f14757b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public a c(m... mVarArr) {
            if (this.f14756a) {
                String[] strArr = new String[mVarArr.length];
                for (int i = 0; i < mVarArr.length; i++) {
                    strArr[i] = mVarArr[i].f14661a;
                }
                b(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a d(boolean z) {
            if (this.f14756a) {
                this.f14759d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a e(String... strArr) {
            if (!this.f14756a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f14758c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public a f(l0... l0VarArr) {
            if (this.f14756a) {
                String[] strArr = new String[l0VarArr.length];
                for (int i = 0; i < l0VarArr.length; i++) {
                    strArr[i] = l0VarArr[i].f14655b;
                }
                e(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a(p pVar) {
            this.f14756a = pVar.f14752a;
            this.f14757b = pVar.f14754c;
            this.f14758c = pVar.f14755d;
            this.f14759d = pVar.f14753b;
        }
    }
}
