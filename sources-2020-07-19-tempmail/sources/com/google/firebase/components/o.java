package com.google.firebase.components;

import com.google.firebase.f.a;
import com.google.firebase.f.b;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
final /* synthetic */ class o implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Map.Entry f11071b;

    /* renamed from: c  reason: collision with root package name */
    private final a f11072c;

    private o(Map.Entry entry, a aVar) {
        this.f11071b = entry;
        this.f11072c = aVar;
    }

    public static Runnable a(Map.Entry entry, a aVar) {
        return new o(entry, aVar);
    }

    public void run() {
        ((b) this.f11071b.getKey()).a(this.f11072c);
    }
}
