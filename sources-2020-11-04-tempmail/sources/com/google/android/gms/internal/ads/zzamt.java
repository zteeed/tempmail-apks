package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzamt extends zzgu implements zzamr {
    zzamt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzams O6(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.B()
            r0.writeString(r4)
            r4 = 1
            android.os.Parcel r4 = r3.H(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzams
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.zzams r0 = (com.google.android.gms.internal.ads.zzams) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.zzamu r1 = new com.google.android.gms.internal.ads.zzamu
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamt.O6(java.lang.String):com.google.android.gms.internal.ads.zzams");
    }

    public final zzaox g3(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        Parcel H = H(3, B);
        zzaox e7 = zzaow.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    public final boolean s4(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        Parcel H = H(2, B);
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }
}
