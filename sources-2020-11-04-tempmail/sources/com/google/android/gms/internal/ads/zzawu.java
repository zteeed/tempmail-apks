package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzawu extends zzgt implements zzawr {
    public zzawu() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzawr e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        if (queryLocalInterface instanceof zzawr) {
            return (zzawr) queryLocalInterface;
        }
        return new zzawt(iBinder);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            switch(r3) {
                case 1: goto L_0x008e;
                case 2: goto L_0x007f;
                case 3: goto L_0x0064;
                case 4: goto L_0x0051;
                case 5: goto L_0x0033;
                case 6: goto L_0x0015;
                case 7: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r3 = 0
            return r3
        L_0x0005:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzark> r3 = com.google.android.gms.internal.ads.zzark.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzgw.b(r4, r3)
            com.google.android.gms.internal.ads.zzark r3 = (com.google.android.gms.internal.ads.zzark) r3
            r2.C4(r3)
            r5.writeNoException()
            goto L_0x00c0
        L_0x0015:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            java.util.ArrayList r3 = r4.createTypedArrayList(r3)
            android.os.IBinder r6 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.H(r6)
            android.os.IBinder r4 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.zzaqz r4 = com.google.android.gms.internal.ads.zzarc.e7(r4)
            r2.N1(r3, r6, r4)
            r5.writeNoException()
            goto L_0x00c0
        L_0x0033:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            java.util.ArrayList r3 = r4.createTypedArrayList(r3)
            android.os.IBinder r6 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.H(r6)
            android.os.IBinder r4 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.zzaqz r4 = com.google.android.gms.internal.ads.zzarc.e7(r4)
            r2.Y0(r3, r6, r4)
            r5.writeNoException()
            goto L_0x00c0
        L_0x0051:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.H(r3)
            com.google.android.gms.dynamic.IObjectWrapper r3 = r2.q0(r3)
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzgw.c(r5, r3)
            goto L_0x00c0
        L_0x0064:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.H(r3)
            android.os.IBinder r4 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.H(r4)
            com.google.android.gms.dynamic.IObjectWrapper r3 = r2.Q2(r3, r4)
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzgw.c(r5, r3)
            goto L_0x00c0
        L_0x007f:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.H(r3)
            r2.X2(r3)
            r5.writeNoException()
            goto L_0x00c0
        L_0x008e:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.H(r3)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzawx> r6 = com.google.android.gms.internal.ads.zzawx.CREATOR
            android.os.Parcelable r6 = com.google.android.gms.internal.ads.zzgw.b(r4, r6)
            com.google.android.gms.internal.ads.zzawx r6 = (com.google.android.gms.internal.ads.zzawx) r6
            android.os.IBinder r4 = r4.readStrongBinder()
            if (r4 != 0) goto L_0x00a6
            r4 = 0
            goto L_0x00ba
        L_0x00a6:
            java.lang.String r0 = "com.google.android.gms.ads.internal.signals.ISignalCallback"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzawq
            if (r1 == 0) goto L_0x00b4
            r4 = r0
            com.google.android.gms.internal.ads.zzawq r4 = (com.google.android.gms.internal.ads.zzawq) r4
            goto L_0x00ba
        L_0x00b4:
            com.google.android.gms.internal.ads.zzaws r0 = new com.google.android.gms.internal.ads.zzaws
            r0.<init>(r4)
            r4 = r0
        L_0x00ba:
            r2.Z4(r3, r6, r4)
            r5.writeNoException()
        L_0x00c0:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawu.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
