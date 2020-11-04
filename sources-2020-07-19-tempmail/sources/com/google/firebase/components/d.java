package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Class<? super T>> f11039a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<n> f11040b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11041c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11042d;

    /* renamed from: e  reason: collision with root package name */
    private final g<T> f11043e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f11044f;

    /* compiled from: com.google.firebase:firebase-components@@16.0.0 */
    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<? super T>> f11045a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<n> f11046b;

        /* renamed from: c  reason: collision with root package name */
        private int f11047c;

        /* renamed from: d  reason: collision with root package name */
        private int f11048d;

        /* renamed from: e  reason: collision with root package name */
        private g<T> f11049e;

        /* renamed from: f  reason: collision with root package name */
        private Set<Class<?>> f11050f;

        /* access modifiers changed from: private */
        public b<T> g() {
            this.f11048d = 1;
            return this;
        }

        private b<T> h(int i) {
            r.d(this.f11047c == 0, "Instantiation type has already been set.");
            this.f11047c = i;
            return this;
        }

        private void i(Class<?> cls) {
            r.a(!this.f11045a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(n nVar) {
            r.c(nVar, "Null dependency");
            i(nVar.a());
            this.f11046b.add(nVar);
            return this;
        }

        public b<T> c() {
            h(1);
            return this;
        }

        public d<T> d() {
            r.d(this.f11049e != null, "Missing required property: factory.");
            return new d(new HashSet(this.f11045a), new HashSet(this.f11046b), this.f11047c, this.f11048d, this.f11049e, this.f11050f);
        }

        public b<T> e() {
            h(2);
            return this;
        }

        public b<T> f(g<T> gVar) {
            r.c(gVar, "Null factory");
            this.f11049e = gVar;
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f11045a = new HashSet();
            this.f11046b = new HashSet();
            this.f11047c = 0;
            this.f11048d = 0;
            this.f11050f = new HashSet();
            r.c(cls, "Null interface");
            this.f11045a.add(cls);
            for (Class<? super T> c2 : clsArr) {
                r.c(c2, "Null interface");
            }
            Collections.addAll(this.f11045a, clsArr);
        }
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> d<T> g(T t, Class<T> cls) {
        b<T> h = h(cls);
        h.f(c.a(t));
        return h.d();
    }

    public static <T> b<T> h(Class<T> cls) {
        b<T> a2 = a(cls);
        b unused = a2.g();
        return a2;
    }

    static /* synthetic */ Object l(Object obj, e eVar) {
        return obj;
    }

    static /* synthetic */ Object m(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> d<T> n(T t, Class<T> cls, Class<? super T>... clsArr) {
        b<T> b2 = b(cls, clsArr);
        b2.f(b.a(t));
        return b2.d();
    }

    public Set<n> c() {
        return this.f11040b;
    }

    public g<T> d() {
        return this.f11043e;
    }

    public Set<Class<? super T>> e() {
        return this.f11039a;
    }

    public Set<Class<?>> f() {
        return this.f11044f;
    }

    public boolean i() {
        return this.f11041c == 1;
    }

    public boolean j() {
        return this.f11041c == 2;
    }

    public boolean k() {
        return this.f11042d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f11039a.toArray()) + ">{" + this.f11041c + ", type=" + this.f11042d + ", deps=" + Arrays.toString(this.f11040b.toArray()) + "}";
    }

    private d(Set<Class<? super T>> set, Set<n> set2, int i, int i2, g<T> gVar, Set<Class<?>> set3) {
        this.f11039a = Collections.unmodifiableSet(set);
        this.f11040b = Collections.unmodifiableSet(set2);
        this.f11041c = i;
        this.f11042d = i2;
        this.f11043e = gVar;
        this.f11044f = Collections.unmodifiableSet(set3);
    }
}
