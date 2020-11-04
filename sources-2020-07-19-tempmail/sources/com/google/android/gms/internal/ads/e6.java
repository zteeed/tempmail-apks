package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class e6 extends FilterInputStream {

    /* renamed from: b  reason: collision with root package name */
    private final long f3684b;

    /* renamed from: c  reason: collision with root package name */
    private long f3685c;

    e6(InputStream inputStream, long j) {
        super(inputStream);
        this.f3684b = j;
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        return this.f3684b - this.f3685c;
    }

    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.f3685c++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f3685c += (long) read;
        }
        return read;
    }
}
