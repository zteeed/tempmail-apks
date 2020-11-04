package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zza implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f9505b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9506c;

    protected zza(IBinder iBinder, String str) {
        this.f9505b = iBinder;
        this.f9506c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel B() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9506c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void H(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9505b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void V(int i, Parcel parcel) throws RemoteException {
        try {
            this.f9505b.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f9505b;
    }
}
