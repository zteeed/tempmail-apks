package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzams extends IInterface {
    zzaep A0() throws RemoteException;

    zzang I6() throws RemoteException;

    void J4(zzve zzve, String str, String str2) throws RemoteException;

    void O5(IObjectWrapper iObjectWrapper, zzaie zzaie, List<zzaim> list) throws RemoteException;

    void U1(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException;

    void X3(IObjectWrapper iObjectWrapper) throws RemoteException;

    void a4(IObjectWrapper iObjectWrapper, zzve zzve, String str, String str2, zzamx zzamx) throws RemoteException;

    void a7(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException;

    void b3(IObjectWrapper iObjectWrapper, zzve zzve, String str, String str2, zzamx zzamx, zzadj zzadj, List<String> list) throws RemoteException;

    void d3(IObjectWrapper iObjectWrapper, zzatx zzatx, List<String> list) throws RemoteException;

    void destroy() throws RemoteException;

    zzapl e0() throws RemoteException;

    zzapl g0() throws RemoteException;

    void g4(IObjectWrapper iObjectWrapper, zzvh zzvh, zzve zzve, String str, String str2, zzamx zzamx) throws RemoteException;

    Bundle getInterstitialAdapterInfo() throws RemoteException;

    zzyi getVideoController() throws RemoteException;

    IObjectWrapper i6() throws RemoteException;

    boolean isInitialized() throws RemoteException;

    zzanf m4() throws RemoteException;

    void m5(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzatx zzatx, String str2) throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void s1(IObjectWrapper iObjectWrapper, zzvh zzvh, zzve zzve, String str, zzamx zzamx) throws RemoteException;

    zzana s5() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void showVideo() throws RemoteException;

    Bundle t2() throws RemoteException;

    void u5(zzve zzve, String str) throws RemoteException;

    void u6(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException;

    void w6(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean z1() throws RemoteException;

    Bundle zztm() throws RemoteException;
}
