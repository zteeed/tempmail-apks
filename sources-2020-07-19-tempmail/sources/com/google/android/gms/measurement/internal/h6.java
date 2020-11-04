package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class h6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f10041b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzn f10042c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzir f10043d;

    h6(zzir zzir, Bundle bundle, zzn zzn) {
        this.f10043d = zzir;
        this.f10041b = bundle;
        this.f10042c = zzn;
    }

    public final void run() {
        zzem l0 = this.f10043d.f10489d;
        if (l0 == null) {
            this.f10043d.h().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            l0.A5(this.f10041b, this.f10042c);
        } catch (RemoteException e2) {
            this.f10043d.h().G().b("Failed to send default event parameters to service", e2);
        }
    }
}
