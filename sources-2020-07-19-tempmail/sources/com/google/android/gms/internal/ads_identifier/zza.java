package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zza implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f9278b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9279c;

    protected zza(IBinder iBinder, String str) {
        this.f9278b = iBinder;
        this.f9279c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel E(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f9278b.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f9278b;
    }

    /* access modifiers changed from: protected */
    public final Parcel y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9279c);
        return obtain;
    }
}
