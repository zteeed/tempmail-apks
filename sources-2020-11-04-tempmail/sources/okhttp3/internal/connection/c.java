package okhttp3.internal.connection;

import e.p;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* compiled from: ConnectionSpecSelector */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<p> f14812a;

    /* renamed from: b  reason: collision with root package name */
    private int f14813b = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14814c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14815d;

    c(List<p> list) {
        this.f14812a = list;
    }

    private boolean c(SSLSocket sSLSocket) {
        for (int i = this.f14813b; i < this.f14812a.size(); i++) {
            if (this.f14812a.get(i).c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public p a(SSLSocket sSLSocket) throws IOException {
        p pVar;
        int i = this.f14813b;
        int size = this.f14812a.size();
        while (true) {
            if (i >= size) {
                pVar = null;
                break;
            }
            pVar = this.f14812a.get(i);
            if (pVar.c(sSLSocket)) {
                this.f14813b = i + 1;
                break;
            }
            i++;
        }
        if (pVar != null) {
            this.f14814c = c(sSLSocket);
            e.m0.c.f14665a.c(pVar, sSLSocket, this.f14815d);
            return pVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f14815d + ", modes=" + this.f14812a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* access modifiers changed from: package-private */
    public boolean b(IOException iOException) {
        this.f14815d = true;
        if (!this.f14814c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return iOException instanceof SSLException;
        }
        return false;
    }
}
