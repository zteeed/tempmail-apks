package com.google.firebase.components;

import com.google.firebase.h.a;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
final /* synthetic */ class i implements a {

    /* renamed from: a  reason: collision with root package name */
    private final l f11054a;

    /* renamed from: b  reason: collision with root package name */
    private final d f11055b;

    private i(l lVar, d dVar) {
        this.f11054a = lVar;
        this.f11055b = dVar;
    }

    public static a a(l lVar, d dVar) {
        return new i(lVar, dVar);
    }

    public Object get() {
        return this.f11055b.d().create(new s(this.f11055b, this.f11054a));
    }
}
