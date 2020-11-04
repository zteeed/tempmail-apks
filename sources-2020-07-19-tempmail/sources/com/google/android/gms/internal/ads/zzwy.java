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
        P(2, y());
    }

    public final Bundle getAdMetadata() throws RemoteException {
        Parcel E = E(37, y());
        Bundle bundle = (Bundle) zzgw.b(E, Bundle.CREATOR);
        E.recycle();
        return bundle;
    }

    public final String getAdUnitId() throws RemoteException {
        Parcel E = E(31, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel E = E(18, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzyi getVideoController() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.y()
            r1 = 26
            android.os.Parcel r0 = r4.E(r1, r0)
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
        Parcel E = E(23, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final boolean isReady() throws RemoteException {
        Parcel E = E(3, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final void pause() throws RemoteException {
        P(5, y());
    }

    public final void resume() throws RemoteException {
        P(6, y());
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel y = y();
        zzgw.a(y, z);
        P(34, y);
    }

    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        Parcel y = y();
        zzgw.a(y, z);
        P(22, y);
    }

    public final void setUserId(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(25, y);
    }

    public final void showInterstitial() throws RemoteException {
        P(9, y());
    }

    public final void stopLoading() throws RemoteException {
        P(10, y());
    }

    public final boolean zza(zzve zzve) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzve);
        Parcel E = E(4, y);
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final void zzbo(String str) throws RemoteException {
        Parcel y = y();
        y.writeString(str);
        P(38, y);
    }

    public final IObjectWrapper zzkf() throws RemoteException {
        Parcel E = E(1, y());
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }

    public final void zzkg() throws RemoteException {
        P(11, y());
    }

    public final zzvh zzkh() throws RemoteException {
        Parcel E = E(12, y());
        zzvh zzvh = (zzvh) zzgw.b(E, zzvh.CREATOR);
        E.recycle();
        return zzvh;
    }

    public final String zzki() throws RemoteException {
        Parcel E = E(35, y());
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzyd zzkj() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.y()
            r1 = 41
            android.os.Parcel r0 = r4.E(r1, r0)
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
            android.os.Parcel r0 = r4.y()
            r1 = 32
            android.os.Parcel r0 = r4.E(r1, r0)
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
            android.os.Parcel r0 = r4.y()
            r1 = 33
            android.os.Parcel r0 = r4.E(r1, r0)
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
        Parcel y = y();
        zzgw.c(y, zzwj);
        P(7, y);
    }

    public final void zza(zzxe zzxe) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzxe);
        P(8, y);
    }

    public final void zza(zzvh zzvh) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzvh);
        P(13, y);
    }

    public final void zza(zzaqs zzaqs) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzaqs);
        P(14, y);
    }

    public final void zza(zzaqy zzaqy, String str) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzaqy);
        y.writeString(str);
        P(15, y);
    }

    public final void zza(zzabo zzabo) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzabo);
        P(19, y);
    }

    public final void zza(zzwi zzwi) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzwi);
        P(20, y);
    }

    public final void zza(zzxk zzxk) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzxk);
        P(21, y);
    }

    public final void zza(zzatq zzatq) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzatq);
        P(24, y);
    }

    public final void zza(zzaaa zzaaa) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzaaa);
        P(29, y);
    }

    public final void zza(zzyo zzyo) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzyo);
        P(30, y);
    }

    public final void zza(zzwz zzwz) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzwz);
        P(36, y);
    }

    public final void zza(zzvo zzvo) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzvo);
        P(39, y);
    }

    public final void zza(zzsg zzsg) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzsg);
        P(40, y);
    }

    public final void zza(zzyc zzyc) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzyc);
        P(42, y);
    }
}
