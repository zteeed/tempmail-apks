package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

final class u implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ t f10622b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Callable f10623c;

    u(t tVar, Callable callable) {
        this.f10622b = tVar;
        this.f10623c = callable;
    }

    public final void run() {
        try {
            this.f10622b.v(this.f10623c.call());
        } catch (Exception e2) {
            this.f10622b.u(e2);
        }
    }
}
