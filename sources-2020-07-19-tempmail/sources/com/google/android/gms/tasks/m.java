package com.google.android.gms.tasks;

final class m implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Task f10605b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ l f10606c;

    m(l lVar, Task task) {
        this.f10606c = lVar;
        this.f10605b = task;
    }

    public final void run() {
        synchronized (this.f10606c.f10603b) {
            if (this.f10606c.f10604c != null) {
                this.f10606c.f10604c.onSuccess(this.f10605b.n());
            }
        }
    }
}
