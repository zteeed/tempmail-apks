package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzekh extends zzekg implements zzbp {
    private int j;

    protected zzekh(String str) {
        super(str);
    }

    public final int f() {
        if (!this.f8813c) {
            c();
        }
        return this.j;
    }

    /* access modifiers changed from: protected */
    public final long g(ByteBuffer byteBuffer) {
        this.j = zzbq.a(byteBuffer.get());
        zzbq.c(byteBuffer);
        zzbq.a(byteBuffer.get());
        return 4;
    }
}
