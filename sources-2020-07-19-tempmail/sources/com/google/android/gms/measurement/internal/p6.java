package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class p6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f10177b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f10178c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzw f10179d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzn f10180e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzw f10181f;
    private final /* synthetic */ zzir g;

    p6(zzir zzir, boolean z, boolean z2, zzw zzw, zzn zzn, zzw zzw2) {
        this.g = zzir;
        this.f10177b = z;
        this.f10178c = z2;
        this.f10179d = zzw;
        this.f10180e = zzn;
        this.f10181f = zzw2;
    }

    public final void run() {
        zzem l0 = this.g.f10489d;
        if (l0 == null) {
            this.g.h().G().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f10177b) {
            this.g.N(l0, this.f10178c ? null : this.f10179d, this.f10180e);
        } else {
            try {
                if (TextUtils.isEmpty(this.f10181f.f10529b)) {
                    l0.l0(this.f10179d, this.f10180e);
                } else {
                    l0.c4(this.f10179d);
                }
            } catch (RemoteException e2) {
                this.g.h().G().b("Failed to send conditional user property to the service", e2);
            }
        }
        this.g.f0();
    }
}
