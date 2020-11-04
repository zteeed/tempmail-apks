package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.p;
import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class i implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final p f12011b;

    private i(p pVar) {
        this.f12011b = pVar;
    }

    public static Callable a(p pVar) {
        return new i(pVar);
    }

    public Object call() {
        return Boolean.valueOf(this.f12011b.j());
    }
}
