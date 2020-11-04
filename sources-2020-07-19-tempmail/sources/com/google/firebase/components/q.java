package com.google.firebase.components;

import com.google.firebase.h.a;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public class q<T> implements a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f11076c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f11077a = f11076c;

    /* renamed from: b  reason: collision with root package name */
    private volatile a<T> f11078b;

    public q(a<T> aVar) {
        this.f11078b = aVar;
    }

    public T get() {
        T t = this.f11077a;
        if (t == f11076c) {
            synchronized (this) {
                t = this.f11077a;
                if (t == f11076c) {
                    t = this.f11078b.get();
                    this.f11077a = t;
                    this.f11078b = null;
                }
            }
        }
        return t;
    }
}
