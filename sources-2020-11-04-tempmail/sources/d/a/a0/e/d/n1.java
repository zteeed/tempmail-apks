package d.a.a0.e.d;

import d.a.q;
import d.a.s;
import d.a.t;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: ObservableInternalHelper */
public final class n1 {

    /* compiled from: ObservableInternalHelper */
    static final class a<T> implements Callable<d.a.b0.a<T>> {

        /* renamed from: b  reason: collision with root package name */
        private final d.a.l<T> f13843b;

        /* renamed from: c  reason: collision with root package name */
        private final int f13844c;

        a(d.a.l<T> lVar, int i) {
            this.f13843b = lVar;
            this.f13844c = i;
        }

        /* renamed from: a */
        public d.a.b0.a<T> call() {
            return this.f13843b.replay(this.f13844c);
        }
    }

    /* compiled from: ObservableInternalHelper */
    static final class b<T> implements Callable<d.a.b0.a<T>> {

        /* renamed from: b  reason: collision with root package name */
        private final d.a.l<T> f13845b;

        /* renamed from: c  reason: collision with root package name */
        private final int f13846c;

        /* renamed from: d  reason: collision with root package name */
        private final long f13847d;

        /* renamed from: e  reason: collision with root package name */
        private final TimeUnit f13848e;

        /* renamed from: f  reason: collision with root package name */
        private final t f13849f;

        b(d.a.l<T> lVar, int i, long j, TimeUnit timeUnit, t tVar) {
            this.f13845b = lVar;
            this.f13846c = i;
            this.f13847d = j;
            this.f13848e = timeUnit;
            this.f13849f = tVar;
        }

        /* renamed from: a */
        public d.a.b0.a<T> call() {
            return this.f13845b.replay(this.f13846c, this.f13847d, this.f13848e, this.f13849f);
        }
    }

    /* compiled from: ObservableInternalHelper */
    static final class c<T, U> implements d.a.z.n<T, q<U>> {

        /* renamed from: b  reason: collision with root package name */
        private final d.a.z.n<? super T, ? extends Iterable<? extends U>> f13850b;

        c(d.a.z.n<? super T, ? extends Iterable<? extends U>> nVar) {
            this.f13850b = nVar;
        }

        /* renamed from: a */
        public q<U> apply(T t) throws Exception {
            Object apply = this.f13850b.apply(t);
            d.a.a0.b.b.e(apply, "The mapper returned a null Iterable");
            return new e1((Iterable) apply);
        }
    }

    /* compiled from: ObservableInternalHelper */
    static final class d<U, R, T> implements d.a.z.n<U, R> {

        /* renamed from: b  reason: collision with root package name */
        private final d.a.z.c<? super T, ? super U, ? extends R> f13851b;

        /* renamed from: c  reason: collision with root package name */
        private final T f13852c;

        d(d.a.z.c<? super T, ? super U, ? extends R> cVar, T t) {
            this.f13851b = cVar;
            this.f13852c = t;
        }

        public R apply(U u) throws Exception {
            return this.f13851b.a(this.f13852c, u);
        }
    }

    /* compiled from: ObservableInternalHelper */
    static final class e<T, R, U> implements d.a.z.n<T, q<R>> {

        /* renamed from: b  reason: collision with root package name */
        private final d.a.z.c<? super T, ? super U, ? extends R> f13853b;

        /* renamed from: c  reason: collision with root package name */
        private final d.a.z.n<? super T, ? extends q<? extends U>> f13854c;

        e(d.a.z.c<? super T, ? super U, ? extends R> cVar, d.a.z.n<? super T, ? extends q<? extends U>> nVar) {
            this.f13853b = cVar;
            this.f13854c = nVar;
        }

        /* renamed from: a */
        public q<R> apply(T t) throws Exception {
            Object apply = this.f13854c.apply(t);
            d.a.a0.b.b.e(apply, "The mapper returned a null ObservableSource");
            return new v1((q) apply, new d(this.f13853b, t));
        }
    }

