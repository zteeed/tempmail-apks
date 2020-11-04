package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class e6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f10168b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzir f10169c;

    e6(zzir zzir, zzn zzn) {
        this.f10169c = zzir;
        this.f10168b = zzn;
    }

    public final void run() {
        zzem l0 = this.f10169c.f10675d;
        if (l0 == null) {
            this.f10169c.h().G().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            l0.i3(this.f10168b);
        } catch (RemoteException e2) {
            this.f10169c.h().G().b("Failed to reset data on the service: remote exception", e2);
        }
        this.f10169c.f0();
    }
}
