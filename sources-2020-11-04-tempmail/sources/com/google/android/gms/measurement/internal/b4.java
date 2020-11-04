package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class b4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzw f10113b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzgd f10114c;

    b4(zzgd zzgd, zzw zzw) {
        this.f10114c = zzgd;
        this.f10113b = zzw;
    }

    public final void run() {
        this.f10114c.f10642b.e0();
        if (this.f10113b.f10717d.u() == null) {
            this.f10114c.f10642b.O(this.f10113b);
        } else {
            this.f10114c.f10642b.x(this.f10113b);
        }
    }
}
