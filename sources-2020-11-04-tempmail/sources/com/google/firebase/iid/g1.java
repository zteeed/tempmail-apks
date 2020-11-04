package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
public final class g1 implements h1 {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f11751b;

    g1(IBinder iBinder) {
        this.f11751b = iBinder;
    }

    public final IBinder asBinder() {
        return this.f11751b;
    }

    public final void g6(Message message) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.f11751b.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
