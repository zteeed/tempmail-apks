package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public class zza implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f9540b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9541c;

    protected zza(IBinder iBinder, String str) {
        this.f9540b = iBinder;
        this.f9541c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel E(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f9540b.transact(i, parcel, parcel, 0);
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
            this.f9540b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f9540b;
    }

    /* access modifiers changed from: protected */
    public final Parcel y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9541c);
        return obtain;
    }
}
