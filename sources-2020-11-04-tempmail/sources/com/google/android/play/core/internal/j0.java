package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class j0 extends e0 implements k0 {
    public j0() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i, Parcel parcel) throws RemoteException {
        if (i == 2) {
            l((Bundle) f0.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            y((Bundle) f0.a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
