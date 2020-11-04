package okhttp3.internal.http2;

import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import e.m0.e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.c;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

/* compiled from: Http2Reader */
final class g implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    static final Logger f14948f = Logger.getLogger(d.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private final BufferedSource f14949b;

    /* renamed from: c  reason: collision with root package name */
    private final a f14950c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f14951d;

    /* renamed from: e  reason: collision with root package name */
    final c.a f14952e;

    /* compiled from: Http2Reader */
    static final class a implements Source {

        /* renamed from: b  reason: collision with root package name */
        private final BufferedSource f14953b;

        /* renamed from: c  reason: collision with root package name */
        int f14954c;

        /* renamed from: d  reason: collision with root package name */
        byte f14955d;

        /* renamed from: e  reason: collision with root package name */
        int f14956e;

        /* renamed from: f  reason: collision with root package name */
        int f14957f;
        short g;

        a(BufferedSource bufferedSource) {
            this.f14953b = bufferedSource;
        }

        private void a() throws IOException {
            int i = this.f14956e;
            int k = g.k(this.f14953b);
            this.f14957f = k;
            this.f14954c = k;
            byte readByte = (byte) (this.f14953b.readByte() & 255);
            this.f14955d = (byte) (this.f14953b.readByte() & 255);
            if (g.f14948f.isLoggable(Level.FINE)) {
                g.f14948f.fine(d.b(true, this.f14956e, this.f14954c, readByte, this.f14955d));
            }
            int readInt = this.f14953b.readInt() & Integer.MAX_VALUE;
            this.f14956e = readInt;
            if (readByte != 9) {
                d.d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                throw null;
            } else if (readInt != i) {
                d.d("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }

        public void close() throws IOException {
        }

        public long read(Buffer buffer, long j) throws IOException {
            while (true) {
                int i = this.f14957f;
                if (i == 0) {
                    this.f14953b.skip((long) this.g);
                    this.g = 0;
                    if ((this.f14955d & 4) != 0) {
                        return -1;
                    }
                    a();
                } else {
                    long read = this.f14953b.read(buffer, Math.min(j, (long) i));
                    if (read == -1) {
                        return -1;
                    }
                    this.f14957f = (int) (((long) this.f14957f) - read);
                    return read;
                }
            }
        }

        public Timeout timeout() {
            return this.f14953b.timeout();
        }
    }

    /* compiled from: Http2Reader */
    interface b {
        void a();

        void b(boolean z, l lVar);

        void c(boolean z, int i, int i2, List<b> list);

        void d(int i, long j);

        void e(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException;

        void f(boolean z, int i, int i2);

        void g(int i, int i2, int i3, boolean z);

        void h(int i, a aVar);

        void i(int i, int i2, List<b> list) throws IOException;

        void j(int i, a aVar, ByteString byteString);
    }

    g(BufferedSource bufferedSource, boolean z) {
        this.f14949b = bufferedSource;
        this.f14951d = z;
        a aVar = new a(bufferedSource);
        this.f14950c = aVar;
        this.f14952e = new c.a(CodedOutputStream.DEFAULT_BUFFER_SIZE, aVar);
    }

    static int a(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        d.d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    private void e(b bVar, int i, byte b2, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = true;
            boolean z2 = (b2 & 1) != 0;
            if ((b2 & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b2 & 8) != 0) {
                    s = (short) (this.f14949b.readByte() & 255);
                }
                bVar.e(z2, i2, this.f14949b, a(i, b2, s));
                this.f14949b.skip((long) s);
                return;
            }
            d.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        d.d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        throw null;
    }

    private void f(b bVar, int i, byte b2, int i2) throws IOException {
        if (i < 8) {
            d.d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f14949b.readInt();
            int readInt2 = this.f14949b.readInt();
            int i3 = i - 8;
            a f2 = a.f(readInt2);
            if (f2 != null) {
                ByteString byteString = ByteString.EMPTY;
                if (i3 > 0) {
                    byteString = this.f14949b.readByteString((long) i3);
                }
                bVar.j(readInt, f2, byteString);
                return;
            }
            d.d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            d.d("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    private List<b> g(int i, short s, byte b2, int i2) throws IOException {
        a aVar = this.f14950c;
        aVar.f14957f = i;
        aVar.f14954c = i;
        aVar.g = s;
        aVar.f14955d = b2;
        aVar.f14956e = i2;
        this.f14952e.k();
        return this.f14952e.e();
    }

    private void h(b bVar, int i, byte b2, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = (b2 & 1) != 0;
            if ((b2 & 8) != 0) {
                s = (short) (this.f14949b.readByte() & 255);
            }
            if ((b2 & 32) != 0) {
                n(bVar, i2);
                i -= 5;
            }
            bVar.c(z, i2, -1, g(a(i, b2, s), s, b2, i2));
            return;
        }
        d.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    static int k(BufferedSource bufferedSource) throws IOException {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    private void m(b bVar, int i, byte b2, int i2) throws IOException {
        boolean z = false;
        if (i != 8) {
            d.d("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f14949b.readInt();
            int readInt2 = this.f14949b.readInt();
            if ((b2 & 1) != 0) {
                z = true;
            }
            bVar.f(z, readInt, readInt2);
        } else {
            d.d("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    private void n(b bVar, int i) throws IOException {
        int readInt = this.f14949b.readInt();
        bVar.g(i, readInt & Integer.MAX_VALUE, (this.f14949b.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private void o(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 5) {
            d.d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            n(bVar, i2);
        } else {
            d.d("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void p(b bVar, int i, byte b2, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            if ((b2 & 8) != 0) {
                s = (short) (this.f14949b.readByte() & 255);
            }
            bVar.i(i2, this.f14949b.readInt() & Integer.MAX_VALUE, g(a(i - 4, b2, s), s, b2, i2));
            return;
        }
        d.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    private void q(b bVar, int i, byte b2, int i2) throws IOException {
        if (i != 4) {
            d.d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            int readInt = this.f14949b.readInt();
            a f2 = a.f(readInt);
            if (f2 != null) {
                bVar.h(i2, f2);
                return;
            }
            d.d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        } else {
            d.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void r(b bVar, int i, byte b2, int i2) throws IOException {
        if (i2 != 0) {
            d.d("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        } else if ((b2 & 1) != 0) {
            if (i == 0) {
                bVar.a();
            } else {
                d.d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        } else if (i % 6 == 0) {
            l lVar = new l();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short readShort = this.f14949b.readShort() & 65535;
                int readInt = this.f14949b.readInt();
                if (readShort != 2) {
                    if (readShort == 3) {
                        readShort = 4;
                    } else if (readShort == 4) {
                        readShort = 7;
                        if (readInt < 0) {
                            d.d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                    } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                        d.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                        throw null;
                    }
                } else if (!(readInt == 0 || readInt == 1)) {
                    d.d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    throw null;
                }
                lVar.i(readShort, readInt);
            }
            bVar.b(false, lVar);
        } else {
            d.d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
    }

    private void t(b bVar, int i, byte b2, int i2) throws IOException {
        if (i == 4) {
            long readInt = ((long) this.f14949b.readInt()) & 2147483647L;
            if (readInt != 0) {
                bVar.d(i2, readInt);
                return;
            }
            d.d("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        d.d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        throw null;
    }

    public boolean b(boolean z, b bVar) throws IOException {
        try {
            this.f14949b.require(9);
            int k = k(this.f14949b);
            if (k < 0 || k > 16384) {
                d.d("FRAME_SIZE_ERROR: %s", Integer.valueOf(k));
                throw null;
            }
            byte readByte = (byte) (this.f14949b.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.f14949b.readByte() & 255);
                int readInt = this.f14949b.readInt() & Integer.MAX_VALUE;
                if (f14948f.isLoggable(Level.FINE)) {
                    f14948f.fine(d.b(true, readInt, k, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        e(bVar, k, readByte2, readInt);
                        break;
                    case 1:
                        h(bVar, k, readByte2, readInt);
                        break;
                    case 2:
                        o(bVar, k, readByte2, readInt);
                        break;
                    case 3:
                        q(bVar, k, readByte2, readInt);
                        break;
                    case 4:
                        r(bVar, k, readByte2, readInt);
                        break;
                    case 5:
                        p(bVar, k, readByte2, readInt);
                        break;
                    case 6:
                        m(bVar, k, readByte2, readInt);
                        break;
                    case 7:
                        f(bVar, k, readByte2, readInt);
                        break;
                    case 8:
                        t(bVar, k, readByte2, readInt);
                        break;
                    default:
                        this.f14949b.skip((long) k);
                        break;
                }
                return true;
            }
            d.d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            throw null;
        } catch (EOFException unused) {
            return false;
        }
    }

    public void close() throws IOException {
        this.f14949b.close();
    }

    public void d(b bVar) throws IOException {
        if (!this.f14951d) {
            ByteString readByteString = this.f14949b.readByteString((long) d.f14892a.size());
            if (f14948f.isLoggable(Level.FINE)) {
                f14948f.fine(e.p("<< CONNECTION %s", readByteString.hex()));
            }
            if (!d.f14892a.equals(readByteString)) {
                d.d("Expected a connection header but was %s", readByteString.utf8());
                throw null;
            }
        } else if (!b(true, bVar)) {
            d.d("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }
}
