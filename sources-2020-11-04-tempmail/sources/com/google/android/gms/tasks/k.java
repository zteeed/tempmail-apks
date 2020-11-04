package com.google.android.gms.tasks;

final class k implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Task f10786b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j f10787c;

    k(j jVar, Task task) {
        this.f10787c = jVar;
        this.f10786b = task;
    }

    public final void run() {
        synchronized (this.f10787c.f10784b) {
            if (this.f10787c.f10785c != null) {
                this.f10787c.f10785c.b(this.f10786b.m());
            }
        }
    }
}
