package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzasc extends zzgt implements zzarz {
    public zzasc() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzase] */
    /* JADX WARNING: type inference failed for: r1v6, types: [com.google.android.gms.internal.ads.zzasg] */
    /* JADX WARNING: type inference failed for: r1v11, types: [com.google.android.gms.internal.ads.zzasg] */
    /* JADX WARNING: type inference failed for: r1v16, types: [com.google.android.gms.internal.ads.zzasg] */
    /* JADX WARNING: type inference failed for: r1v21, types: [com.google.android.gms.internal.ads.zzasg] */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r1v27 */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
        /*
            r3 = this;
            r7 = 1
            if (r4 == r7) goto L_0x00da
            r0 = 2
            r1 = 0
            if (r4 == r0) goto L_0x00b1
            r0 = 4
            java.lang.String r2 = "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener"
            if (r4 == r0) goto L_0x008a
            r0 = 5
            if (r4 == r0) goto L_0x0063
            r0 = 6
            if (r4 == r0) goto L_0x003b
            r0 = 7
            if (r4 == r0) goto L_0x0017
            r4 = 0
            return r4
        L_0x0017:
            java.lang.String r4 = r5.readString()
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0022
            goto L_0x0033
        L_0x0022:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzasg
            if (r1 == 0) goto L_0x002e
            r1 = r0
            com.google.android.gms.internal.ads.zzasg r1 = (com.google.android.gms.internal.ads.zzasg) r1
            goto L_0x0033
        L_0x002e:
            com.google.android.gms.internal.ads.zzasi r1 = new com.google.android.gms.internal.ads.zzasi
            r1.<init>(r5)
        L_0x0033:
            r3.r4(r4, r1)
            r6.writeNoException()
            goto L_0x00ec
        L_0x003b:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzasm> r4 = com.google.android.gms.internal.ads.zzasm.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzgw.b(r5, r4)
            com.google.android.gms.internal.ads.zzasm r4 = (com.google.android.gms.internal.ads.zzasm) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x004a
            goto L_0x005b
        L_0x004a:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzasg
            if (r1 == 0) goto L_0x0056
            r1 = r0
            com.google.android.gms.internal.ads.zzasg r1 = (com.google.android.gms.internal.ads.zzasg) r1
            goto L_0x005b
        L_0x0056:
            com.google.android.gms.internal.ads.zzasi r1 = new com.google.android.gms.internal.ads.zzasi
            r1.<init>(r5)
        L_0x005b:
            r3.P1(r4, r1)
            r6.writeNoException()
            goto L_0x00ec
        L_0x0063:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzasm> r4 = com.google.android.gms.internal.ads.zzasm.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzgw.b(r5, r4)
            com.google.android.gms.internal.ads.zzasm r4 = (com.google.android.gms.internal.ads.zzasm) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0072
            goto L_0x0083
        L_0x0072:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzasg
            if (r1 == 0) goto L_0x007e
            r1 = r0
            com.google.android.gms.internal.ads.zzasg r1 = (com.google.android.gms.internal.ads.zzasg) r1
            goto L_0x0083
        L_0x007e:
            com.google.android.gms.internal.ads.zzasi r1 = new com.google.android.gms.internal.ads.zzasi
            r1.<init>(r5)
        L_0x0083:
            r3.N0(r4, r1)
            r6.writeNoException()
            goto L_0x00ec
        L_0x008a:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzasm> r4 = com.google.android.gms.internal.ads.zzasm.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzgw.b(r5, r4)
            com.google.android.gms.internal.ads.zzasm r4 = (com.google.android.gms.internal.ads.zzasm) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0099
            goto L_0x00aa
        L_0x0099:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzasg
            if (r1 == 0) goto L_0x00a5
            r1 = r0
            com.google.android.gms.internal.ads.zzasg r1 = (com.google.android.gms.internal.ads.zzasg) r1
            goto L_0x00aa
        L_0x00a5:
            com.google.android.gms.internal.ads.zzasi r1 = new com.google.android.gms.internal.ads.zzasi
            r1.<init>(r5)
        L_0x00aa:
            r3.P6(r4, r1)
            r6.writeNoException()
            goto L_0x00ec
        L_0x00b1:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzart> r4 = com.google.android.gms.internal.ads.zzart.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzgw.b(r5, r4)
            com.google.android.gms.internal.ads.zzart r4 = (com.google.android.gms.internal.ads.zzart) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x00c0
            goto L_0x00d3
        L_0x00c0:
            java.lang.String r0 = "com.google.android.gms.ads.internal.request.IAdResponseListener"
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzase
            if (r1 == 0) goto L_0x00ce
            r1 = r0
            com.google.android.gms.internal.ads.zzase r1 = (com.google.android.gms.internal.ads.zzase) r1
            goto L_0x00d3
        L_0x00ce:
            com.google.android.gms.internal.ads.zzasd r1 = new com.google.android.gms.internal.ads.zzasd
            r1.<init>(r5)
        L_0x00d3:
            r3.C3(r4, r1)
            r6.writeNoException()
            goto L_0x00ec
        L_0x00da:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzart> r4 = com.google.android.gms.internal.ads.zzart.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzgw.b(r5, r4)
            com.google.android.gms.internal.ads.zzart r4 = (com.google.android.gms.internal.ads.zzart) r4
            com.google.android.gms.internal.ads.zzarv r4 = r3.k3(r4)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzgw.g(r6, r4)
        L_0x00ec:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasc.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
