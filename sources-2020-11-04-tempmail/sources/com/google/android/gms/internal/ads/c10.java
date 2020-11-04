package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class c10 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Runnable f3692b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ d10 f3693c;

    c10(d10 d10, Runnable runnable) {
        this.f3693c = d10;
        this.f3692b = runnable;
    }

    public final void run() {
        this.f3693c.f3774b = false;
        this.f3692b.run();
    }

    public final String toString() {
        return this.f3692b.toString();
    }
}
