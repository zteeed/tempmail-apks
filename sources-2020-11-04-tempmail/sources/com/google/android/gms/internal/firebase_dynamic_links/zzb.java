package com.google.android.gms.internal.firebase_dynamic_links;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.firebase:firebase-dynamic-links@@19.1.0 */
public class zzb implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f9475b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9476c;

    protected zzb(IBinder iBinder, String str) {
        this.f9475b = iBinder;
        this.f9476c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel B() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9476c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void H(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9475b.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f9475b;
    }
}
