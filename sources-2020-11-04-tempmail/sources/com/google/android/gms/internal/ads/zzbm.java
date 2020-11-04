package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzbm implements zzbo {

    /* renamed from: b  reason: collision with root package name */
    private static Logger f6544b = Logger.getLogger(zzbm.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private ThreadLocal<ByteBuffer> f6545a = new wb(this);

    public final zzbp a(zzekm zzekm, zzbs zzbs) throws IOException {
        int read;
        long j;
        zzekm zzekm2 = zzekm;
        zzbs zzbs2 = zzbs;
        long position = zzekm.position();
        this.f6545a.get().rewind().limit(8);
        do {
            read = zzekm2.read(this.f6545a.get());
            if (read == 8) {
                this.f6545a.get().rewind();
                long b2 = zzbq.b(this.f6545a.get());
                byte[] bArr = null;
                if (b2 >= 8 || b2 <= 1) {
                    String g = zzbq.g(this.f6545a.get());
                    if (b2 == 1) {
                        this.f6545a.get().limit(16);
                        zzekm2.read(this.f6545a.get());
                        this.f6545a.get().position(8);
                        j = zzbq.d(this.f6545a.get()) - 16;
                    } else {
                        j = b2 == 0 ? zzekm.size() - zzekm.position() : b2 - 8;
                    }
                    if ("uuid".equals(g)) {
                        this.f6545a.get().limit(this.f6545a.get().limit() + 16);
                        zzekm2.read(this.f6545a.get());
                        bArr = new byte[16];
                        for (int position2 = this.f6545a.get().position() - 16; position2 < this.f6545a.get().position(); position2++) {
                            bArr[position2 - (this.f6545a.get().position() - 16)] = this.f6545a.get().get(position2);
                        }
                        j -= 16;
                    }
                    long j2 = j;
                    zzbp b3 = b(g, bArr, zzbs2 instanceof zzbp ? ((zzbp) zzbs2).getType() : "");
                    b3.d(zzbs2);
                    this.f6545a.get().rewind();
                    b3.b(zzekm, this.f6545a.get(), j2, this);
                    return b3;
                }
                Logger logger = f6544b;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder(80);
                sb.append("Plausibility check failed: size < 8 (size = ");
                sb.append(b2);
                sb.append("). Stop parsing!");
                logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                return null;
            }
        } while (read >= 0);
        zzekm2.s(position);
        throw new EOFException();
    }

    public abstract zzbp b(String str, byte[] bArr, String str2);
}
