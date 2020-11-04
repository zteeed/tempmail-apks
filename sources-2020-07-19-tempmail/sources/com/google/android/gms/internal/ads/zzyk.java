package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzyk extends zzgu implements zzyi {
    zzyk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzyj E5() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.y()
            r1 = 11
            android.os.Parcel r0 = r4.E(r1, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyk.E5():com.google.android.gms.internal.ads.zzyj");
    }

    public final void S0(zzyj zzyj) throws RemoteException {
        Parcel y = y();
        zzgw.c(y, zzyj);
        P(8, y);
    }

    public final void X1(boolean z) throws RemoteException {
        Parcel y = y();
        zzgw.a(y, z);
        P(3, y);
    }

    public final boolean g5() throws RemoteException {
        Parcel E = E(10, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final float getAspectRatio() throws RemoteException {
        Parcel E = E(9, y());
        float readFloat = E.readFloat();
        E.recycle();
        return readFloat;
    }

    public final float getCurrentTime() throws RemoteException {
        Parcel E = E(7, y());
        float readFloat = E.readFloat();
        E.recycle();
        return readFloat;
    }

    public final float getDuration() throws RemoteException {
        Parcel E = E(6, y());
        float readFloat = E.readFloat();
        E.recycle();
        return readFloat;
    }

    public final int getPlaybackState() throws RemoteException {
        Parcel E = E(5, y());
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    public final boolean l1() throws RemoteException {
        Parcel E = E(4, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }

    public final void pause() throws RemoteException {
        P(2, y());
    }

    public final void play() throws RemoteException {
        P(1, y());
    }

    public final void stop() throws RemoteException {
        P(13, y());
    }

    public final boolean z0() throws RemoteException {
        Parcel E = E(12, y());
        boolean e2 = zzgw.e(E);
        E.recycle();
        return e2;
    }
}
