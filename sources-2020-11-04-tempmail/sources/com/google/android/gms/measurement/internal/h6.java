package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class h6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f10227b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzn f10228c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzir f10229d;

    h6(zzir zzir, Bundle bundle, zzn zzn) {
        this.f10229d = zzir;
        this.f10227b = bundle;
        this.f10228c = zzn;
    }

    public final void run() {
        zzem l0 = this.f10229d.f10675d;
        if (l0 == null) {
            this.f10229d.h().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            l0.Y5(this.f10227b, this.f10228c);
        } catch (RemoteException e2) {
            this.f10229d.h().G().b("Failed to send default event parameters to service", e2);
        }
    }
}
