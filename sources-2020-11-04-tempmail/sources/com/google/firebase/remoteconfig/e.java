package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class e implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final f f11996b;

    /* renamed from: c  reason: collision with root package name */
    private final g f11997c;

    private e(f fVar, g gVar) {
        this.f11996b = fVar;
        this.f11997c = gVar;
    }

    public static Callable a(f fVar, g gVar) {
        return new e(fVar, gVar);
    }

    public Object call() {
        return this.f11996b.i.h(this.f11997c);
    }
}
