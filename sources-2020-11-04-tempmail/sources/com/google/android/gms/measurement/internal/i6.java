package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class i6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzij f10245b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzir f10246c;

    i6(zzir zzir, zzij zzij) {
        this.f10246c = zzir;
        this.f10245b = zzij;
    }

    public final void run() {
        zzem l0 = this.f10246c.f10675d;
        if (l0 == null) {
            this.f10246c.h().G().a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f10245b == null) {
                l0.a3(0, (String) null, (String) null, this.f10246c.f().getPackageName());
            } else {
                l0.a3(this.f10245b.f10671c, this.f10245b.f10669a, this.f10245b.f10670b, this.f10246c.f().getPackageName());
            }
            this.f10246c.f0();
        } catch (RemoteException e2) {
            this.f10246c.h().G().b("Failed to send current screen to the service", e2);
        }
    }
}
