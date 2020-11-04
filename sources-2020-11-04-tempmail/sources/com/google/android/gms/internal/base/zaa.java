package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zaa implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f9465b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9466c;

    protected zaa(IBinder iBinder, String str) {
        this.f9465b = iBinder;
        this.f9466c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel B() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9466c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel H(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f9465b.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void V(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9465b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f9465b;
    }

    /* access modifiers changed from: protected */
    public final void h0(int i, Parcel parcel) throws RemoteException {
        try {
            this.f9465b.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
