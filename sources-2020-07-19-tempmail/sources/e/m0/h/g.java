package e.m0.h;

import e.a0;
import e.g0;
import e.i0;
import e.n;
import java.io.IOException;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.internal.connection.d;
import okhttp3.internal.connection.j;

/* compiled from: RealInterceptorChain */
public final class g implements a0.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<a0> f14128a;

    /* renamed from: b  reason: collision with root package name */
    private final j f14129b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private final d f14130c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14131d;

    /* renamed from: e  reason: collision with root package name */
    private final g0 f14132e;

    /* renamed from: f  reason: collision with root package name */
    private final e.j f14133f;
    private final int g;
    private final int h;
    private final int i;
    private int j;

    public g(List<a0> list, j jVar, @Nullable d dVar, int i2, g0 g0Var, e.j jVar2, int i3, int i4, int i5) {
        this.f14128a = list;
        this.f14129b = jVar;
        this.f14130c = dVar;
        this.f14131d = i2;
        this.f14132e = g0Var;
        this.f14133f = jVar2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    @Nullable
    public n a() {
        d dVar = this.f14130c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.i;
    }

    public i0 d(g0 g0Var) throws IOException {
        return g(g0Var, this.f14129b, this.f14130c);
    }

    public int e() {
        return this.g;
    }

    public d f() {
        d dVar = this.f14130c;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException();
    }

    public i0 g(g0 g0Var, j jVar, @Nullable d dVar) throws IOException {
        if (this.f14131d < this.f14128a.size()) {
            this.j++;
            d dVar2 = this.f14130c;
            if (dVar2 != null && !dVar2.c().v(g0Var.i())) {
                throw new IllegalStateException("network interceptor " + this.f14128a.get(this.f14131d - 1) + " must retain the same host and port");
            } else if (this.f14130c == null || this.j <= 1) {
                g gVar = new g(this.f14128a, jVar, dVar, this.f14131d + 1, g0Var, this.f14133f, this.g, this.h, this.i);
                a0 a0Var = this.f14128a.get(this.f14131d);
                i0 a2 = a0Var.a(gVar);
                if (dVar != null && this.f14131d + 1 < this.f14128a.size() && gVar.j != 1) {
                    throw new IllegalStateException("network interceptor " + a0Var + " must call proceed() exactly once");
                } else if (a2 == null) {
                    throw new NullPointerException("interceptor " + a0Var + " returned null");
                } else if (a2.a() != null) {
                    return a2;
                } else {
                    throw new IllegalStateException("interceptor " + a0Var + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.f14128a.get(this.f14131d - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }

    public j h() {
        return this.f14129b;
    }

    public g0 request() {
        return this.f14132e;
    }
}
