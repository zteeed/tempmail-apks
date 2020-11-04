package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class p6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f10363b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f10364c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzw f10365d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzn f10366e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzw f10367f;
    private final /* synthetic */ zzir g;

    p6(zzir zzir, boolean z, boolean z2, zzw zzw, zzn zzn, zzw zzw2) {
        this.g = zzir;
        this.f10363b = z;
        this.f10364c = z2;
        this.f10365d = zzw;
        this.f10366e = zzn;
        this.f10367f = zzw2;
    }

    public final void run() {
        zzem l0 = this.g.f10675d;
        if (l0 == null) {
            this.g.h().G().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f10363b) {
            this.g.N(l0, this.f10364c ? null : this.f10365d, this.f10366e);
        } else {
            try {
                if (TextUtils.isEmpty(this.f10367f.f10715b)) {
                    l0.r0(this.f10365d, this.f10366e);
                } else {
                    l0.w4(this.f10365d);
                }
            } catch (RemoteException e2) {
                this.g.h().G().b("Failed to send conditional user property to the service", e2);
            }
        }
        this.g.f0();
    }
}
