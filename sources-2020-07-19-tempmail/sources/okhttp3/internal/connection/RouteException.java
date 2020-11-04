package okhttp3.internal.connection;

import e.m0.e;
import java.io.IOException;

public final class RouteException extends RuntimeException {

    /* renamed from: b  reason: collision with root package name */
    private IOException f14248b;

    /* renamed from: c  reason: collision with root package name */
    private IOException f14249c;

    RouteException(IOException iOException) {
        super(iOException);
        this.f14248b = iOException;
        this.f14249c = iOException;
    }

    /* access modifiers changed from: package-private */
    public void a(IOException iOException) {
        e.a(this.f14248b, iOException);
        this.f14249c = iOException;
    }

    public IOException b() {
        return this.f14248b;
    }

    public IOException c() {
        return this.f14249c;
    }
}
