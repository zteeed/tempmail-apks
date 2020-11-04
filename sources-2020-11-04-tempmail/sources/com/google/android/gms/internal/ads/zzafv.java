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

    public final boolean A(Bundle bundle) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, bundle);
        Parcel H = H(16, B);
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final List D4() throws RemoteException {
        Parcel H = H(23, B());
        ArrayList f2 = zzgw.f(H);
        H.recycle();
        return f2;
    }

    public final void F(Bundle bundle) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, bundle);
        V(17, B);
    }

    public final void J() throws RemoteException {
        V(27, B());
    }

    public final void J6() throws RemoteException {
        V(28, B());
    }

    public final void N() throws RemoteException {
        V(22, B());
    }

    public final void R(zzxp zzxp) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzxp);
        V(26, B);
    }

    public final void c0(zzxt zzxt) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzxt);
        V(25, B);
    }

    public final void destroy() throws RemoteException {
        V(13, B());
    }

    public final String e() throws RemoteException {
        Parcel H = H(2, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final IObjectWrapper f() throws RemoteException {
        Parcel H = H(19, B());
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final void f0(zzafo zzafo) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzafo);
        V(21, B);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzadl g() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.B()
            r1 = 14
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafv.g():com.google.android.gms.internal.ads.zzadl");
    }

    public final Bundle getExtras() throws RemoteException {
        Parcel H = H(20, B());
        Bundle bundle = (Bundle) zzgw.b(H, Bundle.CREATOR);
        H.recycle();
        return bundle;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel H = H(12, B());
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
        Parcel H = H(6, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final String j() throws RemoteException {
        Parcel H = H(4, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final List k() throws RemoteException {
        Parcel H = H(3, B());
        ArrayList f2 = zzgw.f(H);
        H.recycle();
        return f2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzado l0() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.B()
            r1 = 29
            android.os.Parcel r0 = r4.H(r1, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafv.l0():com.google.android.gms.internal.ads.zzado");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzadt m() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.B()
            r1 = 5
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafv.m():com.google.android.gms.internal.ads.zzadt");
    }

    public final boolean m0() throws RemoteException {
        Parcel H = H(30, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final String n() throws RemoteException {
        Parcel H = H(10, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final IObjectWrapper o() throws RemoteException {
        Parcel H = H(18, B());
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final double p() throws RemoteException {
        Parcel H = H(8, B());
        double readDouble = H.readDouble();
        H.recycle();
        return readDouble;
    }

    public final boolean p2() throws RemoteException {
        Parcel H = H(24, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final String q() throws RemoteException {
        Parcel H = H(7, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final String r() throws RemoteException {
        Parcel H = H(9, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final void u(Bundle bundle) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, bundle);
        V(15, B);
    }

    public final void zza(zzyc zzyc) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzyc);
        V(32, B);
    }

    public final zzyd zzkj() throws RemoteException {
        Parcel H = H(31, B());
        zzyd e7 = zzyg.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }
}
