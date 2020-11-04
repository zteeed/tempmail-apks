package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public abstract class zzwv extends zzgt implements zzww {
    public zzwv() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzww zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface instanceof zzww) {
            return (zzww) queryLocalInterface;
        }
        return new zzwy(iBinder);
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.zzwj] */
    /* JADX WARNING: type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.zzxe] */
    /* JADX WARNING: type inference failed for: r4v12, types: [com.google.android.gms.internal.ads.zzwi] */
    /* JADX WARNING: type inference failed for: r4v17, types: [com.google.android.gms.internal.ads.zzxk] */
    /* JADX WARNING: type inference failed for: r4v22, types: [com.google.android.gms.internal.ads.zzwz] */
    /* JADX WARNING: type inference failed for: r4v27, types: [com.google.android.gms.internal.ads.zzyc] */
    /* JADX WARNING: type inference failed for: r4v32 */
    /* JADX WARNING: type inference failed for: r4v33 */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r4v35 */
    /* JADX WARNING: type inference failed for: r4v36 */
    /* JADX WARNING: type inference failed for: r4v37 */
    /* JADX WARNING: type inference failed for: r4v38 */
    /* JADX WARNING: type inference failed for: r4v39 */
    /* JADX WARNING: type inference failed for: r4v40 */
    /* JADX WARNING: type inference failed for: r4v41 */
    /* JADX WARNING: type inference failed for: r4v42 */
    /* JADX WARNING: type inference failed for: r4v43 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x0257;
                case 2: goto L_0x0250;
                case 3: goto L_0x0245;
                case 4: goto L_0x0232;
                case 5: goto L_0x022b;
                case 6: goto L_0x0224;
                case 7: goto L_0x0203;
                case 8: goto L_0x01e2;
                case 9: goto L_0x01da;
                case 10: goto L_0x01d2;
                case 11: goto L_0x01ca;
                case 12: goto L_0x01be;
                case 13: goto L_0x01ae;
                case 14: goto L_0x019e;
                case 15: goto L_0x018a;
                case 16: goto L_0x0004;
                case 17: goto L_0x0004;
                case 18: goto L_0x017e;
                case 19: goto L_0x016e;
                case 20: goto L_0x014c;
                case 21: goto L_0x012a;
                case 22: goto L_0x011e;
                case 23: goto L_0x0112;
                case 24: goto L_0x0102;
                case 25: goto L_0x00f6;
                case 26: goto L_0x00ea;
                case 27: goto L_0x0004;
                case 28: goto L_0x0004;
                case 29: goto L_0x00da;
                case 30: goto L_0x00ca;
                case 31: goto L_0x00be;
                case 32: goto L_0x00b2;
                case 33: goto L_0x00a6;
                case 34: goto L_0x009a;
                case 35: goto L_0x008e;
                case 36: goto L_0x006c;
                case 37: goto L_0x0060;
                case 38: goto L_0x0054;
                case 39: goto L_0x0044;
                case 40: goto L_0x0034;
                case 41: goto L_0x0028;
                case 42: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x000d
            goto L_0x0020
        L_0x000d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IOnPaidEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzyc
            if (r4 == 0) goto L_0x001b
            r4 = r2
            com.google.android.gms.internal.ads.zzyc r4 = (com.google.android.gms.internal.ads.zzyc) r4
            goto L_0x0020
        L_0x001b:
            com.google.android.gms.internal.ads.zzye r4 = new com.google.android.gms.internal.ads.zzye
            r4.<init>(r1)
        L_0x0020:
            r0.zza((com.google.android.gms.internal.ads.zzyc) r4)
            r3.writeNoException()
            goto L_0x0261
        L_0x0028:
            com.google.android.gms.internal.ads.zzyd r1 = r0.zzkj()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.c(r3, r1)
            goto L_0x0261
        L_0x0034:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzsg r1 = com.google.android.gms.internal.ads.zzsj.e7(r1)
            r0.zza((com.google.android.gms.internal.ads.zzsg) r1)
            r3.writeNoException()
            goto L_0x0261
        L_0x0044:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvo> r1 = com.google.android.gms.internal.ads.zzvo.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.b(r2, r1)
            com.google.android.gms.internal.ads.zzvo r1 = (com.google.android.gms.internal.ads.zzvo) r1
            r0.zza((com.google.android.gms.internal.ads.zzvo) r1)
            r3.writeNoException()
            goto L_0x0261
        L_0x0054:
            java.lang.String r1 = r2.readString()
            r0.zzbo(r1)
            r3.writeNoException()
            goto L_0x0261
        L_0x0060:
            android.os.Bundle r1 = r0.getAdMetadata()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.g(r3, r1)
            goto L_0x0261
        L_0x006c:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0073
            goto L_0x0086
        L_0x0073:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdMetadataListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzwz
            if (r4 == 0) goto L_0x0081
            r4 = r2
            com.google.android.gms.internal.ads.zzwz r4 = (com.google.android.gms.internal.ads.zzwz) r4
            goto L_0x0086
        L_0x0081:
            com.google.android.gms.internal.ads.zzxb r4 = new com.google.android.gms.internal.ads.zzxb
            r4.<init>(r1)
        L_0x0086:
            r0.zza((com.google.android.gms.internal.ads.zzwz) r4)
            r3.writeNoException()
            goto L_0x0261
        L_0x008e:
            java.lang.String r1 = r0.zzki()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0261
        L_0x009a:
            boolean r1 = com.google.android.gms.internal.ads.zzgw.e(r2)
            r0.setImmersiveMode(r1)
            r3.writeNoException()
            goto L_0x0261
        L_0x00a6:
            com.google.android.gms.internal.ads.zzwj r1 = r0.zzkl()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.c(r3, r1)
            goto L_0x0261
        L_0x00b2:
            com.google.android.gms.internal.ads.zzxe r1 = r0.zzkk()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.c(r3, r1)
            goto L_0x0261
        L_0x00be:
            java.lang.String r1 = r0.getAdUnitId()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0261
        L_0x00ca:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyo> r1 = com.google.android.gms.internal.ads.zzyo.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.b(r2, r1)
            com.google.android.gms.internal.ads.zzyo r1 = (com.google.android.gms.internal.ads.zzyo) r1
            r0.zza((com.google.android.gms.internal.ads.zzyo) r1)
            r3.writeNoException()
            goto L_0x0261
        L_0x00da:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzaaa> r1 = com.google.android.gms.internal.ads.zzaaa.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.b(r2, r1)
            com.google.android.gms.internal.ads.zzaaa r1 = (com.google.android.gms.internal.ads.zzaaa) r1
            r0.zza((com.google.android.gms.internal.ads.zzaaa) r1)
            r3.writeNoException()
            goto L_0x0261
        L_0x00ea:
            com.google.android.gms.internal.ads.zzyi r1 = r0.getVideoController()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.c(r3, r1)
            goto L_0x0261
        L_0x00f6:
            java.lang.String r1 = r2.readString()
            r0.setUserId(r1)
            r3.writeNoException()
            goto L_0x0261
        L_0x0102:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzatq r1 = com.google.android.gms.internal.ads.zzatp.e7(r1)
            r0.zza((com.google.android.gms.internal.ads.zzatq) r1)
            r3.writeNoException()
            goto L_0x0261
        L_0x0112:
            boolean r1 = r0.isLoading()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.a(r3, r1)
            goto L_0x0261
        L_0x011e:
            boolean r1 = com.google.android.gms.internal.ads.zzgw.e(r2)
            r0.setManualImpressionsEnabled(r1)
            r3.writeNoException()
            goto L_0x0261
        L_0x012a:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0131
            goto L_0x0144
        L_0x0131:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzxk
            if (r4 == 0) goto L_0x013f
            r4 = r2
            com.google.android.gms.internal.ads.zzxk r4 = (com.google.android.gms.internal.ads.zzxk) r4
            goto L_0x0144
        L_0x013f:
            com.google.android.gms.internal.ads.zzxj r4 = new com.google.android.gms.internal.ads.zzxj
            r4.<init>(r1)
        L_0x0144:
            r0.zza((com.google.android.gms.internal.ads.zzxk) r4)
            r3.writeNoException()
            goto L_0x0261
        L_0x014c:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0153
            goto L_0x0166
        L_0x0153:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzwi
            if (r4 == 0) goto L_0x0161
            r4 = r2
            com.google.android.gms.internal.ads.zzwi r4 = (com.google.android.gms.internal.ads.zzwi) r4
            goto L_0x0166
        L_0x0161:
            com.google.android.gms.internal.ads.zzwk r4 = new com.google.android.gms.internal.ads.zzwk
            r4.<init>(r1)
        L_0x0166:
            r0.zza((com.google.android.gms.internal.ads.zzwi) r4)
            r3.writeNoException()
            goto L_0x0261
        L_0x016e:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzabo r1 = com.google.android.gms.internal.ads.zzabr.e7(r1)
            r0.zza((com.google.android.gms.internal.ads.zzabo) r1)
            r3.writeNoException()
            goto L_0x0261
        L_0x017e:
            java.lang.String r1 = r0.getMediationAdapterClassName()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x0261
        L_0x018a:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaqy r1 = com.google.android.gms.internal.ads.zzaqx.e7(r1)
            java.lang.String r2 = r2.readString()
            r0.zza(r1, r2)
            r3.writeNoException()
            goto L_0x0261
        L_0x019e:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaqs r1 = com.google.android.gms.internal.ads.zzaqr.e7(r1)
            r0.zza((com.google.android.gms.internal.ads.zzaqs) r1)
            r3.writeNoException()
            goto L_0x0261
        L_0x01ae:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzvh> r1 = com.google.android.gms.internal.ads.zzvh.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.b(r2, r1)
            com.google.android.gms.internal.ads.zzvh r1 = (com.google.android.gms.internal.ads.zzvh) r1
            r0.zza((com.google.android.gms.internal.ads.zzvh) r1)
            r3.writeNoException()
            goto L_0x0261
        L_0x01be:
            com.google.android.gms.internal.ads.zzvh r1 = r0.zzkh()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.g(r3, r1)
            goto L_0x0261
        L_0x01ca:
            r0.zzkg()
            r3.writeNoException()
            goto L_0x0261
        L_0x01d2:
            r0.stopLoading()
            r3.writeNoException()
            goto L_0x0261
        L_0x01da:
            r0.showInterstitial()
            r3.writeNoException()
            goto L_0x0261
        L_0x01e2:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x01e9
            goto L_0x01fc
        L_0x01e9:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzxe
            if (r4 == 0) goto L_0x01f7
            r4 = r2
            com.google.android.gms.internal.ads.zzxe r4 = (com.google.android.gms.internal.ads.zzxe) r4
            goto L_0x01fc
        L_0x01f7:
            com.google.android.gms.internal.ads.zzxg r4 = new com.google.android.gms.internal.ads.zzxg
            r4.<init>(r1)
        L_0x01fc:
            r0.zza((com.google.android.gms.internal.ads.zzxe) r4)
            r3.writeNoException()
            goto L_0x0261
        L_0x0203:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x020a
            goto L_0x021d
        L_0x020a:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzwj
            if (r4 == 0) goto L_0x0218
            r4 = r2
            com.google.android.gms.internal.ads.zzwj r4 = (com.google.android.gms.internal.ads.zzwj) r4
            goto L_0x021d
        L_0x0218:
            com.google.android.gms.internal.ads.zzwl r4 = new com.google.android.gms.internal.ads.zzwl
            r4.<init>(r1)
        L_0x021d:
            r0.zza((com.google.android.gms.internal.ads.zzwj) r4)
            r3.writeNoException()
            goto L_0x0261
        L_0x0224:
            r0.resume()
            r3.writeNoException()
            goto L_0x0261
        L_0x022b:
            r0.pause()
            r3.writeNoException()
            goto L_0x0261
        L_0x0232:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzve> r1 = com.google.android.gms.internal.ads.zzve.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgw.b(r2, r1)
            com.google.android.gms.internal.ads.zzve r1 = (com.google.android.gms.internal.ads.zzve) r1
            boolean r1 = r0.zza((com.google.android.gms.internal.ads.zzve) r1)
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.a(r3, r1)
            goto L_0x0261
        L_0x0245:
            boolean r1 = r0.isReady()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.a(r3, r1)
            goto L_0x0261
        L_0x0250:
            r0.destroy()
            r3.writeNoException()
            goto L_0x0261
        L_0x0257:
            com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzkf()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzgw.c(r3, r1)
        L_0x0261:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwv.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
