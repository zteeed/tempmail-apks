package e.m0.h;

import e.g0;
import e.i0;
import java.io.IOException;
import javax.annotation.Nullable;
import okhttp3.internal.connection.f;
import okio.Sink;
import okio.Source;

/* compiled from: ExchangeCodec */
public interface c {
    f a();

    void b() throws IOException;

    void c(g0 g0Var) throws IOException;

    void cancel();

    Source d(i0 i0Var) throws IOException;

    @Nullable
    i0.a e(boolean z) throws IOException;

    void f() throws IOException;

    long g(i0 i0Var) throws IOException;

    Sink h(g0 g0Var, long j) throws IOException;
}
