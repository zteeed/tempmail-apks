package com.google.firebase.installations;

/* compiled from: FirebaseInstallations */
final /* synthetic */ class e implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final g f11289b;

    private e(g gVar) {
        this.f11289b = gVar;
    }

    public static Runnable a(g gVar) {
        return new e(gVar);
    }

    public void run() {
        this.f11289b.i();
    }
}
