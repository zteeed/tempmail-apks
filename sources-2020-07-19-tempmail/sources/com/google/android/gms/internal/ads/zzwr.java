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

    public final void F1(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, publisherAdViewOptions);
        P(9, y);
    }

    public final void G3(zzaeu zzaeu) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzaeu);
        P(4, y);
    }

    public final void O5(zzafh zzafh, zzvh zzvh) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzafh);
        zzgw.d(y, zzvh);
        P(8, y);
    }

    public final void P5(zzaio zzaio) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzaio);
        P(13, y);
    }

    public final void S3(zzadj zzadj) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzadj);
        P(6, y);
    }

    public final void a6(zzxk zzxk) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzxk);
        P(7, y);
    }

    public final void c5(String str, zzafa zzafa, zzaez zzaez) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        zzgw.c(y, zzafa);
        zzgw.c(y, zzaez);
        P(5, y);
    }

    public final void j1(zzwj zzwj) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzwj);
        P(2, y);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzwo j5() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.y()
            r1 = 1
            android.os.Parcel r0 = r4.E(r1, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwr.j5():com.google.android.gms.internal.ads.zzwo");
    }

    public final void s3(zzafi zzafi) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzafi);
        P(10, y);
    }

    public final void s4(zzaet zzaet) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzaet);
        P(3, y);
    }

    public final void z5(zzaiw zzaiw) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzaiw);
        P(14, y);
    }
}
