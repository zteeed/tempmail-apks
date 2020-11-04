package com.google.firebase.installations;

/* compiled from: FirebaseInstallations */
final /* synthetic */ class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final f f11837b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11838c;

    private c(f fVar, boolean z) {
        this.f11837b = fVar;
        this.f11838c = z;
    }

    public static Runnable a(f fVar, boolean z) {
        return new c(fVar, z);
    }

    public void run() {
        this.f11837b.c(this.f11838c);
    }
}
