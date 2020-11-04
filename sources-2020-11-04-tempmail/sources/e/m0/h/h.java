package e.m0.h;

import e.b0;
import e.j0;
import javax.annotation.Nullable;
import okio.BufferedSource;

/* compiled from: RealResponseBody */
public final class h extends j0 {
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final String f14697b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14698c;

    /* renamed from: d  reason: collision with root package name */
    private final BufferedSource f14699d;

    public h(@Nullable String str, long j, BufferedSource bufferedSource) {
        this.f14697b = str;
        this.f14698c = j;
        this.f14699d = bufferedSource;
    }

    public long contentLength() {
        return this.f14698c;
    }

    public b0 contentType() {
        String str = this.f14697b;
        if (str != null) {
            return b0.d(str);
        }
        return null;
    }

    public BufferedSource source() {
        return this.f14699d;
    }
}
