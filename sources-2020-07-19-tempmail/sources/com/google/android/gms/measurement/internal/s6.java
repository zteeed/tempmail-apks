package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzw;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class s6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10233b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10234c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f10235d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzn f10236e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzw f10237f;
    private final /* synthetic */ zzir g;

    s6(zzir zzir, String str, String str2, boolean z, zzn zzn, zzw zzw) {
        this.g = zzir;
        this.f10233b = str;
        this.f10234c = str2;
        this.f10235d = z;
        this.f10236e = zzn;
        this.f10237f = zzw;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            zzem l0 = this.g.f10489d;
            if (l0 == null) {
                this.g.h().G().c("Failed to get user properties; not connected to service", this.f10233b, this.f10234c);
                return;
            }
            bundle = zzkr.D(l0.B3(this.f10233b, this.f10234c, this.f10235d, this.f10236e));
            this.g.f0();
            this.g.j().Q(this.f10237f, bundle);
        } catch (RemoteException e2) {
            this.g.h().G().c("Failed to get user properties; remote exception", this.f10233b, e2);
        } finally {
            this.g.j().Q(this.f10237f, bundle);
        }
    }
}
