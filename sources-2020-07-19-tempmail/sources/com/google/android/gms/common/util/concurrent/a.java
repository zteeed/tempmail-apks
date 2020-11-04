package com.google.android.gms.common.util.concurrent;

import android.os.Process;

final class a implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f3136b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3137c;

    public a(Runnable runnable, int i) {
        this.f3136b = runnable;
        this.f3137c = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f3137c);
        this.f3136b.run();
    }
}