    /* compiled from: ObservableInternalHelper */
    static final class f<T, U> implements d.a.z.n<T, q<T>> {

        /* renamed from: b  reason: collision with root package name */
        final d.a.z.n<? super T, ? extends q<U>> f13855b;

        f(d.a.z.n<? super T, ? extends q<U>> nVar) {
            this.f13855b = nVar;
        }

        /* renamed from: a */
        public q<T> apply(T t) throws Exception {
            Object apply = this.f13855b.apply(t);
            d.a.a0.b.b.e(apply, "The itemDelay returned a null ObservableSource");
            return new o3((q) apply, 1).map(d.a.a0.b.a.l(t)).defaultIfEmpty(t);
        }
    }

    /* compiled from: ObservableInternalHelper */
    static final class g<T> implements d.a.z.a {

        /* renamed from: b  reason: collision with root package name */
        final s<T> f13856b;

        g(s<T> sVar) {
            this.f13856b = sVar;
        }

        public void run() throws Exception {
            this.f13856b.onComplete();
        }
    }

    /* compiled from: ObservableInternalHelper */
    static final class h<T> implements d.a.z.f<Throwable> {

        /* renamed from: b  reason: collision with root package name */
        final s<T> f13857b;

        h(s<T> sVar) {
            this.f13857b = sVar;
        }

        /* renamed from: b */
        public void a(Throwable th) throws Exception {
            this.f13857b.onError(th);
        }
    }

    /* compiled from: ObservableInternalHelper */
    static final class i<T> implements d.a.z.f<T> {

        /* renamed from: b  reason: collision with root package name */
        final s<T> f13858b;

        i(s<T> sVar) {
            this.f13858b = sVar;
        }

        public void a(T t) throws Exception {
            this.f13858b.onNext(t);
        }
    }

    /* compiled from: ObservableInternalHelper */
    static final class j<T> implements Callable<d.a.b0.a<T>> {

        /* renamed from: b  reason: collision with root package name */
        private final d.a.l<T> f13859b;

        j(d.a.l<T> lVar) {
            this.f13859b = lVar;
        }

        /* renamed from: a */
        public d.a.b0.a<T> call() {
            return this.f13859b.replay();
        }
    }

    /* compiled from: ObservableInternalHelper */
    static final class k<T, R> implements d.a.z.n<d.a.l<T>, q<R>> {

        /* renamed from: b  reason: collision with root package name */
        private final d.a.z.n<? super d.a.l<T>, ? extends q<R>> f13860b;

        /* renamed from: c  reason: collision with root package name */
        private final t f13861c;

        k(d.a.z.n<? super d.a.l<T>, ? extends q<R>> nVar, t tVar) {
            this.f13860b = nVar;
            this.f13861c = tVar;
        }

        /* renamed from: a */
        public q<R> apply(d.a.l<T> lVar) throws Exception {
            Object apply = this.f13860b.apply(lVar);
            d.a.a0.b.b.e(apply, "The selector returned a null ObservableSource");
            return d.a.l.wrap((q) apply).observeOn(this.f13861c);
        }
    }

    /* compiled from: ObservableInternalHelper */
    static final class l<T, S> implements d.a.z.c<S, d.a.e<T>, S> {

        /* renamed from: a  reason: collision with root package name */
        final d.a.z.b<S, d.a.e<T>> f13862a;

        l(d.a.z.b<S, d.a.e<T>> bVar) {
            this.f13862a = bVar;
        }

        public /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Exception {
            b(obj, (d.a.e) obj2);
            return obj;
        }

        public S b(S s, d.a.e<T> eVar) throws Exception {
            this.f13862a.a(s, eVar);
            return s;
        }
    }

    /* compiled from: ObservableInternalHelper */
    static final class m<T, S> implements d.a.z.c<S, d.a.e<T>, S> {

        /* renamed from: a  reason: collision with root package name */
        final d.a.z.f<d.a.e<T>> f13863a;

        m(d.a.z.f<d.a.e<T>> fVar) {
            this.f13863a = fVar;
        }

