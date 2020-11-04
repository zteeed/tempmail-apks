package okhttp3.internal.http2;

import e.m0.e;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.c;
import okio.Buffer;
import okio.BufferedSink;

/* compiled from: Http2Writer */
final class i implements Closeable {
    private static final Logger h = Logger.getLogger(d.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private final BufferedSink f14414b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14415c;

    /* renamed from: d  reason: collision with root package name */
    private final Buffer f14416d;

    /* renamed from: e  reason: collision with root package name */
    private int f14417e = 16384;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14418f;
    final c.b g;

    i(BufferedSink bufferedSink, boolean z) {
        this.f14414b = bufferedSink;
        this.f14415c = z;
        Buffer buffer = new Buffer();
        this.f14416d = buffer;
        this.g = new c.b(buffer);
    }

    private void r(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min((long) this.f14417e, j);
            long j2 = (long) min;
            j -= j2;
            f(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
            this.f14414b.write(this.f14416d, j2);
        }
    }

    private static void t(BufferedSink bufferedSink, int i) throws IOException {
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }

    public synchronized void a(l lVar) throws IOException {
        if (!this.f14418f) {
            this.f14417e = lVar.f(this.f14417e);
            if (lVar.c() != -1) {
                this.g.e(lVar.c());
            }
            f(0, 0, (byte) 4, (byte) 1);
            this.f14414b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void b() throws IOException {
        if (this.f14418f) {
            throw new IOException("closed");
        } else if (this.f14415c) {
            if (h.isLoggable(Level.FINE)) {
                h.fine(e.p(">> CONNECTION %s", d.f14331a.hex()));
            }
            this.f14414b.write(d.f14331a.toByteArray());
            this.f14414b.flush();
        }
    }

    public synchronized void close() throws IOException {
        this.f14418f = true;
        this.f14414b.close();
    }

    public synchronized void d(boolean z, int i, Buffer buffer, int i2) throws IOException {
        if (!this.f14418f) {
            byte b2 = 0;
            if (z) {
                b2 = (byte) 1;
            }
            e(i, b2, buffer, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public void e(int i, byte b2, Buffer buffer, int i2) throws IOException {
        f(i, i2, (byte) 0, b2);
        if (i2 > 0) {
            this.f14414b.write(buffer, (long) i2);
        }
    }

    public void f(int i, int i2, byte b2, byte b3) throws IOException {
        if (h.isLoggable(Level.FINE)) {
            h.fine(d.b(false, i, i2, b2, b3));
        }
        int i3 = this.f14417e;
        if (i2 > i3) {
            d.c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        } else if ((Integer.MIN_VALUE & i) == 0) {
            t(this.f14414b, i2);
            this.f14414b.writeByte(b2 & 255);
            this.f14414b.writeByte(b3 & 255);
            this.f14414b.writeInt(i & Integer.MAX_VALUE);
        } else {
            d.c("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
    }

    public synchronized void flush() throws IOException {
        if (!this.f14418f) {
            this.f14414b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void g(int i, a aVar, byte[] bArr) throws IOException {
        if (this.f14418f) {
            throw new IOException("closed");
        } else if (aVar.f14310b != -1) {
            f(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f14414b.writeInt(i);
            this.f14414b.writeInt(aVar.f14310b);
            if (bArr.length > 0) {
                this.f14414b.write(bArr);
            }
            this.f14414b.flush();
        } else {
            d.c("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    public synchronized void h(boolean z, int i, List<b> list) throws IOException {
        if (!this.f14418f) {
            this.g.g(list);
            long size = this.f14416d.size();
            int min = (int) Math.min((long) this.f14417e, size);
            long j = (long) min;
            int i2 = (size > j ? 1 : (size == j ? 0 : -1));
            byte b2 = i2 == 0 ? (byte) 4 : 0;
            if (z) {
                b2 = (byte) (b2 | 1);
            }
            f(i, min, (byte) 1, b2);
            this.f14414b.write(this.f14416d, j);
            if (i2 > 0) {
                r(i, size - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public int k() {
        return this.f14417e;
    }

    public synchronized void m(boolean z, int i, int i2) throws IOException {
        if (!this.f14418f) {
            f(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.f14414b.writeInt(i);
            this.f14414b.writeInt(i2);
            this.f14414b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void n(int i, int i2, List<b> list) throws IOException {
        if (!this.f14418f) {
            this.g.g(list);
            long size = this.f14416d.size();
            int min = (int) Math.min((long) (this.f14417e - 4), size);
            long j = (long) min;
            int i3 = (size > j ? 1 : (size == j ? 0 : -1));
            f(i, min + 4, (byte) 5, i3 == 0 ? (byte) 4 : 0);
            this.f14414b.writeInt(i2 & Integer.MAX_VALUE);
            this.f14414b.write(this.f14416d, j);
            if (i3 > 0) {
                r(i, size - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void o(int i, a aVar) throws IOException {
        if (this.f14418f) {
            throw new IOException("closed");
        } else if (aVar.f14310b != -1) {
            f(i, 4, (byte) 3, (byte) 0);
            this.f14414b.writeInt(aVar.f14310b);
            this.f14414b.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void p(l lVar) throws IOException {
        if (!this.f14418f) {
            int i = 0;
            f(0, lVar.j() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (lVar.g(i)) {
                    this.f14414b.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.f14414b.writeInt(lVar.b(i));
                }
                i++;
            }
            this.f14414b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void q(int i, long j) throws IOException {
        if (this.f14418f) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            d.c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        } else {
            f(i, 4, (byte) 8, (byte) 0);
            this.f14414b.writeInt((int) j);
            this.f14414b.flush();
        }
    }
}
