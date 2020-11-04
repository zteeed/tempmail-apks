package com.google.android.gms.internal.gcm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zzd implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f9491b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9492c;

    protected zzd(IBinder iBinder, String str) {
        this.f9491b = iBinder;
        this.f9492c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel B() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9492c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void H(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9491b.transact(2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void V(int i, Parcel parcel) throws RemoteException {
        try {
            this.f9491b.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f9491b;
    }
}
