package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.2.0 */
public class zzgu implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f8893b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8894c;

    protected zzgu(IBinder iBinder, String str) {
        this.f8893b = iBinder;
        this.f8894c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel B() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f8894c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel H(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f8893b.transact(i, parcel, parcel, 0);
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
            this.f8893b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f8893b;
    }

    /* access modifiers changed from: protected */
    public final void h0(int i, Parcel parcel) throws RemoteException {
        try {
            this.f8893b.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
