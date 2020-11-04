package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
public interface zza extends IInterface {
    Bundle F2(int i, String str, List<String> list, String str2, String str3, String str4) throws RemoteException;

    int M0(int i, String str, String str2) throws RemoteException;

    Bundle T6(int i, String str, String str2, Bundle bundle) throws RemoteException;

    Bundle U5(int i, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException;

    Bundle d7(int i, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException;

    Bundle j6(int i, String str, String str2, Bundle bundle) throws RemoteException;

    Bundle n4(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException;

    Bundle o4(int i, String str, String str2, Bundle bundle) throws RemoteException;

    Bundle p6(int i, String str, String str2, String str3, String str4) throws RemoteException;

    Bundle s6(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException;

    int t3(int i, String str, String str2) throws RemoteException;

    Bundle y1(int i, String str, String str2, String str3) throws RemoteException;
}
