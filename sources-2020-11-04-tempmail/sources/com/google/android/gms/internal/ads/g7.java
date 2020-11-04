package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class g7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzbbz f4038b;

    g7(zzbbz zzbbz) {
        this.f4038b = zzbbz;
    }

    public final void run() {
        if (this.f4038b.q != null) {
            this.f4038b.q.f();
            this.f4038b.q.b();
        }
    }
}
