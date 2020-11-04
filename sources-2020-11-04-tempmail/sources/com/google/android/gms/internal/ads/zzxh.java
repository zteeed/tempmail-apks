package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzxh extends zzgu implements zzxf {
    zzxh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzww zza(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.internal.ads.zzvh r3, java.lang.String r4, com.google.android.gms.internal.ads.zzamr r5, int r6) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.B()
            com.google.android.gms.internal.ads.zzgw.c(r0, r2)
            com.google.android.gms.internal.ads.zzgw.d(r0, r3)
            r0.writeString(r4)
            com.google.android.gms.internal.ads.zzgw.c(r0, r5)
            r0.writeInt(r6)
            r2 = 1
            android.os.Parcel r2 = r1.H(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x0020
            r3 = 0
            goto L_0x0034
        L_0x0020:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzww
            if (r5 == 0) goto L_0x002e
            r3 = r4
            com.google.android.gms.internal.ads.zzww r3 = (com.google.android.gms.internal.ads.zzww) r3
            goto L_0x0034
        L_0x002e:
            com.google.android.gms.internal.ads.zzwy r4 = new com.google.android.gms.internal.ads.zzwy
            r4.<init>(r3)
            r3 = r4
        L_0x0034:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxh.zza(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzvh, java.lang.String, com.google.android.gms.internal.ads.zzamr, int):com.google.android.gms.internal.ads.zzww");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzww zzb(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.internal.ads.zzvh r3, java.lang.String r4, com.google.android.gms.internal.ads.zzamr r5, int r6) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.B()
            com.google.android.gms.internal.ads.zzgw.c(r0, r2)
            com.google.android.gms.internal.ads.zzgw.d(r0, r3)
            r0.writeString(r4)
            com.google.android.gms.internal.ads.zzgw.c(r0, r5)
            r0.writeInt(r6)
            r2 = 2
            android.os.Parcel r2 = r1.H(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x0020
            r3 = 0
            goto L_0x0034
        L_0x0020:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzww
            if (r5 == 0) goto L_0x002e
            r3 = r4
            com.google.android.gms.internal.ads.zzww r3 = (com.google.android.gms.internal.ads.zzww) r3
            goto L_0x0034
        L_0x002e:
            com.google.android.gms.internal.ads.zzwy r4 = new com.google.android.gms.internal.ads.zzwy
            r4.<init>(r3)
            r3 = r4
        L_0x0034:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxh.zzb(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzvh, java.lang.String, com.google.android.gms.internal.ads.zzamr, int):com.google.android.gms.internal.ads.zzww");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzxm zzc(com.google.android.gms.dynamic.IObjectWrapper r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.B()
            com.google.android.gms.internal.ads.zzgw.c(r0, r4)
            r4 = 4
            android.os.Parcel r4 = r3.H(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzxm
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.zzxm r0 = (com.google.android.gms.internal.ads.zzxm) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.zzxo r1 = new com.google.android.gms.internal.ads.zzxo
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxh.zzc(com.google.android.gms.dynamic.IObjectWrapper):com.google.android.gms.internal.ads.zzxm");
    }

    public final zzaqt zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        Parcel H = H(7, B);
        zzaqt e7 = zzaqw.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzww zzc(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.internal.ads.zzvh r3, java.lang.String r4, com.google.android.gms.internal.ads.zzamr r5, int r6) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.B()
            com.google.android.gms.internal.ads.zzgw.c(r0, r2)
            com.google.android.gms.internal.ads.zzgw.d(r0, r3)
            r0.writeString(r4)
            com.google.android.gms.internal.ads.zzgw.c(r0, r5)
            r0.writeInt(r6)
            r2 = 13
            android.os.Parcel r2 = r1.H(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x0021
            r3 = 0
            goto L_0x0035
        L_0x0021:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzww
            if (r5 == 0) goto L_0x002f
            r3 = r4
            com.google.android.gms.internal.ads.zzww r3 = (com.google.android.gms.internal.ads.zzww) r3
            goto L_0x0035
        L_0x002f:
            com.google.android.gms.internal.ads.zzwy r4 = new com.google.android.gms.internal.ads.zzwy
            r4.<init>(r3)
            r3 = r4
        L_0x0035:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxh.zzc(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzvh, java.lang.String, com.google.android.gms.internal.ads.zzamr, int):com.google.android.gms.internal.ads.zzww");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzwp zza(com.google.android.gms.dynamic.IObjectWrapper r2, java.lang.String r3, com.google.android.gms.internal.ads.zzamr r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.B()
            com.google.android.gms.internal.ads.zzgw.c(r0, r2)
            r0.writeString(r3)
            com.google.android.gms.internal.ads.zzgw.c(r0, r4)
            r0.writeInt(r5)
            r2 = 3
            android.os.Parcel r2 = r1.H(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x001d
            r3 = 0
            goto L_0x0031
        L_0x001d:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzwp
            if (r5 == 0) goto L_0x002b
            r3 = r4
            com.google.android.gms.internal.ads.zzwp r3 = (com.google.android.gms.internal.ads.zzwp) r3
            goto L_0x0031
        L_0x002b:
            com.google.android.gms.internal.ads.zzwr r4 = new com.google.android.gms.internal.ads.zzwr
            r4.<init>(r3)
            r3 = r4
        L_0x0031:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxh.zza(com.google.android.gms.dynamic.IObjectWrapper, java.lang.String, com.google.android.gms.internal.ads.zzamr, int):com.google.android.gms.internal.ads.zzwp");
    }

    public final zzaqi zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        Parcel H = H(8, B);
        zzaqi zzag = zzaqh.zzag(H.readStrongBinder());
        H.recycle();
        return zzag;
    }

    public final zzaui zzb(IObjectWrapper iObjectWrapper, String str, zzamr zzamr, int i) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        B.writeString(str);
        zzgw.c(B, zzamr);
        B.writeInt(i);
        Parcel H = H(12, B);
        zzaui e7 = zzauh.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    public final zzadx zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, iObjectWrapper2);
        Parcel H = H(5, B);
        zzadx e7 = zzadw.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    public final zzawr zzb(IObjectWrapper iObjectWrapper, zzamr zzamr, int i) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, zzamr);
        B.writeInt(i);
        Parcel H = H(14, B);
        zzawr e7 = zzawu.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    public final zzatj zza(IObjectWrapper iObjectWrapper, zzamr zzamr, int i) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, zzamr);
        B.writeInt(i);
        Parcel H = H(6, B);
        zzatj e7 = zzatm.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzxm zza(com.google.android.gms.dynamic.IObjectWrapper r3, int r4) throws android.os.RemoteException {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.B()
            com.google.android.gms.internal.ads.zzgw.c(r0, r3)
            r0.writeInt(r4)
            r3 = 9
            android.os.Parcel r3 = r2.H(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0018
            r4 = 0
            goto L_0x002c
        L_0x0018:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzxm
            if (r1 == 0) goto L_0x0026
            r4 = r0
            com.google.android.gms.internal.ads.zzxm r4 = (com.google.android.gms.internal.ads.zzxm) r4
            goto L_0x002c
        L_0x0026:
            com.google.android.gms.internal.ads.zzxo r0 = new com.google.android.gms.internal.ads.zzxo
            r0.<init>(r4)
            r4 = r0
        L_0x002c:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxh.zza(com.google.android.gms.dynamic.IObjectWrapper, int):com.google.android.gms.internal.ads.zzxm");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzww zza(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.internal.ads.zzvh r3, java.lang.String r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.B()
            com.google.android.gms.internal.ads.zzgw.c(r0, r2)
            com.google.android.gms.internal.ads.zzgw.d(r0, r3)
            r0.writeString(r4)
            r0.writeInt(r5)
            r2 = 10
            android.os.Parcel r2 = r1.H(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x001e
            r3 = 0
            goto L_0x0032
        L_0x001e:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzww
            if (r5 == 0) goto L_0x002c
            r3 = r4
            com.google.android.gms.internal.ads.zzww r3 = (com.google.android.gms.internal.ads.zzww) r3
            goto L_0x0032
        L_0x002c:
            com.google.android.gms.internal.ads.zzwy r4 = new com.google.android.gms.internal.ads.zzwy
            r4.<init>(r3)
            r3 = r4
        L_0x0032:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxh.zza(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzvh, java.lang.String, int):com.google.android.gms.internal.ads.zzww");
    }

    public final zzaea zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, iObjectWrapper);
        zzgw.c(B, iObjectWrapper2);
        zzgw.c(B, iObjectWrapper3);
        Parcel H = H(11, B);
        zzaea e7 = zzaed.e7(H.readStrongBinder());
        H.recycle();
        return e7;
    }
}
