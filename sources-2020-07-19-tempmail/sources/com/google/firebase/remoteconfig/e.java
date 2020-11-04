package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class e implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final f f11447b;

    /* renamed from: c  reason: collision with root package name */
    private final g f11448c;

    private e(f fVar, g gVar) {
        this.f11447b = fVar;
        this.f11448c = gVar;
    }

    public static Callable a(f fVar, g gVar) {
        return new e(fVar, gVar);
    }

    public Object call() {
        return this.f11447b.i.h(this.f11448c);
    }
}
