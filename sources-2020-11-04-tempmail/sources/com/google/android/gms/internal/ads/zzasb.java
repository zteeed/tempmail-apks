package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzasb extends zzgu implements zzarz {
    zzasb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final void C3(zzart zzart, zzase zzase) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzart);
        zzgw.c(B, zzase);
        V(2, B);
    }

    public final void N0(zzasm zzasm, zzasg zzasg) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzasm);
        zzgw.c(B, zzasg);
        V(5, B);
    }

    public final void P1(zzasm zzasm, zzasg zzasg) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzasm);
        zzgw.c(B, zzasg);
        V(6, B);
    }

    public final void P6(zzasm zzasm, zzasg zzasg) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzasm);
        zzgw.c(B, zzasg);
        V(4, B);
    }

    public final zzarv k3(zzart zzart) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzart);
        Parcel H = H(1, B);
        zzarv zzarv = (zzarv) zzgw.b(H, zzarv.CREATOR);
        H.recycle();
        return zzarv;
    }

    public final void r4(String str, zzasg zzasg) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        zzgw.c(B, zzasg);
        V(7, B);
    }
}
