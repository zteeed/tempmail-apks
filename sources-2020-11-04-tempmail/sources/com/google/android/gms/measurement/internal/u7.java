package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class u7 extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private final SSLSocketFactory f10457a;

    u7() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private final SSLSocket a(SSLSocket sSLSocket) {
        return new t7(this, sSLSocket);
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return a((SSLSocket) this.f10457a.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.f10457a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f10457a.getSupportedCipherSuites();
    }

    private u7(SSLSocketFactory sSLSocketFactory) {
        this.f10457a = sSLSocketFactory;
    }

    public final Socket createSocket(String str, int i) throws IOException {
        return a((SSLSocket) this.f10457a.createSocket(str, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return a((SSLSocket) this.f10457a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return a((SSLSocket) this.f10457a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return a((SSLSocket) this.f10457a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket() throws IOException {
        return a((SSLSocket) this.f10457a.createSocket());
    }
}
