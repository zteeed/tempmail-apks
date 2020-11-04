package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class a2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final b2 f3332b;

    /* renamed from: c  reason: collision with root package name */
    private final zzaju f3333c;

    a2(b2 b2Var, zzaju zzaju) {
        this.f3332b = b2Var;
        this.f3333c = zzaju;
    }

    public final void run() {
        b2 b2Var = this.f3332b;
        zzaju zzaju = this.f3333c;
        b2Var.f3414a.f5762d.a(zzaju);
        zzaju.destroy();
    }
}
