package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zza implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f9290b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9291c;

    protected zza(IBinder iBinder, String str) {
        this.f9290b = iBinder;
        this.f9291c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel E(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f9290b.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void P(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9290b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f9290b;
    }

    /* access modifiers changed from: protected */
    public final void b0(int i, Parcel parcel) throws RemoteException {
        try {
            this.f9290b.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final Parcel y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9291c);
        return obtain;
    }
}
