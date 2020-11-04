package com.google.android.play.core.assetpacks;

final /* synthetic */ class b2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final b0 f11201b;

    private b2(b0 b0Var) {
        this.f11201b = b0Var;
    }

    static Runnable a(b0 b0Var) {
        return new b2(b0Var);
    }

    public final void run() {
        this.f11201b.p();
    }
}
