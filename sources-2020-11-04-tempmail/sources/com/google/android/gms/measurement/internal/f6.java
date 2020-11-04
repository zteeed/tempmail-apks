package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class f6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f10188b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzir f10189c;

    f6(zzir zzir, zzn zzn) {
        this.f10189c = zzir;
        this.f10188b = zzn;
    }

    public final void run() {
        zzem l0 = this.f10189c.f10675d;
        if (l0 == null) {
            this.f10189c.h().G().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            l0.T3(this.f10188b);
            this.f10189c.u().K();
            this.f10189c.N(l0, (AbstractSafeParcelable) null, this.f10188b);
            this.f10189c.f0();
        } catch (RemoteException e2) {
            this.f10189c.h().G().b("Failed to send app launch to the service", e2);
        }
    }
}
