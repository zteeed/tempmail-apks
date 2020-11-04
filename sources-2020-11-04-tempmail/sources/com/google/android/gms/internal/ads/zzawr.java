package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzawr extends IInterface {
    void C4(zzark zzark) throws RemoteException;

    void N1(List<Uri> list, IObjectWrapper iObjectWrapper, zzaqz zzaqz) throws RemoteException;

    IObjectWrapper Q2(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;

    void X2(IObjectWrapper iObjectWrapper) throws RemoteException;

    void Y0(List<Uri> list, IObjectWrapper iObjectWrapper, zzaqz zzaqz) throws RemoteException;

    void Z4(IObjectWrapper iObjectWrapper, zzawx zzawx, zzawq zzawq) throws RemoteException;

    IObjectWrapper q0(IObjectWrapper iObjectWrapper) throws RemoteException;
}
