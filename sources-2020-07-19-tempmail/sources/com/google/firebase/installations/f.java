package com.google.firebase.installations;

/* compiled from: FirebaseInstallations */
final /* synthetic */ class f implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final g f11290b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11291c;

    private f(g gVar, boolean z) {
        this.f11290b = gVar;
        this.f11291c = z;
    }

    public static Runnable a(g gVar, boolean z) {
        return new f(gVar, z);
    }

    public void run() {
        this.f11290b.k(this.f11291c);
    }
}
