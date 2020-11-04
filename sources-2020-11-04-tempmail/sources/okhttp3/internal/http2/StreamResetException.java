package okhttp3.internal.http2;

import java.io.IOException;

public final class StreamResetException extends IOException {

    /* renamed from: b  reason: collision with root package name */
    public final a f14866b;

    public StreamResetException(a aVar) {
        super("stream was reset: " + aVar);
        this.f14866b = aVar;
    }
}