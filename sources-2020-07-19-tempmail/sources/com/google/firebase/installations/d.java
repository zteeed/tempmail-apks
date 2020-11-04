package com.google.firebase.installations;

/* compiled from: FirebaseInstallations */
final /* synthetic */ class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final g f11288b;

    private d(g gVar) {
        this.f11288b = gVar;
    }

    public static Runnable a(g gVar) {
        return new d(gVar);
    }

    public void run() {
        this.f11288b.h();
    }
}
