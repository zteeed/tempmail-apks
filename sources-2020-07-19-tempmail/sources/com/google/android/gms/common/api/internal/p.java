package com.google.android.gms.common.api.internal;

abstract class p implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zaak f2812b;

    private p(zaak zaak) {
        this.f2812b = zaak;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public void run() {
        this.f2812b.f2838b.lock();
        try {
            if (!Thread.interrupted()) {
                a();
                this.f2812b.f2838b.unlock();
            }
        } catch (RuntimeException e2) {
            this.f2812b.f2837a.g(e2);
        } finally {
            this.f2812b.f2838b.unlock();
        }
    }

    /* synthetic */ p(zaak zaak, g gVar) {
        this(zaak);
    }
}
