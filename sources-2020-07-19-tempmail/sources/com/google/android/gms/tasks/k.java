package com.google.android.gms.tasks;

final class k implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Task f10600b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j f10601c;

    k(j jVar, Task task) {
        this.f10601c = jVar;
        this.f10600b = task;
    }

    public final void run() {
        synchronized (this.f10601c.f10598b) {
            if (this.f10601c.f10599c != null) {
                this.f10601c.f10599c.c(this.f10600b.m());
            }
        }
    }
}
