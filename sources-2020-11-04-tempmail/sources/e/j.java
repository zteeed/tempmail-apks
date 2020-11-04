package e;

import java.io.IOException;
import okio.Timeout;

/* compiled from: Call */
public interface j extends Cloneable {

    /* compiled from: Call */
    public interface a {
        j b(g0 g0Var);
    }

    void cancel();

    i0 execute() throws IOException;

    boolean isCanceled();

    g0 request();

    Timeout timeout();

    void u(k kVar);
}
