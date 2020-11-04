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

    public final void O2(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel B = B();
        zac.c(B, iAccountAccessor);
        B.writeInt(i);
        zac.a(B, z);
        V(9, B);
    }

    public final void e3(zah zah, zad zad) throws RemoteException {
        Parcel B = B();
        zac.d(B, zah);
        zac.c(B, zad);
        V(12, B);
    }

    public final void h1(int i) throws RemoteException {
        Parcel B = B();
        B.writeInt(i);
        V(7, B);
    }
}
