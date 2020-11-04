package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class r1 implements zzbbr<zzaju> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaky f4769a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzakh f4770b;

    r1(zzakh zzakh, zzaky zzaky) {
        this.f4770b = zzakh;
        this.f4769a = zzaky;
    }

    public final /* synthetic */ void a(Object obj) {
        zzaju zzaju = (zzaju) obj;
        synchronized (this.f4770b.f5752a) {
            int unused = this.f4770b.h = 0;
            if (!(this.f4770b.g == null || this.f4769a == this.f4770b.g)) {
                zzaxv.m("New JS engine is loaded, marking previous one as destroyable.");
                this.f4770b.g.i();
            }
            zzaky unused2 = this.f4770b.g = this.f4769a;
        }
    }
}
