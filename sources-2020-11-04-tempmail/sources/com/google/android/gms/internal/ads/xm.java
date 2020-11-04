package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class xm implements zzduu<ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzasg f5502a;

    xm(zzcoy zzcoy, zzasg zzasg) {
        this.f5502a = zzasg;
    }

    public final void a(Throwable th) {
        try {
            this.f5502a.G5(zzazi.u(th));
        } catch (RemoteException e2) {
            zzaxv.l("Service can't call client", e2);
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        try {
            this.f5502a.x0((ParcelFileDescriptor) obj);
        } catch (RemoteException e2) {
            zzaxv.l("Service can't call client", e2);
        }
    }
}
