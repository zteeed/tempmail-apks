package com.google.android.play.core.tasks;

import b.c.a.e.a.c.a;
import java.util.concurrent.Executor;

final class p<ResultT> extends c<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f11525a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final l<ResultT> f11526b = new l<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f11527c;

    /* renamed from: d  reason: collision with root package name */
    private ResultT f11528d;

    /* renamed from: e  reason: collision with root package name */
    private Exception f11529e;

    p() {
    }

    private final void i() {
        a.c(this.f11527c, "Task is not yet complete");
    }

    private final void l() {
        a.c(!this.f11527c, "Task is already complete");
    }

    private final void o() {
        synchronized (this.f11525a) {
            if (this.f11527c) {
                this.f11526b.a(this);
            }
        }
    }

    public final c<ResultT> a(a aVar) {
        b(d.f11508a, aVar);
        return this;
    }

    public final c<ResultT> b(Executor executor, a aVar) {
        this.f11526b.b(new g(executor, aVar));
        o();
        return this;
    }

    public final c<ResultT> c(b<? super ResultT> bVar) {
        d(d.f11508a, bVar);
        return this;
    }

    public final c<ResultT> d(Executor executor, b<? super ResultT> bVar) {
        this.f11526b.b(new i(executor, bVar));
        o();
        return this;
    }

    public final Exception e() {
        Exception exc;
        synchronized (this.f11525a) {
            exc = this.f11529e;
        }
        return exc;
    }

    public final ResultT f() {
        ResultT resultt;
        synchronized (this.f11525a) {
            i();
            Exception exc = this.f11529e;
            if (exc == null) {
                resultt = this.f11528d;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return resultt;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.f11525a) {
            z = this.f11527c;
        }
        return z;
    }

    public final boolean h() {
        boolean z;
        synchronized (this.f11525a) {
            z = false;
            if (this.f11527c && this.f11529e == null) {
                z = true;
            }
        }
        return z;
    }

    public final void j(Exception exc) {
        a.b(exc, "Exception must not be null");
        synchronized (this.f11525a) {
            l();
            this.f11527c = true;
            this.f11529e = exc;
        }
        this.f11526b.a(this);
    }

    public final void k(ResultT resultt) {
        synchronized (this.f11525a) {
            l();
            this.f11527c = true;
            this.f11528d = resultt;
        }
        this.f11526b.a(this);
    }

    public final boolean m(Exception exc) {
        a.b(exc, "Exception must not be null");
        synchronized (this.f11525a) {
            if (this.f11527c) {
                return false;
            }
            this.f11527c = true;
            this.f11529e = exc;
            this.f11526b.a(this);
            return true;
        }
    }

    public final boolean n(ResultT resultt) {
        synchronized (this.f11525a) {
            if (this.f11527c) {
                return false;
            }
            this.f11527c = true;
            this.f11528d = resultt;
            this.f11526b.a(this);
            return true;
        }
    }
}
