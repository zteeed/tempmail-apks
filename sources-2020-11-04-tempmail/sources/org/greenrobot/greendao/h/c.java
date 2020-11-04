package org.greenrobot.greendao.h;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: IdentityScopeObject */
public class c<K, T> implements a<K, T> {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<K, Reference<T>> f15087a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final ReentrantLock f15088b = new ReentrantLock();

    public void a(K k, T t) {
        this.f15087a.put(k, new WeakReference(t));
    }

    public T b(K k) {
        Reference reference = this.f15087a.get(k);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    public void c(int i) {
    }

    public void clear() {
        this.f15088b.lock();
        try {
            this.f15087a.clear();
        } finally {
            this.f15088b.unlock();
        }
    }

    public boolean d(K k, T t) {
        boolean z;
        this.f15088b.lock();
        try {
            if (get(k) != t || t == null) {
                z = false;
            } else {
                remove(k);
                z = true;
            }
            return z;
        } finally {
            this.f15088b.unlock();
        }
    }

    public void e() {
        this.f15088b.unlock();
    }

    public void f(Iterable<K> iterable) {
        this.f15088b.lock();
        try {
            for (K remove : iterable) {
                this.f15087a.remove(remove);
            }
        } finally {
            this.f15088b.unlock();
        }
    }

    public void g() {
        this.f15088b.lock();
    }

    public T get(K k) {
        this.f15088b.lock();
        try {
            Reference reference = this.f15087a.get(k);
            if (reference != null) {
                return reference.get();
            }
            return null;
        } finally {
            this.f15088b.unlock();
        }
    }

    public void put(K k, T t) {
        this.f15088b.lock();
        try {
            this.f15087a.put(k, new WeakReference(t));
        } finally {
            this.f15088b.unlock();
        }
    }

    public void remove(K k) {
        this.f15088b.lock();
        try {
            this.f15087a.remove(k);
        } finally {
            this.f15088b.unlock();
        }
    }
}
