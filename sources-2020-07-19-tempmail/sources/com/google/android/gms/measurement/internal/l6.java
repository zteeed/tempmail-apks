package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzw;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class l6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzao f10105b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10106c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzw f10107d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzir f10108e;

    l6(zzir zzir, zzao zzao, String str, zzw zzw) {
        this.f10108e = zzir;
        this.f10105b = zzao;
        this.f10106c = str;
        this.f10107d = zzw;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            zzem l0 = this.f10108e.f10489d;
            if (l0 == null) {
                this.f10108e.h().G().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            bArr = l0.H5(this.f10105b, this.f10106c);
            this.f10108e.f0();
            this.f10108e.j().U(this.f10107d, bArr);
        } catch (RemoteException e2) {
            this.f10108e.h().G().b("Failed to send event to the service to bundle", e2);
        } finally {
            this.f10108e.j().U(this.f10107d, bArr);
        }
    }
}
