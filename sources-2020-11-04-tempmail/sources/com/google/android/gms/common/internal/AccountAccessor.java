package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.IAccountAccessor;

public class AccountAccessor extends IAccountAccessor.Stub {
    @KeepForSdk
    public static Account V(IAccountAccessor iAccountAccessor) {
        if (iAccountAccessor != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return iAccountAccessor.a0();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }

    public final Account a0() {
        throw new NoSuchMethodError();
    }

    public boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }
}
