package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
abstract class a50 implements zzdwc {

    /* renamed from: a  reason: collision with root package name */
    private final y40 f3525a;

    /* renamed from: b  reason: collision with root package name */
    private final y40 f3526b;

    public a50(byte[] bArr) throws InvalidKeyException {
        this.f3525a = b(bArr, 1);
        this.f3526b = b(bArr, 0);
    }

    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= (Integer.MAX_VALUE - this.f3525a.g()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.f3525a.g() + 16);
            if (allocate.remaining() >= bArr.length + this.f3525a.g() + 16) {
                int position = allocate.position();
                this.f3525a.c(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[this.f3525a.g()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.f3526b.i(bArr3, 0).get(bArr4);
                int length = bArr2.length % 16 == 0 ? bArr2.length : (bArr2.length + 16) - (bArr2.length % 16);
                int remaining = allocate.remaining();
                int i = remaining % 16;
                int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
                ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(length);
                order.put(allocate);
                order.position(i2);
                order.putLong((long) bArr2.length);
                order.putLong((long) remaining);
                byte[] b2 = c50.b(bArr4, order.array());
                allocate.limit(allocate.limit() + 16);
                allocate.put(b2);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* access modifiers changed from: package-private */
    public abstract y40 b(byte[] bArr, int i) throws InvalidKeyException;
}
