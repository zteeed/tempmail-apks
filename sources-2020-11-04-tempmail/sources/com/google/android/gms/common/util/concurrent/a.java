package com.google.android.gms.common.util.concurrent;

import android.os.Process;

final class a implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f3319b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3320c;

    public a(Runnable runnable, int i) {
        this.f3319b = runnable;
        this.f3320c = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f3320c);
        this.f3319b.run();
    }
}
