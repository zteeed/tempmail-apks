package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaer extends zzgu implements zzaep {
    zzaer(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public final boolean A5() throws RemoteException {
        Parcel H = H(12, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final boolean G3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        Parcel H = H(10, B);
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final void P2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(14, B);
    }

    public final void destroy() throws RemoteException {
        V(8, B());
    }

    public final List<String> getAvailableAssetNames() throws RemoteException {
        Parcel H = H(3, B());
        ArrayList<String> createStringArrayList = H.createStringArrayList();
        H.recycle();
        return createStringArrayList;
    }

    public final String getCustomTemplateId() throws RemoteException {
        Parcel H = H(4, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final zzyi getVideoController() throws RemoteException {
        Parcel H = H(7, B());
        zzyi e7 = zzyh.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    public final String l4(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        Parcel H = H(1, B);
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final IObjectWrapper m6() throws RemoteException {
        Parcel H = H(9, B());
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final IObjectWrapper o() throws RemoteException {
        Parcel H = H(11, B());
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final void performClick(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(5, B);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzadt r5(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.B()
            r0.writeString(r4)
            r4 = 2
            android.os.Parcel r4 = r3.H(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzadt
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.zzadt r0 = (com.google.android.gms.internal.ads.zzadt) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.zzadv r1 = new com.google.android.gms.internal.ads.zzadv
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaer.r5(java.lang.String):com.google.android.gms.internal.ads.zzadt");
    }

    public final void recordImpression() throws RemoteException {
        V(6, B());
    }

    public final boolean v4() throws RemoteException {
        Parcel H = H(13, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final void w3() throws RemoteException {
        V(15, B());
    }
}
