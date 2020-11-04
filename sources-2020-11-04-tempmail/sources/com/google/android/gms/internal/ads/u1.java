package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class u1 implements zzbbp {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaky f5206a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzakh f5207b;

    u1(zzakh zzakh, zzaky zzaky) {
        this.f5207b = zzakh;
        this.f5206a = zzaky;
    }

    public final void run() {
        synchronized (this.f5207b.f5935a) {
            int unused = this.f5207b.h = 1;
            zzaxv.m("Failed loading new engine. Marking new engine destroyable.");
            this.f5206a.i();
        }
    }
}
