package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzaui extends IInterface {
    zzaud K2() throws RemoteException;

    void Z5(zzauz zzauz) throws RemoteException;

    void b7(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    void e1(zzxx zzxx) throws RemoteException;

    void e5(zzauj zzauj) throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoaded() throws RemoteException;

    void k1(zzve zzve, zzauq zzauq) throws RemoteException;

    void l2(IObjectWrapper iObjectWrapper) throws RemoteException;

    void o0(zzve zzve, zzauq zzauq) throws RemoteException;

    void q6(zzaur zzaur) throws RemoteException;

    void zza(zzyc zzyc) throws RemoteException;

    zzyd zzkj() throws RemoteException;
}
