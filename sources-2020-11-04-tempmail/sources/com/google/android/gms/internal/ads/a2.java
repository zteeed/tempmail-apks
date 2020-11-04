package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class a2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final b2 f3515b;

    /* renamed from: c  reason: collision with root package name */
    private final zzaju f3516c;

    a2(b2 b2Var, zzaju zzaju) {
        this.f3515b = b2Var;
        this.f3516c = zzaju;
    }

    public final void run() {
        b2 b2Var = this.f3515b;
        zzaju zzaju = this.f3516c;
        b2Var.f3597a.f5945d.a(zzaju);
        zzaju.destroy();
    }
}
