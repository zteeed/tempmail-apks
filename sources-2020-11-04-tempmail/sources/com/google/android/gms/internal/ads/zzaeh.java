package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzaeh extends IInterface {
    boolean A(Bundle bundle) throws RemoteException;

    void F(Bundle bundle) throws RemoteException;

    void destroy() throws RemoteException;

    String e() throws RemoteException;

    IObjectWrapper f() throws RemoteException;

    zzadl g() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    zzyi getVideoController() throws RemoteException;

    String i() throws RemoteException;

    String j() throws RemoteException;

    List k() throws RemoteException;

    zzadt m() throws RemoteException;

    String n() throws RemoteException;

    IObjectWrapper o() throws RemoteException;

    double p() throws RemoteException;

    String r() throws RemoteException;

    void u(Bundle bundle) throws RemoteException;
}
