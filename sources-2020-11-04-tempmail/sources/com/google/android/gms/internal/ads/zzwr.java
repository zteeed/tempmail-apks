package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzwr extends zzgu implements zzwp {
    zzwr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public final void A6(zzxk zzxk) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzxk);
        V(7, B);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzwo F5() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.B()
            r1 = 1
            android.os.Parcel r0 = r4.H(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzwo
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.zzwo r1 = (com.google.android.gms.internal.ads.zzwo) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.zzwq r2 = new com.google.android.gms.internal.ads.zzwq
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwr.F5():com.google.android.gms.internal.ads.zzwo");
    }

    public final void H3(zzafi zzafi) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzafi);
        V(10, B);
    }

    public final void M4(zzaet zzaet) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzaet);
        V(3, B);
    }

    public final void O1(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, publisherAdViewOptions);
        V(9, B);
    }

    public final void U3(zzaeu zzaeu) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzaeu);
        V(4, B);
    }

    public final void X5(zzaiw zzaiw) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzaiw);
        V(14, B);
    }

    public final void k4(zzadj zzadj) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzadj);
        V(6, B);
    }

    public final void n6(zzafh zzafh, zzvh zzvh) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzafh);
        zzgw.d(B, zzvh);
        V(8, B);
    }

    public final void o6(zzaio zzaio) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzaio);
        V(13, B);
    }

    public final void p1(zzwj zzwj) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzwj);
        V(2, B);
    }

    public final void y5(String str, zzafa zzafa, zzaez zzaez) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        zzgw.c(B, zzafa);
        zzgw.c(B, zzaez);
        V(5, B);
    }
}
