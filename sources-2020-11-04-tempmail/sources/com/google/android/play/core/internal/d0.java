package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class d0 implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f11485b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11486c;

    protected d0(IBinder iBinder, String str) {
        this.f11485b = iBinder;
        this.f11486c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel B() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f11486c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void H(int i, Parcel parcel) throws RemoteException {
        try {
            this.f11485b.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f11485b;
    }
}
