package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class e6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f9982b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzir f9983c;

    e6(zzir zzir, zzn zzn) {
        this.f9983c = zzir;
        this.f9982b = zzn;
    }

    public final void run() {
        zzem l0 = this.f9983c.f10489d;
        if (l0 == null) {
            this.f9983c.h().G().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            l0.W2(this.f9982b);
        } catch (RemoteException e2) {
            this.f9983c.h().G().b("Failed to reset data on the service: remote exception", e2);
        }
        this.f9983c.f0();
    }
}
