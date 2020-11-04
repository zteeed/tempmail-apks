package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzaox extends IInterface {
    void C4(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaos zzaos, zzamx zzamx) throws RemoteException;

    void H1(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzvh zzvh, zzaoy zzaoy) throws RemoteException;

    void H3(String str) throws RemoteException;

    void P4(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaol zzaol, zzamx zzamx, zzvh zzvh) throws RemoteException;

    void R1(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaos zzaos, zzamx zzamx) throws RemoteException;

    zzapl Y() throws RemoteException;

    zzapl a0() throws RemoteException;

    void a5(String[] strArr, Bundle[] bundleArr) throws RemoteException;

    boolean c6(IObjectWrapper iObjectWrapper) throws RemoteException;

    void d6(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaor zzaor, zzamx zzamx) throws RemoteException;

    void g2(IObjectWrapper iObjectWrapper) throws RemoteException;

    void g4(String str, String str2, zzve zzve, IObjectWrapper iObjectWrapper, zzaom zzaom, zzamx zzamx) throws RemoteException;

    zzyi getVideoController() throws RemoteException;

    boolean v2(IObjectWrapper iObjectWrapper) throws RemoteException;
}
