package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ar implements zzduu<ArrayList<Uri>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaqz f3583a;

    ar(zzcxz zzcxz, zzaqz zzaqz) {
        this.f3583a = zzaqz;
    }

    public final void a(Throwable th) {
        try {
            zzaqz zzaqz = this.f3583a;
            String valueOf = String.valueOf(th.getMessage());
            zzaqz.onError(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }

    public final /* synthetic */ void onSuccess(@Nonnull Object obj) {
        try {
            this.f3583a.A3((ArrayList) obj);
        } catch (RemoteException e2) {
            zzbba.c("", e2);
        }
    }
}
