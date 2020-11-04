package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzw;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class g6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f10207b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzw f10208c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzir f10209d;

    g6(zzir zzir, zzn zzn, zzw zzw) {
        this.f10209d = zzir;
        this.f10207b = zzn;
        this.f10208c = zzw;
    }

    public final void run() {
        try {
            zzem l0 = this.f10209d.f10675d;
            if (l0 == null) {
                this.f10209d.h().G().a("Failed to get app instance id");
                return;
            }
            String m2 = l0.m2(this.f10207b);
            if (m2 != null) {
                this.f10209d.q().N(m2);
                this.f10209d.k().l.b(m2);
            }
            this.f10209d.f0();
            this.f10209d.j().R(this.f10208c, m2);
        } catch (RemoteException e2) {
            this.f10209d.h().G().b("Failed to get app instance id", e2);
        } finally {
            this.f10209d.j().R(this.f10208c, (String) null);
        }
    }
}
