package org.greenrobot.greendao.h;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: IdentityScopeObject */
public class c<K, T> implements a<K, T> {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<K, Reference<T>> f14518a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final ReentrantLock f14519b = new ReentrantLock();

    public void a(K k, T t) {
        this.f14518a.put(k, new WeakReference(t));
    }

    public T b(K k) {
        Reference reference = this.f14518a.get(k);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    public void c(int i) {
    }

    public void clear() {
        this.f14519b.lock();
        try {
            this.f14518a.clear();
        } finally {
            this.f14519b.unlock();
        }
    }

    public void d() {
        this.f14519b.unlock();
    }

    public void e(Iterable<K> iterable) {
        this.f14519b.lock();
        try {
            for (K remove : iterable) {
                this.f14518a.remove(remove);
            }
        } finally {
            this.f14519b.unlock();
        }
    }

    public void f() {
        this.f14519b.lock();
    }

    public T get(K k) {
        this.f14519b.lock();
        try {
            Reference reference = this.f14518a.get(k);
            if (reference != null) {
                return reference.get();
            }
            return null;
        } finally {
            this.f14519b.unlock();
        }
    }

    public void put(K k, T t) {
        this.f14519b.lock();
        try {
            this.f14518a.put(k, new WeakReference(t));
        } finally {
            this.f14519b.unlock();
        }
    }

    public void remove(K k) {
        this.f14519b.lock();
        try {
            this.f14518a.remove(k);
        } finally {
            this.f14519b.unlock();
        }
    }
}
