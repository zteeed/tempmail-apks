package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzauh extends zzgt implements zzaui {
    public zzauh() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzaui e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof zzaui) {
            return (zzaui) queryLocalInterface;
        }
        return new zzauk(iBinder);
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzauq] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.zzauj] */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.google.android.gms.internal.ads.zzaur] */
    /* JADX WARNING: type inference failed for: r0v14, types: [com.google.android.gms.internal.ads.zzauq] */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            java.lang.String r5 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback"
            r0 = 0
            switch(r2) {
                case 1: goto L_0x0100;
                case 2: goto L_0x00df;
                case 3: goto L_0x00d4;
                case 4: goto L_0x00c9;
                case 5: goto L_0x00ba;
                case 6: goto L_0x0098;
                case 7: goto L_0x0088;
                case 8: goto L_0x0078;
                case 9: goto L_0x006c;
                case 10: goto L_0x0058;
                case 11: goto L_0x004c;
                case 12: goto L_0x0040;
                case 13: goto L_0x0030;
                case 14: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r2 = 0
            return r2
        L_0x0008:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzve> r2 = com.google.android.gms.internal.ads.zzve.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzgw.b(r3, r2)
            com.google.android.gms.internal.ads.zzve r2 = (com.google.android.gms.internal.ads.zzve) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x0017
            goto L_0x0028
        L_0x0017:
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzauq
            if (r0 == 0) goto L_0x0023
            r0 = r5
            com.google.android.gms.internal.ads.zzauq r0 = (com.google.android.gms.internal.ads.zzauq) r0
            goto L_0x0028
        L_0x0023:
            com.google.android.gms.internal.ads.zzaus r0 = new com.google.android.gms.internal.ads.zzaus
            r0.<init>(r3)
        L_0x0028:
            r1.k1(r2, r0)
            r4.writeNoException()
            goto L_0x0126
        L_0x0030:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzyc r2 = com.google.android.gms.internal.ads.zzyb.e7(r2)
            r1.zza(r2)
            r4.writeNoException()
            goto L_0x0126
        L_0x0040:
            com.google.android.gms.internal.ads.zzyd r2 = r1.zzkj()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzgw.c(r4, r2)
            goto L_0x0126
        L_0x004c:
            com.google.android.gms.internal.ads.zzaud r2 = r1.K2()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzgw.c(r4, r2)
            goto L_0x0126
        L_0x0058:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.H(r2)
            boolean r3 = com.google.android.gms.internal.ads.zzgw.e(r3)
            r1.b7(r2, r3)
            r4.writeNoException()
            goto L_0x0126
        L_0x006c:
            android.os.Bundle r2 = r1.getAdMetadata()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzgw.g(r4, r2)
            goto L_0x0126
        L_0x0078:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzxx r2 = com.google.android.gms.internal.ads.zzya.e7(r2)
            r1.e1(r2)
            r4.writeNoException()
            goto L_0x0126
        L_0x0088:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzauz> r2 = com.google.android.gms.internal.ads.zzauz.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzgw.b(r3, r2)
            com.google.android.gms.internal.ads.zzauz r2 = (com.google.android.gms.internal.ads.zzauz) r2
            r1.Z5(r2)
            r4.writeNoException()
            goto L_0x0126
        L_0x0098:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x009f
            goto L_0x00b2
        L_0x009f:
            java.lang.String r3 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.zzaur
            if (r5 == 0) goto L_0x00ad
            r0 = r3
            com.google.android.gms.internal.ads.zzaur r0 = (com.google.android.gms.internal.ads.zzaur) r0
            goto L_0x00b2
        L_0x00ad:
            com.google.android.gms.internal.ads.zzauu r0 = new com.google.android.gms.internal.ads.zzauu
            r0.<init>(r2)
        L_0x00b2:
            r1.q6(r0)
            r4.writeNoException()
            goto L_0x0126
        L_0x00ba:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.H(r2)
            r1.l2(r2)
            r4.writeNoException()
            goto L_0x0126
        L_0x00c9:
            java.lang.String r2 = r1.getMediationAdapterClassName()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x0126
        L_0x00d4:
            boolean r2 = r1.isLoaded()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzgw.a(r4, r2)
            goto L_0x0126
        L_0x00df:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x00e6
            goto L_0x00f9
        L_0x00e6:
            java.lang.String r3 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.zzauj
            if (r5 == 0) goto L_0x00f4
            r0 = r3
            com.google.android.gms.internal.ads.zzauj r0 = (com.google.android.gms.internal.ads.zzauj) r0
            goto L_0x00f9
        L_0x00f4:
            com.google.android.gms.internal.ads.zzaul r0 = new com.google.android.gms.internal.ads.zzaul
            r0.<init>(r2)
        L_0x00f9:
            r1.e5(r0)
            r4.writeNoException()
            goto L_0x0126
        L_0x0100:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzve> r2 = com.google.android.gms.internal.ads.zzve.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzgw.b(r3, r2)
            com.google.android.gms.internal.ads.zzve r2 = (com.google.android.gms.internal.ads.zzve) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x010f
            goto L_0x0120
        L_0x010f:
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzauq
            if (r0 == 0) goto L_0x011b
            r0 = r5
            com.google.android.gms.internal.ads.zzauq r0 = (com.google.android.gms.internal.ads.zzauq) r0
            goto L_0x0120
        L_0x011b:
            com.google.android.gms.internal.ads.zzaus r0 = new com.google.android.gms.internal.ads.zzaus
            r0.<init>(r3)
        L_0x0120:
            r1.o0(r2, r0)
            r4.writeNoException()
        L_0x0126:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzauh.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
