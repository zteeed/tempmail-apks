package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.internal.http2.g;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: Http2Connection */
public final class e implements Closeable {
    /* access modifiers changed from: private */
    public static final ExecutorService z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.m0.e.H("OkHttp Http2Connection", true));

    /* renamed from: b  reason: collision with root package name */
    final boolean f14335b;

    /* renamed from: c  reason: collision with root package name */
    final j f14336c;

    /* renamed from: d  reason: collision with root package name */
    final Map<Integer, h> f14337d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    final String f14338e;

    /* renamed from: f  reason: collision with root package name */
    int f14339f;
    int g;
    /* access modifiers changed from: private */
    public boolean h;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService i;
    private final ExecutorService j;
    final k k;
    /* access modifiers changed from: private */
    public long l = 0;
    /* access modifiers changed from: private */
    public long m = 0;
    private long n = 0;
    private long o = 0;
    private long p = 0;
    private long q = 0;
    long r = 0;
    long s;
    l t = new l();
    final l u = new l();
    final Socket v;
    final i w;
    final l x;
    final Set<Integer> y = new LinkedHashSet();

    /* compiled from: Http2Connection */
    class a extends e.m0.d {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f14340c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f14341d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i, a aVar) {
            super(str, objArr);
            this.f14340c = i;
            this.f14341d = aVar;
        }

        public void k() {
            try {
                e.this.S(this.f14340c, this.f14341d);
            } catch (IOException e2) {
                e.this.q(e2);
            }
        }
    }

    /* compiled from: Http2Connection */
    class b extends e.m0.d {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f14343c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f14344d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f14343c = i;
            this.f14344d = j;
        }

        public void k() {
            try {
                e.this.w.q(this.f14343c, this.f14344d);
            } catch (IOException e2) {
                e.this.q(e2);
            }
        }
    }

    /* compiled from: Http2Connection */
    class c extends e.m0.d {
        c(String str, Object... objArr) {
            super(str, objArr);
        }

        public void k() {
            e.this.R(false, 2, 0);
        }
    }

    /* compiled from: Http2Connection */
    class d extends e.m0.d {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f14347c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f14348d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f14347c = i;
            this.f14348d = list;
        }

        public void k() {
            if (e.this.k.a(this.f14347c, this.f14348d)) {
                try {
                    e.this.w.o(this.f14347c, a.CANCEL);
                    synchronized (e.this) {
                        e.this.y.remove(Integer.valueOf(this.f14347c));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.e$e  reason: collision with other inner class name */
    /* compiled from: Http2Connection */
    class C0164e extends e.m0.d {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f14350c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f14351d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f14352e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0164e(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f14350c = i;
            this.f14351d = list;
            this.f14352e = z;
        }

        public void k() {
            boolean b2 = e.this.k.b(this.f14350c, this.f14351d, this.f14352e);
            if (b2) {
                try {
                    e.this.w.o(this.f14350c, a.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (b2 || this.f14352e) {
                synchronized (e.this) {
                    e.this.y.remove(Integer.valueOf(this.f14350c));
                }
            }
        }
    }

    /* compiled from: Http2Connection */
    class f extends e.m0.d {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f14354c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Buffer f14355d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f14356e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f14357f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str, Object[] objArr, int i, Buffer buffer, int i2, boolean z) {
            super(str, objArr);
            this.f14354c = i;
            this.f14355d = buffer;
            this.f14356e = i2;
            this.f14357f = z;
        }

        public void k() {
            try {
                boolean d2 = e.this.k.d(this.f14354c, this.f14355d, this.f14356e, this.f14357f);
                if (d2) {
                    e.this.w.o(this.f14354c, a.CANCEL);
                }
                if (d2 || this.f14357f) {
                    synchronized (e.this) {
                        e.this.y.remove(Integer.valueOf(this.f14354c));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* compiled from: Http2Connection */
    class g extends e.m0.d {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f14358c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f14359d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(String str, Object[] objArr, int i, a aVar) {
            super(str, objArr);
            this.f14358c = i;
            this.f14359d = aVar;
        }

        public void k() {
            e.this.k.c(this.f14358c, this.f14359d);
            synchronized (e.this) {
                e.this.y.remove(Integer.valueOf(this.f14358c));
            }
        }
    }

    /* compiled from: Http2Connection */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        Socket f14361a;

        /* renamed from: b  reason: collision with root package name */
        String f14362b;

        /* renamed from: c  reason: collision with root package name */
        BufferedSource f14363c;

        /* renamed from: d  reason: collision with root package name */
        BufferedSink f14364d;

        /* renamed from: e  reason: collision with root package name */
        j f14365e = j.f14368a;

        /* renamed from: f  reason: collision with root package name */
        k f14366f = k.f14426a;
        boolean g;
        int h;

        public h(boolean z) {
            this.g = z;
        }

        public e a() {
            return new e(this);
        }

        public h b(j jVar) {
            this.f14365e = jVar;
            return this;
        }

        public h c(int i) {
            this.h = i;
            return this;
        }

        public h d(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.f14361a = socket;
            this.f14362b = str;
            this.f14363c = bufferedSource;
            this.f14364d = bufferedSink;
            return this;
        }
    }

    /* compiled from: Http2Connection */
    final class i extends e.m0.d {
        i() {
            super("OkHttp %s ping", e.this.f14338e);
        }

        public void k() {
            boolean z;
            synchronized (e.this) {
                if (e.this.m < e.this.l) {
                    z = true;
                } else {
                    e.f(e.this);
                    z = false;
                }
            }
            if (z) {
                e.this.q((IOException) null);
            } else {
                e.this.R(false, 1, 0);
            }
        }
    }

    /* compiled from: Http2Connection */
    public static abstract class j {

        /* renamed from: a  reason: collision with root package name */
        public static final j f14368a = new a();

        /* compiled from: Http2Connection */
        class a extends j {
            a() {
            }

            public void c(h hVar) throws IOException {
                hVar.d(a.REFUSED_STREAM, (IOException) null);
            }
        }

        public void b(e eVar) {
        }

        public abstract void c(h hVar) throws IOException;
    }

    /* compiled from: Http2Connection */
    final class k extends e.m0.d {

        /* renamed from: c  reason: collision with root package name */
        final boolean f14369c;

        /* renamed from: d  reason: collision with root package name */
        final int f14370d;

        /* renamed from: e  reason: collision with root package name */
        final int f14371e;

        k(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", e.this.f14338e, Integer.valueOf(i), Integer.valueOf(i2));
            this.f14369c = z;
            this.f14370d = i;
            this.f14371e = i2;
        }

        public void k() {
            e.this.R(this.f14369c, this.f14370d, this.f14371e);
        }
    }

    /* compiled from: Http2Connection */
    class l extends e.m0.d implements g.b {

        /* renamed from: c  reason: collision with root package name */
        final g f14373c;

        /* compiled from: Http2Connection */
        class a extends e.m0.d {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h f14375c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, h hVar) {
                super(str, objArr);
                this.f14375c = hVar;
            }

            public void k() {
                try {
                    e.this.f14336c.c(this.f14375c);
                } catch (IOException e2) {
                    e.m0.j.f j = e.m0.j.f.j();
                    j.p(4, "Http2Connection.Listener failure for " + e.this.f14338e, e2);
                    try {
                        this.f14375c.d(a.PROTOCOL_ERROR, e2);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* compiled from: Http2Connection */
        class b extends e.m0.d {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f14377c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ l f14378d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(String str, Object[] objArr, boolean z, l lVar) {
                super(str, objArr);
                this.f14377c = z;
                this.f14378d = lVar;
            }

            public void k() {
                l.this.l(this.f14377c, this.f14378d);
            }
        }

        /* compiled from: Http2Connection */
        class c extends e.m0.d {
            c(String str, Object... objArr) {
                super(str, objArr);
            }

            public void k() {
                e eVar = e.this;
                eVar.f14336c.b(eVar);
            }
        }

        l(g gVar) {
            super("OkHttp %s", e.this.f14338e);
            this.f14373c = gVar;
        }

        public void a() {
        }

        public void b(boolean z, l lVar) {
            try {
                e.this.i.execute(new b("OkHttp %s ACK Settings", new Object[]{e.this.f14338e}, z, lVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        public void c(boolean z, int i, int i2, List<b> list) {
            if (e.this.H(i)) {
                e.this.D(i, list, z);
                return;
            }
            synchronized (e.this) {
                h r = e.this.r(i);
                if (r != null) {
                    r.n(e.m0.e.J(list), z);
                } else if (!e.this.h) {
                    if (i > e.this.f14339f) {
                        if (i % 2 != e.this.g % 2) {
                            int i3 = i;
                            h hVar = new h(i3, e.this, false, z, e.m0.e.J(list));
                            e.this.f14339f = i;
                            e.this.f14337d.put(Integer.valueOf(i), hVar);
                            e.z.execute(new a("OkHttp %s stream %d", new Object[]{e.this.f14338e, Integer.valueOf(i)}, hVar));
                        }
                    }
                }
            }
        }

        public void d(int i, long j) {
            if (i == 0) {
                synchronized (e.this) {
                    e.this.s += j;
                    e.this.notifyAll();
                }
                return;
            }
            h r = e.this.r(i);
            if (r != null) {
                synchronized (r) {
                    r.a(j);
                }
            }
        }

        public void e(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException {
            if (e.this.H(i)) {
                e.this.A(i, bufferedSource, i2, z);
                return;
            }
            h r = e.this.r(i);
            if (r == null) {
                e.this.T(i, a.PROTOCOL_ERROR);
                long j = (long) i2;
                e.this.O(j);
                bufferedSource.skip(j);
                return;
            }
            r.m(bufferedSource, i2);
            if (z) {
                r.n(e.m0.e.f14106c, true);
            }
        }

        public void f(boolean z, int i, int i2) {
            if (z) {
                synchronized (e.this) {
                    if (i == 1) {
                        try {
                            e.d(e.this);
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (i == 2) {
                        e.n(e.this);
                    } else if (i == 3) {
                        e.o(e.this);
                        e.this.notifyAll();
                    }
                }
                return;
            }
            try {
                e.this.i.execute(new k(true, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        public void g(int i, int i2, int i3, boolean z) {
        }

        public void h(int i, a aVar) {
            if (e.this.H(i)) {
                e.this.G(i, aVar);
                return;
            }
            h I = e.this.I(i);
            if (I != null) {
                I.o(aVar);
            }
        }

        public void i(int i, int i2, List<b> list) {
            e.this.E(i2, list);
        }

        public void j(int i, a aVar, ByteString byteString) {
            h[] hVarArr;
            byteString.size();
            synchronized (e.this) {
                hVarArr = (h[]) e.this.f14337d.values().toArray(new h[e.this.f14337d.size()]);
                boolean unused = e.this.h = true;
            }
            for (h hVar : hVarArr) {
                if (hVar.g() > i && hVar.j()) {
                    hVar.o(a.REFUSED_STREAM);
                    e.this.I(hVar.g());
                }
            }
        }

        /* access modifiers changed from: protected */
        public void k() {
            a aVar;
            a aVar2;
            a aVar3 = a.INTERNAL_ERROR;
            e = null;
            try {
                this.f14373c.d(this);
                while (this.f14373c.b(false, this)) {
                }
                aVar = a.NO_ERROR;
                try {
                    aVar2 = a.CANCEL;
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (IOException e3) {
                e = e3;
                aVar = aVar3;
                try {
                    aVar = a.PROTOCOL_ERROR;
                    aVar2 = a.PROTOCOL_ERROR;
                    e.this.p(aVar, aVar2, e);
                    e.m0.e.f(this.f14373c);
                } catch (Throwable th) {
                    th = th;
                    e.this.p(aVar, aVar3, e);
                    e.m0.e.f(this.f14373c);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                aVar = aVar3;
                e.this.p(aVar, aVar3, e);
                e.m0.e.f(this.f14373c);
                throw th;
            }
            e.this.p(aVar, aVar2, e);
            e.m0.e.f(this.f14373c);
        }

        /* access modifiers changed from: package-private */
        public void l(boolean z, l lVar) {
            h[] hVarArr;
            long j;
            synchronized (e.this.w) {
                synchronized (e.this) {
                    int d2 = e.this.u.d();
                    if (z) {
                        e.this.u.a();
                    }
                    e.this.u.h(lVar);
                    int d3 = e.this.u.d();
                    hVarArr = null;
                    if (d3 == -1 || d3 == d2) {
                        j = 0;
                    } else {
                        j = (long) (d3 - d2);
                        if (!e.this.f14337d.isEmpty()) {
                            hVarArr = (h[]) e.this.f14337d.values().toArray(new h[e.this.f14337d.size()]);
                        }
                    }
                }
                try {
                    e.this.w.a(e.this.u);
                } catch (IOException e2) {
                    e.this.q(e2);
                }
            }
            if (hVarArr != null) {
                for (h hVar : hVarArr) {
                    synchronized (hVar) {
                        hVar.a(j);
                    }
                }
            }
            e.z.execute(new c("OkHttp %s settings", e.this.f14338e));
        }
    }

    static {
        Class<e> cls = e.class;
    }

    e(h hVar) {
        h hVar2 = hVar;
        this.k = hVar2.f14366f;
        boolean z2 = hVar2.g;
        this.f14335b = z2;
        this.f14336c = hVar2.f14365e;
        int i2 = z2 ? 1 : 2;
        this.g = i2;
        if (hVar2.g) {
            this.g = i2 + 2;
        }
        if (hVar2.g) {
            this.t.i(7, 16777216);
        }
        this.f14338e = hVar2.f14362b;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, e.m0.e.H(e.m0.e.p("OkHttp %s Writer", this.f14338e), false));
        this.i = scheduledThreadPoolExecutor;
        if (hVar2.h != 0) {
            i iVar = new i();
            int i3 = hVar2.h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, (long) i3, (long) i3, TimeUnit.MILLISECONDS);
        }
        this.j = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), e.m0.e.H(e.m0.e.p("OkHttp %s Push Observer", this.f14338e), true));
        this.u.i(7, 65535);
        this.u.i(5, 16384);
        this.s = (long) this.u.d();
        this.v = hVar2.f14361a;
        this.w = new i(hVar2.f14364d, this.f14335b);
        this.x = new l(new g(hVar2.f14363c, this.f14335b));
    }

    private synchronized void B(e.m0.d dVar) {
        if (!this.h) {
            this.j.execute(dVar);
        }
    }

    static /* synthetic */ long d(e eVar) {
        long j2 = eVar.m;
        eVar.m = 1 + j2;
        return j2;
    }

    static /* synthetic */ long f(e eVar) {
        long j2 = eVar.l;
        eVar.l = 1 + j2;
        return j2;
    }

    static /* synthetic */ long n(e eVar) {
        long j2 = eVar.o;
        eVar.o = 1 + j2;
        return j2;
    }

    static /* synthetic */ long o(e eVar) {
        long j2 = eVar.p;
        eVar.p = 1 + j2;
        return j2;
    }

    /* access modifiers changed from: private */
    public void q(@Nullable IOException iOException) {
        a aVar = a.PROTOCOL_ERROR;
        p(aVar, aVar, iOException);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.internal.http2.h v(int r11, java.util.List<okhttp3.internal.http2.b> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.internal.http2.i r7 = r10.w
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0078 }
            int r0 = r10.g     // Catch:{ all -> 0x0075 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            okhttp3.internal.http2.a r0 = okhttp3.internal.http2.a.REFUSED_STREAM     // Catch:{ all -> 0x0075 }
            r10.K(r0)     // Catch:{ all -> 0x0075 }
        L_0x0013:
            boolean r0 = r10.h     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x006f
            int r8 = r10.g     // Catch:{ all -> 0x0075 }
            int r0 = r10.g     // Catch:{ all -> 0x0075 }
            int r0 = r0 + 2
            r10.g = r0     // Catch:{ all -> 0x0075 }
            okhttp3.internal.http2.h r9 = new okhttp3.internal.http2.h     // Catch:{ all -> 0x0075 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0075 }
            if (r13 == 0) goto L_0x003c
            long r0 = r10.s     // Catch:{ all -> 0x0075 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003c
            long r0 = r9.f14398b     // Catch:{ all -> 0x0075 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r13 = 0
            goto L_0x003d
        L_0x003c:
            r13 = 1
        L_0x003d:
            boolean r0 = r9.k()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004c
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r0 = r10.f14337d     // Catch:{ all -> 0x0075 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0075 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0075 }
        L_0x004c:
            monitor-exit(r10)     // Catch:{ all -> 0x0075 }
            if (r11 != 0) goto L_0x0055
            okhttp3.internal.http2.i r11 = r10.w     // Catch:{ all -> 0x0078 }
            r11.h(r6, r8, r12)     // Catch:{ all -> 0x0078 }
            goto L_0x005e
        L_0x0055:
            boolean r0 = r10.f14335b     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0067
            okhttp3.internal.http2.i r0 = r10.w     // Catch:{ all -> 0x0078 }
            r0.n(r11, r8, r12)     // Catch:{ all -> 0x0078 }
        L_0x005e:
            monitor-exit(r7)     // Catch:{ all -> 0x0078 }
            if (r13 == 0) goto L_0x0066
            okhttp3.internal.http2.i r11 = r10.w
            r11.flush()
        L_0x0066:
            return r9
        L_0x0067:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0078 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0078 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x006f:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0075 }
            r11.<init>()     // Catch:{ all -> 0x0075 }
            throw r11     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0075 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0078 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.v(int, java.util.List, boolean):okhttp3.internal.http2.h");
    }

    /* access modifiers changed from: package-private */
    public void A(int i2, BufferedSource bufferedSource, int i3, boolean z2) throws IOException {
        Buffer buffer = new Buffer();
        long j2 = (long) i3;
        bufferedSource.require(j2);
        bufferedSource.read(buffer, j2);
        if (buffer.size() == j2) {
            B(new f("OkHttp %s Push Data[%s]", new Object[]{this.f14338e, Integer.valueOf(i2)}, i2, buffer, i3, z2));
            return;
        }
        throw new IOException(buffer.size() + " != " + i3);
    }

    /* access modifiers changed from: package-private */
    public void D(int i2, List<b> list, boolean z2) {
        try {
            B(new C0164e("OkHttp %s Push Headers[%s]", new Object[]{this.f14338e, Integer.valueOf(i2)}, i2, list, z2));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void E(int i2, List<b> list) {
        synchronized (this) {
            if (this.y.contains(Integer.valueOf(i2))) {
                T(i2, a.PROTOCOL_ERROR);
                return;
            }
            this.y.add(Integer.valueOf(i2));
            try {
                B(new d("OkHttp %s Push Request[%s]", new Object[]{this.f14338e, Integer.valueOf(i2)}, i2, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void G(int i2, a aVar) {
        B(new g("OkHttp %s Push Reset[%s]", new Object[]{this.f14338e, Integer.valueOf(i2)}, i2, aVar));
    }

    /* access modifiers changed from: package-private */
    public boolean H(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    /* access modifiers changed from: package-private */
    public synchronized h I(int i2) {
        h remove;
        remove = this.f14337d.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    /* access modifiers changed from: package-private */
    public void J() {
        synchronized (this) {
            if (this.o >= this.n) {
                this.n++;
                this.q = System.nanoTime() + 1000000000;
                try {
                    this.i.execute(new c("OkHttp %s ping", this.f14338e));
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    public void K(a aVar) throws IOException {
        synchronized (this.w) {
            synchronized (this) {
                if (!this.h) {
                    this.h = true;
                    int i2 = this.f14339f;
                    this.w.g(i2, aVar, e.m0.e.f14104a);
                }
            }
        }
    }

    public void L() throws IOException {
        N(true);
    }

    /* access modifiers changed from: package-private */
    public void N(boolean z2) throws IOException {
        if (z2) {
            this.w.b();
            this.w.p(this.t);
            int d2 = this.t.d();
            if (d2 != 65535) {
                this.w.q(0, (long) (d2 - 65535));
            }
        }
        new Thread(this.x).start();
    }

    /* access modifiers changed from: package-private */
    public synchronized void O(long j2) {
        long j3 = this.r + j2;
        this.r = j3;
        if (j3 >= ((long) (this.t.d() / 2))) {
            U(0, this.r);
            this.r = 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.s), r8.w.k());
        r6 = (long) r3;
        r8.s -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void P(int r9, boolean r10, okio.Buffer r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            okhttp3.internal.http2.i r12 = r8.w
            r12.d(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0069
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.s     // Catch:{ InterruptedException -> 0x005a }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r3 = r8.f14337d     // Catch:{ InterruptedException -> 0x005a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005a }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x005a }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x005a }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005a }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005a }
            throw r9     // Catch:{ InterruptedException -> 0x005a }
        L_0x0030:
            long r3 = r8.s     // Catch:{ all -> 0x0058 }
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0058 }
            int r4 = (int) r3     // Catch:{ all -> 0x0058 }
            okhttp3.internal.http2.i r3 = r8.w     // Catch:{ all -> 0x0058 }
            int r3 = r3.k()     // Catch:{ all -> 0x0058 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0058 }
            long r4 = r8.s     // Catch:{ all -> 0x0058 }
            long r6 = (long) r3     // Catch:{ all -> 0x0058 }
            long r4 = r4 - r6
            r8.s = r4     // Catch:{ all -> 0x0058 }
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            long r12 = r12 - r6
            okhttp3.internal.http2.i r4 = r8.w
            if (r10 == 0) goto L_0x0053
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            r4.d(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0058:
            r9 = move-exception
            goto L_0x0067
        L_0x005a:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0058 }
            r9.interrupt()     // Catch:{ all -> 0x0058 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0058 }
            r9.<init>()     // Catch:{ all -> 0x0058 }
            throw r9     // Catch:{ all -> 0x0058 }
        L_0x0067:
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            throw r9
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.P(int, boolean, okio.Buffer, long):void");
    }

    /* access modifiers changed from: package-private */
    public void Q(int i2, boolean z2, List<b> list) throws IOException {
        this.w.h(z2, i2, list);
    }

    /* access modifiers changed from: package-private */
    public void R(boolean z2, int i2, int i3) {
        try {
            this.w.m(z2, i2, i3);
        } catch (IOException e2) {
            q(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public void S(int i2, a aVar) throws IOException {
        this.w.o(i2, aVar);
    }

    /* access modifiers changed from: package-private */
    public void T(int i2, a aVar) {
        try {
            this.i.execute(new a("OkHttp %s stream %d", new Object[]{this.f14338e, Integer.valueOf(i2)}, i2, aVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void U(int i2, long j2) {
        try {
            this.i.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f14338e, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void close() {
        p(a.NO_ERROR, a.CANCEL, (IOException) null);
    }

    public void flush() throws IOException {
        this.w.flush();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(okhttp3.internal.http2.a r4, okhttp3.internal.http2.a r5, @javax.annotation.Nullable java.io.IOException r6) {
        /*
            r3 = this;
            r3.K(r4)     // Catch:{ IOException -> 0x0003 }
        L_0x0003:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r0 = r3.f14337d     // Catch:{ all -> 0x004a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0026
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r4 = r3.f14337d     // Catch:{ all -> 0x004a }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x004a }
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r0 = r3.f14337d     // Catch:{ all -> 0x004a }
            int r0 = r0.size()     // Catch:{ all -> 0x004a }
            okhttp3.internal.http2.h[] r0 = new okhttp3.internal.http2.h[r0]     // Catch:{ all -> 0x004a }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x004a }
            okhttp3.internal.http2.h[] r4 = (okhttp3.internal.http2.h[]) r4     // Catch:{ all -> 0x004a }
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r0 = r3.f14337d     // Catch:{ all -> 0x004a }
            r0.clear()     // Catch:{ all -> 0x004a }
        L_0x0026:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0035
            int r0 = r4.length
            r1 = 0
        L_0x002b:
            if (r1 >= r0) goto L_0x0035
            r2 = r4[r1]
            r2.d(r5, r6)     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0035:
            okhttp3.internal.http2.i r4 = r3.w     // Catch:{ IOException -> 0x003a }
            r4.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            java.net.Socket r4 = r3.v     // Catch:{ IOException -> 0x003f }
            r4.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            java.util.concurrent.ScheduledExecutorService r4 = r3.i
            r4.shutdown()
            java.util.concurrent.ExecutorService r4 = r3.j
            r4.shutdown()
            return
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.p(okhttp3.internal.http2.a, okhttp3.internal.http2.a, java.io.IOException):void");
    }

    /* access modifiers changed from: package-private */
    public synchronized h r(int i2) {
        return this.f14337d.get(Integer.valueOf(i2));
    }

    public synchronized boolean t(long j2) {
        if (this.h) {
            return false;
        }
        if (this.o >= this.n || j2 < this.q) {
            return true;
        }
        return false;
    }

    public synchronized int u() {
        return this.u.e(Integer.MAX_VALUE);
    }

    public h x(List<b> list, boolean z2) throws IOException {
        return v(0, list, z2);
    }
}
