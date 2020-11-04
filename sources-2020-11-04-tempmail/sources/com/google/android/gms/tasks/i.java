package com.google.android.gms.tasks;

final class i implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Task f10781b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ h f10782c;

    i(h hVar, Task task) {
        this.f10782c = hVar;
        this.f10781b = task;
    }

    public final void run() {
        synchronized (this.f10782c.f10779b) {
            if (this.f10782c.f10780c != null) {
                this.f10782c.f10780c.a(this.f10781b);
            }
        }
    }
}
