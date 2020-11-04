package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzaiz extends zzgt implements zzaiw {
    public zzaiz() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    public static zzaiw e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        if (queryLocalInterface instanceof zzaiw) {
            return (zzaiw) queryLocalInterface;
        }
        return new zzaiy(iBinder);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L_0x0010
            r0 = 2
            if (r2 == r0) goto L_0x0008
            r2 = 0
            return r2
        L_0x0008:
            int r2 = r3.readInt()
            r1.r6(r2)
            goto L_0x002f
        L_0x0010:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0018
            r2 = 0
            goto L_0x002c
        L_0x0018:
            java.lang.String r3 = "com.google.android.gms.ads.internal.instream.client.IInstreamAd"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzaiq
            if (r0 == 0) goto L_0x0026
            r2 = r3
            com.google.android.gms.internal.ads.zzaiq r2 = (com.google.android.gms.internal.ads.zzaiq) r2
            goto L_0x002c
        L_0x0026:
            com.google.android.gms.internal.ads.zzais r3 = new com.google.android.gms.internal.ads.zzais
            r3.<init>(r2)
            r2 = r3
        L_0x002c:
            r1.e4(r2)
        L_0x002f:
            r4.writeNoException()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiz.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
