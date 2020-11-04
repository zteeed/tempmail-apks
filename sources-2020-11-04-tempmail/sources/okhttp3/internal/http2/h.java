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
    long f14958a = 0;

    /* renamed from: b  reason: collision with root package name */
    long f14959b;

    /* renamed from: c  reason: collision with root package name */
    final int f14960c;

    /* renamed from: d  reason: collision with root package name */
    final e f14961d;

    /* renamed from: e  reason: collision with root package name */
    private final Deque<y> f14962e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    private boolean f14963f;
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
        private final Buffer f14964b = new Buffer();

        /* renamed from: c  reason: collision with root package name */
        private y f14965c;

        /* renamed from: d  reason: collision with root package name */
        boolean f14966d;

        /* renamed from: e  reason: collision with root package name */
        boolean f14967e;

        a() {
        }

        /* JADX INFO: finally extract failed */
        private void a(boolean z) throws IOException {
            long min;
            boolean z2;
            synchronized (h.this) {
                h.this.j.enter();
                while (h.this.f14959b <= 0 && !this.f14967e && !this.f14966d && h.this.k == null) {
                    try {
                        h.this.q();
                    } catch (Throwable th) {
                        h.this.j.a();
                        throw th;
                    }
                }
                h.this.j.a();
                h.this.c();
                min = Math.min(h.this.f14959b, this.f14964b.size());
                h.this.f14959b -= min;
            }
            h.this.j.enter();
            if (z) {
                try {
                    if (min == this.f14964b.size()) {
                        z2 = true;
                        h.this.f14961d.P(h.this.f14960c, z2, this.f14964b, min);
                        h.this.j.a();
                    }
                } catch (Throwable th2) {
                    h.this.j.a();
                    throw th2;
                }
            }
            z2 = false;
            h.this.f14961d.P(h.this.f14960c, z2, this.f14964b, min);
            h.this.j.a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r8.f14964b.size() <= 0) goto L_0x0022;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            if (r8.f14965c == null) goto L_0x0029;
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
            if (r8.f14964b.size() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
            a(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
            r0 = r8.f14968f;
            r0.f14961d.Q(r0.f14960c, true, e.m0.e.I(r8.f14965c));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
            if (r2 == false) goto L_0x005a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
            if (r8.f14964b.size() <= 0) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
            r0 = r8.f14968f;
            r0.f14961d.P(r0.f14960c, true, (okio.Buffer) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
            r2 = r8.f14968f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r8.f14966d = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
            r8.f14968f.f14961d.flush();
            r8.f14968f.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f14968f.h.f14967e != false) goto L_0x0067;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r8 = this;
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                monitor-enter(r0)
                boolean r1 = r8.f14966d     // Catch:{ all -> 0x007d }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                okhttp3.internal.http2.h$a r0 = r0.h
                boolean r0 = r0.f14967e
                r1 = 1
                if (r0 != 0) goto L_0x0067
                okio.Buffer r0 = r8.f14964b
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
                e.y r3 = r8.f14965c
                if (r3 == 0) goto L_0x0029
                r3 = 1
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x004a
            L_0x002c:
                okio.Buffer r2 = r8.f14964b
                long r2 = r2.size()
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x003a
                r8.a(r0)
                goto L_0x002c
            L_0x003a:
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                okhttp3.internal.http2.e r2 = r0.f14961d
                int r0 = r0.f14960c
                e.y r3 = r8.f14965c
                java.util.List r3 = e.m0.e.I(r3)
                r2.Q(r0, r1, r3)
                goto L_0x0067
            L_0x004a:
                if (r2 == 0) goto L_0x005a
            L_0x004c:
                okio.Buffer r0 = r8.f14964b
                long r2 = r0.size()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0067
                r8.a(r1)
                goto L_0x004c
            L_0x005a:
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                okhttp3.internal.http2.e r2 = r0.f14961d
                int r3 = r0.f14960c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.P(r3, r4, r5, r6)
            L_0x0067:
                okhttp3.internal.http2.h r2 = okhttp3.internal.http2.h.this
                monitor-enter(r2)
                r8.f14966d = r1     // Catch:{ all -> 0x007a }
                monitor-exit(r2)     // Catch:{ all -> 0x007a }
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                okhttp3.internal.http2.e r0 = r0.f14961d
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
            while (this.f14964b.size() > 0) {
                a(false);
                h.this.f14961d.flush();
            }
        }

        public Timeout timeout() {
            return h.this.j;
        }

        public void write(Buffer buffer, long j) throws IOException {
            this.f14964b.write(buffer, j);
            while (this.f14964b.size() >= PlaybackStateCompat.ACTION_PREPARE) {
                a(false);
            }
        }
    }

    /* compiled from: Http2Stream */
    private final class b implements Source {

        /* renamed from: b  reason: collision with root package name */
        private final Buffer f14969b = new Buffer();

        /* renamed from: c  reason: collision with root package name */
        private final Buffer f14970c = new Buffer();

        /* renamed from: d  reason: collision with root package name */
        private final long f14971d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public y f14972e;

        /* renamed from: f  reason: collision with root package name */
        boolean f14973f;
        boolean g;

        b(long j) {
            this.f14971d = j;
        }

        private void d(long j) {
            h.this.f14961d.O(j);
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
                    z3 = this.f14970c.size() + j > this.f14971d;
                }
                if (z3) {
                    bufferedSource.skip(j);
                    h.this.f(a.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    bufferedSource.skip(j);
                    return;
                } else {
                    long read = bufferedSource.read(this.f14969b, j);
                    if (read != -1) {
                        j -= read;
                        synchronized (h.this) {
                            if (this.f14973f) {
                                j2 = this.f14969b.size();
                                this.f14969b.clear();
                            } else {
                                if (this.f14970c.size() != 0) {
                                    z2 = false;
                                }
                                this.f14970c.writeAll(this.f14969b);
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
                this.f14973f = true;
                size = this.f14970c.size();
                this.f14970c.clear();
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
                            if (this.f14973f) {
                                throw new IOException("stream closed");
                            } else if (this.f14970c.size() > 0) {
                                read = this.f14970c.read(buffer, Math.min(j, this.f14970c.size()));
                                h.this.f14958a += read;
                                if (th == null && h.this.f14958a >= ((long) (h.this.f14961d.t.d() / 2))) {
                                    h.this.f14961d.U(h.this.f14960c, h.this.f14958a);
                                    h.this.f14958a = 0;
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
            h.this.f14961d.J();
        }
    }

    h(int i2, e eVar, boolean z, boolean z2, @Nullable y yVar) {
        if (eVar != null) {
            this.f14960c = i2;
            this.f14961d = eVar;
            this.f14959b = (long) eVar.u.d();
            this.g = new b((long) eVar.t.d());
            a aVar = new a();
            this.h = aVar;
            this.g.g = z2;
            aVar.f14967e = z;
            if (yVar != null) {
                this.f14962e.add(yVar);
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
            if (this.g.g && this.h.f14967e) {
                return false;
            }
            this.k = aVar;
            this.l = iOException;
            notifyAll();
            this.f14961d.I(this.f14960c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j2) {
        this.f14959b += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() throws IOException {
        boolean z;
        boolean k2;
        synchronized (this) {
            z = !this.g.g && this.g.f14973f && (this.h.f14967e || this.h.f14966d);
            k2 = k();
        }
        if (z) {
            d(a.CANCEL, (IOException) null);
        } else if (!k2) {
            this.f14961d.I(this.f14960c);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() throws IOException {
        a aVar = this.h;
        if (aVar.f14966d) {
            throw new IOException("stream closed");
        } else if (aVar.f14967e) {
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
            this.f14961d.S(this.f14960c, aVar);
        }
    }

    public void f(a aVar) {
        if (e(aVar, (IOException) null)) {
            this.f14961d.T(this.f14960c, aVar);
        }
    }

    public int g() {
        return this.f14960c;
    }

    public Sink h() {
        synchronized (this) {
            if (!this.f14963f) {
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
        if (this.f14961d.f14896b == ((this.f14960c & 1) == 1)) {
            return true;
        }
        return false;
    }

    public synchronized boolean k() {
        if (this.k != null) {
            return false;
        }
        if ((this.g.g || this.g.f14973f) && ((this.h.f14967e || this.h.f14966d) && this.f14963f)) {
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
            boolean r0 = r2.f14963f     // Catch:{ all -> 0x002e }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            if (r4 != 0) goto L_0x0009
            goto L_0x000f
        L_0x0009:
            okhttp3.internal.http2.h$b r0 = r2.g     // Catch:{ all -> 0x002e }
            e.y unused = r0.f14972e = r3     // Catch:{ all -> 0x002e }
            goto L_0x0016
        L_0x000f:
            r2.f14963f = r1     // Catch:{ all -> 0x002e }
            java.util.Deque<e.y> r0 = r2.f14962e     // Catch:{ all -> 0x002e }
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
            okhttp3.internal.http2.e r3 = r2.f14961d
            int r4 = r2.f14960c
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
            java.util.Deque<e.y> r0 = r2.f14962e     // Catch:{ all -> 0x003c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0016
            okhttp3.internal.http2.a r0 = r2.k     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0016
            r2.q()     // Catch:{ all -> 0x003c }
            goto L_0x0006
        L_0x0016:
            okhttp3.internal.http2.h$c r0 = r2.i     // Catch:{ all -> 0x0043 }
            r0.a()     // Catch:{ all -> 0x0043 }
            java.util.Deque<e.y> r0 = r2.f14962e     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x002d
            java.util.Deque<e.y> r0 = r2.f14962e     // Catch:{ all -> 0x0043 }
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
