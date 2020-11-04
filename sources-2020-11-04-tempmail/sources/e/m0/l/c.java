package e.m0.l;

import e.m0.j.f;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: CertificateChainCleaner */
public abstract class c {
    public static c b(X509TrustManager x509TrustManager) {
        return f.j().c(x509TrustManager);
    }

    public abstract List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
