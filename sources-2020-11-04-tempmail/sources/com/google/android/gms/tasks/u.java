package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

final class u implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ t f10808b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Callable f10809c;

    u(t tVar, Callable callable) {
        this.f10808b = tVar;
        this.f10809c = callable;
    }

    public final void run() {
        try {
            this.f10808b.v(this.f10809c.call());
        } catch (Exception e2) {
            this.f10808b.u(e2);
        }
    }
}
