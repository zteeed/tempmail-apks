package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzams extends IInterface {
    void J3(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper K5() throws RemoteException;

    void L1(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException;

    void M3(IObjectWrapper iObjectWrapper, zzve zzve, String str, String str2, zzamx zzamx) throws RemoteException;

    void P2(IObjectWrapper iObjectWrapper, zzve zzve, String str, String str2, zzamx zzamx, zzadj zzadj, List<String> list) throws RemoteException;

    void P3(IObjectWrapper iObjectWrapper, zzvh zzvh, zzve zzve, String str, String str2, zzamx zzamx) throws RemoteException;

    void R2(IObjectWrapper iObjectWrapper, zzatx zzatx, List<String> list) throws RemoteException;

    void S4(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzatx zzatx, String str2) throws RemoteException;

    zzanf U3() throws RemoteException;

    void U5(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException;

    void W5(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzana X4() throws RemoteException;

    zzapl Y() throws RemoteException;

    void Z4(zzve zzve, String str) throws RemoteException;

    zzapl a0() throws RemoteException;

    void destroy() throws RemoteException;

    zzang g6() throws RemoteException;

    Bundle getInterstitialAdapterInfo() throws RemoteException;

    zzyi getVideoController() throws RemoteException;

    boolean isInitialized() throws RemoteException;

    Bundle j2() throws RemoteException;

    void m1(IObjectWrapper iObjectWrapper, zzvh zzvh, zzve zzve, String str, zzamx zzamx) throws RemoteException;

    void p4(zzve zzve, String str, String str2) throws RemoteException;

    void pause() throws RemoteException;

    boolean r1() throws RemoteException;

    void resume() throws RemoteException;

    void s5(IObjectWrapper iObjectWrapper, zzaie zzaie, List<zzaim> list) throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void showVideo() throws RemoteException;

    zzaep u0() throws RemoteException;

    void w6(IObjectWrapper iObjectWrapper, zzve zzve, String str, zzamx zzamx) throws RemoteException;

    Bundle zztm() throws RemoteException;
}
