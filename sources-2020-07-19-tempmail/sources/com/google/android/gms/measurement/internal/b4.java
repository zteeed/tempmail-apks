package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class b4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzw f9927b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzgd f9928c;

    b4(zzgd zzgd, zzw zzw) {
        this.f9928c = zzgd;
        this.f9927b = zzw;
    }

    public final void run() {
        this.f9928c.f10456b.e0();
        if (this.f9927b.f10531d.u() == null) {
            this.f9928c.f10456b.O(this.f9927b);
        } else {
            this.f9928c.f10456b.x(this.f9927b);
        }
    }
}
