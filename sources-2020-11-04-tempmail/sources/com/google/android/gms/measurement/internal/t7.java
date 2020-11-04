package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class t7 extends SSLSocket {

    /* renamed from: b  reason: collision with root package name */
    private final SSLSocket f10444b;

    t7(u7 u7Var, SSLSocket sSLSocket) {
        this.f10444b = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f10444b.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void bind(SocketAddress socketAddress) throws IOException {
        this.f10444b.bind(socketAddress);
    }

    public final synchronized void close() throws IOException {
        this.f10444b.close();
    }

    public final void connect(SocketAddress socketAddress) throws IOException {
        this.f10444b.connect(socketAddress);
    }

    public final boolean equals(Object obj) {
        return this.f10444b.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.f10444b.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.f10444b.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f10444b.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.f10444b.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.f10444b.getInetAddress();
    }

    public final InputStream getInputStream() throws IOException {
        return this.f10444b.getInputStream();
    }

    public final boolean getKeepAlive() throws SocketException {
        return this.f10444b.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f10444b.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f10444b.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f10444b.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.f10444b.getNeedClientAuth();
    }

    public final boolean getOOBInline() throws SocketException {
        return this.f10444b.getOOBInline();
    }

    public final OutputStream getOutputStream() throws IOException {
        return this.f10444b.getOutputStream();
    }

    public final int getPort() {
        return this.f10444b.getPort();
    }

    public final synchronized int getReceiveBufferSize() throws SocketException {
        return this.f10444b.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f10444b.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() throws SocketException {
        return this.f10444b.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() throws SocketException {
        return this.f10444b.getSendBufferSize();
    }

    public final SSLSession getSession() {
        return this.f10444b.getSession();
    }

    public final int getSoLinger() throws SocketException {
        return this.f10444b.getSoLinger();
    }

    public final synchronized int getSoTimeout() throws SocketException {
        return this.f10444b.getSoTimeout();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f10444b.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.f10444b.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() throws SocketException {
        return this.f10444b.getTcpNoDelay();
    }

    public final int getTrafficClass() throws SocketException {
        return this.f10444b.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.f10444b.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.f10444b.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.f10444b.isBound();
    }

    public final boolean isClosed() {
        return this.f10444b.isClosed();
    }

    public final boolean isConnected() {
        return this.f10444b.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f10444b.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f10444b.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f10444b.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void sendUrgentData(int i) throws IOException {
        this.f10444b.sendUrgentData(i);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f10444b.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f10444b.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f10444b.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f10444b.setEnabledProtocols(strArr);
    }

    public final void setKeepAlive(boolean z) throws SocketException {
        this.f10444b.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.f10444b.setNeedClientAuth(z);
    }

    public final void setOOBInline(boolean z) throws SocketException {
        this.f10444b.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f10444b.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) throws SocketException {
        this.f10444b.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) throws SocketException {
        this.f10444b.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) throws SocketException {
        this.f10444b.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) throws SocketException {
        this.f10444b.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) throws SocketException {
        this.f10444b.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) throws SocketException {
        this.f10444b.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) throws SocketException {
        this.f10444b.setTrafficClass(i);
    }

    public final void setUseClientMode(boolean z) {
        this.f10444b.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f10444b.setWantClientAuth(z);
    }

    public final void shutdownInput() throws IOException {
        this.f10444b.shutdownInput();
    }

    public final void shutdownOutput() throws IOException {
        this.f10444b.shutdownOutput();
    }

    public final void startHandshake() throws IOException {
        this.f10444b.startHandshake();
    }

    public final String toString() {
        return this.f10444b.toString();
    }

    public final void connect(SocketAddress socketAddress, int i) throws IOException {
        this.f10444b.connect(socketAddress, i);
    }
}
