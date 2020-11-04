package com.google.firebase.installations;

/* compiled from: FirebaseInstallations */
final /* synthetic */ class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final f f11839b;

    private d(f fVar) {
        this.f11839b = fVar;
    }

    public static Runnable a(f fVar) {
        return new d(fVar);
    }

    public void run() {
        this.f11839b.e(false);
    }
}
