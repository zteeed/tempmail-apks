package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzatj extends IInterface {
    void E4(IObjectWrapper iObjectWrapper) throws RemoteException;

    void N3(zzath zzath) throws RemoteException;

    void U4(IObjectWrapper iObjectWrapper) throws RemoteException;

    void V4(String str) throws RemoteException;

    void destroy() throws RemoteException;

    void e4(IObjectWrapper iObjectWrapper) throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoaded() throws RemoteException;

    void l6(IObjectWrapper iObjectWrapper) throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setCustomData(String str) throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void show() throws RemoteException;

    void y5(zzatw zzatw) throws RemoteException;

    boolean z1() throws RemoteException;

    void zza(zzatq zzatq) throws RemoteException;

    void zza(zzwz zzwz) throws RemoteException;

    zzyd zzkj() throws RemoteException;
}
