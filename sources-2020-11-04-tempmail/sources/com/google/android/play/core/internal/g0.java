package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class g0 extends d0 implements i0 {
    g0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    public final void G6(String str, Bundle bundle, k0 k0Var) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        f0.c(B, bundle);
        f0.b(B, k0Var);
        H(3, B);
    }

    public final void c4(String str, Bundle bundle, k0 k0Var) throws RemoteException {
        Parcel B = B();
        B.writeString(str);
        f0.c(B, bundle);
        f0.b(B, k0Var);
        H(2, B);
    }
}
