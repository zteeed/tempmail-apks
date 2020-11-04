package com.google.android.play.core.tasks;

final class h implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f11515b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ i f11516c;

    h(i iVar, c cVar) {
        this.f11516c = iVar;
        this.f11515b = cVar;
    }

    public final void run() {
        synchronized (this.f11516c.f11518b) {
            if (this.f11516c.f11519c != null) {
                this.f11516c.f11519c.onSuccess(this.f11515b.f());
            }
        }
    }
}
