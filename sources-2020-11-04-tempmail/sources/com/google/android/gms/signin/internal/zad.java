package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public interface zad extends IInterface {
    void J3(Status status) throws RemoteException;

    void W3(Status status) throws RemoteException;

    void b1(zaj zaj) throws RemoteException;

    void c5(ConnectionResult connectionResult, zaa zaa) throws RemoteException;

    void y0(Status status, GoogleSignInAccount googleSignInAccount) throws RemoteException;
}
