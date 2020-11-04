package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzasb extends zzgu implements zzarz {
    zzasb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final void G0(zzasm zzasm, zzasg zzasg) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzasm);
        zzgw.c(y, zzasg);
        P(5, y);
    }

    public final void G1(zzasm zzasm, zzasg zzasg) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzasm);
        zzgw.c(y, zzasg);
        P(6, y);
    }

    public final void X3(String str, zzasg zzasg) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        zzgw.c(y, zzasg);
        P(7, y);
    }

    public final zzarv Y2(zzart zzart) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzart);
        Parcel E = E(1, y);
        zzarv zzarv = (zzarv) zzgw.b(E, zzarv.CREATOR);
        E.recycle();
        return zzarv;
    }

    public final void m3(zzart zzart, zzase zzase) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzart);
        zzgw.c(y, zzase);
        P(2, y);
    }

    public final void n6(zzasm zzasm, zzasg zzasg) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzasm);
        zzgw.c(y, zzasg);
        P(4, y);
    }
}
