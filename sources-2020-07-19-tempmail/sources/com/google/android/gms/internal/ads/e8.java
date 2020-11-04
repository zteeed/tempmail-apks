package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class e8 extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private SSLSocketFactory f3687a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ c8 f3688b;

    e8(c8 c8Var) {
        this.f3688b = c8Var;
    }

    private final Socket a(Socket socket) throws SocketException {
        if (this.f3688b.o > 0) {
            socket.setReceiveBufferSize(this.f3688b.o);
        }
        this.f3688b.e(socket);
        return socket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f3687a.createSocket(socket, str, i, z);
        a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f3687a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f3687a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.f3687a.createSocket(str, i);
        a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.f3687a.createSocket(str, i, inetAddress, i2);
        a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.f3687a.createSocket(inetAddress, i);
        a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.f3687a.createSocket(inetAddress, i, inetAddress2, i2);
        a(createSocket);
        return createSocket;
    }
}
