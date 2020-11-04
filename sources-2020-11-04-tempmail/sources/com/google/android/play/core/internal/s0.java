package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class s0 extends d0 implements t0 {
    s0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void P(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel B = B();
        f0.c(B, bundle);
        f0.c(B, bundle2);
        H(2, B);
    }

    public final void l(Bundle bundle) throws RemoteException {
        Parcel B = B();
        f0.c(B, bundle);
        H(3, B);
    }

    public final void y(Bundle bundle) throws RemoteException {
        Parcel B = B();
        f0.c(B, bundle);
        H(4, B);
    }
}
