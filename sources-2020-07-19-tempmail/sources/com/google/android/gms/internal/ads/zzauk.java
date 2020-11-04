package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzauk extends zzgu implements zzaui {
    zzauk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public final void B5(zzauz zzauz) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzauz);
        P(7, y);
    }

    public final void K4(zzauj zzauj) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzauj);
        P(2, y);
    }

    public final void R5(zzaur zzaur) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzaur);
        P(6, y);
    }

    public final void Y0(zzxx zzxx) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzxx);
        P(8, y);
    }

    public final void b2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(5, y);
    }

    public final void e1(zzve zzve, zzauq zzauq) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzve);
        zzgw.c(y, zzauq);
        P(14, y);
    }

    public final Bundle getAdMetadata() throws RemoteException {
        Parcel E = E(9, y());
        Bundle bundle = (Bundle) zzgw.b(E, Bundle.CREATOR);
        E.recycle();
        return bundle;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel E = E(4, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final void i0(zzve zzve, zzauq zzauq) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzve);
        zzgw.c(y, zzauq);
        P(1, y);
    }

    public final boolean isLoaded() throws RemoteException {
        Parcel E = E(3, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaud x2() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.y()
            r1 = 11
            android.os.Parcel r0 = r4.E(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.rewarded.client.IRewardItem"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzaud
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzaud r1 = (com.google.android.gms.internal.ads.zzaud) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzauf r2 = new com.google.android.gms.internal.ads.zzauf
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzauk.x2():com.google.android.gms.internal.ads.zzaud");
    }

    public final void x6(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.a(y, z);
        P(10, y);
    }

    public final void zza(zzyc zzyc) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzyc);
        P(13, y);
    }

    public final zzyd zzkj() throws RemoteException {
        Parcel E = E(12, y());
        zzyd z6 = zzyg.z6(E.readStrongBinder());
        E.recycle();
        return z6;
    }
}
