package com.google.android.gms.tasks;

final class g implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ f f10777b;

    g(f fVar) {
        this.f10777b = fVar;
    }

    public final void run() {
        synchronized (this.f10777b.f10775b) {
            if (this.f10777b.f10776c != null) {
                this.f10777b.f10776c.c();
            }
        }
    }
}
