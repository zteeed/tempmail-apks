package org.greenrobot.greendao.h;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;
import org.greenrobot.greendao.i.c;

/* compiled from: IdentityScopeLong */
public class b<T> implements a<Long, T> {

    /* renamed from: a  reason: collision with root package name */
    private final c<Reference<T>> f14516a = new c<>();

    /* renamed from: b  reason: collision with root package name */
    private final ReentrantLock f14517b = new ReentrantLock();

    public void c(int i) {
        this.f14516a.e(i);
    }

    public void clear() {
        this.f14517b.lock();
        try {
            this.f14516a.a();
        } finally {
            this.f14517b.unlock();
        }
    }

    public void d() {
        this.f14517b.unlock();
    }

    public void e(Iterable<Long> iterable) {
        this.f14517b.lock();
        try {
            for (Long longValue : iterable) {
                this.f14516a.d(longValue.longValue());
            }
        } finally {
            this.f14517b.unlock();
        }
    }

    public void f() {
        this.f14517b.lock();
    }

    /* renamed from: g */
    public T get(Long l) {
        return h(l.longValue());
    }

    public T h(long j) {
        this.f14517b.lock();
        try {
            Reference b2 = this.f14516a.b(j);
            if (b2 != null) {
                return b2.get();
            }
            return null;
        } finally {
            this.f14517b.unlock();
        }
    }

    public T i(long j) {
        Reference b2 = this.f14516a.b(j);
        if (b2 != null) {
            return b2.get();
        }
        return null;
    }

    /* renamed from: j */
    public T b(Long l) {
        return i(l.longValue());
    }

    /* renamed from: k */
    public void put(Long l, T t) {
        l(l.longValue(), t);
    }

    public void l(long j, T t) {
        this.f14517b.lock();
        try {
            this.f14516a.c(j, new WeakReference(t));
        } finally {
            this.f14517b.unlock();
        }
    }

    public void m(long j, T t) {
        this.f14516a.c(j, new WeakReference(t));
    }

    /* renamed from: n */
    public void a(Long l, T t) {
        m(l.longValue(), t);
    }

    /* renamed from: o */
    public void remove(Long l) {
        this.f14517b.lock();
        try {
            this.f14516a.d(l.longValue());
        } finally {
            this.f14517b.unlock();
        }
    }
}
