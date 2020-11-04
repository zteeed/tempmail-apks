package e.m0.j;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import e.e0;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@SuppressLint({"NewApi"})
/* compiled from: Android10Platform */
class a extends b {
    a(Class<?> cls) {
        super(cls, (Class<?>) null, (Method) null, (Method) null, (Method) null, (Method) null);
    }

    @Nullable
    public static f t() {
        try {
            if (b.u() >= 29) {
                return new a(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
            return null;
        } catch (ReflectiveOperationException unused) {
            return null;
        }
    }

    private void v(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    public void g(SSLSocket sSLSocket, String str, List<e0> list) {
        v(sSLSocket);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) f.b(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Nullable
    @IgnoreJRERequirement
    public String l(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
