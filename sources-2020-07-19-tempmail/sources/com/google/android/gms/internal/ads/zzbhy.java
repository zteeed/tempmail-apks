package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzbhy extends IInterface {
    void A0(Bundle bundle) throws RemoteException;

    void C5(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException;

    void D5(String str) throws RemoteException;

    Map K3(String str, String str2, boolean z) throws RemoteException;

    void Q(String str, String str2, Bundle bundle) throws RemoteException;

    String Q3() throws RemoteException;

    String S1() throws RemoteException;

    int T(String str) throws RemoteException;

    String V3() throws RemoteException;

    List X(String str, String str2) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    Bundle d2(Bundle bundle) throws RemoteException;

    void l4(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException;

    long p2() throws RemoteException;

    void r6(String str) throws RemoteException;

    String u2() throws RemoteException;

    String w4() throws RemoteException;

    void z4(Bundle bundle) throws RemoteException;
}
