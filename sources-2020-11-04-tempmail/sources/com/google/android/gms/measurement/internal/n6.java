package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class n6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f10327b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzir f10328c;

    n6(zzir zzir, zzn zzn) {
        this.f10328c = zzir;
        this.f10327b = zzn;
    }

    public final void run() {
        zzem l0 = this.f10328c.f10675d;
        if (l0 == null) {
            this.f10328c.h().G().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            l0.S4(this.f10327b);
            this.f10328c.f0();
        } catch (RemoteException e2) {
            this.f10328c.h().G().b("Failed to send measurementEnabled to the service", e2);
        }
    }
}
