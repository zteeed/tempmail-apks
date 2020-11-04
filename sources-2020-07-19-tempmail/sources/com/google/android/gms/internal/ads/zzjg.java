package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzjg implements zzig {

    /* renamed from: b  reason: collision with root package name */
    private int f8770b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f8771c = -1;

    /* renamed from: d  reason: collision with root package name */
    private kb0 f8772d;

    /* renamed from: e  reason: collision with root package name */
    private float f8773e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    private float f8774f = 1.0f;
    private ByteBuffer g;
    private ShortBuffer h;
    private ByteBuffer i;
    private long j;
    private long k;
    private boolean l;

    public zzjg() {
        ByteBuffer byteBuffer = zzig.f8760a;
        this.g = byteBuffer;
        this.h = byteBuffer.asShortBuffer();
        this.i = zzig.f8760a;
    }

    public final void a() {
        this.f8772d = null;
        ByteBuffer byteBuffer = zzig.f8760a;
        this.g = byteBuffer;
        this.h = byteBuffer.asShortBuffer();
        this.i = zzig.f8760a;
        this.f8770b = -1;
        this.f8771c = -1;
        this.j = 0;
        this.k = 0;
        this.l = false;
    }

    public final boolean b() {
        if (!this.l) {
            return false;
        }
        kb0 kb0 = this.f8772d;
        return kb0 == null || kb0.k() == 0;
    }

    public final ByteBuffer c() {
        ByteBuffer byteBuffer = this.i;
        this.i = zzig.f8760a;
        return byteBuffer;
    }

    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.j += (long) remaining;
            this.f8772d.e(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int k2 = (this.f8772d.k() * this.f8770b) << 1;
        if (k2 > 0) {
            if (this.g.capacity() < k2) {
                ByteBuffer order = ByteBuffer.allocateDirect(k2).order(ByteOrder.nativeOrder());
                this.g = order;
                this.h = order.asShortBuffer();
            } else {
                this.g.clear();
                this.h.clear();
            }
            this.f8772d.h(this.h);
            this.k += (long) k2;
            this.g.limit(k2);
            this.i = this.g;
        }
    }

    public final int e() {
        return 2;
    }

    public final boolean f(int i2, int i3, int i4) throws zzif {
        if (i4 != 2) {
            throw new zzif(i2, i3, i4);
        } else if (this.f8771c == i2 && this.f8770b == i3) {
            return false;
        } else {
            this.f8771c = i2;
            this.f8770b = i3;
            return true;
        }
    }

    public final void flush() {
        kb0 kb0 = new kb0(this.f8771c, this.f8770b);
        this.f8772d = kb0;
        kb0.a(this.f8773e);
        this.f8772d.c(this.f8774f);
        this.i = zzig.f8760a;
        this.j = 0;
        this.k = 0;
        this.l = false;
    }

    public final void g() {
        this.f8772d.j();
        this.l = true;
    }

    public final int h() {
        return this.f8770b;
    }

    public final float i(float f2) {
        float a2 = zzpo.a(f2, 0.1f, 8.0f);
        this.f8773e = a2;
        return a2;
    }

    public final boolean isActive() {
        return Math.abs(this.f8773e - 1.0f) >= 0.01f || Math.abs(this.f8774f - 1.0f) >= 0.01f;
    }

    public final float j(float f2) {
        this.f8774f = zzpo.a(f2, 0.1f, 8.0f);
        return f2;
    }

    public final long k() {
        return this.j;
    }

    public final long l() {
        return this.k;
    }
}
