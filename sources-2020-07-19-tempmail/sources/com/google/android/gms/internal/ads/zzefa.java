package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzefa extends OutputStream {
    private static final byte[] g = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private final int f8536b = 128;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<zzeer> f8537c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private int f8538d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f8539e = new byte[128];

    /* renamed from: f  reason: collision with root package name */
    private int f8540f;

    zzefa(int i) {
    }

    private final synchronized int a() {
        return this.f8538d + this.f8540f;
    }

    private final void d(int i) {
        this.f8537c.add(new x50(this.f8539e));
        int length = this.f8538d + this.f8539e.length;
        this.f8538d = length;
        this.f8539e = new byte[Math.max(this.f8536b, Math.max(i, length >>> 1))];
        this.f8540f = 0;
    }

    public final synchronized zzeer b() {
        if (this.f8540f >= this.f8539e.length) {
            this.f8537c.add(new x50(this.f8539e));
            this.f8539e = g;
        } else if (this.f8540f > 0) {
            byte[] bArr = this.f8539e;
            int i = this.f8540f;
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            this.f8537c.add(new x50(bArr2));
        }
        this.f8538d += this.f8540f;
        this.f8540f = 0;
        return zzeer.Q(this.f8537c);
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a())});
    }

    public final synchronized void write(int i) {
        if (this.f8540f == this.f8539e.length) {
            d(1);
        }
        byte[] bArr = this.f8539e;
        int i2 = this.f8540f;
        this.f8540f = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        if (i2 <= this.f8539e.length - this.f8540f) {
            System.arraycopy(bArr, i, this.f8539e, this.f8540f, i2);
            this.f8540f += i2;
            return;
        }
        int length = this.f8539e.length - this.f8540f;
        System.arraycopy(bArr, i, this.f8539e, this.f8540f, length);
        int i3 = i2 - length;
        d(i3);
        System.arraycopy(bArr, i + length, this.f8539e, 0, i3);
        this.f8540f = i3;
    }
}
