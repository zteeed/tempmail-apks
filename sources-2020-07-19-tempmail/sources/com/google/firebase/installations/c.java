package com.google.firebase.installations;

/* compiled from: FirebaseInstallations */
final /* synthetic */ class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final g f11287b;

    private c(g gVar) {
        this.f11287b = gVar;
    }

    public static Runnable a(g gVar) {
        return new c(gVar);
    }

    public void run() {
        this.f11287b.j();
    }
}
