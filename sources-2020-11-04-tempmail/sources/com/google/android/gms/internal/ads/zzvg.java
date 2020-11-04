package com.google.android.gms.internal.ads;

import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzvg implements Parcelable.Creator<zzve> {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r31) {
        /*
            r30 = this;
            r0 = r31
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.L(r31)
            r2 = 0
            r3 = 0
            r4 = 0
            r10 = r3
            r12 = r10
            r16 = r12
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r26 = r24
            r28 = r26
            r29 = r28
            r8 = r4
            r7 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r25 = 0
            r27 = 0
        L_0x002e:
            int r2 = r31.dataPosition()
            if (r2 >= r1) goto L_0x00c8
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.C(r31)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.v(r2)
            switch(r3) {
                case 1: goto L_0x00c2;
                case 2: goto L_0x00bc;
                case 3: goto L_0x00b6;
                case 4: goto L_0x00b0;
                case 5: goto L_0x00aa;
                case 6: goto L_0x00a5;
                case 7: goto L_0x00a0;
                case 8: goto L_0x009b;
                case 9: goto L_0x0096;
                case 10: goto L_0x008b;
                case 11: goto L_0x0080;
                case 12: goto L_0x007b;
                case 13: goto L_0x0076;
                case 14: goto L_0x0071;
                case 15: goto L_0x006c;
                case 16: goto L_0x0067;
                case 17: goto L_0x0062;
                case 18: goto L_0x005d;
                case 19: goto L_0x0052;
                case 20: goto L_0x004d;
                case 21: goto L_0x0048;
                case 22: goto L_0x0043;
                default: goto L_0x003f;
            }
        L_0x003f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.K(r0, r2)
            goto L_0x002e
        L_0x0043:
            java.util.ArrayList r29 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r0, r2)
            goto L_0x002e
        L_0x0048:
            java.lang.String r28 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r0, r2)
            goto L_0x002e
        L_0x004d:
            int r27 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.E(r0, r2)
            goto L_0x002e
        L_0x0052:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzuw> r3 = com.google.android.gms.internal.ads.zzuw.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.o(r0, r2, r3)
            r26 = r2
            com.google.android.gms.internal.ads.zzuw r26 = (com.google.android.gms.internal.ads.zzuw) r26
            goto L_0x002e
        L_0x005d:
            boolean r25 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.w(r0, r2)
            goto L_0x002e
        L_0x0062:
            java.lang.String r24 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r0, r2)
            goto L_0x002e
        L_0x0067:
            java.lang.String r23 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r0, r2)
            goto L_0x002e
        L_0x006c:
            java.util.ArrayList r22 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r0, r2)
            goto L_0x002e
        L_0x0071:
            android.os.Bundle r21 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r0, r2)
            goto L_0x002e
        L_0x0076:
            android.os.Bundle r20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r0, r2)
            goto L_0x002e
        L_0x007b:
            java.lang.String r19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r0, r2)
            goto L_0x002e
        L_0x0080:
            android.os.Parcelable$Creator r3 = android.location.Location.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.o(r0, r2, r3)
            r18 = r2
            android.location.Location r18 = (android.location.Location) r18
            goto L_0x002e
        L_0x008b:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzzw> r3 = com.google.android.gms.internal.ads.zzzw.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.o(r0, r2, r3)
            r17 = r2
            com.google.android.gms.internal.ads.zzzw r17 = (com.google.android.gms.internal.ads.zzzw) r17
            goto L_0x002e
        L_0x0096:
            java.lang.String r16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r0, r2)
            goto L_0x002e
        L_0x009b:
            boolean r15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.w(r0, r2)
            goto L_0x002e
        L_0x00a0:
            int r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.E(r0, r2)
            goto L_0x002e
        L_0x00a5:
            boolean r13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.w(r0, r2)
            goto L_0x002e
        L_0x00aa:
            java.util.ArrayList r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r0, r2)
            goto L_0x002e
        L_0x00b0:
            int r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.E(r0, r2)
            goto L_0x002e
        L_0x00b6:
            android.os.Bundle r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r0, r2)
            goto L_0x002e
        L_0x00bc:
            long r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.G(r0, r2)
            goto L_0x002e
        L_0x00c2:
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.E(r0, r2)
            goto L_0x002e
        L_0x00c8:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.u(r0, r1)
            com.google.android.gms.internal.ads.zzve r0 = new com.google.android.gms.internal.ads.zzve
            r6 = r0
            r6.<init>(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvg.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzve[i];
    }
}
