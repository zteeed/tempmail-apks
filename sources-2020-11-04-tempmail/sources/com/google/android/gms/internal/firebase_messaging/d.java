package com.google.android.gms.internal.firebase_messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.1 */
final class d extends FilterInputStream {

    /* renamed from: b  reason: collision with root package name */
    private long f9477b;

    /* renamed from: c  reason: collision with root package name */
    private long f9478c = -1;

    d(InputStream inputStream, long j) {
        super(inputStream);
        zzg.a(inputStream);
        this.f9477b = 1048577;
    }

    public final int available() throws IOException {
        return (int) Math.min((long) this.in.available(), this.f9477b);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f9478c = this.f9477b;
    }

    public final int read() throws IOException {
        if (this.f9477b == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f9477b--;
        }
        return read;
    }

    public final synchronized void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f9478c != -1) {
            this.in.reset();
            this.f9477b = this.f9478c;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, this.f9477b));
        this.f9477b -= skip;
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f9477b;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f9477b -= (long) read;
        }
        return read;
    }
}
