package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class xq implements zzduu<zzcyv> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzawq f5508a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzcxz f5509b;

    xq(zzcxz zzcxz, zzawq zzawq) {
        this.f5509b = zzcxz;
        this.f5508a = zzawq;
    }

    public final void a(Throwable th) {
        try {
            zzawq zzawq = this.f5508a;
            String valueOf = String.valueOf(th.getMessage());
            zzawq.onError(valueOf.length() != 0 ? "Internal error. ".concat(valueOf) : new String("Internal error. "));
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzcyv zzcyv = (zzcyv) obj;
        try {
            if (((Boolean) zzwg.e().c(zzaav.G3)).booleanValue()) {
                if (this.f5509b.f7874e.f6316d >= ((Integer) zzwg.e().c(zzaav.I3)).intValue()) {
                    if (zzcyv == null) {
                        this.f5508a.T((String) null, (String) null, (Bundle) null);
                        return;
                    } else {
                        this.f5508a.T(zzcyv.f7897a, zzcyv.f7898b, zzcyv.f7899c);
                        return;
                    }
                }
            }
            if (zzcyv == null) {
                this.f5508a.U6((String) null, (String) null);
            } else {
                this.f5508a.U6(zzcyv.f7897a, zzcyv.f7898b);
            }
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
