package e.m0.j;

import e.e0;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* compiled from: ConscryptPlatform */
public class c extends f {
    private c() {
    }

    public static c r() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new c();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private Provider s() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    public void f(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    public void g(SSLSocket sSLSocket, String str, List<e0> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) f.b(list).toArray(new String[0]));
            return;
        }
        super.g(sSLSocket, str, list);
    }

    public SSLContext k() {
        try {
            return SSLContext.getInstance("TLSv1.3", s());
        } catch (NoSuchAlgorithmException e2) {
            try {
                return SSLContext.getInstance("TLS", s());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e2);
            }
        }
    }

    @Nullable
    public String l(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.l(sSLSocket);
    }
}
