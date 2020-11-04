package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class f6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f10002b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzir f10003c;

    f6(zzir zzir, zzn zzn) {
        this.f10003c = zzir;
        this.f10002b = zzn;
    }

    public final void run() {
        zzem l0 = this.f10003c.f10489d;
        if (l0 == null) {
            this.f10003c.h().G().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            l0.F3(this.f10002b);
            this.f10003c.u().K();
            this.f10003c.N(l0, (AbstractSafeParcelable) null, this.f10002b);
            this.f10003c.f0();
        } catch (RemoteException e2) {
            this.f10003c.h().G().b("Failed to send app launch to the service", e2);
        }
    }
}
