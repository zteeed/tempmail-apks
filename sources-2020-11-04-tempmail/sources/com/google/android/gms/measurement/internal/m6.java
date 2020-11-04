package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class m6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f10311b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f10312c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzao f10313d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzn f10314e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f10315f;
    private final /* synthetic */ zzir g;

    m6(zzir zzir, boolean z, boolean z2, zzao zzao, zzn zzn, String str) {
        this.g = zzir;
        this.f10311b = z;
        this.f10312c = z2;
        this.f10313d = zzao;
        this.f10314e = zzn;
        this.f10315f = str;
    }

    public final void run() {
        zzem l0 = this.g.f10675d;
        if (l0 == null) {
            this.g.h().G().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f10311b) {
            this.g.N(l0, this.f10312c ? null : this.f10313d, this.f10314e);
        } else {
            try {
                if (TextUtils.isEmpty(this.f10315f)) {
                    l0.x4(this.f10313d, this.f10314e);
                } else {
                    l0.K4(this.f10313d, this.f10315f, this.g.h().P());
                }
            } catch (RemoteException e2) {
                this.g.h().G().b("Failed to send event to the service", e2);
            }
        }
        this.g.f0();
    }
}
