package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzaep extends IInterface {
    void E2(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper N5() throws RemoteException;

    String T3(String str) throws RemoteException;

    zzadt W4(String str) throws RemoteException;

    boolean b4() throws RemoteException;

    void destroy() throws RemoteException;

    boolean e5() throws RemoteException;

    void g3() throws RemoteException;

    List<String> getAvailableAssetNames() throws RemoteException;

    String getCustomTemplateId() throws RemoteException;

    zzyi getVideoController() throws RemoteException;

    IObjectWrapper m() throws RemoteException;

    void performClick(String str) throws RemoteException;

    boolean r3(IObjectWrapper iObjectWrapper) throws RemoteException;

    void recordImpression() throws RemoteException;
}
