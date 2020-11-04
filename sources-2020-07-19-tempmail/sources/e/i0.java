package e;

import e.y;
import java.io.Closeable;
import javax.annotation.Nullable;
import okhttp3.internal.connection.d;

/* compiled from: Response */
public final class i0 implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    final g0 f14059b;

    /* renamed from: c  reason: collision with root package name */
    final e0 f14060c;

    /* renamed from: d  reason: collision with root package name */
    final int f14061d;

    /* renamed from: e  reason: collision with root package name */
    final String f14062e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    final x f14063f;
    final y g;
    @Nullable
    final j0 h;
    @Nullable
    final i0 i;
    @Nullable
    final i0 j;
    @Nullable
    final i0 k;
    final long l;
    final long m;
    @Nullable
    final d n;
    @Nullable
    private volatile i o;

    i0(a aVar) {
        this.f14059b = aVar.f14064a;
        this.f14060c = aVar.f14065b;
        this.f14061d = aVar.f14066c;
        this.f14062e = aVar.f14067d;
        this.f14063f = aVar.f14068e;
        this.g = aVar.f14069f.f();
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m;
    }

    @Nullable
    public j0 a() {
        return this.h;
    }

    public i b() {
        i iVar = this.o;
        if (iVar != null) {
            return iVar;
        }
        i k2 = i.k(this.g);
        this.o = k2;
        return k2;
    }

    public void close() {
        j0 j0Var = this.h;
        if (j0Var != null) {
            j0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public int d() {
        return this.f14061d;
    }

    @Nullable
    public x e() {
        return this.f14063f;
    }

    @Nullable
    public String f(String str) {
        return g(str, (String) null);
    }

    @Nullable
    public String g(String str, @Nullable String str2) {
        String c2 = this.g.c(str);
        return c2 != null ? c2 : str2;
    }

    public y h() {
        return this.g;
    }

    public boolean k() {
        int i2 = this.f14061d;
        return i2 >= 200 && i2 < 300;
    }

    public String m() {
        return this.f14062e;
    }

    public a n() {
        return new a(this);
    }

    @Nullable
    public i0 o() {
        return this.k;
    }

    public long p() {
        return this.m;
    }

    public g0 q() {
        return this.f14059b;
    }

    public long r() {
        return this.l;
    }

    public String toString() {
        return "Response{protocol=" + this.f14060c + ", code=" + this.f14061d + ", message=" + this.f14062e + ", url=" + this.f14059b.i() + '}';
    }

    /* compiled from: Response */
    public static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        g0 f14064a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        e0 f14065b;

        /* renamed from: c  reason: collision with root package name */
        int f14066c;

        /* renamed from: d  reason: collision with root package name */
        String f14067d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        x f14068e;

        /* renamed from: f  reason: collision with root package name */
        y.a f14069f;
        @Nullable
        j0 g;
        @Nullable
        i0 h;
        @Nullable
        i0 i;
        @Nullable
        i0 j;
        long k;
        long l;
        @Nullable
        d m;

        public a() {
            this.f14066c = -1;
            this.f14069f = new y.a();
        }

        private void e(i0 i0Var) {
            if (i0Var.h != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private void f(String str, i0 i0Var) {
            if (i0Var.h != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (i0Var.i != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (i0Var.j != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (i0Var.k != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        public a a(String str, String str2) {
            this.f14069f.a(str, str2);
            return this;
        }

        public a b(@Nullable j0 j0Var) {
            this.g = j0Var;
            return this;
        }

        public i0 c() {
            if (this.f14064a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f14065b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f14066c < 0) {
                throw new IllegalStateException("code < 0: " + this.f14066c);
            } else if (this.f14067d != null) {
                return new i0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public a d(@Nullable i0 i0Var) {
            if (i0Var != null) {
                f("cacheResponse", i0Var);
            }
            this.i = i0Var;
            return this;
        }

        public a g(int i2) {
            this.f14066c = i2;
            return this;
        }

        public a h(@Nullable x xVar) {
            this.f14068e = xVar;
            return this;
        }

        public a i(String str, String str2) {
            this.f14069f.h(str, str2);
            return this;
        }

        public a j(y yVar) {
            this.f14069f = yVar.f();
            return this;
        }

        /* access modifiers changed from: package-private */
        public void k(d dVar) {
            this.m = dVar;
        }

        public a l(String str) {
            this.f14067d = str;
            return this;
        }

        public a m(@Nullable i0 i0Var) {
            if (i0Var != null) {
                f("networkResponse", i0Var);
            }
            this.h = i0Var;
            return this;
        }

        public a n(@Nullable i0 i0Var) {
            if (i0Var != null) {
                e(i0Var);
            }
            this.j = i0Var;
            return this;
        }

        public a o(e0 e0Var) {
            this.f14065b = e0Var;
            return this;
        }

        public a p(long j2) {
            this.l = j2;
            return this;
        }

        public a q(g0 g0Var) {
            this.f14064a = g0Var;
            return this;
        }

        public a r(long j2) {
            this.k = j2;
            return this;
        }

        a(i0 i0Var) {
            this.f14066c = -1;
            this.f14064a = i0Var.f14059b;
            this.f14065b = i0Var.f14060c;
            this.f14066c = i0Var.f14061d;
            this.f14067d = i0Var.f14062e;
            this.f14068e = i0Var.f14063f;
            this.f14069f = i0Var.g.f();
            this.g = i0Var.h;
            this.h = i0Var.i;
            this.i = i0Var.j;
            this.j = i0Var.k;
            this.k = i0Var.l;
            this.l = i0Var.m;
            this.m = i0Var.n;
        }
    }
}
