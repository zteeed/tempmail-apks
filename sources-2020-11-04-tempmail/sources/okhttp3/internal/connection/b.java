package okhttp3.internal.connection;

import e.a0;
import e.d0;
import e.g0;
import e.i0;
import e.m0.h.g;
import java.io.IOException;

/* compiled from: ConnectInterceptor */
public final class b implements a0 {
    public b(d0 d0Var) {
    }

    public i0 a(a0.a aVar) throws IOException {
        g gVar = (g) aVar;
        g0 request = gVar.request();
        j h = gVar.h();
        return gVar.g(request, h, h.k(aVar, !request.f().equals("GET")));
    }
}
