package com.google.android.gms.stats;

final class a implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ WakeLock f10566b;

    a(WakeLock wakeLock) {
        this.f10566b = wakeLock;
    }

    public final void run() {
        this.f10566b.f(0);
    }
}
