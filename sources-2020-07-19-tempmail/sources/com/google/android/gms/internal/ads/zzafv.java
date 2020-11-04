package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzafv extends zzgu implements zzaft {
    zzafv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    public final void C(Bundle bundle) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, bundle);
        P(17, y);
    }

    public final void G() throws RemoteException {
        P(27, y());
    }

    public final void J() throws RemoteException {
        P(22, y());
    }

    public final void M(zzxp zzxp) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzxp);
        P(26, y);
    }

    public final void W(zzxt zzxt) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzxt);
        P(25, y);
    }

    public final void Z(zzafo zzafo) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzafo);
        P(21, y);
    }

    public final String d() throws RemoteException {
        Parcel E = E(2, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final void destroy() throws RemoteException {
        P(13, y());
    }

    public final IObjectWrapper e() throws RemoteException {
        Parcel E = E(19, y());
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzadl f() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.y()
            r1 = 14
            android.os.Parcel r0 = r4.E(r1, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafv.f():com.google.android.gms.internal.ads.zzadl");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzado f0() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.y()
            r1 = 29
            android.os.Parcel r0 = r4.E(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzado
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzado r1 = (com.google.android.gms.internal.ads.zzado) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzadq r2 = new com.google.android.gms.internal.ads.zzadq
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafv.f0():com.google.android.gms.internal.ads.zzado");
    }

    public final boolean f2() throws RemoteException {
        Parcel E = E(24, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final boolean g0() throws RemoteException {
        Parcel E = E(30, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final Bundle getExtras() throws RemoteException {
        Parcel E = E(20, y());
        Bundle bundle = (Bundle) zzgw.b(E, Bundle.CREATOR);
        E.recycle();
        return bundle;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel E = E(12, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final zzyi getVideoController() throws RemoteException {
        Parcel E = E(11, y());
        zzyi z6 = zzyh.z6(E.readStrongBinder());
        E.recycle();
        return z6;
    }

    public final String h() throws RemoteException {
        Parcel E = E(6, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final void h6() throws RemoteException {
        P(28, y());
    }

    public final String i() throws RemoteException {
        Parcel E = E(4, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final List j() throws RemoteException {
        Parcel E = E(3, y());
        ArrayList f2 = zzgw.f(E);
        E.recycle();
        return f2;
    }

    public final List j4() throws RemoteException {
        Parcel E = E(23, y());
        ArrayList f2 = zzgw.f(E);
        E.recycle();
        return f2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzadt k() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.y()
            r1 = 5
            android.os.Parcel r0 = r4.E(r1, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafv.k():com.google.android.gms.internal.ads.zzadt");
    }

    public final String l() throws RemoteException {
        Parcel E = E(10, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final IObjectWrapper m() throws RemoteException {
        Parcel E = E(18, y());
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }

    public final double n() throws RemoteException {
        Parcel E = E(8, y());
        double readDouble = E.readDouble();
        E.recycle();
        return readDouble;
    }

    public final String o() throws RemoteException {
        Parcel E = E(7, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final String p() throws RemoteException {
        Parcel E = E(9, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final void s(Bundle bundle) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, bundle);
        P(15, y);
    }

    public final boolean x(Bundle bundle) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, bundle);
        Parcel E = E(16, y);
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final void zza(zzyc zzyc) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzyc);
        P(32, y);
    }

    public final zzyd zzkj() throws RemoteException {
        Parcel E = E(31, y());
        zzyd z6 = zzyg.z6(E.readStrongBinder());
        E.recycle();
        return z6;
    }
}
