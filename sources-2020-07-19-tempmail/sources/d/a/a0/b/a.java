package d.a.a0.b;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: Functions */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final d.a.z.n<Object, Object> f12615a = new t();

    /* renamed from: b  reason: collision with root package name */
    public static final Runnable f12616b = new p();

    /* renamed from: c  reason: collision with root package name */
    public static final d.a.z.a f12617c = new n();

    /* renamed from: d  reason: collision with root package name */
    static final d.a.z.f<Object> f12618d = new o();

    /* renamed from: e  reason: collision with root package name */
    public static final d.a.z.f<Throwable> f12619e = new c0();

    /* renamed from: f  reason: collision with root package name */
    static final d.a.z.o<Object> f12620f = new h0();
    static final d.a.z.o<Object> g = new r();
    static final Callable<Object> h = new b0();
    static final Comparator<Object> i = new x();

    /* renamed from: d.a.a0.b.a$a  reason: collision with other inner class name */
    /* compiled from: Functions */
    static final class C0126a<T> implements d.a.z.f<T> {

        /* renamed from: b  reason: collision with root package name */
        final d.a.z.a f12621b;

        C0126a(d.a.z.a aVar) {
            this.f12621b = aVar;
        }

        public void a(T t) throws Exception {
            this.f12621b.run();
        }
    }

    /* compiled from: Functions */
    static final class a0<T> implements d.a.z.f<T> {

        /* renamed from: b  reason: collision with root package name */
        final d.a.z.f<? super d.a.k<T>> f12622b;

        a0(d.a.z.f<? super d.a.k<T>> fVar) {
            this.f12622b = fVar;
        }

        public void a(T t) throws Exception {
            this.f12622b.a(d.a.k.c(t));
        }
    }

    /* compiled from: Functions */
    static final class b<T1, T2, R> implements d.a.z.n<Object[], R> {

        /* renamed from: b  reason: collision with root package name */
        final d.a.z.c<? super T1, ? super T2, ? extends R> f12623b;

        b(d.a.z.c<? super T1, ? super T2, ? extends R> cVar) {
            this.f12623b = cVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f12623b.a(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* compiled from: Functions */
    static final class b0 implements Callable<Object> {
        b0() {
        }

        public Object call() {
            return null;
        }
    }

    /* compiled from: Functions */
    static final class c<T1, T2, T3, R> implements d.a.z.n<Object[], R> {

        /* renamed from: b  reason: collision with root package name */
        final d.a.z.g<T1, T2, T3, R> f12624b;

        c(d.a.z.g<T1, T2, T3, R> gVar) {
            this.f12624b = gVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 3) {
                return this.f12624b.a(objArr[0], objArr[1], objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    /* compiled from: Functions */
    static final class c0 implements d.a.z.f<Throwable> {
        c0() {
        }

        /* renamed from: b */
        public void a(Throwable th) {
            d.a.d0.a.s(new OnErrorNotImplementedException(th));
        }
    }

    /* compiled from: Functions */
    static final class d<T1, T2, T3, T4, R> implements d.a.z.n<Object[], R> {

        /* renamed from: b  reason: collision with root package name */
        final d.a.z.h<T1, T2, T3, T4, R> f12625b;

        d(d.a.z.h<T1, T2, T3, T4, R> hVar) {
            this.f12625b = hVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 4) {
                return this.f12625b.a(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
        }
    }

    /* compiled from: Functions */
    static final class d0<T> implements d.a.z.n<T, d.a.e0.b<T>> {

        /* renamed from: b  reason: collision with root package name */
        final TimeUnit f12626b;

        /* renamed from: c  reason: collision with root package name */
        final d.a.t f12627c;

        d0(TimeUnit timeUnit, d.a.t tVar) {
            this.f12626b = timeUnit;
            this.f12627c = tVar;
        }

        /* renamed from: a */
        public d.a.e0.b<T> apply(T t) throws Exception {
            return new d.a.e0.b<>(t, this.f12627c.b(this.f12626b), this.f12626b);
        }
    }

    /* compiled from: Functions */
    static final class e<T1, T2, T3, T4, T5, R> implements d.a.z.n<Object[], R> {

        /* renamed from: b  reason: collision with root package name */
        private final d.a.z.i<T1, T2, T3, T4, T5, R> f12628b;

        e(d.a.z.i<T1, T2, T3, T4, T5, R> iVar) {
            this.f12628b = iVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 5) {
                return this.f12628b.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
            throw new IllegalArgumentException("Array of size 5 expected but got " + objArr.length);
        }
    }

    /* compiled from: Functions */
    static final class e0<K, T> implements d.a.z.b<Map<K, T>, T> {

        /* renamed from: a  reason: collision with root package name */
        private final d.a.z.n<? super T, ? extends K> f12629a;

        e0(d.a.z.n<? super T, ? extends K> nVar) {
            this.f12629a = nVar;
        }

        /* renamed from: b */
        public void a(Map<K, T> map, T t) throws Exception {
            map.put(this.f12629a.apply(t), t);
        }
    }

    /* compiled from: Functions */
    static final class f<T1, T2, T3, T4, T5, T6, R> implements d.a.z.n<Object[], R> {

        /* renamed from: b  reason: collision with root package name */
        final d.a.z.j<T1, T2, T3, T4, T5, T6, R> f12630b;

        f(d.a.z.j<T1, T2, T3, T4, T5, T6, R> jVar) {
            this.f12630b = jVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 6) {
                return this.f12630b.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
            throw new IllegalArgumentException("Array of size 6 expected but got " + objArr.length);
        }
    }

    /* compiled from: Functions */
    static final class f0<K, V, T> implements d.a.z.b<Map<K, V>, T> {

        /* renamed from: a  reason: collision with root package name */
        private final d.a.z.n<? super T, ? extends V> f12631a;

        /* renamed from: b  reason: collision with root package name */
        private final d.a.z.n<? super T, ? extends K> f12632b;

        f0(d.a.z.n<? super T, ? extends V> nVar, d.a.z.n<? super T, ? extends K> nVar2) {
            this.f12631a = nVar;
            this.f12632b = nVar2;
        }

        /* renamed from: b */
        public void a(Map<K, V> map, T t) throws Exception {
            map.put(this.f12632b.apply(t), this.f12631a.apply(t));
        }
    }

    /* compiled from: Functions */
    static final class g<T1, T2, T3, T4, T5, T6, T7, R> implements d.a.z.n<Object[], R> {

        /* renamed from: b  reason: collision with root package name */
        final d.a.z.k<T1, T2, T3, T4, T5, T6, T7, R> f12633b;

        g(d.a.z.k<T1, T2, T3, T4, T5, T6, T7, R> kVar) {
            this.f12633b = kVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 7) {
                return this.f12633b.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
            throw new IllegalArgumentException("Array of size 7 expected but got " + objArr.length);
        }
    }

    /* compiled from: Functions */
    static final class g0<K, V, T> implements d.a.z.b<Map<K, Collection<V>>, T> {

        /* renamed from: a  reason: collision with root package name */
        private final d.a.z.n<? super K, ? extends Collection<? super V>> f12634a;

        /* renamed from: b  reason: collision with root package name */
        private final d.a.z.n<? super T, ? extends V> f12635b;

        /* renamed from: c  reason: collision with root package name */
        private final d.a.z.n<? super T, ? extends K> f12636c;

        g0(d.a.z.n<? super K, ? extends Collection<? super V>> nVar, d.a.z.n<? super T, ? extends V> nVar2, d.a.z.n<? super T, ? extends K> nVar3) {
            this.f12634a = nVar;
            this.f12635b = nVar2;
            this.f12636c = nVar3;
        }

        /* renamed from: b */
        public void a(Map<K, Collection<V>> map, T t) throws Exception {
            Object apply = this.f12636c.apply(t);
            Collection collection = map.get(apply);
            if (collection == null) {
                collection = (Collection) this.f12634a.apply(apply);
                map.put(apply, collection);
            }
            collection.add(this.f12635b.apply(t));
        }
    }

    /* compiled from: Functions */
    static final class h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements d.a.z.n<Object[], R> {

        /* renamed from: b  reason: collision with root package name */
        final d.a.z.l<T1, T2, T3, T4, T5, T6, T7, T8, R> f12637b;

        h(d.a.z.l<T1, T2, T3, T4, T5, T6, T7, T8, R> lVar) {
            this.f12637b = lVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 8) {
                return this.f12637b.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
            throw new IllegalArgumentException("Array of size 8 expected but got " + objArr.length);
        }
    }

    /* compiled from: Functions */
    static final class h0 implements d.a.z.o<Object> {
        h0() {
        }

        public boolean a(Object obj) {
            return true;
        }
    }

    /* compiled from: Functions */
    static final class i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements d.a.z.n<Object[], R> {

        /* renamed from: b  reason: collision with root package name */
        final d.a.z.m<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f12638b;

        i(d.a.z.m<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> mVar) {
            this.f12638b = mVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 9) {
                return this.f12638b.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
            }
            throw new IllegalArgumentException("Array of size 9 expected but got " + objArr.length);
        }
    }

    /* compiled from: Functions */
    static final class j<T> implements Callable<List<T>> {

        /* renamed from: b  reason: collision with root package name */
        final int f12639b;

        j(int i) {
            this.f12639b = i;
        }

        /* renamed from: a */
        public List<T> call() throws Exception {
            return new ArrayList(this.f12639b);
        }
    }

    /* compiled from: Functions */
    static final class k<T> implements d.a.z.o<T> {

        /* renamed from: b  reason: collision with root package name */
        final d.a.z.e f12640b;

        k(d.a.z.e eVar) {
            this.f12640b = eVar;
        }

        public boolean a(T t) throws Exception {
            return !this.f12640b.a();
        }
    }

    /* compiled from: Functions */
    static final class l<T, U> implements d.a.z.n<T, U> {

        /* renamed from: b  reason: collision with root package name */
        final Class<U> f12641b;

        l(Class<U> cls) {
            this.f12641b = cls;
        }

        public U apply(T t) throws Exception {
            return this.f12641b.cast(t);
        }
    }

    /* compiled from: Functions */
    static final class m<T, U> implements d.a.z.o<T> {

        /* renamed from: b  reason: collision with root package name */
        final Class<U> f12642b;

        m(Class<U> cls) {
            this.f12642b = cls;
        }

        public boolean a(T t) throws Exception {
            return this.f12642b.isInstance(t);
        }
    }

    /* compiled from: Functions */
    static final class n implements d.a.z.a {
        n() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* compiled from: Functions */
    static final class o implements d.a.z.f<Object> {
        o() {
        }

        public void a(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* compiled from: Functions */
    static final class p implements Runnable {
        p() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* compiled from: Functions */
    static final class q<T> implements d.a.z.o<T> {

        /* renamed from: b  reason: collision with root package name */
        final T f12643b;

        q(T t) {
            this.f12643b = t;
        }

        public boolean a(T t) throws Exception {
            return b.c(t, this.f12643b);
        }
    }

    /* compiled from: Functions */
    static final class r implements d.a.z.o<Object> {
        r() {
        }

        public boolean a(Object obj) {
            return false;
        }
    }

    /* compiled from: Functions */
    enum s implements Callable<Set<Object>> {
        INSTANCE;

        /* renamed from: f */
        public Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    /* compiled from: Functions */
    static final class t implements d.a.z.n<Object, Object> {
        t() {
        }

        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* compiled from: Functions */
    static final class u<T, U> implements Callable<U>, d.a.z.n<T, U> {

        /* renamed from: b  reason: collision with root package name */
        final U f12646b;

        u(U u) {
            this.f12646b = u;
        }

        public U apply(T t) throws Exception {
            return this.f12646b;
        }

        public U call() throws Exception {
            return this.f12646b;
        }
    }

    /* compiled from: Functions */
    static final class v<T> implements d.a.z.n<List<T>, List<T>> {

        /* renamed from: b  reason: collision with root package name */
        final Comparator<? super T> f12647b;

        v(Comparator<? super T> comparator) {
            this.f12647b = comparator;
        }

        public List<T> a(List<T> list) {
            Collections.sort(list, this.f12647b);
            return list;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) throws Exception {
            List list = (List) obj;
            a(list);
            return list;
        }
    }

    /* compiled from: Functions */
    enum w implements Comparator<Object> {
        INSTANCE;

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* compiled from: Functions */
    static final class x implements Comparator<Object> {
        x() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* compiled from: Functions */
    static final class y<T> implements d.a.z.a {

        /* renamed from: b  reason: collision with root package name */
        final d.a.z.f<? super d.a.k<T>> f12650b;

        y(d.a.z.f<? super d.a.k<T>> fVar) {
            this.f12650b = fVar;
        }

        public void run() throws Exception {
            this.f12650b.a(d.a.k.a());
        }
    }

    /* compiled from: Functions */
    static final class z<T> implements d.a.z.f<Throwable> {

        /* renamed from: b  reason: collision with root package name */
        final d.a.z.f<? super d.a.k<T>> f12651b;

        z(d.a.z.f<? super d.a.k<T>> fVar) {
            this.f12651b = fVar;
        }

        /* renamed from: b */
        public void a(Throwable th) throws Exception {
            this.f12651b.a(d.a.k.b(th));
        }
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> d.a.z.n<Object[], R> A(d.a.z.k<T1, T2, T3, T4, T5, T6, T7, R> kVar) {
        b.e(kVar, "f is null");
        return new g(kVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> d.a.z.n<Object[], R> B(d.a.z.l<T1, T2, T3, T4, T5, T6, T7, T8, R> lVar) {
        b.e(lVar, "f is null");
        return new h(lVar);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> d.a.z.n<Object[], R> C(d.a.z.m<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> mVar) {
        b.e(mVar, "f is null");
        return new i(mVar);
    }

    public static <T, K> d.a.z.b<Map<K, T>, T> D(d.a.z.n<? super T, ? extends K> nVar) {
        return new e0(nVar);
    }

    public static <T, K, V> d.a.z.b<Map<K, V>, T> E(d.a.z.n<? super T, ? extends K> nVar, d.a.z.n<? super T, ? extends V> nVar2) {
        return new f0(nVar2, nVar);
    }

    public static <T, K, V> d.a.z.b<Map<K, Collection<V>>, T> F(d.a.z.n<? super T, ? extends K> nVar, d.a.z.n<? super T, ? extends V> nVar2, d.a.z.n<? super K, ? extends Collection<? super V>> nVar3) {
        return new g0(nVar3, nVar2, nVar);
    }

    public static <T> d.a.z.f<T> a(d.a.z.a aVar) {
        return new C0126a(aVar);
    }

    public static <T> d.a.z.o<T> b() {
        return g;
    }

    public static <T> d.a.z.o<T> c() {
        return f12620f;
    }

    public static <T, U> d.a.z.n<T, U> d(Class<U> cls) {
        return new l(cls);
    }

    public static <T> Callable<List<T>> e(int i2) {
        return new j(i2);
    }

    public static <T> Callable<Set<T>> f() {
        return s.INSTANCE;
    }

    public static <T> d.a.z.f<T> g() {
        return f12618d;
    }

    public static <T> d.a.z.o<T> h(T t2) {
        return new q(t2);
    }

    public static <T> d.a.z.n<T, T> i() {
        return f12615a;
    }

    public static <T, U> d.a.z.o<T> j(Class<U> cls) {
        return new m(cls);
    }

    public static <T> Callable<T> k(T t2) {
        return new u(t2);
    }

    public static <T, U> d.a.z.n<T, U> l(U u2) {
        return new u(u2);
    }

    public static <T> d.a.z.n<List<T>, List<T>> m(Comparator<? super T> comparator) {
        return new v(comparator);
    }

    public static <T> Comparator<T> n() {
        return w.INSTANCE;
    }

    public static <T> Comparator<T> o() {
        return i;
    }

    public static <T> d.a.z.a p(d.a.z.f<? super d.a.k<T>> fVar) {
        return new y(fVar);
    }

    public static <T> d.a.z.f<Throwable> q(d.a.z.f<? super d.a.k<T>> fVar) {
        return new z(fVar);
    }

    public static <T> d.a.z.f<T> r(d.a.z.f<? super d.a.k<T>> fVar) {
        return new a0(fVar);
    }

    public static <T> Callable<T> s() {
        return h;
    }

    public static <T> d.a.z.o<T> t(d.a.z.e eVar) {
        return new k(eVar);
    }

    public static <T> d.a.z.n<T, d.a.e0.b<T>> u(TimeUnit timeUnit, d.a.t tVar) {
        return new d0(timeUnit, tVar);
    }

    public static <T1, T2, R> d.a.z.n<Object[], R> v(d.a.z.c<? super T1, ? super T2, ? extends R> cVar) {
        b.e(cVar, "f is null");
        return new b(cVar);
    }

    public static <T1, T2, T3, R> d.a.z.n<Object[], R> w(d.a.z.g<T1, T2, T3, R> gVar) {
        b.e(gVar, "f is null");
        return new c(gVar);
    }

    public static <T1, T2, T3, T4, R> d.a.z.n<Object[], R> x(d.a.z.h<T1, T2, T3, T4, R> hVar) {
        b.e(hVar, "f is null");
        return new d(hVar);
    }

    public static <T1, T2, T3, T4, T5, R> d.a.z.n<Object[], R> y(d.a.z.i<T1, T2, T3, T4, T5, R> iVar) {
        b.e(iVar, "f is null");
        return new e(iVar);
    }

    public static <T1, T2, T3, T4, T5, T6, R> d.a.z.n<Object[], R> z(d.a.z.j<T1, T2, T3, T4, T5, T6, R> jVar) {
        b.e(jVar, "f is null");
        return new f(jVar);
    }
}
