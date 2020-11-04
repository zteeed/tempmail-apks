package com.google.android.gms.location;

import android.os.IInterface;
import android.os.RemoteException;

public interface zzu extends IInterface {
    void G4(LocationResult locationResult) throws RemoteException;

    void z3(LocationAvailability locationAvailability) throws RemoteException;
}
