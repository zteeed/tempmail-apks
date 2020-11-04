package com.google.android.gms.common.api.internal;

abstract class p implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zaak f3000b;

    private p(zaak zaak) {
        this.f3000b = zaak;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public void run() {
        this.f3000b.f3026b.lock();
        try {
            if (!Thread.interrupted()) {
                a();
                this.f3000b.f3026b.unlock();
            }
        } catch (RuntimeException e2) {
            this.f3000b.f3025a.g(e2);
        } finally {
            this.f3000b.f3026b.unlock();
        }
    }

    /* synthetic */ p(zaak zaak, g gVar) {
        this(zaak);
    }
}
