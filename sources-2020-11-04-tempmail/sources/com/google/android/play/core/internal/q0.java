package com.google.android.play.core.internal;

public abstract class q0 extends e0 implements r0 {
    public q0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B(int r4, android.os.Parcel r5) throws android.os.RemoteException {
        /*
            r3 = this;
            r0 = 2
            java.lang.String r1 = "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback"
            r2 = 0
            if (r4 == r0) goto L_0x002e
            r0 = 3
            if (r4 == r0) goto L_0x000b
            r4 = 0
            return r4
        L_0x000b:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.play.core.internal.f0.a(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r4 = r5.readStrongBinder()
            if (r4 == 0) goto L_0x002a
            android.os.IInterface r5 = r4.queryLocalInterface(r1)
            boolean r0 = r5 instanceof com.google.android.play.core.internal.t0
            if (r0 == 0) goto L_0x0025
            r2 = r5
            com.google.android.play.core.internal.t0 r2 = (com.google.android.play.core.internal.t0) r2
            goto L_0x002a
        L_0x0025:
            com.google.android.play.core.internal.s0 r2 = new com.google.android.play.core.internal.s0
            r2.<init>(r4)
        L_0x002a:
            r3.G2(r2)
            goto L_0x0050
        L_0x002e:
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.play.core.internal.f0.a(r5, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 == 0) goto L_0x004d
            android.os.IInterface r0 = r5.queryLocalInterface(r1)
            boolean r1 = r0 instanceof com.google.android.play.core.internal.t0
            if (r1 == 0) goto L_0x0048
            r2 = r0
            com.google.android.play.core.internal.t0 r2 = (com.google.android.play.core.internal.t0) r2
            goto L_0x004d
        L_0x0048:
            com.google.android.play.core.internal.s0 r2 = new com.google.android.play.core.internal.s0
            r2.<init>(r5)
        L_0x004d:
            r3.A1(r4, r2)
        L_0x0050:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.q0.B(int, android.os.Parcel):boolean");
    }
}
