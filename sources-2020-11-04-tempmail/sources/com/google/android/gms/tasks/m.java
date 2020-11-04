package com.google.android.gms.tasks;

final class m implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Task f10791b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ l f10792c;

    m(l lVar, Task task) {
        this.f10792c = lVar;
        this.f10791b = task;
    }

    public final void run() {
        synchronized (this.f10792c.f10789b) {
            if (this.f10792c.f10790c != null) {
                this.f10792c.f10790c.onSuccess(this.f10791b.n());
            }
        }
    }
}
