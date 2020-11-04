package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzw;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class l6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzao f10291b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10292c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzw f10293d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzir f10294e;

    l6(zzir zzir, zzao zzao, String str, zzw zzw) {
        this.f10294e = zzir;
        this.f10291b = zzao;
        this.f10292c = str;
        this.f10293d = zzw;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            zzem l0 = this.f10294e.f10675d;
            if (l0 == null) {
                this.f10294e.h().G().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            bArr = l0.f6(this.f10291b, this.f10292c);
            this.f10294e.f0();
            this.f10294e.j().U(this.f10293d, bArr);
        } catch (RemoteException e2) {
            this.f10294e.h().G().b("Failed to send event to the service to bundle", e2);
        } finally {
            this.f10294e.j().U(this.f10293d, bArr);
        }
    }
}
