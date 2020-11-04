package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzws extends zzgt implements zzwp {
    public zzws() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.zzwj] */
    /* JADX WARNING: type inference failed for: r4v9, types: [com.google.android.gms.internal.ads.zzxk] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x00e9;
                case 2: goto L_0x00c8;
                case 3: goto L_0x00b9;
                case 4: goto L_0x00aa;
                case 5: goto L_0x008f;
                case 6: goto L_0x0080;
                case 7: goto L_0x005e;
                case 8: goto L_0x0046;
                case 9: goto L_0x0036;
                case 10: goto L_0x0026;
                case 11: goto L_0x0004;
                case 12: goto L_0x0004;
                case 13: goto L_0x0016;
                case 14: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaiw r1 = com.google.android.gms.internal.ads.zzaiz.e7(r1)
            r0.X5(r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x0016:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzaio> r1 = com.google.android.gms.internal.ads.zzaio.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.b(r2, r1)
            com.google.android.gms.internal.ads.zzaio r1 = (com.google.android.gms.internal.ads.zzaio) r1
            r0.o6(r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x0026:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzafi r1 = com.google.android.gms.internal.ads.zzafl.e7(r1)
            r0.H3(r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x0036:
            android.os.Parcelable$Creator<com.google.android.gms.ads.formats.PublisherAdViewOptions> r1 = com.google.android.gms.ads.formats.PublisherAdViewOptions.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.b(r2, r1)
            com.google.android.gms.ads.formats.PublisherAdViewOptions r1 = (com.google.android.gms.ads.formats.PublisherAdViewOptions) r1
            r0.O1(r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x0046:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzafh r1 = com.google.android.gms.internal.ads.zzafg.e7(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvh> r4 = com.google.android.gms.internal.ads.zzvh.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzgw.b(r2, r4)
            com.google.android.gms.internal.ads.zzvh r2 = (com.google.android.gms.internal.ads.zzvh) r2
            r0.n6(r1, r2)
            r3.writeNoException()
            goto L_0x00f3
        L_0x005e:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0065
            goto L_0x0078
        L_0x0065:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzxk
            if (r4 == 0) goto L_0x0073
            r4 = r2
            com.google.android.gms.internal.ads.zzxk r4 = (com.google.android.gms.internal.ads.zzxk) r4
            goto L_0x0078
        L_0x0073:
            com.google.android.gms.internal.ads.zzxj r4 = new com.google.android.gms.internal.ads.zzxj
            r4.<init>(r1)
        L_0x0078:
            r0.A6(r4)
            r3.writeNoException()
            goto L_0x00f3
        L_0x0080:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzadj> r1 = com.google.android.gms.internal.ads.zzadj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.b(r2, r1)
            com.google.android.gms.internal.ads.zzadj r1 = (com.google.android.gms.internal.ads.zzadj) r1
            r0.k4(r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x008f:
            java.lang.String r1 = r2.readString()
            android.os.IBinder r4 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzafa r4 = com.google.android.gms.internal.ads.zzafd.e7(r4)
            android.os.IBinder r2 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaez r2 = com.google.android.gms.internal.ads.zzaey.e7(r2)
            r0.y5(r1, r4, r2)
            r3.writeNoException()
            goto L_0x00f3
        L_0x00aa:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaeu r1 = com.google.android.gms.internal.ads.zzaex.e7(r1)
            r0.U3(r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x00b9:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaet r1 = com.google.android.gms.internal.ads.zzaes.e7(r1)
            r0.M4(r1)
            r3.writeNoException()
            goto L_0x00f3
        L_0x00c8:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00cf
            goto L_0x00e2
        L_0x00cf:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzwj
            if (r4 == 0) goto L_0x00dd
            r4 = r2
            com.google.android.gms.internal.ads.zzwj r4 = (com.google.android.gms.internal.ads.zzwj) r4
            goto L_0x00e2
        L_0x00dd:
            com.google.android.gms.internal.ads.zzwl r4 = new com.google.android.gms.internal.ads.zzwl
            r4.<init>(r1)
        L_0x00e2:
            r0.p1(r4)
            r3.writeNoException()
            goto L_0x00f3
        L_0x00e9:
            com.google.android.gms.internal.ads.zzwo r1 = r0.F5()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.c(r3, r1)
        L_0x00f3:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzws.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
