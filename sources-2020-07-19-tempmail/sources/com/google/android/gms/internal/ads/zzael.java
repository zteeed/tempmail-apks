package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzael extends IInterface {
    void C(Bundle bundle) throws RemoteException;

    String d() throws RemoteException;

    void destroy() throws RemoteException;

    IObjectWrapper e() throws RemoteException;

    zzadl f() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    zzyi getVideoController() throws RemoteException;

    String h() throws RemoteException;

    zzadt h0() throws RemoteException;

    String i() throws RemoteException;

    List j() throws RemoteException;

    IObjectWrapper m() throws RemoteException;

    String o() throws RemoteException;

    void s(Bundle bundle) throws RemoteException;

    boolean x(Bundle bundle) throws RemoteException;
}
