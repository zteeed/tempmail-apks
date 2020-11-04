package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class r1 implements zzbbr<zzaju> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaky f4952a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzakh f4953b;

    r1(zzakh zzakh, zzaky zzaky) {
        this.f4953b = zzakh;
        this.f4952a = zzaky;
    }

    public final /* synthetic */ void a(Object obj) {
        zzaju zzaju = (zzaju) obj;
        synchronized (this.f4953b.f5935a) {
            int unused = this.f4953b.h = 0;
            if (!(this.f4953b.g == null || this.f4952a == this.f4953b.g)) {
                zzaxv.m("New JS engine is loaded, marking previous one as destroyable.");
                this.f4953b.g.i();
            }
            zzaky unused2 = this.f4953b.g = this.f4952a;
        }
    }
}
