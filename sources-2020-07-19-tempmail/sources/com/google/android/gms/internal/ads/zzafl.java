package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzafl extends zzgt implements zzafi {
    public zzafl() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static zzafi z6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        if (queryLocalInterface instanceof zzafi) {
            return (zzafi) queryLocalInterface;
        }
        return new zzafk(iBinder);
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
            if (r2 != r5) goto L_0x0026
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x000b
            r2 = 0
            goto L_0x001f
        L_0x000b:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzaft
            if (r0 == 0) goto L_0x0019
            r2 = r3
            com.google.android.gms.internal.ads.zzaft r2 = (com.google.android.gms.internal.ads.zzaft) r2
            goto L_0x001f
        L_0x0019:
            com.google.android.gms.internal.ads.zzafv r3 = new com.google.android.gms.internal.ads.zzafv
            r3.<init>(r2)
            r2 = r3
        L_0x001f:
            r1.y0(r2)
            r4.writeNoException()
            return r5
        L_0x0026:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafl.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
