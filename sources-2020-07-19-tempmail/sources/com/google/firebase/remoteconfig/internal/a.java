package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class a implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final e f11469b;

    /* renamed from: c  reason: collision with root package name */
    private final f f11470c;

    private a(e eVar, f fVar) {
        this.f11469b = eVar;
        this.f11470c = fVar;
    }

    public static Callable a(e eVar, f fVar) {
        return new a(eVar, fVar);
    }

    public Object call() {
        return this.f11469b.f11479b.e(this.f11470c);
    }
}
