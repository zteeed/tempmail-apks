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
    private static final m[] f14184e = {m.q, m.r, m.s, m.k, m.m, m.l, m.n, m.p, m.o};

    /* renamed from: f  reason: collision with root package name */
    private static final m[] f14185f = {m.q, m.r, m.s, m.k, m.m, m.l, m.n, m.p, m.o, m.i, m.j, m.g, m.h, m.f14096e, m.f14097f, m.f14095d};
    public static final p g;
    public static final p h = new a(false).a();

    /* renamed from: a  reason: collision with root package name */
    final boolean f14186a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f14187b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    final String[] f14188c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    final String[] f14189d;

    static {
        a aVar = new a(true);
        aVar.c(f14184e);
        aVar.f(l0.TLS_1_3, l0.TLS_1_2);
        aVar.d(true);
        aVar.a();
        a aVar2 = new a(true);
        aVar2.c(f14185f);
        aVar2.f(l0.TLS_1_3, l0.TLS_1_2);
        aVar2.d(true);
        g = aVar2.a();
        a aVar3 = new a(true);
        aVar3.c(f14185f);
        aVar3.f(l0.TLS_1_3, l0.TLS_1_2, l0.TLS_1_1, l0.TLS_1_0);
        aVar3.d(true);
        aVar3.a();
    }

    p(a aVar) {
        this.f14186a = aVar.f14190a;
        this.f14188c = aVar.f14191b;
        this.f14189d = aVar.f14192c;
        this.f14187b = aVar.f14193d;
    }

    private p e(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.f14188c != null) {
            strArr = e.y(m.f14093b, sSLSocket.getEnabledCipherSuites(), this.f14188c);
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f14189d != null) {
            strArr2 = e.y(e.i, sSLSocket.getEnabledProtocols(), this.f14189d);
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int v = e.v(m.f14093b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
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
        String[] strArr = e2.f14189d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e2.f14188c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Nullable
    public List<m> b() {
        String[] strArr = this.f14188c;
        if (strArr != null) {
            return m.b(strArr);
        }
        return null;
    }

    public boolean c(SSLSocket sSLSocket) {
        if (!this.f14186a) {
            return false;
        }
        String[] strArr = this.f14189d;
        if (strArr != null && !e.B(e.i, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f14188c;
        if (strArr2 == null || e.B(m.f14093b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    public boolean d() {
        return this.f14186a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        p pVar = (p) obj;
        boolean z = this.f14186a;
        if (z != pVar.f14186a) {
            return false;
        }
        return !z || (Arrays.equals(this.f14188c, pVar.f14188c) && Arrays.equals(this.f14189d, pVar.f14189d) && this.f14187b == pVar.f14187b);
    }

    public boolean f() {
        return this.f14187b;
    }

    @Nullable
    public List<l0> g() {
        String[] strArr = this.f14189d;
        if (strArr != null) {
            return l0.g(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f14186a) {
            return ((((527 + Arrays.hashCode(this.f14188c)) * 31) + Arrays.hashCode(this.f14189d)) * 31) + (this.f14187b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f14186a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(g(), "[all enabled]") + ", supportsTlsExtensions=" + this.f14187b + ")";
    }

    /* compiled from: ConnectionSpec */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f14190a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        String[] f14191b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        String[] f14192c;

        /* renamed from: d  reason: collision with root package name */
        boolean f14193d;

        a(boolean z) {
            this.f14190a = z;
        }

        public p a() {
            return new p(this);
        }

        public a b(String... strArr) {
            if (!this.f14190a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f14191b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public a c(m... mVarArr) {
            if (this.f14190a) {
                String[] strArr = new String[mVarArr.length];
                for (int i = 0; i < mVarArr.length; i++) {
                    strArr[i] = mVarArr[i].f14098a;
                }
                b(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a d(boolean z) {
            if (this.f14190a) {
                this.f14193d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a e(String... strArr) {
            if (!this.f14190a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f14192c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public a f(l0... l0VarArr) {
            if (this.f14190a) {
                String[] strArr = new String[l0VarArr.length];
                for (int i = 0; i < l0VarArr.length; i++) {
                    strArr[i] = l0VarArr[i].f14092b;
                }
                e(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a(p pVar) {
            this.f14190a = pVar.f14186a;
            this.f14191b = pVar.f14188c;
            this.f14192c = pVar.f14189d;
            this.f14193d = pVar.f14187b;
        }
    }
}
