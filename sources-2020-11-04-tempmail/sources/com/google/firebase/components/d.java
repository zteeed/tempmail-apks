package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Class<? super T>> f11589a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<n> f11590b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11591c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11592d;

    /* renamed from: e  reason: collision with root package name */
    private final g<T> f11593e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f11594f;

    /* compiled from: com.google.firebase:firebase-components@@16.0.0 */
    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<? super T>> f11595a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<n> f11596b;

        /* renamed from: c  reason: collision with root package name */
        private int f11597c;

        /* renamed from: d  reason: collision with root package name */
        private int f11598d;

        /* renamed from: e  reason: collision with root package name */
        private g<T> f11599e;

        /* renamed from: f  reason: collision with root package name */
        private Set<Class<?>> f11600f;

        /* access modifiers changed from: private */
        public b<T> g() {
            this.f11598d = 1;
            return this;
        }

        private b<T> h(int i) {
            r.d(this.f11597c == 0, "Instantiation type has already been set.");
            this.f11597c = i;
            return this;
        }

        private void i(Class<?> cls) {
            r.a(!this.f11595a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(n nVar) {
            r.c(nVar, "Null dependency");
            i(nVar.a());
            this.f11596b.add(nVar);
            return this;
        }

        public b<T> c() {
            h(1);
            return this;
        }

        public d<T> d() {
            r.d(this.f11599e != null, "Missing required property: factory.");
            return new d(new HashSet(this.f11595a), new HashSet(this.f11596b), this.f11597c, this.f11598d, this.f11599e, this.f11600f);
        }

        public b<T> e() {
            h(2);
            return this;
        }

        public b<T> f(g<T> gVar) {
            r.c(gVar, "Null factory");
            this.f11599e = gVar;
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f11595a = new HashSet();
            this.f11596b = new HashSet();
            this.f11597c = 0;
            this.f11598d = 0;
            this.f11600f = new HashSet();
            r.c(cls, "Null interface");
            this.f11595a.add(cls);
            for (Class<? super T> c2 : clsArr) {
                r.c(c2, "Null interface");
            }
            Collections.addAll(this.f11595a, clsArr);
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
        return this.f11590b;
    }

    public g<T> d() {
        return this.f11593e;
    }

    public Set<Class<? super T>> e() {
        return this.f11589a;
    }

    public Set<Class<?>> f() {
        return this.f11594f;
    }

    public boolean i() {
        return this.f11591c == 1;
    }

    public boolean j() {
        return this.f11591c == 2;
    }

    public boolean k() {
        return this.f11592d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f11589a.toArray()) + ">{" + this.f11591c + ", type=" + this.f11592d + ", deps=" + Arrays.toString(this.f11590b.toArray()) + "}";
    }

    private d(Set<Class<? super T>> set, Set<n> set2, int i, int i2, g<T> gVar, Set<Class<?>> set3) {
        this.f11589a = Collections.unmodifiableSet(set);
        this.f11590b = Collections.unmodifiableSet(set2);
        this.f11591c = i;
        this.f11592d = i2;
        this.f11593e = gVar;
        this.f11594f = Collections.unmodifiableSet(set3);
    }
}
