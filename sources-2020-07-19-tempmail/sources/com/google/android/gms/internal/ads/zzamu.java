package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzamu extends zzgu implements zzams {
    zzamu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final void J3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(21, y);
    }

    public final IObjectWrapper K5() throws RemoteException {
        Parcel E = E(2, y());
        IObjectWrapper E2 = IObjectWrapper.Stub.E(E.readStrongBinder());
        E.recycle();
        return E2;
    }

    public final void L1(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.d(y, zzve);
        y.writeString(str);
        zzgw.c(y, zzamx);
        P(3, y);
    }

    public final void M3(IObjectWrapper iObjectWrapper, zzve zzve, String str, String str2, zzamx zzamx) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.d(y, zzve);
        y.writeString(str);
        y.writeString(str2);
        zzgw.c(y, zzamx);
        P(7, y);
    }

    public final void P2(IObjectWrapper iObjectWrapper, zzve zzve, String str, String str2, zzamx zzamx, zzadj zzadj, List<String> list) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.d(y, zzve);
        y.writeString(str);
        y.writeString(str2);
        zzgw.c(y, zzamx);
        zzgw.d(y, zzadj);
        y.writeStringList(list);
        P(14, y);
    }

    public final void P3(IObjectWrapper iObjectWrapper, zzvh zzvh, zzve zzve, String str, String str2, zzamx zzamx) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.d(y, zzvh);
        zzgw.d(y, zzve);
        y.writeString(str);
        y.writeString(str2);
        zzgw.c(y, zzamx);
        P(6, y);
    }

    public final void R2(IObjectWrapper iObjectWrapper, zzatx zzatx, List<String> list) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.c(y, zzatx);
        y.writeStringList(list);
        P(23, y);
    }

    public final void S4(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzatx zzatx, String str2) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.d(y, zzve);
        y.writeString(str);
        zzgw.c(y, zzatx);
        y.writeString(str2);
        P(10, y);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzanf U3() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.y()
            r1 = 16
            android.os.Parcel r0 = r4.E(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzanf
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzanf r1 = (com.google.android.gms.internal.ads.zzanf) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzanh r2 = new com.google.android.gms.internal.ads.zzanh
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamu.U3():com.google.android.gms.internal.ads.zzanf");
    }

    public final void U5(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.d(y, zzve);
        y.writeString(str);
        zzgw.c(y, zzamx);
        P(28, y);
    }

    public final void W5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        P(30, y);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzana X4() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.y()
            r1 = 15
            android.os.Parcel r0 = r4.E(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzana
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzana r1 = (com.google.android.gms.internal.ads.zzana) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzanc r2 = new com.google.android.gms.internal.ads.zzanc
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamu.X4():com.google.android.gms.internal.ads.zzana");
    }

    public final zzapl Y() throws RemoteException {
        Parcel E = E(34, y());
        zzapl zzapl = (zzapl) zzgw.b(E, zzapl.CREATOR);
        E.recycle();
        return zzapl;
    }

    public final void Z4(zzve zzve, String str) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzve);
        y.writeString(str);
        P(11, y);
    }

    public final zzapl a0() throws RemoteException {
        Parcel E = E(33, y());
        zzapl zzapl = (zzapl) zzgw.b(E, zzapl.CREATOR);
        E.recycle();
        return zzapl;
    }

    public final void destroy() throws RemoteException {
        P(5, y());
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzang g6() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.y()
            r1 = 27
            android.os.Parcel r0 = r4.E(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzang
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzang r1 = (com.google.android.gms.internal.ads.zzang) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzani r2 = new com.google.android.gms.internal.ads.zzani
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamu.g6():com.google.android.gms.internal.ads.zzang");
    }

    public final Bundle getInterstitialAdapterInfo() throws RemoteException {
        Parcel E = E(18, y());
        Bundle bundle = (Bundle) zzgw.b(E, Bundle.CREATOR);
        E.recycle();
        return bundle;
    }

    public final zzyi getVideoController() throws RemoteException {
        Parcel E = E(26, y());
        zzyi z6 = zzyh.z6(E.readStrongBinder());
        E.recycle();
        return z6;
    }

    public final boolean isInitialized() throws RemoteException {
        Parcel E = E(13, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final Bundle j2() throws RemoteException {
        Parcel E = E(19, y());
        Bundle bundle = (Bundle) zzgw.b(E, Bundle.CREATOR);
        E.recycle();
        return bundle;
    }

    public final void m1(IObjectWrapper iObjectWrapper, zzvh zzvh, zzve zzve, String str, zzamx zzamx) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.d(y, zzvh);
        zzgw.d(y, zzve);
        y.writeString(str);
        zzgw.c(y, zzamx);
        P(1, y);
    }

    public final void p4(zzve zzve, String str, String str2) throws RemoteException {
        Parcel y = y();
        zzgw.d(y, zzve);
        y.writeString(str);
        y.writeString(str2);
        P(20, y);
    }

    public final void pause() throws RemoteException {
        P(8, y());
    }

    public final boolean r1() throws RemoteException {
        Parcel E = E(22, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final void resume() throws RemoteException {
        P(9, y());
    }

    public final void s5(IObjectWrapper iObjectWrapper, zzaie zzaie, List<zzaim> list) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.c(y, zzaie);
        y.writeTypedList(list);
        P(31, y);
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel y = y();
        zzgw.a(y, z);
        P(25, y);
    }

    public final void showInterstitial() throws RemoteException {
        P(4, y());
    }

    public final void showVideo() throws RemoteException {
        P(12, y());
    }

    public final zzaep u0() throws RemoteException {
        Parcel E = E(24, y());
        zzaep z6 = zzaeo.z6(E.readStrongBinder());
        E.recycle();
        return z6;
    }

    public final void w6(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, iObjectWrapper);
        zzgw.d(y, zzve);
        y.writeString(str);
        zzgw.c(y, zzamx);
        P(32, y);
    }

    public final Bundle zztm() throws RemoteException {
        Parcel E = E(17, y());
        Bundle bundle = (Bundle) zzgw.b(E, Bundle.CREATOR);
        E.recycle();
        return bundle;
    }
}
