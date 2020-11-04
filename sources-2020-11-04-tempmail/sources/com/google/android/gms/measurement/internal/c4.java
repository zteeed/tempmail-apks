package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final class c4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f10127b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzgd f10128c;

    c4(zzgd zzgd, zzn zzn) {
        this.f10128c = zzgd;
        this.f10127b = zzn;
    }

    public final void run() {
        this.f10128c.f10642b.e0();
        zzkj B = this.f10128c.f10642b;
        zzn zzn = this.f10127b;
        B.g().c();
        B.c0();
        Preconditions.g(zzn.f10709b);
        B.Q(zzn);
    }
}
