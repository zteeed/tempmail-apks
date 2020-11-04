package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzyk extends zzgu implements zzyi {
    zzyk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public final boolean D5() throws RemoteException {
        Parcel H = H(10, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final boolean F0() throws RemoteException {
        Parcel H = H(12, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final void Z0(zzyj zzyj) throws RemoteException {
        Parcel B = B();
        zzgw.c(B, zzyj);
        V(8, B);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzyj c6() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.B()
            r1 = 11
            android.os.Parcel r0 = r4.H(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzyj
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzyj r1 = (com.google.android.gms.internal.ads.zzyj) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzyl r2 = new com.google.android.gms.internal.ads.zzyl
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyk.c6():com.google.android.gms.internal.ads.zzyj");
    }

    public final float getAspectRatio() throws RemoteException {
        Parcel H = H(9, B());
        float readFloat = H.readFloat();
        H.recycle();
        return readFloat;
    }

    public final float getCurrentTime() throws RemoteException {
        Parcel H = H(7, B());
        float readFloat = H.readFloat();
        H.recycle();
        return readFloat;
    }

    public final float getDuration() throws RemoteException {
        Parcel H = H(6, B());
        float readFloat = H.readFloat();
        H.recycle();
        return readFloat;
    }

    public final int getPlaybackState() throws RemoteException {
        Parcel H = H(5, B());
        int readInt = H.readInt();
        H.recycle();
        return readInt;
    }

    public final void h2(boolean z) throws RemoteException {
        Parcel B = B();
        zzgw.a(B, z);
        V(3, B);
    }

    public final void pause() throws RemoteException {
        V(2, B());
    }

    public final void play() throws RemoteException {
        V(1, B());
    }

    public final boolean r1() throws RemoteException {
        Parcel H = H(4, B());
        boolean e2 = zzgw.e(H);
        H.recycle();
        return e2;
    }

    public final void stop() throws RemoteException {
        V(13, B());
    }
}
