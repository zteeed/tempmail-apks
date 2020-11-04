package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
public class zzf implements IInterface {

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f10009b;

    /* renamed from: c  reason: collision with root package name */
    private final String f10010c;

    protected zzf(IBinder iBinder, String str) {
        this.f10009b = iBinder;
        this.f10010c = str;
    }

    /* access modifiers changed from: protected */
    public final Parcel B() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10010c);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel H(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f10009b.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f10009b;
    }
}
