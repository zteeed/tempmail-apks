package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzaft extends IInterface {
    void C(Bundle bundle) throws RemoteException;

    void G() throws RemoteException;

    void J() throws RemoteException;

    void M(zzxp zzxp) throws RemoteException;

    void W(zzxt zzxt) throws RemoteException;

    void Z(zzafo zzafo) throws RemoteException;

    String d() throws RemoteException;

    void destroy() throws RemoteException;

    IObjectWrapper e() throws RemoteException;

    zzadl f() throws RemoteException;

    zzado f0() throws RemoteException;

    boolean f2() throws RemoteException;

    boolean g0() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    zzyi getVideoController() throws RemoteException;

    String h() throws RemoteException;

    void h6() throws RemoteException;

    String i() throws RemoteException;

    List j() throws RemoteException;

    List j4() throws RemoteException;

    zzadt k() throws RemoteException;

    String l() throws RemoteException;

    IObjectWrapper m() throws RemoteException;

    double n() throws RemoteException;

    String o() throws RemoteException;

    String p() throws RemoteException;

    void s(Bundle bundle) throws RemoteException;

    boolean x(Bundle bundle) throws RemoteException;

    void zza(zzyc zzyc) throws RemoteException;

    zzyd zzkj() throws RemoteException;
}
