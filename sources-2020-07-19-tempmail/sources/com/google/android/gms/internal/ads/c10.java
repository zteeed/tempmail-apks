package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class c10 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Runnable f3509b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ d10 f3510c;

    c10(d10 d10, Runnable runnable) {
        this.f3510c = d10;
        this.f3509b = runnable;
    }

    public final void run() {
        this.f3510c.f3591b = false;
        this.f3509b.run();
    }

    public final String toString() {
        return this.f3509b.toString();
    }
}
