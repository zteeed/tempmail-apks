package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class c implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final n f11474b;

    private c(n nVar) {
        this.f11474b = nVar;
    }

    public static Callable a(n nVar) {
        return new c(nVar);
    }

    public Object call() {
        return this.f11474b.d();
    }
}
