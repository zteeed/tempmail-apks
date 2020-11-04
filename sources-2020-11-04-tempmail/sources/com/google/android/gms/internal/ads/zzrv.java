package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzrv extends zzro {

    /* renamed from: c  reason: collision with root package name */
    private MessageDigest f9256c;

    public final byte[] a(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int i = 4;
        if (split.length == 1) {
            int a2 = zzrs.a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a2);
            bArr = allocate.array();
        } else {
            if (split.length < 5) {
                bArr2 = new byte[(split.length << 1)];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int a3 = zzrs.a(split[i2]);
                    int i3 = (a3 >> 16) ^ (65535 & a3);
                    byte[] bArr3 = {(byte) i3, (byte) (i3 >> 8)};
                    int i4 = i2 << 1;
                    bArr2[i4] = bArr3[0];
                    bArr2[i4 + 1] = bArr3[1];
                }
            } else {
                bArr2 = new byte[split.length];
                for (int i5 = 0; i5 < split.length; i5++) {
                    int a4 = zzrs.a(split[i5]);
                    bArr2[i5] = (byte) ((a4 >> 24) ^ (((a4 & 255) ^ ((a4 >> 8) & 255)) ^ ((a4 >> 16) & 255)));
                }
            }
            bArr = bArr2;
        }
        this.f9256c = b();
        synchronized (this.f9247a) {
            if (this.f9256c == null) {
                byte[] bArr4 = new byte[0];
                return bArr4;
            }
            this.f9256c.reset();
            this.f9256c.update(bArr);
            byte[] digest = this.f9256c.digest();
            if (digest.length <= 4) {
                i = digest.length;
            }
            byte[] bArr5 = new byte[i];
            System.arraycopy(digest, 0, bArr5, 0, i);
            return bArr5;
        }
    }
}
