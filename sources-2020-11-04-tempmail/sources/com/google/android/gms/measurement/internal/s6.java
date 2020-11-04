package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzw;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class s6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10419b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10420c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f10421d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzn f10422e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzw f10423f;
    private final /* synthetic */ zzir g;

    s6(zzir zzir, String str, String str2, boolean z, zzn zzn, zzw zzw) {
        this.g = zzir;
        this.f10419b = str;
        this.f10420c = str2;
        this.f10421d = z;
        this.f10422e = zzn;
        this.f10423f = zzw;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            zzem l0 = this.g.f10675d;
            if (l0 == null) {
                this.g.h().G().c("Failed to get user properties; not connected to service", this.f10419b, this.f10420c);
                return;
            }
            bundle = zzkr.D(l0.P3(this.f10419b, this.f10420c, this.f10421d, this.f10422e));
            this.g.f0();
            this.g.j().Q(this.f10423f, bundle);
        } catch (RemoteException e2) {
            this.g.h().G().c("Failed to get user properties; remote exception", this.f10419b, e2);
        } finally {
            this.g.j().Q(this.f10423f, bundle);
        }
    }
}
