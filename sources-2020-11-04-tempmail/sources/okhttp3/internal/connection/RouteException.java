package okhttp3.internal.connection;

import e.m0.e;
import java.io.IOException;

public final class RouteException extends RuntimeException {

    /* renamed from: b  reason: collision with root package name */
    private IOException f14809b;

    /* renamed from: c  reason: collision with root package name */
    private IOException f14810c;

    RouteException(IOException iOException) {
        super(iOException);
        this.f14809b = iOException;
        this.f14810c = iOException;
    }

    /* access modifiers changed from: package-private */
    public void a(IOException iOException) {
        e.a(this.f14809b, iOException);
        this.f14810c = iOException;
    }

    public IOException b() {
        return this.f14809b;
    }

    public IOException c() {
        return this.f14810c;
    }
}
