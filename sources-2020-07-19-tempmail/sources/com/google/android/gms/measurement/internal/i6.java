package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class i6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzij f10059b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzir f10060c;

    i6(zzir zzir, zzij zzij) {
        this.f10060c = zzir;
        this.f10059b = zzij;
    }

    public final void run() {
        zzem l0 = this.f10060c.f10489d;
        if (l0 == null) {
            this.f10060c.h().G().a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f10059b == null) {
                l0.O2(0, (String) null, (String) null, this.f10060c.f().getPackageName());
            } else {
                l0.O2(this.f10059b.f10485c, this.f10059b.f10483a, this.f10059b.f10484b, this.f10060c.f().getPackageName());
            }
            this.f10060c.f0();
        } catch (RemoteException e2) {
            this.f10060c.h().G().b("Failed to send current screen to the service", e2);
        }
    }
}
