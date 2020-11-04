package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class a implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final e f12018b;

    /* renamed from: c  reason: collision with root package name */
    private final f f12019c;

    private a(e eVar, f fVar) {
        this.f12018b = eVar;
        this.f12019c = fVar;
    }

    public static Callable a(e eVar, f fVar) {
        return new a(eVar, fVar);
    }

    public Object call() {
        return this.f12018b.f12028b.e(this.f12019c);
    }
}
