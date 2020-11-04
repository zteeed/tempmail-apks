package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public interface IResolveAccountCallbacks extends IInterface {

    public static abstract class Stub extends zab implements IResolveAccountCallbacks {

        public static class Proxy extends zaa implements IResolveAccountCallbacks {
            public void M5(ResolveAccountResponse resolveAccountResponse) throws RemoteException {
                Parcel y = y();
                zac.d(y, resolveAccountResponse);
                P(2, y);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.IResolveAccountCallbacks");
        }

        /* access modifiers changed from: protected */
        public boolean U0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            M5((ResolveAccountResponse) zac.b(parcel, ResolveAccountResponse.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    void M5(ResolveAccountResponse resolveAccountResponse) throws RemoteException;
}
