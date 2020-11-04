package e;

import e.y;
import java.io.Closeable;
import javax.annotation.Nullable;
import okhttp3.internal.connection.d;

/* compiled from: Response */
public final class i0 implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    final g0 f14622b;

    /* renamed from: c  reason: collision with root package name */
    final e0 f14623c;

    /* renamed from: d  reason: collision with root package name */
    final int f14624d;

    /* renamed from: e  reason: collision with root package name */
    final String f14625e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    final x f14626f;
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
        this.f14622b = aVar.f14627a;
        this.f14623c = aVar.f14628b;
        this.f14624d = aVar.f14629c;
        this.f14625e = aVar.f14630d;
        this.f14626f = aVar.f14631e;
        this.g = aVar.f14632f.f();
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
        return this.f14624d;
    }

    @Nullable
    public x e() {
        return this.f14626f;
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
        int i2 = this.f14624d;
        return i2 >= 200 && i2 < 300;
    }

    public String m() {
        return this.f14625e;
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
        return this.f14622b;
    }

    public long r() {
        return this.l;
    }

    public String toString() {
        return "Response{protocol=" + this.f14623c + ", code=" + this.f14624d + ", message=" + this.f14625e + ", url=" + this.f14622b.i() + '}';
    }

    /* compiled from: Response */
    public static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        g0 f14627a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        e0 f14628b;

        /* renamed from: c  reason: collision with root package name */
        int f14629c;

        /* renamed from: d  reason: collision with root package name */
        String f14630d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        x f14631e;

        /* renamed from: f  reason: collision with root package name */
        y.a f14632f;
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
            this.f14629c = -1;
            this.f14632f = new y.a();
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
            this.f14632f.a(str, str2);
            return this;
        }

        public a b(@Nullable j0 j0Var) {
            this.g = j0Var;
            return this;
        }

        public i0 c() {
            if (this.f14627a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f14628b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f14629c < 0) {
                throw new IllegalStateException("code < 0: " + this.f14629c);
            } else if (this.f14630d != null) {
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
            this.f14629c = i2;
            return this;
        }

        public a h(@Nullable x xVar) {
            this.f14631e = xVar;
            return this;
        }

        public a i(String str, String str2) {
            this.f14632f.h(str, str2);
            return this;
        }

        public a j(y yVar) {
            this.f14632f = yVar.f();
            return this;
        }

        /* access modifiers changed from: package-private */
        public void k(d dVar) {
            this.m = dVar;
        }

        public a l(String str) {
            this.f14630d = str;
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
            this.f14628b = e0Var;
            return this;
        }

        public a p(long j2) {
            this.l = j2;
            return this;
        }

        public a q(g0 g0Var) {
            this.f14627a = g0Var;
            return this;
        }

        public a r(long j2) {
            this.k = j2;
            return this;
        }

        a(i0 i0Var) {
            this.f14629c = -1;
            this.f14627a = i0Var.f14622b;
            this.f14628b = i0Var.f14623c;
            this.f14629c = i0Var.f14624d;
            this.f14630d = i0Var.f14625e;
            this.f14631e = i0Var.f14626f;
            this.f14632f = i0Var.g.f();
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
