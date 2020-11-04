package e.m0.i;

import android.support.v4.media.session.PlaybackStateCompat;
import e.d0;
import e.g0;
import e.i0;
import e.m0.h.i;
import e.m0.h.k;
import e.y;
import e.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* compiled from: Http1ExchangeCodec */
public final class a implements e.m0.h.c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final d0 f14704a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final okhttp3.internal.connection.f f14705b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final BufferedSource f14706c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final BufferedSink f14707d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f14708e = 0;

    /* renamed from: f  reason: collision with root package name */
    private long f14709f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    /* access modifiers changed from: private */
    public y g;

    /* compiled from: Http1ExchangeCodec */
    private abstract class b implements Source {

        /* renamed from: b  reason: collision with root package name */
        protected final ForwardingTimeout f14710b;

        /* renamed from: c  reason: collision with root package name */
        protected boolean f14711c;

        private b() {
            this.f14710b = new ForwardingTimeout(a.this.f14706c.timeout());
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (a.this.f14708e != 6) {
                if (a.this.f14708e == 5) {
                    a.this.s(this.f14710b);
                    int unused = a.this.f14708e = 6;
                    return;
                }
                throw new IllegalStateException("state: " + a.this.f14708e);
            }
        }

        public long read(Buffer buffer, long j) throws IOException {
            try {
                return a.this.f14706c.read(buffer, j);
            } catch (IOException e2) {
                a.this.f14705b.q();
                a();
                throw e2;
            }
        }

        public Timeout timeout() {
            return this.f14710b;
        }
    }

    /* compiled from: Http1ExchangeCodec */
    private final class c implements Sink {

        /* renamed from: b  reason: collision with root package name */
        private final ForwardingTimeout f14713b = new ForwardingTimeout(a.this.f14707d.timeout());

        /* renamed from: c  reason: collision with root package name */
        private boolean f14714c;

        c() {
        }

        public synchronized void close() throws IOException {
            if (!this.f14714c) {
                this.f14714c = true;
                a.this.f14707d.writeUtf8("0\r\n\r\n");
                a.this.s(this.f14713b);
                int unused = a.this.f14708e = 3;
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.f14714c) {
                a.this.f14707d.flush();
            }
        }

        public Timeout timeout() {
            return this.f14713b;
        }

        public void write(Buffer buffer, long j) throws IOException {
            if (this.f14714c) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                a.this.f14707d.writeHexadecimalUnsignedLong(j);
                a.this.f14707d.writeUtf8("\r\n");
                a.this.f14707d.write(buffer, j);
                a.this.f14707d.writeUtf8("\r\n");
            }
        }
    }

    /* compiled from: Http1ExchangeCodec */
    private class d extends b {

        /* renamed from: e  reason: collision with root package name */
        private final z f14716e;

        /* renamed from: f  reason: collision with root package name */
        private long f14717f = -1;
        private boolean g = true;

        d(z zVar) {
            super();
            this.f14716e = zVar;
        }

        private void b() throws IOException {
            if (this.f14717f != -1) {
                a.this.f14706c.readUtf8LineStrict();
            }
            try {
                this.f14717f = a.this.f14706c.readHexadecimalUnsignedLong();
                String trim = a.this.f14706c.readUtf8LineStrict().trim();
                if (this.f14717f < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f14717f + trim + "\"");
                } else if (this.f14717f == 0) {
                    this.g = false;
                    a aVar = a.this;
                    y unused = aVar.g = aVar.z();
                    e.m0.h.e.e(a.this.f14704a.j(), this.f14716e, a.this.g);
                    a();
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        public void close() throws IOException {
            if (!this.f14711c) {
                if (this.g && !e.m0.e.o(this, 100, TimeUnit.MILLISECONDS)) {
                    a.this.f14705b.q();
                    a();
                }
                this.f14711c = true;
            }
        }

        public long read(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f14711c) {
                throw new IllegalStateException("closed");
            } else if (!this.g) {
                return -1;
            } else {
                long j2 = this.f14717f;
                if (j2 == 0 || j2 == -1) {
                    b();
                    if (!this.g) {
                        return -1;
                    }
                }
                long read = super.read(buffer, Math.min(j, this.f14717f));
                if (read != -1) {
                    this.f14717f -= read;
                    return read;
                }
                a.this.f14705b.q();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
        }
    }

    /* compiled from: Http1ExchangeCodec */
    private class e extends b {

        /* renamed from: e  reason: collision with root package name */
        private long f14718e;

        e(long j) {
            super();
            this.f14718e = j;
            if (j == 0) {
                a();
            }
        }

        public void close() throws IOException {
            if (!this.f14711c) {
                if (this.f14718e != 0 && !e.m0.e.o(this, 100, TimeUnit.MILLISECONDS)) {
                    a.this.f14705b.q();
                    a();
                }
                this.f14711c = true;
            }
        }

        public long read(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (!this.f14711c) {
                long j2 = this.f14718e;
                if (j2 == 0) {
                    return -1;
                }
                long read = super.read(buffer, Math.min(j2, j));
                if (read != -1) {
                    long j3 = this.f14718e - read;
                    this.f14718e = j3;
                    if (j3 == 0) {
                        a();
                    }
                    return read;
                }
                a.this.f14705b.q();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* compiled from: Http1ExchangeCodec */
    private final class f implements Sink {

        /* renamed from: b  reason: collision with root package name */
        private final ForwardingTimeout f14720b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f14721c;

        private f() {
            this.f14720b = new ForwardingTimeout(a.this.f14707d.timeout());
        }

        public void close() throws IOException {
            if (!this.f14721c) {
                this.f14721c = true;
                a.this.s(this.f14720b);
                int unused = a.this.f14708e = 3;
            }
        }

        public void flush() throws IOException {
            if (!this.f14721c) {
                a.this.f14707d.flush();
            }
        }

        public Timeout timeout() {
            return this.f14720b;
        }

        public void write(Buffer buffer, long j) throws IOException {
            if (!this.f14721c) {
                e.m0.e.e(buffer.size(), 0, j);
                a.this.f14707d.write(buffer, j);
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    /* compiled from: Http1ExchangeCodec */
    private class g extends b {

        /* renamed from: e  reason: collision with root package name */
        private boolean f14723e;

        private g(a aVar) {
            super();
        }

        public void close() throws IOException {
            if (!this.f14711c) {
                if (!this.f14723e) {
                    a();
                }
                this.f14711c = true;
            }
        }

        public long read(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f14711c) {
                throw new IllegalStateException("closed");
            } else if (this.f14723e) {
                return -1;
            } else {
                long read = super.read(buffer, j);
                if (read != -1) {
                    return read;
                }
                this.f14723e = true;
                a();
                return -1;
            }
        }
    }

    public a(d0 d0Var, okhttp3.internal.connection.f fVar, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        this.f14704a = d0Var;
        this.f14705b = fVar;
        this.f14706c = bufferedSource;
        this.f14707d = bufferedSink;
    }

    /* access modifiers changed from: private */
    public void s(ForwardingTimeout forwardingTimeout) {
        Timeout delegate = forwardingTimeout.delegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    private Sink t() {
        if (this.f14708e == 1) {
            this.f14708e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f14708e);
    }

    private Source u(z zVar) {
        if (this.f14708e == 4) {
            this.f14708e = 5;
            return new d(zVar);
        }
        throw new IllegalStateException("state: " + this.f14708e);
    }

    private Source v(long j) {
        if (this.f14708e == 4) {
            this.f14708e = 5;
            return new e(j);
        }
        throw new IllegalStateException("state: " + this.f14708e);
    }

    private Sink w() {
        if (this.f14708e == 1) {
            this.f14708e = 2;
            return new f();
        }
        throw new IllegalStateException("state: " + this.f14708e);
    }

    private Source x() {
        if (this.f14708e == 4) {
            this.f14708e = 5;
            this.f14705b.q();
            return new g();
        }
        throw new IllegalStateException("state: " + this.f14708e);
    }

    private String y() throws IOException {
        String readUtf8LineStrict = this.f14706c.readUtf8LineStrict(this.f14709f);
        this.f14709f -= (long) readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }

    /* access modifiers changed from: private */
    public y z() throws IOException {
        y.a aVar = new y.a();
        while (true) {
            String y = y();
            if (y.length() == 0) {
                return aVar.f();
            }
            e.m0.c.f14665a.a(aVar, y);
        }
    }

    public void A(i0 i0Var) throws IOException {
        long b2 = e.m0.h.e.b(i0Var);
        if (b2 != -1) {
            Source v = v(b2);
            e.m0.e.E(v, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            v.close();
        }
    }

    public void B(y yVar, String str) throws IOException {
        if (this.f14708e == 0) {
            this.f14707d.writeUtf8(str).writeUtf8("\r\n");
            int h = yVar.h();
            for (int i = 0; i < h; i++) {
                this.f14707d.writeUtf8(yVar.e(i)).writeUtf8(": ").writeUtf8(yVar.i(i)).writeUtf8("\r\n");
            }
            this.f14707d.writeUtf8("\r\n");
            this.f14708e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f14708e);
    }

    public okhttp3.internal.connection.f a() {
        return this.f14705b;
    }

    public void b() throws IOException {
        this.f14707d.flush();
    }

    public void c(g0 g0Var) throws IOException {
        B(g0Var.d(), i.a(g0Var, this.f14705b.r().b().type()));
    }

    public void cancel() {
        okhttp3.internal.connection.f fVar = this.f14705b;
        if (fVar != null) {
            fVar.d();
        }
    }

    public Source d(i0 i0Var) {
        if (!e.m0.h.e.c(i0Var)) {
            return v(0);
        }
        if ("chunked".equalsIgnoreCase(i0Var.f("Transfer-Encoding"))) {
            return u(i0Var.q().i());
        }
        long b2 = e.m0.h.e.b(i0Var);
        if (b2 != -1) {
            return v(b2);
        }
        return x();
    }

    public i0.a e(boolean z) throws IOException {
        int i = this.f14708e;
        if (i == 1 || i == 3) {
            try {
                k a2 = k.a(y());
                i0.a aVar = new i0.a();
                aVar.o(a2.f14701a);
                aVar.g(a2.f14702b);
                aVar.l(a2.f14703c);
                aVar.j(z());
                if (z && a2.f14702b == 100) {
                    return null;
                }
                if (a2.f14702b == 100) {
                    this.f14708e = 3;
                    return aVar;
                }
                this.f14708e = 4;
                return aVar;
            } catch (EOFException e2) {
                okhttp3.internal.connection.f fVar = this.f14705b;
                String C = fVar != null ? fVar.r().a().l().C() : "unknown";
                throw new IOException("unexpected end of stream on " + C, e2);
            }
        } else {
            throw new IllegalStateException("state: " + this.f14708e);
        }
    }

    public void f() throws IOException {
        this.f14707d.flush();
    }

    public long g(i0 i0Var) {
        if (!e.m0.h.e.c(i0Var)) {
            return 0;
        }
        if ("chunked".equalsIgnoreCase(i0Var.f("Transfer-Encoding"))) {
            return -1;
        }
        return e.m0.h.e.b(i0Var);
    }

    public Sink h(g0 g0Var, long j) throws IOException {
        if (g0Var.a() != null && g0Var.a().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if ("chunked".equalsIgnoreCase(g0Var.c("Transfer-Encoding"))) {
            return t();
        } else {
            if (j != -1) {
                return w();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }
}
