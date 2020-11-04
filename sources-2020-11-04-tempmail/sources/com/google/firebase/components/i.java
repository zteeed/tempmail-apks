package com.google.firebase.components;

import com.google.firebase.h.a;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
final /* synthetic */ class i implements a {

    /* renamed from: a  reason: collision with root package name */
    private final l f11604a;

    /* renamed from: b  reason: collision with root package name */
    private final d f11605b;

    private i(l lVar, d dVar) {
        this.f11604a = lVar;
        this.f11605b = dVar;
    }

    public static a a(l lVar, d dVar) {
        return new i(lVar, dVar);
    }

    public Object get() {
        return this.f11605b.d().create(new s(this.f11605b, this.f11604a));
    }
}
