package com.google.android.gms.tasks;

final class g implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ f f10591b;

    g(f fVar) {
        this.f10591b = fVar;
    }

    public final void run() {
        synchronized (this.f10591b.f10589b) {
            if (this.f10591b.f10590c != null) {
                this.f10591b.f10590c.b();
            }
        }
    }
}
