package e;

import e.m0.e;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: Handshake */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final l0 f14781a;

    /* renamed from: b  reason: collision with root package name */
    private final m f14782b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Certificate> f14783c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Certificate> f14784d;

    private x(l0 l0Var, m mVar, List<Certificate> list, List<Certificate> list2) {
        this.f14781a = l0Var;
        this.f14782b = mVar;
        this.f14783c = list;
        this.f14784d = list2;
    }

    public static x b(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            m a2 = m.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                l0 f2 = l0.f(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = e.t(certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = e.t(localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new x(f2, a2, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    private List<String> c(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate next : list) {
            if (next instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) next).getSubjectDN()));
            } else {
                arrayList.add(next.getType());
            }
        }
        return arrayList;
    }

    public m a() {
        return this.f14782b;
    }

    public List<Certificate> d() {
        return this.f14783c;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f14781a.equals(xVar.f14781a) || !this.f14782b.equals(xVar.f14782b) || !this.f14783c.equals(xVar.f14783c) || !this.f14784d.equals(xVar.f14784d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.f14781a.hashCode()) * 31) + this.f14782b.hashCode()) * 31) + this.f14783c.hashCode()) * 31) + this.f14784d.hashCode();
    }

    public String toString() {
        return "Handshake{tlsVersion=" + this.f14781a + " cipherSuite=" + this.f14782b + " peerCertificates=" + c(this.f14783c) + " localCertificates=" + c(this.f14784d) + '}';
    }
}
