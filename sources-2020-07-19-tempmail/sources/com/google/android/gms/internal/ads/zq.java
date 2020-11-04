package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import java.util.Collections;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zq implements zzduu<Uri> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaqz f5488a;

    zq(zzcxz zzcxz, zzaqz zzaqz) {
        this.f5488a = zzaqz;
    }

    public final void a(Throwable th) {
        try {
            zzaqz zzaqz = this.f5488a;
            String valueOf = String.valueOf(th.getMessage());
            zzaqz.onError(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final /* synthetic */ void onSuccess(@Nonnull Object obj) {
        try {
            this.f5488a.k3(Collections.singletonList((Uri) obj));
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
