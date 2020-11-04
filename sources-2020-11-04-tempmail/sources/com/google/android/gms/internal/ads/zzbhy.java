package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzbhy extends IInterface {
    long A2() throws RemoteException;

    void F4(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException;

    void G0(Bundle bundle) throws RemoteException;

    String H2() throws RemoteException;

    String Q4() throws RemoteException;

    void T4(Bundle bundle) throws RemoteException;

    void V6(String str) throws RemoteException;

    void W(String str, String str2, Bundle bundle) throws RemoteException;

    Map Y3(String str, String str2, boolean z) throws RemoteException;

    int Z(String str) throws RemoteException;

    void a6(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException;

    String b2() throws RemoteException;

    void b6(String str) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    List d0(String str, String str2) throws RemoteException;

    String h4() throws RemoteException;

    Bundle n2(Bundle bundle) throws RemoteException;

    String p4() throws RemoteException;
}
