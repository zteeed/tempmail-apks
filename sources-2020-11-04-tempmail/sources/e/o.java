package e;

import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.g;

/* compiled from: ConnectionPool */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    final g f14749a;

    public o() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public o(int i, long j, TimeUnit timeUnit) {
        this.f14749a = new g(i, j, timeUnit);
    }
}
