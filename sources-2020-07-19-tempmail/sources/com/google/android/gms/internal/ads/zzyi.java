package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public interface zzyi extends IInterface {
    zzyj E5() throws RemoteException;

    void S0(zzyj zzyj) throws RemoteException;

    void X1(boolean z) throws RemoteException;

    boolean g5() throws RemoteException;

    float getAspectRatio() throws RemoteException;

    float getCurrentTime() throws RemoteException;

    float getDuration() throws RemoteException;

    int getPlaybackState() throws RemoteException;

    boolean l1() throws RemoteException;

    void pause() throws RemoteException;

    void play() throws RemoteException;

    void stop() throws RemoteException;

    boolean z0() throws RemoteException;
}
