package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public interface zzekm extends Closeable {
    void close() throws IOException;

    long position() throws IOException;

    int read(ByteBuffer byteBuffer) throws IOException;

    void s(long j) throws IOException;

    long size() throws IOException;

    ByteBuffer y(long j, long j2) throws IOException;
}
