package com.google.android.play.core.assetpacks;

import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

final class m0 extends FilterInputStream {

    /* renamed from: b  reason: collision with root package name */
    private byte[] f11325b = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];

    /* renamed from: c  reason: collision with root package name */
    private long f11326c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11327d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11328e = false;

    m0(InputStream inputStream) {
        super(inputStream);
    }

    private final int a(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    private final q2 d(int i, String str, long j, int i2, boolean z) {
        return q2.a(str, j, i2, z, Arrays.copyOf(this.f11325b, i));
    }

    private final void e(long j) {
        int length = this.f11325b.length;
        if (j > ((long) length)) {
            do {
                length += length;
            } while (((long) length) < j);
            this.f11325b = Arrays.copyOf(this.f11325b, length);
        }
    }

    private final boolean f(int i, int i2) throws IOException {
        return a(this.f11325b, i, i2) == i2;
    }

    /* access modifiers changed from: package-private */
    public final q2 b() throws IOException {
        byte[] bArr;
        if (this.f11326c > 0) {
            do {
                bArr = this.f11325b;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f11327d || this.f11328e) {
            return q2.a((String) null, -1, -1, false, (byte[]) null);
        }
        int a2 = a(this.f11325b, 0, 30);
        if (a2 != 30 && !f(a2, 30 - a2)) {
            this.f11327d = true;
            return d(a2, (String) null, -1, -1, true);
        } else if (w1.e(this.f11325b, 0) != 67324752) {
            this.f11328e = true;
            return d(a2, (String) null, -1, -1, false);
        } else {
            long e2 = w1.e(this.f11325b, 18);
            if (e2 != 4294967295L) {
                int g = w1.g(this.f11325b, 8);
                int g2 = w1.g(this.f11325b, 26);
                int i = g2 + 30;
                e((long) i);
                int a3 = a(this.f11325b, 30, g2);
                int i2 = a3 + 30;
                if (a3 == g2 || f(i2, g2 - a3)) {
                    String str = new String(this.f11325b, 30, g2);
                    int g3 = w1.g(this.f11325b, 28);
                    int i3 = i + g3;
                    e((long) i3);
                    int a4 = a(this.f11325b, i, g3);
                    int i4 = i + a4;
                    if (a4 == g3 || f(i4, g3 - a4)) {
                        this.f11326c = w1.e(this.f11325b, 18);
                        return d(i3, str, e2, g, false);
                    }
                    this.f11327d = true;
                    return d(i4, str, e2, g, true);
                }
                this.f11327d = true;
                return d(i2, (String) null, e2, g, true);
            }
            throw new v0("Files bigger than 4GiB are not supported.");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return this.f11327d;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return this.f11328e;
    }

    /* access modifiers changed from: package-private */
    public final long k() {
        return this.f11326c;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f11326c;
        if (j <= 0 || this.f11327d) {
            return -1;
        }
        int a2 = a(bArr, i, (int) Math.min(j, (long) i2));
        this.f11326c -= (long) a2;
        if (a2 != 0) {
            return a2;
        }
        this.f11327d = true;
        return 0;
    }
}
