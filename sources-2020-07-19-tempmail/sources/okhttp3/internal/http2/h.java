package okhttp3.internal.http2;

import android.support.v4.media.session.PlaybackStateCompat;
import e.y;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import javax.annotation.Nullable;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* compiled from: Http2Stream */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    long f14397a = 0;

    /* renamed from: b  reason: collision with root package name */
    long f14398b;

    /* renamed from: c  reason: collision with root package name */
    final int f14399c;

    /* renamed from: d  reason: collision with root package name */
    final e f14400d;

    /* renamed from: e  reason: collision with root package name */
    private final Deque<y> f14401e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    private boolean f14402f;
    private final b g;
    final a h;
    final c i = new c();
    final c j = new c();
    @Nullable
    a k;
    @Nullable
    IOException l;

    /* compiled from: Http2Stream */
    final class a implements Sink {

        /* renamed from: b  reason: collision with root package name */
        private final Buffer f14403b = new Buffer();

        /* renamed from: c  reason: collision with root package name */
        private y f14404c;

        /* renamed from: d  reason: collision with root package name */
        boolean f14405d;

        /* renamed from: e  reason: collision with root package name */
        boolean f14406e;

        a() {
        }

        /* JADX INFO: finally extract failed */
        private void a(boolean z) throws IOException {
            long min;
            boolean z2;
            synchronized (h.this) {
                h.this.j.enter();
                while (h.this.f14398b <= 0 && !this.f14406e && !this.f14405d && h.this.k == null) {
                    try {
                        h.this.q();
                    } catch (Throwable th) {
                        h.this.j.a();
                        throw th;
                    }
                }
                h.this.j.a();
                h.this.c();
                min = Math.min(h.this.f14398b, this.f14403b.size());
                h.this.f14398b -= min;
            }
            h.this.j.enter();
            if (z) {
                try {
                    if (min == this.f14403b.size()) {
                        z2 = true;
                        h.this.f14400d.P(h.this.f14399c, z2, this.f14403b, min);
                        h.this.j.a();
                    }
                } catch (Throwable th2) {
                    h.this.j.a();
                    throw th2;
                }
            }
            z2 = false;
            h.this.f14400d.P(h.this.f14399c, z2, this.f14403b, min);
            h.this.j.a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r8.f14403b.size() <= 0) goto L_0x0022;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            if (r8.f14404c == null) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
            if (r3 == false) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
            if (r8.f14403b.size() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
            a(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
            r0 = r8.f14407f;
            r0.f14400d.Q(r0.f14399c, true, e.m0.e.I(r8.f14404c));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
            if (r2 == false) goto L_0x005a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
            if (r8.f14403b.size() <= 0) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
            r0 = r8.f14407f;
            r0.f14400d.P(r0.f14399c, true, (okio.Buffer) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
            r2 = r8.f14407f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r8.f14405d = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
            r8.f14407f.f14400d.flush();
            r8.f14407f.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f14407f.h.f14406e != false) goto L_0x0067;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r8 = this;
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                monitor-enter(r0)
                boolean r1 = r8.f14405d     // Catch:{ all -> 0x007d }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                okhttp3.internal.http2.h$a r0 = r0.h
                boolean r0 = r0.f14406e
                r1 = 1
                if (r0 != 0) goto L_0x0067
                okio.Buffer r0 = r8.f14403b
                long r2 = r0.size()
                r0 = 0
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x0022
                r2 = 1
                goto L_0x0023
            L_0x0022:
                r2 = 0
            L_0x0023:
                e.y r3 = r8.f14404c
                if (r3 == 0) goto L_0x0029
                r3 = 1
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x004a
            L_0x002c:
                okio.Buffer r2 = r8.f14403b
                long r2 = r2.size()
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x003a
                r8.a(r0)
                goto L_0x002c
            L_0x003a:
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                okhttp3.internal.http2.e r2 = r0.f14400d
                int r0 = r0.f14399c
                e.y r3 = r8.f14404c
                java.util.List r3 = e.m0.e.I(r3)
                r2.Q(r0, r1, r3)
                goto L_0x0067
            L_0x004a:
                if (r2 == 0) goto L_0x005a
            L_0x004c:
                okio.Buffer r0 = r8.f14403b
                long r2 = r0.size()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0067
                r8.a(r1)
                goto L_0x004c
            L_0x005a:
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                okhttp3.internal.http2.e r2 = r0.f14400d
                int r3 = r0.f14399c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.P(r3, r4, r5, r6)
            L_0x0067:
                okhttp3.internal.http2.h r2 = okhttp3.internal.http2.h.this
                monitor-enter(r2)
                r8.f14405d = r1     // Catch:{ all -> 0x007a }
                monitor-exit(r2)     // Catch:{ all -> 0x007a }
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                okhttp3.internal.http2.e r0 = r0.f14400d
                r0.flush()
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                r0.b()
                return
            L_0x007a:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x007a }
                throw r0
            L_0x007d:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.h.a.close():void");
        }

        public void flush() throws IOException {
            synchronized (h.this) {
                h.this.c();
            }
            while (this.f14403b.size() > 0) {
                a(false);
                h.this.f14400d.flush();
            }
        }

        public Timeout timeout() {
            return h.this.j;
        }

        public void write(Buffer buffer, long j) throws IOException {
            this.f14403b.write(buffer, j);
            while (this.f14403b.size() >= PlaybackStateCompat.ACTION_PREPARE) {
                a(false);
            }
        }
    }

    /* compiled from: Http2Stream */
    private final class b implements Source {

        /* renamed from: b  reason: collision with root package name */
        private final Buffer f14408b = new Buffer();

        /* renamed from: c  reason: collision with root package name */
        private final Buffer f14409c = new Buffer();

        /* renamed from: d  reason: collision with root package name */
        private final long f14410d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public y f14411e;

        /* renamed from: f  reason: collision with root package name */
        boolean f14412f;
        boolean g;

        b(long j) {
            this.f14410d = j;
        }

        private void d(long j) {
            h.this.f14400d.O(j);
        }

        /* access modifiers changed from: package-private */
        public void b(BufferedSource bufferedSource, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            while (j > 0) {
                synchronized (h.this) {
                    z = this.g;
                    z2 = true;
                    z3 = this.f14409c.size() + j > this.f14410d;
                }
                if (z3) {
                    bufferedSource.skip(j);
                    h.this.f(a.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    bufferedSource.skip(j);
                    return;
                } else {
                    long read = bufferedSource.read(this.f14408b, j);
                    if (read != -1) {
                        j -= read;
                        synchronized (h.this) {
                            if (this.f14412f) {
                                j2 = this.f14408b.size();
                                this.f14408b.clear();
                            } else {
                                if (this.f14409c.size() != 0) {
                                    z2 = false;
                                }
                                this.f14409c.writeAll(this.f14408b);
                                if (z2) {
                                    h.this.notifyAll();
                                }
                                j2 = 0;
                            }
                        }
                        if (j2 > 0) {
                            d(j2);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public void close() throws IOException {
            long size;
            synchronized (h.this) {
                this.f14412f = true;
                size = this.f14409c.size();
                this.f14409c.clear();
                h.this.notifyAll();
            }
            if (size > 0) {
                d(size);
            }
            h.this.b();
        }

        public long read(Buffer buffer, long j) throws IOException {
            Throwable th;
            long read;
            if (j >= 0) {
                while (true) {
                    th = null;
                    synchronized (h.this) {
                        h.this.i.enter();
                        try {
                            if (h.this.k != null) {
                                if (h.this.l != null) {
                                    th = h.this.l;
                                } else {
                                    th = new StreamResetException(h.this.k);
                                }
                            }
                            if (this.f14412f) {
                                throw new IOException("stream closed");
                            } else if (this.f14409c.size() > 0) {
                                read = this.f14409c.read(buffer, Math.min(j, this.f14409c.size()));
                                h.this.f14397a += read;
                                if (th == null && h.this.f14397a >= ((long) (h.this.f14400d.t.d() / 2))) {
                                    h.this.f14400d.U(h.this.f14399c, h.this.f14397a);
                                    h.this.f14397a = 0;
                                }
                            } else if (this.g || th != null) {
                                read = -1;
                            } else {
                                h.this.q();
                            }
                        } finally {
                            h.this.i.a();
                        }
                    }
                }
                read = -1;
                h.this.i.a();
                if (read != -1) {
                    d(read);
                    return read;
                } else if (th == null) {
                    return -1;
                } else {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
        }

        public Timeout timeout() {
            return h.this.i;
        }
    }

    /* compiled from: Http2Stream */
    class c extends AsyncTimeout {
        c() {
        }

        public void a() throws IOException {
            if (exit()) {
                throw newTimeoutException((IOException) null);
            }
        }

        /* access modifiers changed from: protected */
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        public void timedOut() {
            h.this.f(a.CANCEL);
            h.this.f14400d.J();
        }
    }

    h(int i2, e eVar, boolean z, boolean z2, @Nullable y yVar) {
        if (eVar != null) {
            this.f14399c = i2;
            this.f14400d = eVar;
            this.f14398b = (long) eVar.u.d();
            this.g = new b((long) eVar.t.d());
            a aVar = new a();
            this.h = aVar;
            this.g.g = z2;
            aVar.f14406e = z;
            if (yVar != null) {
                this.f14401e.add(yVar);
            }
            if (j() && yVar != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!j() && yVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    private boolean e(a aVar, @Nullable IOException iOException) {
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            if (this.g.g && this.h.f14406e) {
                return false;
            }
            this.k = aVar;
            this.l = iOException;
            notifyAll();
            this.f14400d.I(this.f14399c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j2) {
        this.f14398b += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() throws IOException {
        boolean z;
        boolean k2;
        synchronized (this) {
            z = !this.g.g && this.g.f14412f && (this.h.f14406e || this.h.f14405d);
            k2 = k();
        }
        if (z) {
            d(a.CANCEL, (IOException) null);
        } else if (!k2) {
            this.f14400d.I(this.f14399c);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() throws IOException {
        a aVar = this.h;
        if (aVar.f14405d) {
            throw new IOException("stream closed");
        } else if (aVar.f14406e) {
            throw new IOException("stream finished");
        } else if (this.k != null) {
            Throwable th = this.l;
            if (th == null) {
                th = new StreamResetException(this.k);
            }
            throw th;
        }
    }

    public void d(a aVar, @Nullable IOException iOException) throws IOException {
        if (e(aVar, iOException)) {
            this.f14400d.S(this.f14399c, aVar);
        }
    }

    public void f(a aVar) {
        if (e(aVar, (IOException) null)) {
            this.f14400d.T(this.f14399c, aVar);
        }
    }

    public int g() {
        return this.f14399c;
    }

    public Sink h() {
        synchronized (this) {
            if (!this.f14402f) {
                if (!j()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.h;
    }

    public Source i() {
        return this.g;
    }

    public boolean j() {
        if (this.f14400d.f14335b == ((this.f14399c & 1) == 1)) {
            return true;
        }
        return false;
    }

    public synchronized boolean k() {
        if (this.k != null) {
            return false;
        }
        if ((this.g.g || this.g.f14412f) && ((this.h.f14406e || this.h.f14405d) && this.f14402f)) {
            return false;
        }
        return true;
    }

    public Timeout l() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public void m(BufferedSource bufferedSource, int i2) throws IOException {
        this.g.b(bufferedSource, (long) i2);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(e.y r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f14402f     // Catch:{ all -> 0x002e }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            if (r4 != 0) goto L_0x0009
            goto L_0x000f
        L_0x0009:
            okhttp3.internal.http2.h$b r0 = r2.g     // Catch:{ all -> 0x002e }
            e.y unused = r0.f14411e = r3     // Catch:{ all -> 0x002e }
            goto L_0x0016
        L_0x000f:
            r2.f14402f = r1     // Catch:{ all -> 0x002e }
            java.util.Deque<e.y> r0 = r2.f14401e     // Catch:{ all -> 0x002e }
            r0.add(r3)     // Catch:{ all -> 0x002e }
        L_0x0016:
            if (r4 == 0) goto L_0x001c
            okhttp3.internal.http2.h$b r3 = r2.g     // Catch:{ all -> 0x002e }
            r3.g = r1     // Catch:{ all -> 0x002e }
        L_0x001c:
            boolean r3 = r2.k()     // Catch:{ all -> 0x002e }
            r2.notifyAll()     // Catch:{ all -> 0x002e }
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            if (r3 != 0) goto L_0x002d
            okhttp3.internal.http2.e r3 = r2.f14400d
            int r4 = r2.f14399c
            r3.I(r4)
        L_0x002d:
            return
        L_0x002e:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.h.n(e.y, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public synchronized void o(a aVar) {
        if (this.k == null) {
            this.k = aVar;
            notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r2.i.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized e.y p() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.h$c r0 = r2.i     // Catch:{ all -> 0x0043 }
            r0.enter()     // Catch:{ all -> 0x0043 }
        L_0x0006:
            java.util.Deque<e.y> r0 = r2.f14401e     // Catch:{ all -> 0x003c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0016
            okhttp3.internal.http2.a r0 = r2.k     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0016
            r2.q()     // Catch:{ all -> 0x003c }
            goto L_0x0006
        L_0x0016:
            okhttp3.internal.http2.h$c r0 = r2.i     // Catch:{ all -> 0x0043 }
            r0.a()     // Catch:{ all -> 0x0043 }
            java.util.Deque<e.y> r0 = r2.f14401e     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x002d
            java.util.Deque<e.y> r0 = r2.f14401e     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x0043 }
            e.y r0 = (e.y) r0     // Catch:{ all -> 0x0043 }
            monitor-exit(r2)
            return r0
        L_0x002d:
            java.io.IOException r0 = r2.l     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0034
            java.io.IOException r0 = r2.l     // Catch:{ all -> 0x0043 }
            goto L_0x003b
        L_0x0034:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x0043 }
            okhttp3.internal.http2.a r1 = r2.k     // Catch:{ all -> 0x0043 }
            r0.<init>(r1)     // Catch:{ all -> 0x0043 }
        L_0x003b:
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x003c:
            r0 = move-exception
            okhttp3.internal.http2.h$c r1 = r2.i     // Catch:{ all -> 0x0043 }
            r1.a()     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.h.p():e.y");
    }

    /* access modifiers changed from: package-private */
    public void q() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public Timeout r() {
        return this.j;
    }
}
