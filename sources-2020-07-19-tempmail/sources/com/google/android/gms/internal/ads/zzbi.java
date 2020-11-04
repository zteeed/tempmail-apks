package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbi extends ByteArrayOutputStream {

    /* renamed from: b  reason: collision with root package name */
    private final zzat f6261b;

    public zzbi(zzat zzat, int i) {
        this.f6261b = zzat;
        this.buf = zzat.b(Math.max(i, 256));
    }

    private final void a(int i) {
        int i2 = this.count;
        if (i2 + i > this.buf.length) {
            byte[] b2 = this.f6261b.b((i2 + i) << 1);
            System.arraycopy(this.buf, 0, b2, 0, this.count);
            this.f6261b.a(this.buf);
            this.buf = b2;
        }
    }

    public final void close() throws IOException {
        this.f6261b.a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f6261b.a(this.buf);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }

    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }
}
