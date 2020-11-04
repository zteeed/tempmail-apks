package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzw;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class g6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f10021b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzw f10022c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzir f10023d;

    g6(zzir zzir, zzn zzn, zzw zzw) {
        this.f10023d = zzir;
        this.f10021b = zzn;
        this.f10022c = zzw;
    }

    public final void run() {
        try {
            zzem l0 = this.f10023d.f10489d;
            if (l0 == null) {
                this.f10023d.h().G().a("Failed to get app instance id");
                return;
            }
            String c2 = l0.c2(this.f10021b);
            if (c2 != null) {
                this.f10023d.q().N(c2);
                this.f10023d.k().l.b(c2);
            }
            this.f10023d.f0();
            this.f10023d.j().R(this.f10022c, c2);
        } catch (RemoteException e2) {
            this.f10023d.h().G().b("Failed to get app instance id", e2);
        } finally {
            this.f10023d.j().R(this.f10022c, (String) null);
        }
    }
}
