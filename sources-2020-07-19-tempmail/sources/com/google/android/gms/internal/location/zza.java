package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zza implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f9322b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9323c;

    protected zza(IBinder iBinder, String str) {
        this.f9322b = iBinder;
        this.f9323c = str;
    }

    /* access modifiers changed from: protected */
    public final void E(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9322b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void P(int i, Parcel parcel) throws RemoteException {
        try {
            this.f9322b.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f9322b;
    }

    /* access modifiers changed from: protected */
    public final Parcel y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9323c);
        return obtain;
    }
}
