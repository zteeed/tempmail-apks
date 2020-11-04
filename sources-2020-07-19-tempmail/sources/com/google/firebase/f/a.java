package com.google.firebase.f;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f11126a;

    /* renamed from: b  reason: collision with root package name */
    private final T f11127b;

    public T a() {
        return this.f11127b;
    }

    public Class<T> b() {
        return this.f11126a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f11126a, this.f11127b});
    }
}
