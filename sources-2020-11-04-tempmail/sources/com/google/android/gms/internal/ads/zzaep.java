package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzaep extends IInterface {
    boolean A5() throws RemoteException;

    boolean G3(IObjectWrapper iObjectWrapper) throws RemoteException;

    void P2(IObjectWrapper iObjectWrapper) throws RemoteException;

    void destroy() throws RemoteException;

    List<String> getAvailableAssetNames() throws RemoteException;

    String getCustomTemplateId() throws RemoteException;

    zzyi getVideoController() throws RemoteException;

    String l4(String str) throws RemoteException;

    IObjectWrapper m6() throws RemoteException;

    IObjectWrapper o() throws RemoteException;

    void performClick(String str) throws RemoteException;

    zzadt r5(String str) throws RemoteException;

    void recordImpression() throws RemoteException;

    boolean v4() throws RemoteException;

    void w3() throws RemoteException;
}
