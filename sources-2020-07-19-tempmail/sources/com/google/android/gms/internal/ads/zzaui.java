package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzaui extends IInterface {
    void B5(zzauz zzauz) throws RemoteException;

    void K4(zzauj zzauj) throws RemoteException;

    void R5(zzaur zzaur) throws RemoteException;

    void Y0(zzxx zzxx) throws RemoteException;

    void b2(IObjectWrapper iObjectWrapper) throws RemoteException;

    void e1(zzve zzve, zzauq zzauq) throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    void i0(zzve zzve, zzauq zzauq) throws RemoteException;

    boolean isLoaded() throws RemoteException;

    zzaud x2() throws RemoteException;

    void x6(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    void zza(zzyc zzyc) throws RemoteException;

    zzyd zzkj() throws RemoteException;
}
