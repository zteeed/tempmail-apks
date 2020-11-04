package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class g7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzbbz f3855b;

    g7(zzbbz zzbbz) {
        this.f3855b = zzbbz;
    }

    public final void run() {
        if (this.f3855b.q != null) {
            this.f3855b.q.f();
            this.f3855b.q.b();
        }
    }
}
