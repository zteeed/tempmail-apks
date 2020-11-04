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
    final z f14027a;

    /* renamed from: b  reason: collision with root package name */
    final String f14028b;

    /* renamed from: c  reason: collision with root package name */
    final y f14029c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    final h0 f14030d;

    /* renamed from: e  reason: collision with root package name */
    final Map<Class<?>, Object> f14031e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private volatile i f14032f;

    g0(a aVar) {
        this.f14027a = aVar.f14033a;
        this.f14028b = aVar.f14034b;
        this.f14029c = aVar.f14035c.f();
        this.f14030d = aVar.f14036d;
        this.f14031e = e.u(aVar.f14037e);
    }

    @Nullable
    public h0 a() {
        return this.f14030d;
    }

    public i b() {
        i iVar = this.f14032f;
        if (iVar != null) {
            return iVar;
        }
        i k = i.k(this.f14029c);
        this.f14032f = k;
        return k;
    }

    @Nullable
    public String c(String str) {
        return this.f14029c.c(str);
    }

    public y d() {
        return this.f14029c;
    }

    public boolean e() {
        return this.f14027a.n();
    }

    public String f() {
        return this.f14028b;
    }

    public a g() {
        return new a(this);
    }

    @Nullable
    public <T> T h(Class<? extends T> cls) {
        return cls.cast(this.f14031e.get(cls));
    }

    public z i() {
        return this.f14027a;
    }

    public String toString() {
        return "Request{method=" + this.f14028b + ", url=" + this.f14027a + ", tags=" + this.f14031e + '}';
    }

    /* compiled from: Request */
    public static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        z f14033a;

        /* renamed from: b  reason: collision with root package name */
        String f14034b;

        /* renamed from: c  reason: collision with root package name */
        y.a f14035c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        h0 f14036d;

        /* renamed from: e  reason: collision with root package name */
        Map<Class<?>, Object> f14037e;

        public a() {
            this.f14037e = Collections.emptyMap();
            this.f14034b = "GET";
            this.f14035c = new y.a();
        }

        public g0 a() {
            if (this.f14033a != null) {
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
            this.f14035c.h(str, str2);
            return this;
        }

        public a d(y yVar) {
            this.f14035c = yVar.f();
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
                this.f14034b = str;
                this.f14036d = h0Var;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        public a f(String str) {
            this.f14035c.g(str);
            return this;
        }

        public <T> a g(Class<? super T> cls, @Nullable T t) {
            if (cls != null) {
                if (t == null) {
                    this.f14037e.remove(cls);
                } else {
                    if (this.f14037e.isEmpty()) {
                        this.f14037e = new LinkedHashMap();
                    }
                    this.f14037e.put(cls, cls.cast(t));
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
                this.f14033a = zVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        a(g0 g0Var) {
            Map<Class<?>, Object> map;
            this.f14037e = Collections.emptyMap();
            this.f14033a = g0Var.f14027a;
            this.f14034b = g0Var.f14028b;
            this.f14036d = g0Var.f14030d;
            if (g0Var.f14031e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(g0Var.f14031e);
            }
            this.f14037e = map;
            this.f14035c = g0Var.f14029c.f();
        }
    }
}
