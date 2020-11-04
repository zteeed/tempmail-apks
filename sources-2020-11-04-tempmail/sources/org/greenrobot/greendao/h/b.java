package org.greenrobot.greendao.h;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;
import org.greenrobot.greendao.i.c;

/* compiled from: IdentityScopeLong */
public class b<T> implements a<Long, T> {

    /* renamed from: a  reason: collision with root package name */
    private final c<Reference<T>> f15085a = new c<>();

    /* renamed from: b  reason: collision with root package name */
    private final ReentrantLock f15086b = new ReentrantLock();

    public void c(int i) {
        this.f15085a.e(i);
    }

    public void clear() {
        this.f15086b.lock();
        try {
            this.f15085a.a();
        } finally {
            this.f15086b.unlock();
        }
    }

    public void e() {
        this.f15086b.unlock();
    }

    public void f(Iterable<Long> iterable) {
        this.f15086b.lock();
        try {
            for (Long longValue : iterable) {
                this.f15085a.d(longValue.longValue());
            }
        } finally {
            this.f15086b.unlock();
        }
    }

    public void g() {
        this.f15086b.lock();
    }

    /* renamed from: h */
    public boolean d(Long l, T t) {
        boolean z;
        this.f15086b.lock();
        try {
            if (get(l) != t || t == null) {
                z = false;
            } else {
                remove(l);
                z = true;
            }
            return z;
        } finally {
            this.f15086b.unlock();
        }
    }

    /* renamed from: i */
    public T get(Long l) {
        return j(l.longValue());
    }

    public T j(long j) {
        this.f15086b.lock();
        try {
            Reference b2 = this.f15085a.b(j);
            if (b2 != null) {
                return b2.get();
            }
            return null;
        } finally {
            this.f15086b.unlock();
        }
    }

    public T k(long j) {
        Reference b2 = this.f15085a.b(j);
        if (b2 != null) {
            return b2.get();
        }
        return null;
    }

    /* renamed from: l */
    public T b(Long l) {
        return k(l.longValue());
    }

    /* renamed from: m */
    public void put(Long l, T t) {
        n(l.longValue(), t);
    }

    public void n(long j, T t) {
        this.f15086b.lock();
        try {
            this.f15085a.c(j, new WeakReference(t));
        } finally {
            this.f15086b.unlock();
        }
    }

    public void o(long j, T t) {
        this.f15085a.c(j, new WeakReference(t));
    }

    /* renamed from: p */
    public void a(Long l, T t) {
        o(l.longValue(), t);
    }

    /* renamed from: q */
    public void remove(Long l) {
        this.f15086b.lock();
        try {
            this.f15085a.d(l.longValue());
        } finally {
            this.f15086b.unlock();
        }
    }
}
