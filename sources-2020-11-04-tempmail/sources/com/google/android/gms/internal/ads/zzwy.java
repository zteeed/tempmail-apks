package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzwy extends zzgu implements zzww {
    zzwy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final void destroy() throws RemoteException {
        V(2, B());
    }

    public final Bundle getAdMetadata() throws RemoteException {
        Parcel H = H(37, B());
        Bundle bundle = (Bundle) zzgw.b(H, Bundle.CREATOR);
        H.recycle();
        return bundle;
    }

    public final String getAdUnitId() throws RemoteException {
        Parcel H = H(31, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel H = H(18, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzyi getVideoController() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.B()
            r1 = 26
            android.os.Parcel r0 = r4.H(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzyi
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzyi r1 = (com.google.android.gms.internal.ads.zzyi) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzyk r2 = new com.google.android.gms.internal.ads.zzyk
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwy.getVideoController():com.google.android.gms.internal.ads.zzyi");
    }

    public final boolean isLoading() throws RemoteException {
        Parcel H = H(23, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final boolean isReady() throws RemoteException {
        Parcel H = H(3, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final void pause() throws RemoteException {
        V(5, B());
    }

    public final void resume() throws RemoteException {
        V(6, B());
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel B = B();
        zzgw.a(B, z);
        V(34, B);
    }

    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        Parcel B = B();
        zzgw.a(B, z);
        V(22, B);
    }

    public final void setUserId(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(25, B);
    }

    public final void showInterstitial() throws RemoteException {
        V(9, B());
    }

    public final void stopLoading() throws RemoteException {
        V(10, B());
    }

    public final boolean zza(zzve zzve) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzve);
        Parcel H = H(4, B);
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final void zzbo(String str) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        V(38, B);
    }

    public final IObjectWrapper zzkf() throws RemoteException {
        Parcel H = H(1, B());
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final void zzkg() throws RemoteException {
        V(11, B());
    }

    public final zzvh zzkh() throws RemoteException {
        Parcel H = H(12, B());
        zzvh zzvh = (zzvh) zzgw.b(H, zzvh.CREATOR);
        H.recycle();
        return zzvh;
    }

    public final String zzki() throws RemoteException {
        Parcel H = H(35, B());
        String readString = H.readString();
        H.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzyd zzkj() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.B()
            r1 = 41
            android.os.Parcel r0 = r4.H(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzyd
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzyd r1 = (com.google.android.gms.internal.ads.zzyd) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzyf r2 = new com.google.android.gms.internal.ads.zzyf
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwy.zzkj():com.google.android.gms.internal.ads.zzyd");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzxe zzkk() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.B()
            r1 = 32
            android.os.Parcel r0 = r4.H(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzxe
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzxe r1 = (com.google.android.gms.internal.ads.zzxe) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzxg r2 = new com.google.android.gms.internal.ads.zzxg
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwy.zzkk():com.google.android.gms.internal.ads.zzxe");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzwj zzkl() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.B()
            r1 = 33
            android.os.Parcel r0 = r4.H(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzwj
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzwj r1 = (com.google.android.gms.internal.ads.zzwj) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzwl r2 = new com.google.android.gms.internal.ads.zzwl
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwy.zzkl():com.google.android.gms.internal.ads.zzwj");
    }

    public final void zza(zzwj zzwj) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzwj);
        V(7, B);
    }

    public final void zza(zzxe zzxe) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzxe);
        V(8, B);
    }

    public final void zza(zzvh zzvh) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzvh);
        V(13, B);
    }

    public final void zza(zzaqs zzaqs) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzaqs);
        V(14, B);
    }

    public final void zza(zzaqy zzaqy, String str) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzaqy);
        B.writeString(str);
        V(15, B);
    }

    public final void zza(zzabo zzabo) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzabo);
        V(19, B);
    }

    public final void zza(zzwi zzwi) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzwi);
        V(20, B);
    }

    public final void zza(zzxk zzxk) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzxk);
        V(21, B);
    }

    public final void zza(zzatq zzatq) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzatq);
        V(24, B);
    }

    public final void zza(zzaaa zzaaa) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzaaa);
        V(29, B);
    }

    public final void zza(zzyo zzyo) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzyo);
        V(30, B);
    }

    public final void zza(zzwz zzwz) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzwz);
        V(36, B);
    }

    public final void zza(zzvo zzvo) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzvo);
        V(39, B);
    }

    public final void zza(zzsg zzsg) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzsg);
        V(40, B);
    }

    public final void zza(zzyc zzyc) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzyc);
        V(42, B);
    }
}
