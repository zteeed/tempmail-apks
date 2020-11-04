package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaen extends zzgu implements zzael {
    zzaen(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    public final boolean A(Bundle bundle) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, bundle);
        Parcel H = H(13, B);
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final void F(Bundle bundle) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, bundle);
        V(14, B);
    }

    public final void destroy() throws RemoteException {
        V(10, B());
    }

    public final String e() throws RemoteException {
        Parcel H = H(3, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final IObjectWrapper f() throws RemoteException {
        Parcel H = H(16, B());
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzadl g() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.B()
            r1 = 15
            android.os.Parcel r0 = r4.H(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzadl
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzadl r1 = (com.google.android.gms.internal.ads.zzadl) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzadn r2 = new com.google.android.gms.internal.ads.zzadn
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaen.g():com.google.android.gms.internal.ads.zzadl");
    }

    public final Bundle getExtras() throws RemoteException {
        Parcel H = H(9, B());
        Bundle bundle = (Bundle) zzgw.b(H, Bundle.CREATOR);
        H.recycle();
        return bundle;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel H = H(17, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final zzyi getVideoController() throws RemoteException {
        Parcel H = H(11, B());
        zzyi e7 = zzyh.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    public final String i() throws RemoteException {
        Parcel H = H(7, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final String j() throws RemoteException {
        Parcel H = H(5, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final List k() throws RemoteException {
        Parcel H = H(4, B());
        ArrayList f2 = zzgw.f(H);
        H.recycle();
        return f2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzadt n0() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.B()
            r1 = 6
            android.os.Parcel r0 = r4.H(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzadt
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.zzadt r1 = (com.google.android.gms.internal.ads.zzadt) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.zzadv r2 = new com.google.android.gms.internal.ads.zzadv
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaen.n0():com.google.android.gms.internal.ads.zzadt");
    }

    public final IObjectWrapper o() throws RemoteException {
        Parcel H = H(2, B());
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final String q() throws RemoteException {
        Parcel H = H(8, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final void u(Bundle bundle) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, bundle);
        V(12, B);
    }
}
