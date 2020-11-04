package org.greenrobot.greendao.h;

/* compiled from: IdentityScope */
public interface a<K, T> {
    void a(K k, T t);

    T b(K k);

    void c(int i);

    void clear();

    boolean d(K k, T t);

    void e();

    void f(Iterable<K> iterable);

    void g();

    T get(K k);

    void put(K k, T t);

    void remove(K k);
}
