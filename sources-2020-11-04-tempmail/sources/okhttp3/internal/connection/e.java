package okhttp3.internal.connection;

import e.a0;
import e.d0;
import e.j;
import e.k0;
import e.m0.h.c;
import e.v;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import okhttp3.internal.connection.i;

/* compiled from: ExchangeFinder */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private final j f14832a;

    /* renamed from: b  reason: collision with root package name */
    private final e.e f14833b;

    /* renamed from: c  reason: collision with root package name */
    private final g f14834c;

    /* renamed from: d  reason: collision with root package name */
    private final j f14835d;

    /* renamed from: e  reason: collision with root package name */
    private final v f14836e;

    /* renamed from: f  reason: collision with root package name */
    private i.a f14837f;
    private final i g;
    private f h;
    private boolean i;
    private k0 j;

    e(j jVar, g gVar, e.e eVar, j jVar2, v vVar) {
        this.f14832a = jVar;
        this.f14834c = gVar;
        this.f14833b = eVar;
        this.f14835d = jVar2;
        this.f14836e = vVar;
        this.g = new i(eVar, gVar.f14847e, jVar2, vVar);
    }

    private f c(int i2, int i3, int i4, int i5, boolean z) throws IOException {
        Socket socket;
        Socket n;
        f fVar;
        f fVar2;
        boolean z2;
        k0 k0Var;
        boolean z3;
        List<k0> list;
        i.a aVar;
        synchronized (this.f14834c) {
            if (!this.f14832a.i()) {
                this.i = false;
                f fVar3 = this.f14832a.i;
                socket = null;
                n = (this.f14832a.i == null || !this.f14832a.i.k) ? null : this.f14832a.n();
                if (this.f14832a.i != null) {
                    fVar2 = this.f14832a.i;
                    fVar = null;
                } else {
                    fVar = fVar3;
                    fVar2 = null;
                }
                if (fVar2 == null) {
                    if (this.f14834c.g(this.f14833b, this.f14832a, (List<k0>) null, false)) {
                        fVar2 = this.f14832a.i;
                        k0Var = null;
                        z2 = true;
                    } else {
                        if (this.j != null) {
                            k0Var = this.j;
                            this.j = null;
                        } else if (g()) {
                            k0Var = this.f14832a.i.r();
                        }
                        z2 = false;
                    }
                }
                k0Var = null;
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        e.m0.e.g(n);
        if (fVar != null) {
            this.f14836e.h(this.f14835d, fVar);
        }
        if (z2) {
            this.f14836e.g(this.f14835d, fVar2);
        }
        if (fVar2 != null) {
            return fVar2;
        }
        if (k0Var != null || ((aVar = this.f14837f) != null && aVar.b())) {
            z3 = false;
        } else {
            this.f14837f = this.g.d();
            z3 = true;
        }
        synchronized (this.f14834c) {
            if (!this.f14832a.i()) {
                if (z3) {
                    list = this.f14837f.a();
                    if (this.f14834c.g(this.f14833b, this.f14832a, list, false)) {
                        fVar2 = this.f14832a.i;
                        z2 = true;
                    }
                } else {
                    list = null;
                }
                if (!z2) {
                    if (k0Var == null) {
                        k0Var = this.f14837f.c();
                    }
                    fVar2 = new f(this.f14834c, k0Var);
                    this.h = fVar2;
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (z2) {
            this.f14836e.g(this.f14835d, fVar2);
            return fVar2;
        }
        fVar2.e(i2, i3, i4, i5, z, this.f14835d, this.f14836e);
        this.f14834c.f14847e.a(fVar2.r());
        synchronized (this.f14834c) {
            this.h = null;
            if (this.f14834c.g(this.f14833b, this.f14832a, list, true)) {
                fVar2.k = true;
                socket = fVar2.t();
                fVar2 = this.f14832a.i;
                this.j = k0Var;
            } else {
                this.f14834c.f(fVar2);
                this.f14832a.a(fVar2);
            }
        }
        e.m0.e.g(socket);
        this.f14836e.g(this.f14835d, fVar2);
        return fVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r0.n(r9) != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.internal.connection.f d(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            okhttp3.internal.connection.f r0 = r3.c(r4, r5, r6, r7, r8)
            okhttp3.internal.connection.g r1 = r3.f14834c
            monitor-enter(r1)
            int r2 = r0.m     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            boolean r2 = r0.o()     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return r0
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            boolean r1 = r0.n(r9)
            if (r1 != 0) goto L_0x001e
            r0.q()
            goto L_0x0000
        L_0x001e:
            return r0
        L_0x001f:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.e.d(int, int, int, int, boolean, boolean):okhttp3.internal.connection.f");
    }

    private boolean g() {
        f fVar = this.f14832a.i;
        return fVar != null && fVar.l == 0 && e.m0.e.D(fVar.r().a().l(), this.f14833b.l());
    }

    /* access modifiers changed from: package-private */
    public f a() {
        return this.h;
    }

    public c b(d0 d0Var, a0.a aVar, boolean z) {
        try {
            return d(aVar.e(), aVar.b(), aVar.c(), d0Var.z(), d0Var.I(), z).p(d0Var, aVar);
        } catch (RouteException e2) {
            h();
            throw e2;
        } catch (IOException e3) {
            h();
            throw new RouteException(e3);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e() {
        /*
            r3 = this;
            okhttp3.internal.connection.g r0 = r3.f14834c
            monitor-enter(r0)
            e.k0 r1 = r3.j     // Catch:{ all -> 0x0034 }
            r2 = 1
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return r2
        L_0x000a:
            boolean r1 = r3.g()     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x001c
            okhttp3.internal.connection.j r1 = r3.f14832a     // Catch:{ all -> 0x0034 }
            okhttp3.internal.connection.f r1 = r1.i     // Catch:{ all -> 0x0034 }
            e.k0 r1 = r1.r()     // Catch:{ all -> 0x0034 }
            r3.j = r1     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return r2
        L_0x001c:
            okhttp3.internal.connection.i$a r1 = r3.f14837f     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0028
            okhttp3.internal.connection.i$a r1 = r3.f14837f     // Catch:{ all -> 0x0034 }
            boolean r1 = r1.b()     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0032
        L_0x0028:
            okhttp3.internal.connection.i r1 = r3.g     // Catch:{ all -> 0x0034 }
            boolean r1 = r1.b()     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return r2
        L_0x0034:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.e.e():boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        boolean z;
        synchronized (this.f14834c) {
            z = this.i;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        synchronized (this.f14834c) {
            this.i = true;
        }
    }
}
