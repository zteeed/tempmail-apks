package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public interface zzem extends IInterface {
    void K4(zzao zzao, String str, String str2) throws RemoteException;

    List<zzkq> P3(String str, String str2, boolean z, zzn zzn) throws RemoteException;

    List<zzkq> Q3(zzn zzn, boolean z) throws RemoteException;

    void S4(zzn zzn) throws RemoteException;

    void T3(zzn zzn) throws RemoteException;

    void Y5(Bundle bundle, zzn zzn) throws RemoteException;

    void a3(long j, String str, String str2, String str3) throws RemoteException;

    byte[] f6(zzao zzao, String str) throws RemoteException;

    void i3(zzn zzn) throws RemoteException;

    List<zzw> j3(String str, String str2, String str3) throws RemoteException;

    List<zzw> l3(String str, String str2, zzn zzn) throws RemoteException;

    String m2(zzn zzn) throws RemoteException;

    void r0(zzw zzw, zzn zzn) throws RemoteException;

    List<zzkq> v1(String str, String str2, String str3, boolean z) throws RemoteException;

    void w4(zzw zzw) throws RemoteException;

    void x4(zzao zzao, zzn zzn) throws RemoteException;

    void y3(zzkq zzkq, zzn zzn) throws RemoteException;
}
