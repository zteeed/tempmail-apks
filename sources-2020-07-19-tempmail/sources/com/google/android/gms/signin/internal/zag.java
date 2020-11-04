package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zag extends zaa implements zaf {
    zag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void D2(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel y = y();
        zac.c(y, iAccountAccessor);
        y.writeInt(i);
        zac.a(y, z);
        P(9, y);
    }

    public final void S2(zah zah, zad zad) throws RemoteException {
        Parcel y = y();
        zac.d(y, zah);
        zac.c(y, zad);
        P(12, y);
    }

    public final void b1(int i) throws RemoteException {
        Parcel y = y();
        y.writeInt(i);
        P(7, y);
    }
}
