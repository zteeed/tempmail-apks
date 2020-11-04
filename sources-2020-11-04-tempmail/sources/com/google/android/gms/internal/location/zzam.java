package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;

public interface zzam extends IInterface {
    void c7(int i, String[] strArr) throws RemoteException;

    void d6(int i, String[] strArr) throws RemoteException;

    void r3(int i, PendingIntent pendingIntent) throws RemoteException;
}
