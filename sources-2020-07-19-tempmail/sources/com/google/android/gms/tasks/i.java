package com.google.android.gms.tasks;

final class i implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Task f10595b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ h f10596c;

    i(h hVar, Task task) {
        this.f10596c = hVar;
        this.f10595b = task;
    }

    public final void run() {
        synchronized (this.f10596c.f10593b) {
            if (this.f10596c.f10594c != null) {
                this.f10596c.f10594c.a(this.f10595b);
            }
        }
    }
}
