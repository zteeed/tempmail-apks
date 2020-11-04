package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class xq implements zzduu<zzcyv> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzawq f5325a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzcxz f5326b;

    xq(zzcxz zzcxz, zzawq zzawq) {
        this.f5326b = zzcxz;
        this.f5325a = zzawq;
    }

    public final void a(Throwable th) {
        try {
            zzawq zzawq = this.f5325a;
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
                if (this.f5326b.f7691e.f6133d >= ((Integer) zzwg.e().c(zzaav.I3)).intValue()) {
                    if (zzcyv == null) {
                        this.f5325a.N((String) null, (String) null, (Bundle) null);
                        return;
                    } else {
                        this.f5325a.N(zzcyv.f7714a, zzcyv.f7715b, zzcyv.f7716c);
                        return;
                    }
                }
            }
            if (zzcyv == null) {
                this.f5325a.q6((String) null, (String) null);
            } else {
                this.f5325a.q6(zzcyv.f7714a, zzcyv.f7715b);
            }
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
