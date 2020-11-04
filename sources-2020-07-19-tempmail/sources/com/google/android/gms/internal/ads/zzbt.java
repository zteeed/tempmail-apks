package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbt extends zzekg {
    public zzbt(String str) {
        super(str);
    }

    public final void e(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
