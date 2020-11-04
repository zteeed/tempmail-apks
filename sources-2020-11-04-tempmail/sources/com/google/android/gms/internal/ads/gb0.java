package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class gb0 implements zzig {

    /* renamed from: b  reason: collision with root package name */
    private int f4056b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f4057c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int[] f4058d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4059e;

    /* renamed from: f  reason: collision with root package name */
    private int[] f4060f;
    private ByteBuffer g;
    private ByteBuffer h;
    private boolean i;

    public gb0() {
        ByteBuffer byteBuffer = zzig.f8943a;
        this.g = byteBuffer;
        this.h = byteBuffer;
    }

    public final void a() {
        flush();
        this.g = zzig.f8943a;
        this.f4056b = -1;
        this.f4057c = -1;
        this.f4060f = null;
        this.f4059e = false;
    }

    public final boolean b() {
        return this.i && this.h == zzig.f8943a;
    }

    public final ByteBuffer c() {
        ByteBuffer byteBuffer = this.h;
        this.h = zzig.f8943a;
        return byteBuffer;
    }

    public final void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.f4056b * 2)) * this.f4060f.length) << 1;
        if (this.g.capacity() < length) {
            this.g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        while (position < limit) {
            for (int i2 : this.f4060f) {
                this.g.putShort(byteBuffer.getShort((i2 * 2) + position));
            }
            position += this.f4056b << 1;
        }
        byteBuffer.position(limit);
        this.g.flip();
        this.h = this.g;
    }

    public final int e() {
        return 2;
    }

    public final boolean f(int i2, int i3, int i4) throws zzif {
        boolean z = !Arrays.equals(this.f4058d, this.f4060f);
        int[] iArr = this.f4058d;
        this.f4060f = iArr;
        if (iArr == null) {
            this.f4059e = false;
            return z;
        } else if (i4 != 2) {
            throw new zzif(i2, i3, i4);
        } else if (!z && this.f4057c == i2 && this.f4056b == i3) {
            return false;
        } else {
            this.f4057c = i2;
            this.f4056b = i3;
            this.f4059e = i3 != this.f4060f.length;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f4060f;
                if (i5 >= iArr2.length) {
                    return true;
                }
                int i6 = iArr2[i5];
                if (i6 < i3) {
                    this.f4059e = (i6 != i5) | this.f4059e;
                    i5++;
                } else {
                    throw new zzif(i2, i3, i4);
                }
            }
        }
    }

    public final void flush() {
        this.h = zzig.f8943a;
        this.i = false;
    }

    public final void g() {
        this.i = true;
    }

    public final int h() {
        int[] iArr = this.f4060f;
        return iArr == null ? this.f4056b : iArr.length;
    }

    public final void i(int[] iArr) {
        this.f4058d = iArr;
    }

    public final boolean isActive() {
        return this.f4059e;
    }
}
