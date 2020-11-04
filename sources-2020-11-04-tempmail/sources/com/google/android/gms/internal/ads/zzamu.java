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

    public final zzaep A0() throws RemoteException {
        Parcel H = H(24, B());
        zzaep e7 = zzaeo.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzang I6() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.B()
            r1 = 27
            android.os.Parcel r0 = r4.H(r1, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamu.I6():com.google.android.gms.internal.ads.zzang");
    }

    public final void J4(zzve zzve, String str, String str2) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzve);
        B.writeString(str);
        B.writeString(str2);
        V(20, B);
    }

    public final void O5(IObjectWrapper iObjectWrapper, zzaie zzaie, List<zzaim> list) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, zzaie);
        B.writeTypedList(list);
        V(31, B);
    }

    public final void U1(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.d(B, zzve);
        B.writeString(str);
        zzgw.c(B, zzamx);
        V(3, B);
    }

    public final void X3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(21, B);
    }

    public final void a4(IObjectWrapper iObjectWrapper, zzve zzve, String str, String str2, zzamx zzamx) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.d(B, zzve);
        B.writeString(str);
        B.writeString(str2);
        zzgw.c(B, zzamx);
        V(7, B);
    }

    public final void a7(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.d(B, zzve);
        B.writeString(str);
        zzgw.c(B, zzamx);
        V(32, B);
    }

    public final void b3(IObjectWrapper iObjectWrapper, zzve zzve, String str, String str2, zzamx zzamx, zzadj zzadj, List<String> list) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.d(B, zzve);
        B.writeString(str);
        B.writeString(str2);
        zzgw.c(B, zzamx);
        zzgw.d(B, zzadj);
        B.writeStringList(list);
        V(14, B);
    }

    public final void d3(IObjectWrapper iObjectWrapper, zzatx zzatx, List<String> list) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, zzatx);
        B.writeStringList(list);
        V(23, B);
    }

    public final void destroy() throws RemoteException {
        V(5, B());
    }

    public final zzapl e0() throws RemoteException {
        Parcel H = H(34, B());
        zzapl zzapl = (zzapl) zzgw.b(H, zzapl.CREATOR);
        H.recycle();
        return zzapl;
    }

    public final zzapl g0() throws RemoteException {
        Parcel H = H(33, B());
        zzapl zzapl = (zzapl) zzgw.b(H, zzapl.CREATOR);
        H.recycle();
        return zzapl;
    }

    public final void g4(IObjectWrapper iObjectWrapper, zzvh zzvh, zzve zzve, String str, String str2, zzamx zzamx) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.d(B, zzvh);
        zzgw.d(B, zzve);
        B.writeString(str);
        B.writeString(str2);
        zzgw.c(B, zzamx);
        V(6, B);
    }

    public final Bundle getInterstitialAdapterInfo() throws RemoteException {
        Parcel H = H(18, B());
        Bundle bundle = (Bundle) zzgw.b(H, Bundle.CREATOR);
        H.recycle();
        return bundle;
    }

    public final zzyi getVideoController() throws RemoteException {
        Parcel H = H(26, B());
        zzyi e7 = zzyh.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    public final IObjectWrapper i6() throws RemoteException {
        Parcel H = H(2, B());
        IObjectWrapper H2 = IObjectWrapper.Stub.H(H.readStrongBinder());
        H.recycle();
        return H2;
    }

    public final boolean isInitialized() throws RemoteException {
        Parcel H = H(13, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzanf m4() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.B()
            r1 = 16
            android.os.Parcel r0 = r4.H(r1, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamu.m4():com.google.android.gms.internal.ads.zzanf");
    }

    public final void m5(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzatx zzatx, String str2) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.d(B, zzve);
        B.writeString(str);
        zzgw.c(B, zzatx);
        B.writeString(str2);
        V(10, B);
    }

    public final void pause() throws RemoteException {
        V(8, B());
    }

    public final void resume() throws RemoteException {
        V(9, B());
    }

    public final void s1(IObjectWrapper iObjectWrapper, zzvh zzvh, zzve zzve, String str, zzamx zzamx) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.d(B, zzvh);
        zzgw.d(B, zzve);
        B.writeString(str);
        zzgw.c(B, zzamx);
        V(1, B);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzana s5() throws android.os.RemoteException {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamu.s5():com.google.android.gms.internal.ads.zzana");
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel B = B();
        zzgw.a(B, z);
        V(25, B);
    }

    public final void showInterstitial() throws RemoteException {
        V(4, B());
    }

    public final void showVideo() throws RemoteException {
        V(12, B());
    }

    public final Bundle t2() throws RemoteException {
        Parcel H = H(19, B());
        Bundle bundle = (Bundle) zzgw.b(H, Bundle.CREATOR);
        H.recycle();
        return bundle;
    }

    public final void u5(zzve zzve, String str) throws RemoteException {
        Parcel B = B();
        zzgw.d(B, zzve);
        B.writeString(str);
        V(11, B);
    }

    public final void u6(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.d(B, zzve);
        B.writeString(str);
        zzgw.c(B, zzamx);
        V(28, B);
    }

    public final void w6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        V(30, B);
    }

    public final boolean z1() throws RemoteException {
        Parcel H = H(22, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final Bundle zztm() throws RemoteException {
        Parcel H = H(17, B());
        Bundle bundle = (Bundle) zzgw.b(H, Bundle.CREATOR);
        H.recycle();
        return bundle;
    }
}