        public /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Exception {
            b(obj, (d.a.e) obj2);
            return obj;
        }

        public S b(S s, d.a.e<T> eVar) throws Exception {
            this.f13863a.a(eVar);
            return s;
        }
    }

    /* compiled from: ObservableInternalHelper */
    static final class n<T> implements Callable<d.a.b0.a<T>> {

        /* renamed from: b  reason: collision with root package name */
        private final d.a.l<T> f13864b;

        /* renamed from: c  reason: collision with root package name */
        private final long f13865c;

        /* renamed from: d  reason: collision with root package name */
        private final TimeUnit f13866d;

        /* renamed from: e  reason: collision with root package name */
        private final t f13867e;

        n(d.a.l<T> lVar, long j, TimeUnit timeUnit, t tVar) {
            this.f13864b = lVar;
            this.f13865c = j;
            this.f13866d = timeUnit;
            this.f13867e = tVar;
        }

        /* renamed from: a */
        public d.a.b0.a<T> call() {
            return this.f13864b.replay(this.f13865c, this.f13866d, this.f13867e);
        }
    }

    /* compiled from: ObservableInternalHelper */
    static final class o<T, R> implements d.a.z.n<List<q<? extends T>>, q<? extends R>> {

        /* renamed from: b  reason: collision with root package name */
        private final d.a.z.n<? super Object[], ? extends R> f13868b;

        o(d.a.z.n<? super Object[], ? extends R> nVar) {
            this.f13868b = nVar;
        }

        /* renamed from: a */
        public q<? extends R> apply(List<q<? extends T>> list) {
            return d.a.l.zipIterable(list, this.f13868b, false, d.a.l.bufferSize());
        }
    }

    public static <T, U> d.a.z.n<T, q<U>> a(d.a.z.n<? super T, ? extends Iterable<? extends U>> nVar) {
        return new c(nVar);
    }

    public static <T, U, R> d.a.z.n<T, q<R>> b(d.a.z.n<? super T, ? extends q<? extends U>> nVar, d.a.z.c<? super T, ? super U, ? extends R> cVar) {
        return new e(cVar, nVar);
    }

    public static <T, U> d.a.z.n<T, q<T>> c(d.a.z.n<? super T, ? extends q<U>> nVar) {
        return new f(nVar);
    }

    public static <T> d.a.z.a d(s<T> sVar) {
        return new g(sVar);
    }

    public static <T> d.a.z.f<Throwable> e(s<T> sVar) {
        return new h(sVar);
    }

    public static <T> d.a.z.f<T> f(s<T> sVar) {
        return new i(sVar);
    }

    public static <T> Callable<d.a.b0.a<T>> g(d.a.l<T> lVar) {
        return new j(lVar);
    }

    public static <T> Callable<d.a.b0.a<T>> h(d.a.l<T> lVar, int i2) {
        return new a(lVar, i2);
    }

    public static <T> Callable<d.a.b0.a<T>> i(d.a.l<T> lVar, int i2, long j2, TimeUnit timeUnit, t tVar) {
        return new b(lVar, i2, j2, timeUnit, tVar);
    }

    public static <T> Callable<d.a.b0.a<T>> j(d.a.l<T> lVar, long j2, TimeUnit timeUnit, t tVar) {
        return new n(lVar, j2, timeUnit, tVar);
    }

    public static <T, R> d.a.z.n<d.a.l<T>, q<R>> k(d.a.z.n<? super d.a.l<T>, ? extends q<R>> nVar, t tVar) {
        return new k(nVar, tVar);
    }

    public static <T, S> d.a.z.c<S, d.a.e<T>, S> l(d.a.z.b<S, d.a.e<T>> bVar) {
        return new l(bVar);
    }

    public static <T, S> d.a.z.c<S, d.a.e<T>, S> m(d.a.z.f<d.a.e<T>> fVar) {
        return new m(fVar);
    }

    public static <T, R> d.a.z.n<List<q<? extends T>>, q<? extends R>> n(d.a.z.n<? super Object[], ? extends R> nVar) {
        return new o(nVar);
    }
}
