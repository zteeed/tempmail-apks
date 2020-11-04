package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class c4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f9941b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzgd f9942c;

    c4(zzgd zzgd, zzn zzn) {
        this.f9942c = zzgd;
        this.f9941b = zzn;
    }

    public final void run() {
        this.f9942c.f10456b.e0();
        zzkj y = this.f9942c.f10456b;
        zzn zzn = this.f9941b;
        y.g().c();
        y.c0();
        Preconditions.g(zzn.f10523b);
        y.Q(zzn);
    }
}
