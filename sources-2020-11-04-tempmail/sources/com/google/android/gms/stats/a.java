package com.google.android.gms.stats;

final class a implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ WakeLock f10752b;

    a(WakeLock wakeLock) {
        this.f10752b = wakeLock;
    }

    public final void run() {
        this.f10752b.f(0);
    }
}
