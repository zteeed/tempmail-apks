package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

final class d0 extends InputStream {

    /* renamed from: b  reason: collision with root package name */
    private final InputStream f11213b;

    /* renamed from: c  reason: collision with root package name */
    private long f11214c;

    d0(InputStream inputStream, long j) {
        this.f11213b = inputStream;
        this.f11214c = j;
    }

    public final int read() throws IOException {
        long j = this.f11214c;
        if (j <= 0) {
            return -1;
        }
        this.f11214c = j - 1;
        return this.f11213b.read();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f11214c;
        if (j <= 0) {
            return -1;
        }
        int read = this.f11213b.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f11214c -= (long) read;
        }
        return read;
    }
}
