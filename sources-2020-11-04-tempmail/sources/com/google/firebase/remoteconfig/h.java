package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class h implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final j f12010b;

    private h(j jVar) {
        this.f12010b = jVar;
    }

    public static Callable a(j jVar) {
        return new h(jVar);
    }

    public Object call() {
        return this.f12010b.e();
    }
}
