package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class pr implements ng {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f4841a;

    public pr(ByteBuffer byteBuffer) {
        this.f4841a = byteBuffer.slice();
    }

    public final void a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.f4841a) {
            int i2 = (int) j;
            this.f4841a.position(i2);
            this.f4841a.limit(i2 + i);
            slice = this.f4841a.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }

    public final long size() {
        return (long) this.f4841a.capacity();
    }
}
