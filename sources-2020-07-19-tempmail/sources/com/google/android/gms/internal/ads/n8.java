package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class n8 implements zzekm {

    /* renamed from: b  reason: collision with root package name */
    private final ByteBuffer f4456b;

    n8(ByteBuffer byteBuffer) {
        this.f4456b = byteBuffer.duplicate();
    }

    public final void close() throws IOException {
    }

    public final long position() throws IOException {
        return (long) this.f4456b.position();
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.f4456b.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f4456b.remaining());
        byte[] bArr = new byte[min];
        this.f4456b.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    public final void s(long j) throws IOException {
        this.f4456b.position((int) j);
    }

    public final long size() throws IOException {
        return (long) this.f4456b.limit();
    }

    public final ByteBuffer y(long j, long j2) throws IOException {
        int position = this.f4456b.position();
        this.f4456b.position((int) j);
        ByteBuffer slice = this.f4456b.slice();
        slice.limit((int) j2);
        this.f4456b.position(position);
        return slice;
    }
}
