package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzawr extends IInterface {
    void E1(List<Uri> list, IObjectWrapper iObjectWrapper, zzaqz zzaqz) throws RemoteException;

    IObjectWrapper F2(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;

    void F4(IObjectWrapper iObjectWrapper, zzawx zzawx, zzawq zzawq) throws RemoteException;

    void L2(IObjectWrapper iObjectWrapper) throws RemoteException;

    void R0(List<Uri> list, IObjectWrapper iObjectWrapper, zzaqz zzaqz) throws RemoteException;

    void i4(zzark zzark) throws RemoteException;

    IObjectWrapper k0(IObjectWrapper iObjectWrapper) throws RemoteException;
}
