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

    public final void E2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(14, y);
    }

    public final IObjectWrapper N5() throws RemoteException {
        Parcel E = E(9, y());
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }

    public final String T3(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        Parcel E = E(1, y);
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzadt W4(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.y()
            r0.writeString(r4)
            r4 = 2
            android.os.Parcel r4 = r3.E(r4, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaer.W4(java.lang.String):com.google.android.gms.internal.ads.zzadt");
    }

    public final boolean b4() throws RemoteException {
        Parcel E = E(13, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final void destroy() throws RemoteException {
        P(8, y());
    }

    public final boolean e5() throws RemoteException {
        Parcel E = E(12, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final void g3() throws RemoteException {
        P(15, y());
    }

    public final List<String> getAvailableAssetNames() throws RemoteException {
        Parcel E = E(3, y());
        ArrayList<String> createStringArrayList = E.createStringArrayList();
        E.recycle();
        return createStringArrayList;
    }

    public final String getCustomTemplateId() throws RemoteException {
        Parcel E = E(4, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final zzyi getVideoController() throws RemoteException {
        Parcel E = E(7, y());
        zzyi z6 = zzyh.z6(E.readStrongBinder());
        E.recycle();
        return z6;
    }

    public final IObjectWrapper m() throws RemoteException {
        Parcel E = E(11, y());
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }

    public final void performClick(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(5, y);
    }

    public final boolean r3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        Parcel E = E(10, y);
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final void recordImpression() throws RemoteException {
        P(6, y());
    }
}
