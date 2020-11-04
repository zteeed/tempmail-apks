package com.google.firebase.components;

import com.google.firebase.h.a;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public class q<T> implements a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f11626c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f11627a = f11626c;

    /* renamed from: b  reason: collision with root package name */
    private volatile a<T> f11628b;

    public q(a<T> aVar) {
        this.f11628b = aVar;
    }

    public T get() {
        T t = this.f11627a;
        if (t == f11626c) {
            synchronized (this) {
                t = this.f11627a;
                if (t == f11626c) {
                    t = this.f11628b.get();
                    this.f11627a = t;
                    this.f11628b = null;
                }
            }
        }
        return t;
    }
}
