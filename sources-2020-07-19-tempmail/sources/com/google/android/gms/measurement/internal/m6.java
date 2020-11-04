package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class m6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f10125b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f10126c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzao f10127d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzn f10128e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f10129f;
    private final /* synthetic */ zzir g;

    m6(zzir zzir, boolean z, boolean z2, zzao zzao, zzn zzn, String str) {
        this.g = zzir;
        this.f10125b = z;
        this.f10126c = z2;
        this.f10127d = zzao;
        this.f10128e = zzn;
        this.f10129f = str;
    }

    public final void run() {
        zzem l0 = this.g.f10489d;
        if (l0 == null) {
            this.g.h().G().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f10125b) {
            this.g.N(l0, this.f10126c ? null : this.f10127d, this.f10128e);
        } else {
            try {
                if (TextUtils.isEmpty(this.f10129f)) {
                    l0.d4(this.f10127d, this.f10128e);
                } else {
                    l0.q4(this.f10127d, this.f10129f, this.g.h().P());
                }
            } catch (RemoteException e2) {
                this.g.h().G().b("Failed to send event to the service", e2);
            }
        }
        this.g.f0();
    }
}
