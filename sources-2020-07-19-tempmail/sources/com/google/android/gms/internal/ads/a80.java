package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class a80 extends InputStream {

    /* renamed from: b  reason: collision with root package name */
    private x70 f3348b;

    /* renamed from: c  reason: collision with root package name */
    private v50 f3349c;

    /* renamed from: d  reason: collision with root package name */
    private int f3350d;

    /* renamed from: e  reason: collision with root package name */
    private int f3351e;

    /* renamed from: f  reason: collision with root package name */
    private int f3352f;
    private int g;
    private final /* synthetic */ w70 h;

    public a80(w70 w70) {
        this.h = w70;
        a();
    }

    private final void a() {
        x70 x70 = new x70(this.h, (v70) null);
        this.f3348b = x70;
        v50 v50 = (v50) x70.next();
        this.f3349c = v50;
        this.f3350d = v50.size();
        this.f3351e = 0;
        this.f3352f = 0;
    }

    private final void b() {
        int i;
        if (this.f3349c != null && this.f3351e == (i = this.f3350d)) {
            this.f3352f += i;
            this.f3351e = 0;
            if (this.f3348b.hasNext()) {
                v50 v50 = (v50) this.f3348b.next();
                this.f3349c = v50;
                this.f3350d = v50.size();
                return;
            }
            this.f3349c = null;
            this.f3350d = 0;
        }
    }

    private final int d(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            b();
            if (this.f3349c == null) {
                break;
            }
            int min = Math.min(this.f3350d - this.f3351e, i3);
            if (bArr != null) {
                this.f3349c.l(bArr, this.f3351e, i, min);
                i += min;
            }
            this.f3351e += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    public final int available() throws IOException {
        return this.h.size() - (this.f3352f + this.f3351e);
    }

    public final void mark(int i) {
        this.g = this.f3352f + this.f3351e;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw null;
        } else if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else {
            int d2 = d(bArr, i, i2);
            if (d2 == 0) {
                return -1;
            }
            return d2;
        }
    }

    public final synchronized void reset() {
        a();
        d((byte[]) null, 0, this.g);
    }

    public final long skip(long j) {
        if (j >= 0) {
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return (long) d((byte[]) null, 0, (int) j);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int read() throws IOException {
        b();
        v50 v50 = this.f3349c;
        if (v50 == null) {
            return -1;
        }
        int i = this.f3351e;
        this.f3351e = i + 1;
        return v50.C(i) & 255;
    }
}
