package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class u1 implements zzbbp {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaky f5023a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzakh f5024b;

    u1(zzakh zzakh, zzaky zzaky) {
        this.f5024b = zzakh;
        this.f5023a = zzaky;
    }

    public final void run() {
        synchronized (this.f5024b.f5752a) {
            int unused = this.f5024b.h = 1;
            zzaxv.m("Failed loading new engine. Marking new engine destroyable.");
            this.f5023a.i();
        }
    }
}
