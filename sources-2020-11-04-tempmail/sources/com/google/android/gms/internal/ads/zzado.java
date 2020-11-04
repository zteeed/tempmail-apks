package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzado extends IInterface {
    void P4(zzaff zzaff) throws RemoteException;

    IObjectWrapper Z2() throws RemoteException;

    void d1(IObjectWrapper iObjectWrapper) throws RemoteException;

    float getAspectRatio() throws RemoteException;

    float getCurrentTime() throws RemoteException;

    float getDuration() throws RemoteException;

    zzyi getVideoController() throws RemoteException;

    boolean hasVideoContent() throws RemoteException;
}
