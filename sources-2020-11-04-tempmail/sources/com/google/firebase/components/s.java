package com.google.firebase.components;

import com.google.firebase.f.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
final class s extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Class<?>> f11629a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Class<?>> f11630b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Class<?>> f11631c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Class<?>> f11632d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<Class<?>> f11633e;

    /* renamed from: f  reason: collision with root package name */
    private final e f11634f;

    /* compiled from: com.google.firebase:firebase-components@@16.0.0 */
    private static class a implements c {
        public a(Set<Class<?>> set, c cVar) {
        }
    }

    s(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (n next : dVar.c()) {
            if (next.b()) {
                if (next.d()) {
                    hashSet3.add(next.a());
                } else {
                    hashSet.add(next.a());
                }
            } else if (next.d()) {
                hashSet4.add(next.a());
            } else {
                hashSet2.add(next.a());
            }
        }
        if (!dVar.f().isEmpty()) {
            hashSet.add(c.class);
        }
        this.f11629a = Collections.unmodifiableSet(hashSet);
        this.f11630b = Collections.unmodifiableSet(hashSet2);
        this.f11631c = Collections.unmodifiableSet(hashSet3);
        this.f11632d = Collections.unmodifiableSet(hashSet4);
        this.f11633e = dVar.f();
        this.f11634f = eVar;
    }

    public <T> T a(Class<T> cls) {
        if (this.f11629a.contains(cls)) {
            T a2 = this.f11634f.a(cls);
            if (!cls.equals(c.class)) {
                return a2;
            }
            return new a(this.f11633e, (c) a2);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public <T> com.google.firebase.h.a<T> b(Class<T> cls) {
        if (this.f11630b.contains(cls)) {
            return this.f11634f.b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public <T> com.google.firebase.h.a<Set<T>> c(Class<T> cls) {
        if (this.f11632d.contains(cls)) {
            return this.f11634f.c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    public <T> Set<T> d(Class<T> cls) {
        if (this.f11631c.contains(cls)) {
            return this.f11634f.d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }
}
