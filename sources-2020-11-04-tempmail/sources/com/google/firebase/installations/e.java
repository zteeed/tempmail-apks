package com.google.firebase.installations;

/* compiled from: FirebaseInstallations */
final /* synthetic */ class e implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final f f11840b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11841c;

    private e(f fVar, boolean z) {
        this.f11840b = fVar;
        this.f11841c = z;
    }

    public static Runnable a(f fVar, boolean z) {
        return new e(fVar, z);
    }

    public void run() {
        this.f11840b.e(this.f11841c);
    }
}
