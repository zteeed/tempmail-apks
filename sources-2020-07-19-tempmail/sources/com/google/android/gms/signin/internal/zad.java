package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public interface zad extends IInterface {
    void I3(Status status) throws RemoteException;

    void I4(ConnectionResult connectionResult, zaa zaa) throws RemoteException;

    void V0(zaj zaj) throws RemoteException;

    void s0(Status status, GoogleSignInAccount googleSignInAccount) throws RemoteException;

    void u3(Status status) throws RemoteException;
}
