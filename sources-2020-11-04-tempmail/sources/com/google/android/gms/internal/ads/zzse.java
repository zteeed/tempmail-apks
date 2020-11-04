package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzse extends zzgt implements zzsf {
    public zzse() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            r4 = 2
            if (r1 == r4) goto L_0x002b
            r4 = 3
            if (r1 == r4) goto L_0x0008
            r1 = 0
            return r1
        L_0x0008:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0010
            r1 = 0
            goto L_0x0024
        L_0x0010:
            java.lang.String r2 = "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzsl
            if (r4 == 0) goto L_0x001e
            r1 = r2
            com.google.android.gms.internal.ads.zzsl r1 = (com.google.android.gms.internal.ads.zzsl) r1
            goto L_0x0024
        L_0x001e:
            com.google.android.gms.internal.ads.zzsn r2 = new com.google.android.gms.internal.ads.zzsn
            r2.<init>(r1)
            r1 = r2
        L_0x0024:
            r0.w5(r1)
            r3.writeNoException()
            goto L_0x0035
        L_0x002b:
            com.google.android.gms.internal.ads.zzww r1 = r0.i5()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.c(r3, r1)
        L_0x0035:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzse.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
