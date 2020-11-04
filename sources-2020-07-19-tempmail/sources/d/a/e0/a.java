package d.a.e0;

import d.a.a0.g.m;
import d.a.a0.g.n;
import d.a.t;
import java.util.concurrent.Callable;

/* compiled from: Schedulers */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final t f13917a = d.a.d0.a.e(new b());

    /* renamed from: b  reason: collision with root package name */
    static final t f13918b = d.a.d0.a.f(new c());

    /* renamed from: c  reason: collision with root package name */
    static final t f13919c = n.f();

    /* renamed from: d.a.e0.a$a  reason: collision with other inner class name */
    /* compiled from: Schedulers */
    static final class C0157a {

        /* renamed from: a  reason: collision with root package name */
        static final t f13920a = new d.a.a0.g.b();
    }

    /* compiled from: Schedulers */
    static final class b implements Callable<t> {
        b() {
        }

        /* renamed from: a */
        public t call() throws Exception {
            return C0157a.f13920a;
        }
    }

    /* compiled from: Schedulers */
    static final class c implements Callable<t> {
        c() {
        }

        /* renamed from: a */
        public t call() throws Exception {
            return d.f13921a;
        }
    }

    /* compiled from: Schedulers */
    static final class d {

        /* renamed from: a  reason: collision with root package name */
        static final t f13921a = new d.a.a0.g.d();
    }

    /* compiled from: Schedulers */
    static final class e {

        /* renamed from: a  reason: collision with root package name */
        static final t f13922a = new d.a.a0.g.e();
    }

    /* compiled from: Schedulers */
    static final class f implements Callable<t> {
        f() {
        }

        /* renamed from: a */
        public t call() throws Exception {
            return e.f13922a;
        }
    }

    /* compiled from: Schedulers */
    static final class g {

        /* renamed from: a  reason: collision with root package name */
        static final t f13923a = new m();
    }

    /* compiled from: Schedulers */
    static final class h implements Callable<t> {
        h() {
        }

        /* renamed from: a */
        public t call() throws Exception {
            return g.f13923a;
        }
    }

    static {
        d.a.d0.a.h(new h());
        d.a.d0.a.g(new f());
    }

    public static t a() {
        return d.a.d0.a.r(f13917a);
    }

    public static t b() {
        return d.a.d0.a.t(f13918b);
    }

    public static t c() {
        return f13919c;
    }
}
