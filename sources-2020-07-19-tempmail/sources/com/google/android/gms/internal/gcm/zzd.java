package com.google.android.gms.internal.gcm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zzd implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f9308b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9309c;

    protected zzd(IBinder iBinder, String str) {
        this.f9308b = iBinder;
        this.f9309c = str;
    }

    /* access modifiers changed from: protected */
    public final void E(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9308b.transact(2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void P(int i, Parcel parcel) throws RemoteException {
        try {
            this.f9308b.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f9308b;
    }

    /* access modifiers changed from: protected */
    public final Parcel y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9309c);
        return obtain;
    }
}
