package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzeki extends zzekk implements zzbp {
    private String i;
    private boolean j;

    public zzeki(String str) {
        this.i = str;
    }

    public final void b(zzekm zzekm, ByteBuffer byteBuffer, long j2, zzbo zzbo) throws IOException {
        zzekm.position();
        byteBuffer.remaining();
        this.j = byteBuffer.remaining() == 16;
        e(zzekm, j2, zzbo);
    }

    public final void d(zzbs zzbs) {
    }

    public final void e(zzekm zzekm, long j2, zzbo zzbo) throws IOException {
        this.f8635c = zzekm;
        this.f8637e = zzekm.position();
        if (!this.j) {
            int i2 = ((8 + j2) > 4294967296L ? 1 : ((8 + j2) == 4294967296L ? 0 : -1));
        }
        zzekm.s(zzekm.position() + j2);
        this.f8638f = zzekm.position();
        this.f8634b = zzbo;
    }

    public final String getType() {
        return this.i;
    }
}
