package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public interface IAccountAccessor extends IInterface {

    public static abstract class Stub extends zzb implements IAccountAccessor {

        public static class zza extends com.google.android.gms.internal.common.zza implements IAccountAccessor {
            zza(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            public final Account U() throws RemoteException {
                Parcel E = E(2, y());
                Account account = (Account) zzc.b(E, Account.CREATOR);
                E.recycle();
                return account;
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        public static IAccountAccessor E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof IAccountAccessor) {
                return (IAccountAccessor) queryLocalInterface;
            }
            return new zza(iBinder);
        }

        /* access modifiers changed from: protected */
        public final boolean y(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            Account U = U();
            parcel2.writeNoException();
            zzc.f(parcel2, U);
            return true;
        }
    }

    Account U() throws RemoteException;
}
