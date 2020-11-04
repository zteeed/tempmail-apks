package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public interface zzem extends IInterface {
    void A5(Bundle bundle, zzn zzn) throws RemoteException;

    List<zzkq> B3(String str, String str2, boolean z, zzn zzn) throws RemoteException;

    List<zzkq> C3(zzn zzn, boolean z) throws RemoteException;

    void F3(zzn zzn) throws RemoteException;

    byte[] H5(zzao zzao, String str) throws RemoteException;

    void O2(long j, String str, String str2, String str3) throws RemoteException;

    void W2(zzn zzn) throws RemoteException;

    List<zzw> X2(String str, String str2, String str3) throws RemoteException;

    List<zzw> Z2(String str, String str2, zzn zzn) throws RemoteException;

    String c2(zzn zzn) throws RemoteException;

    void c4(zzw zzw) throws RemoteException;

    void d4(zzao zzao, zzn zzn) throws RemoteException;

    void i3(zzkq zzkq, zzn zzn) throws RemoteException;

    void l0(zzw zzw, zzn zzn) throws RemoteException;

    List<zzkq> o1(String str, String str2, String str3, boolean z) throws RemoteException;

    void q4(zzao zzao, String str, String str2) throws RemoteException;

    void y4(zzn zzn) throws RemoteException;
}
