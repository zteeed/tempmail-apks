package com.google.android.play.core.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class e0 extends Binder implements IInterface {
    protected e0(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    public abstract boolean B(int i, Parcel parcel) throws RemoteException;

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return B(i, parcel);
    }
}
