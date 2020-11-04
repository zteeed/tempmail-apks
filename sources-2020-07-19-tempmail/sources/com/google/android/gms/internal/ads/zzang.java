package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzang extends IInterface {
    void A(IObjectWrapper iObjectWrapper) throws RemoteException;

    float B1() throws RemoteException;

    boolean D() throws RemoteException;

    float P0() throws RemoteException;

    float T1() throws RemoteException;

    String d() throws RemoteException;

    IObjectWrapper e() throws RemoteException;

    zzadl f() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    zzyi getVideoController() throws RemoteException;

    String h() throws RemoteException;

    String i() throws RemoteException;

    List j() throws RemoteException;

    zzadt k() throws RemoteException;

    String l() throws RemoteException;

    double n() throws RemoteException;

    String o() throws RemoteException;

    String p() throws RemoteException;

    void r(IObjectWrapper iObjectWrapper) throws RemoteException;

    void recordImpression() throws RemoteException;

    boolean t() throws RemoteException;

    void u(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    IObjectWrapper v() throws RemoteException;

    IObjectWrapper w() throws RemoteException;
}
