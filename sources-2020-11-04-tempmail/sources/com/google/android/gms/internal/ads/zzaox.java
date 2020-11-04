package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzaox extends IInterface {
    void A4(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaom zzaom, zzamx zzamx) throws RemoteException;

    boolean C6(IObjectWrapper iObjectWrapper) throws RemoteException;

    void E6(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaor zzaor, zzamx zzamx) throws RemoteException;

    boolean I2(IObjectWrapper iObjectWrapper) throws RemoteException;

    void Q1(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzvh zzvh, zzaoy zzaoy) throws RemoteException;

    void V3(String str) throws RemoteException;

    void W4(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaos zzaos, zzamx zzamx) throws RemoteException;

    void a2(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaos zzaos, zzamx zzamx) throws RemoteException;

    zzapl e0() throws RemoteException;

    zzapl g0() throws RemoteException;

    zzyi getVideoController() throws RemoteException;

    void j5(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaol zzaol, zzamx zzamx, zzvh zzvh) throws RemoteException;

    void q2(IObjectWrapper iObjectWrapper) throws RemoteException;

    void v5(String[] strArr, Bundle[] bundleArr) throws RemoteException;
}
