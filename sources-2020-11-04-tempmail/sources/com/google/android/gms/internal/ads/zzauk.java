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

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaud K2() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.B()
            r1 = 11
            android.os.Parcel r0 = r4.H(r1, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzauk.K2():com.google.android.gms.internal.ads.zzaud");
    }

    public final void Z5(zzauz zzauz) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzauz);
        V(7, B);
    }

    public final void b7(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.a(B, z);
        V(10, B);
    }

    public final void e1(zzxx zzxx) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzxx);
        V(8, B);
    }

    public final void e5(zzauj zzauj) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzauj);
        V(2, B);
    }

    public final Bundle getAdMetadata() throws RemoteException {
        Parcel H = H(9, B());
        Bundle bundle = (Bundle) zzgw.b(H, Bundle.CREATOR);
        H.recycle();
        return bundle;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel H = H(4, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final boolean isLoaded() throws RemoteException {
        Parcel H = H(3, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final void k1(zzve zzve, zzauq zzauq) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzve);
        zzgw.c(B, zzauq);
        V(14, B);
    }

    public final void l2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(5, B);
    }

    public final void o0(zzve zzve, zzauq zzauq) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzve);
        zzgw.c(B, zzauq);
        V(1, B);
    }

    public final void q6(zzaur zzaur) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzaur);
        V(6, B);
    }

    public final void zza(zzyc zzyc) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzyc);
        V(13, B);
    }

    public final zzyd zzkj() throws RemoteException {
        Parcel H = H(12, B());
        zzyd e7 = zzyg.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }
}
