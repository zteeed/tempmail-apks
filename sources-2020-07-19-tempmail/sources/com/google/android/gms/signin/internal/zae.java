package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract class zae extends zab implements zad {
    public zae() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public boolean U0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 3) {
            I4((ConnectionResult) zac.b(parcel, ConnectionResult.CREATOR), (zaa) zac.b(parcel, zaa.CREATOR));
        } else if (i == 4) {
            u3((Status) zac.b(parcel, Status.CREATOR));
        } else if (i == 6) {
            I3((Status) zac.b(parcel, Status.CREATOR));
        } else if (i == 7) {
            s0((Status) zac.b(parcel, Status.CREATOR), (GoogleSignInAccount) zac.b(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            V0((zaj) zac.b(parcel, zaj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
