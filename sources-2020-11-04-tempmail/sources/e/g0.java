package e;

import e.m0.e;
import e.m0.h.f;
import e.y;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: Request */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    final z f14590a;

    /* renamed from: b  reason: collision with root package name */
    final String f14591b;

    /* renamed from: c  reason: collision with root package name */
    final y f14592c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    final h0 f14593d;

    /* renamed from: e  reason: collision with root package name */
    final Map<Class<?>, Object> f14594e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private volatile i f14595f;

    g0(a aVar) {
        this.f14590a = aVar.f14596a;
        this.f14591b = aVar.f14597b;
        this.f14592c = aVar.f14598c.f();
        this.f14593d = aVar.f14599d;
        this.f14594e = e.u(aVar.f14600e);
    }

    @Nullable
    public h0 a() {
        return this.f14593d;
    }

    public i b() {
        i iVar = this.f14595f;
        if (iVar != null) {
            return iVar;
        }
        i k = i.k(this.f14592c);
        this.f14595f = k;
        return k;
    }

    @Nullable
    public String c(String str) {
        return this.f14592c.c(str);
    }

    public y d() {
        return this.f14592c;
    }

    public boolean e() {
        return this.f14590a.n();
    }

    public String f() {
        return this.f14591b;
    }

    public a g() {
        return new a(this);
    }

    @Nullable
    public <T> T h(Class<? extends T> cls) {
        return cls.cast(this.f14594e.get(cls));
    }

    public z i() {
        return this.f14590a;
    }

    public String toString() {
        return "Request{method=" + this.f14591b + ", url=" + this.f14590a + ", tags=" + this.f14594e + '}';
    }

    /* compiled from: Request */
    public static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        z f14596a;

        /* renamed from: b  reason: collision with root package name */
        String f14597b;

        /* renamed from: c  reason: collision with root package name */
        y.a f14598c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        h0 f14599d;

        /* renamed from: e  reason: collision with root package name */
        Map<Class<?>, Object> f14600e;

        public a() {
            this.f14600e = Collections.emptyMap();
            this.f14597b = "GET";
            this.f14598c = new y.a();
        }

        public g0 a() {
            if (this.f14596a != null) {
                return new g0(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b(i iVar) {
            String iVar2 = iVar.toString();
            if (iVar2.isEmpty()) {
                f("Cache-Control");
                return this;
            }
            c("Cache-Control", iVar2);
            return this;
        }

        public a c(String str, String str2) {
            this.f14598c.h(str, str2);
            return this;
        }

        public a d(y yVar) {
            this.f14598c = yVar.f();
            return this;
        }

        public a e(String str, @Nullable h0 h0Var) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (h0Var != null && !f.b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (h0Var != null || !f.e(str)) {
                this.f14597b = str;
                this.f14599d = h0Var;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        public a f(String str) {
            this.f14598c.g(str);
            return this;
        }

        public <T> a g(Class<? super T> cls, @Nullable T t) {
            if (cls != null) {
                if (t == null) {
                    this.f14600e.remove(cls);
                } else {
                    if (this.f14600e.isEmpty()) {
                        this.f14600e = new LinkedHashMap();
                    }
                    this.f14600e.put(cls, cls.cast(t));
                }
                return this;
            }
            throw new NullPointerException("type == null");
        }

        public a h(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    str = "http:" + str.substring(3);
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    str = "https:" + str.substring(4);
                }
                i(z.l(str));
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a i(z zVar) {
            if (zVar != null) {
                this.f14596a = zVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        a(g0 g0Var) {
            Map<Class<?>, Object> map;
            this.f14600e = Collections.emptyMap();
            this.f14596a = g0Var.f14590a;
            this.f14597b = g0Var.f14591b;
            this.f14599d = g0Var.f14593d;
            if (g0Var.f14594e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(g0Var.f14594e);
            }
            this.f14600e = map;
            this.f14598c = g0Var.f14592c.f();
        }
    }
}
