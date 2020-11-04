package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzju implements zzjw {
    private static final byte[] g = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];

    /* renamed from: a  reason: collision with root package name */
    private final zzok f8981a;

    /* renamed from: b  reason: collision with root package name */
    private final long f8982b;

    /* renamed from: c  reason: collision with root package name */
    private long f8983c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f8984d = new byte[65536];

    /* renamed from: e  reason: collision with root package name */
    private int f8985e;

    /* renamed from: f  reason: collision with root package name */
    private int f8986f;

    public zzju(zzok zzok, long j, long j2) {
        this.f8981a = zzok;
        this.f8983c = j;
        this.f8982b = j2;
    }

    private final int i(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int read = this.f8981a.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    private final int j(int i) {
        int min = Math.min(this.f8986f, i);
        k(min);
        return min;
    }

    private final void k(int i) {
        int i2 = this.f8986f - i;
        this.f8986f = i2;
        this.f8985e = 0;
        byte[] bArr = this.f8984d;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[(i2 + 65536)];
        }
        System.arraycopy(this.f8984d, i, bArr, 0, this.f8986f);
        this.f8984d = bArr;
    }

    private final void l(int i) {
        if (i != -1) {
            this.f8983c += (long) i;
        }
    }

    private final int m(byte[] bArr, int i, int i2) {
        int i3 = this.f8986f;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f8984d, 0, bArr, i, min);
        k(min);
        return min;
    }

    private final boolean n(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.f8985e + i;
        byte[] bArr = this.f8984d;
        if (i2 > bArr.length) {
            this.f8984d = Arrays.copyOf(this.f8984d, zzpo.p(bArr.length << 1, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.f8986f - this.f8985e, i);
        while (min < i) {
            min = i(this.f8984d, this.f8985e, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i3 = this.f8985e + i;
        this.f8985e = i3;
        this.f8986f = Math.max(this.f8986f, i3);
        return true;
    }

    public final void a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        if (n(i2, false)) {
            System.arraycopy(this.f8984d, this.f8985e - i2, bArr, i, i2);
        }
    }

    public final void b(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        g(bArr, i, i2, false);
    }

    public final void c() {
        this.f8985e = 0;
    }

    public final void d(int i) throws IOException, InterruptedException {
        int j = j(i);
        while (j < i && j != -1) {
            byte[] bArr = g;
            j = i(bArr, -j, Math.min(i, bArr.length + j), j, false);
        }
        l(j);
    }

    public final long e() {
        return this.f8982b;
    }

    public final void f(int i) throws IOException, InterruptedException {
        n(i, false);
    }

    public final boolean g(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int m = m(bArr, i, i2);
        while (m < i2 && m != -1) {
            m = i(bArr, i, i2, m, z);
        }
        l(m);
        return m != -1;
    }

    public final long getPosition() {
        return this.f8983c;
    }

    public final int h(int i) throws IOException, InterruptedException {
        int j = j(i);
        if (j == 0) {
            byte[] bArr = g;
            j = i(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        l(j);
        return j;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int m = m(bArr, i, i2);
        if (m == 0) {
            m = i(bArr, i, i2, 0, true);
        }
        l(m);
        return m;
    }
}
